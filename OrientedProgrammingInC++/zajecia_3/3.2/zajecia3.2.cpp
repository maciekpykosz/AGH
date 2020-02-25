// zajecia3.2.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include <string>

using namespace std;

class Student {
	string imie, nazwisko;
	int rok_studiow, grupa;

public:
	Student(string i, string n, int r, int g) {
		imie = i;
		nazwisko = n;
		rok_studiow = r;
		grupa = g;
	}

	void wypisz() {
		cout << "imie " << imie << endl;
		cout << "nazwisko " << nazwisko << endl;
		cout << "rok stodiow " << rok_studiow << endl;
		cout << "grupa " << grupa << endl << endl;
	}
};


int main() {

	Student s1("Maciej", "Pykosz", 2018, 8);
	s1.wypisz();
	Student s2("Hubert", "Stinia", 2017, 7);
	s2.wypisz();
	Student s3("Dominik", "Strama", 2019, 9);
	s3.wypisz();
	Student s4("Jaroslaw", "Stanczyk", 2016, 6);
	s4.wypisz();

	system("PAUSE");
	return 0;
}