// zajecia4.3.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
using namespace std;

class Zespolona {
public:
	double re;
	double im;
	Zespolona(double r = 0, double i = 0) : re(r), im(i) {}
	friend void Pokaz(Zespolona);
};

void Pokaz(Zespolona zesp) {
	cout << "[" << zesp.re << "," << zesp.im << "]" << endl;
};

int main() {
	Zespolona liczba1;
	Zespolona liczba2(8);
	Zespolona *liczba_dyn = new Zespolona(18);
	Pokaz(liczba1);
	Pokaz(liczba2);
	Pokaz(*liczba_dyn);

	system("PAUSE");
    return 0;
}

