// zaj3.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include <string>

using namespace std;

class Osoba {
	string imie;
	int wiek;

public:
	Osoba();
};

Osoba::Osoba() {
	cout << "To ja, kontruktor domyslny" << endl;
}

int main()
{
	Osoba statyczny;
	Osoba *dynamiczny = new Osoba();
	delete dynamiczny;

	system("PAUSE");
	return 0;
}