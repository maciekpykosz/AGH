#include "iostream"
using namespace std;

//void do 6 zadania
/*
void tabl(int tab[], int n) {
for (int i = 0; i < n; i++)
cout << tab[i] << " ";
}

void wska(int *tab, int n) {
for (int i = 0; i < n; i++)
cout << *(tab+i) << " ";
}
void wska_tabl(int *tab, int n) {
for (int i = 0; i < n; i++)
cout << tab[i] << " ";
}
*/

//void do 5 zadania
/*
void Pokazywacz(const int *obiekt, int n) {

}
void Zmieniacz(int *obiekt, int n) {

}
*/
int main()
{

	// zadanie1
	/*
	int tab1[6];
	double tab2[6];
	int *wskaznik1;
	double *wskaznik2;

	wskaznik1 = &tab1[0];
	wskaznik2 = &tab2[0];

	for (int i = 0; i < 6; i++, wskaznik1++, wskaznik2++) {
	cout << "wskaznik1 = " << wskaznik1 << " ";
	cout << "wskaznik2 = " << wskaznik2 << endl;

	}

	wskaznik1 = &tab1[0];
	wskaznik2 = &tab2[0];

	for (int i = 0; i < 6; i++, wskaznik1++, wskaznik2++) {
	cout << reinterpret_cast <unsigned int> (wskaznik1) << " ";
	cout << reinterpret_cast <unsigned int> (wskaznik2) << endl;

	}
	*/

	//zadanie2
	/*
	int tablica[15];
	int *w1;
	int *w2;
	int *w3;

	w1 = &tablica[5];
	w2 = &tablica[10];
	w3 = &tablica[11];

	cout << (w1 - w2) << endl;
	cout << (w1 - w3) << endl;
	cout << (w2 - w1) << endl;
	cout << (w2 - w3) << endl;
	cout << (w3 - w1) << endl;
	cout << (w3 - w2) << endl;
	*/

	//zadanie3
	/*
	int n;
	int tab[5];
	int *w1;
	int *w2;
	w1 = &tab[2];
	cout << "wskaznik jest na 3 elemencie" << endl;
	cout << "na ktorym ustawic drugi" << endl;
	cin >> n;

	if (n<1 || n>5) {
	cout << "wybrales element poza tablica!";
	getchar();
	return 0;
	}
	w1 = &tab[n - 1];
	if (n<3) {
	cout << "wskaznik blizej poczıtku";
	}
	else {
	cout << "wskaznik dalej niz pierwszy";
	}
	*/

	//zadanie4
	/*
	const int n = 4;
	int tab[4] = { 5,10,15,20 };

	tabl(tab, n);
	cout << endl;
	wska(tab, n);
	cout << endl;
	wska_tabl(tab, n);
	*/

	//zadanie5
	/*
	int tab[4];
	Pokazywacz();
	Zmieniacz();
	*/

	//zadanie6
	/*
	long double *tab = new long double[1000, 1000];
	cout << "Udalo sie zaalokowac dynamicznie pamiec!";
	delete tab;
	*/


	getchar();
	return 0;
}