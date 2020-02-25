// zajecia3.6.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include <string>

using namespace std;

class Silnik {
public:
	int moc;
	int max_moment_obr;

	Silnik(int power, int moment) {
		moc = power;
		max_moment_obr = moment;
	}
};

class Samochod {
public:
	Silnik silnik;
	string model;

	Samochod(string MODEL, int MOC, int MOMENT) : silnik(MOC, MOMENT), model(MODEL){

	}

	void wypisz() {
		cout << "MODEL " << model << endl;
		cout << "MOC " << silnik.moc << endl;
		cout << "MOMENT " << silnik.max_moment_obr << endl;
	}
};

int main() {
	Samochod  *car = new Samochod("Ford", 220, 8000);
	car->wypisz();
	delete car;

	system("PAUSE");
	return(0);
}

