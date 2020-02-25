#include<stdlib.h>
#include<stdio.h>
#include<pthread.h>
#include<unistd.h>


void * zad_watku(void * wsk){
	int * wsk_int = (int*) wsk;
	int value = * wsk_int;

	printf("Systemowy ID: %ld , Swoj ID: %d \n", pthread_self(), value);

	return(NULL);
}

int main(){
	pthread_t tid[5];

	for(int i=0; i<5; i++){
		int value = i;
		pthread_create(&tid[i], NULL, zad_watku, &value);
		sleep(1);
	}

	for(int i=0; i<5; i++){
                pthread_join(tid[i], NULL);
        }

	return 0;
}
