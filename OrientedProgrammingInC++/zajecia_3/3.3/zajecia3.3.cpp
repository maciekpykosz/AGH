// zajecia3.3.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>

using namespace std;

class Figura {
	int a, b;

public:
	Figura() {
		cout << "domyslny" << endl << endl;
	}
	Figura(int arg1) {
		a = arg1;
		cout << a << endl << "jednoargumentowy" << endl << endl;
	}
	Figura(int arg1, int arg2) {
		a = arg1;
		b = arg2;
		cout << a << ", " << b << endl << "wieloargumentowy" << endl;
	}

};

int main()
{
	Figura *obiekt1 = new Figura();
	delete obiekt1;
	Figura *obiekt2 = new Figura(2);
	delete obiekt2;
	Figura *obiekt3 = new Figura(20,200);
	delete obiekt3;

	system("PAUSE");
    return 0;
}

