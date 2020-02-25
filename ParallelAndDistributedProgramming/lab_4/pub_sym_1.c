#include<stdlib.h>
#include<stdio.h>
#include<time.h>
#include<pthread.h>
#include<unistd.h>
#include<stdbool.h>

void * watek_klient (void * arg);
int l_kf;
pthread_mutex_t kufle, kran;

int main(){

  pthread_t *tab_klient;
  int *tab_klient_id;
  int l_kl, l_kr, i;

  printf("Liczba klientow: "); scanf("%d", &l_kl);
  printf("Liczba kufli: "); scanf("%d", &l_kf);

  l_kr = 1;

  tab_klient = (pthread_t *) malloc(l_kl*sizeof(pthread_t));
  tab_klient_id = (int *) malloc(l_kl*sizeof(int));

  for(i=0;i<l_kl;i++) tab_klient_id[i]=i;

  printf("\nOtwieramy pub (simple)!");
  printf("\nLiczba wolnych kufli %d", l_kf); 

  for(i=0;i<l_kl;i++){
    pthread_create(&tab_klient[i], NULL, watek_klient, &tab_klient_id[i]); 
  }

  for(i=0;i<l_kl;i++){
    pthread_join(tab_klient[i], NULL);
  }

  printf("\nZamykamy pub!\n");
}


void * watek_klient (void * arg_wsk){

  int moj_id = * ((int *)arg_wsk);

  int i, j, result;
  int ile_musze_wypic = 2;
  bool czy_kufel_zajety;

  printf("\nKlient %d, wchodzę do pubu", moj_id);
  result = 0;

     for(i=0; i<ile_musze_wypic; i++){
       czy_kufel_zajety = false;
       while(!czy_kufel_zajety){
	 //blokuje kufle
         pthread_mutex_lock(&kufle);
         if(l_kf>0){
           l_kf--;
           czy_kufel_zajety = true;
           pthread_mutex_unlock(&kufle);
         }
         else{
           pthread_mutex_unlock(&kufle);
           usleep(3000);
           printf("\n Klient %d, czekam", moj_id);
         }
       }
         printf("\nKlient %d, wybieram kufel", moj_id);

         //blokuje kran
         pthread_mutex_lock(&kran); 
         j=0;
         printf("\nKlient %d, nalewam z kranu %d", moj_id, j); 
         pthread_mutex_unlock(&kran);
         usleep(300);

         printf("\nKlient %d, pije", moj_id); 
         nanosleep((struct timespec[]){{0, 500000000L}}, NULL);

         result++;
         pthread_mutex_lock(&kufle);
         l_kf++;
         pthread_mutex_unlock(&kufle);
         printf("\nKlient %d, odkladam kufel", moj_id);
         printf("\nWolne kufle: %d", l_kf);  
     }

  printf("\nKlient %d, wychodzę z pubu", moj_id); 

  return(NULL);
}


