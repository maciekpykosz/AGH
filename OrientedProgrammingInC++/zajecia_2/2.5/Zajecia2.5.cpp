// Zajecia2.5.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include<iostream>

using namespace std;

class Data {
private:
	int dzien;
	int miesiac;
	int rok;
public:
	void Wypisz_date() {
		cout << dzien << "." << miesiac << "." << rok << endl;
	}
	void Pobierz_date() {
		cout << "Dzien: ";
		cin >> dzien;
		cout << "Miesiac: ";
		cin >> miesiac;
		cout << "Rok: ";
		cin >> rok;
	}
};

class Student {
private:
	char imie[20];
	char nazwisko[20];
	int rok;
	int grupa;
	Data urodziny;
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
		urodziny.Pobierz_date();
	}
	void Wpisz() {
		cout << endl << imie << endl;
		cout << nazwisko << endl;
		cout << rok << endl;
		cout << grupa << endl;
		urodziny.Wypisz_date();
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

