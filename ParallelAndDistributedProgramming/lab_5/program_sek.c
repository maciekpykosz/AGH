// Nie przydał się :(

#include<stdlib.h>
#include<stdio.h>
#include<pthread.h>
#include<"">


double funkcja_sin(double x){
	return x*x;
}

int main(){
	int N;
	double x1, x2, dx, a, b, c, t1;
	
	N = 10;
	a = 0;
	b = 3;
	x1 = a; 
	c = 0.0; 
	dx = (b-a)/N;
	
	t1 = czas_zegara();
	for(int i=0;i<N;i++){
		x2=x1+dx;  
		c+=0.5*(funkcja_sin(x1)+funkcja_sin(x2))*dx; 
		x1=x2;
	}
	t1 = czas_zegara() - t1;
	printf("Czas obliczen = %lf\n", t1);
	printf("Wynik: %lf \n", c);
	return 0;
}
