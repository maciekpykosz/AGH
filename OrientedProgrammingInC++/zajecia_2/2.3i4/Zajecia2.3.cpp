// Zajecia2.3.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include<iostream>

using namespace std;

class Student {
private:
	char imie[20];
	char nazwisko[20];
	int rok;
	int grupa;
public:
	void Wczytaj() {
		cout << "imie: ";
		cin >> imie;
		cout << "nazwisko: ";
		cin >> nazwisko;
		cout << "rok: ";
		cin >> rok;
		cout << "grupa: ";
		cin >> grupa;
	}
	void Wpisz() {
		cout << endl << imie << endl;
		cout << nazwisko <<endl;
		cout << rok << endl ;
		cout << grupa << endl;
	}
};

int main()
{
	Student obiekt;
	obiekt.Wczytaj();
	obiekt.Wpisz();
	
	system("PAUSE");
    return 0;
}

