// zajecia3.4.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include <string>

using namespace std;

class Osoba
{
	int wiek;
	string imie;

public:
	Osoba(const Osoba &osoba) {
		imie = osoba.imie;
		wiek = osoba.wiek;
		cout << "To ja, konstruktor kopiujacy" << endl;
	}
	Osoba(string i, int w) {
		imie = i;
		wiek = w;
	}
	void wypisz() {
		cout << "imie " << imie << endl;
		cout << "wiek " << wiek << endl;
	}
};

int main()
{
	Osoba *obiekt1 = new Osoba("Maciek", 20);
	Osoba obiekt2(*obiekt1);
	
	obiekt1->wypisz();
	obiekt2.wypisz();

	delete obiekt1;

	system("pause");
	return 0;

}

