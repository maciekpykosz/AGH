// Zajecia2.2.cpp : Defines the entry point for the console application.
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
	void Pobierz_date();
	void Wypisz_date() {
		cout << dzien << "." << miesiac << "." << rok << endl;
	}
};

void Data::Pobierz_date() {
	cout << "Dzien: ";
	cin >> dzien;
	cout << "Miesiac: ";
	cin >> miesiac;
	cout << "Rok: ";
	cin >> rok;
}

int main()
{
	Data urodziny;
	urodziny.Pobierz_date();
	urodziny.Wypisz_date();

	system("PAUSE");
	return 0;
}

