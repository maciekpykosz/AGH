// Zajecia2.1.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include<iostream>

using namespace std;

class Data {
public:
	int dzien;
	int miesiac;
	int rok;
};

int main()
{
	Data urodziny;
	urodziny.dzien = 11;
	urodziny.miesiac = 7;
	urodziny.rok = 1998;

	cout << "dzien " << urodziny.dzien << " miesiac " << urodziny.miesiac << " rok " << urodziny.rok << endl;

	system("PAUSE");
    return 0;
}

