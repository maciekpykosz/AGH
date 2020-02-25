// zajecia4.1.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>

using namespace std;


class Klasa {
public:
	int skladnik=10;
	friend class k_Zaprzyjazniona;
	friend void f_Zaprzyjazniona(Klasa &s);
};

class k_Zaprzyjazniona {
public:
	void wyswietl_i_pokaz(Klasa &s) {
		cout << "pierwotna: " <<  s.skladnik << endl;
		s.skladnik = 2;
		cout << "nowa wartosc: " << s.skladnik << endl;
	}
};

void f_Zaprzyjazniona(Klasa &s) {
	s.skladnik = 8;
	cout << "zmieniona wartosc: " << s.skladnik << endl;
}

int main()
{
	Klasa liczba;
	k_Zaprzyjazniona pierwotna;
	pierwotna.wyswietl_i_pokaz(liczba);
	f_Zaprzyjazniona(liczba);

	system("PAUSE");
    return 0;
}