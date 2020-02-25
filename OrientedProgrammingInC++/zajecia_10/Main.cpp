#include "Header.h"
#include<iostream>
#include<string>


using namespace std;

int main() {

	KartaZawodnika obiekt_1;
	obiekt_1.imie = "Robert";
	obiekt_1.nazwisko = "Lewandowski";
	obiekt_1.wiek = 32;
	obiekt_1.ocena = 9.81;
	obiekt_1.pierwsza_litera_imienia_ojca = 'W';
	cout << "Imie: " << obiekt_1.imie << endl;
	cout << "Nazwisko: " << obiekt_1.nazwisko << endl;
	cout << "Wiek:" << obiekt_1.wiek << endl;
	cout << "Ocena zawodnika: " << obiekt_1.ocena << endl;
	cout << "Pierwsza litera imienia matki: " << obiekt_1.pierwsza_litera_imienia_ojca << endl;

	KartaZawodnika obiekt_2;
	KartaZawodnika *wsk;
	wsk = &obiekt_2;
	cout << "Imie: " << endl;
	cin >> (*wsk).imie << endl;
	cout << "Nazwisko: " << endl;
	cin >> (*wsk).nazwisko << endl;
	cout << "Wiek: " << endl;
	cin >> (*wsk).wiek << endl;
	cout << "Ocena: " << endl;
	cin >> (*wsk).ocena << endl;
	cout << "Pierwsza litara imienia ojca: " << endl;
	cin >> (*wsk).pierwsza_litera_imienia_ojca << endl;

	cout << "Imie: " << (*wsk).imieimie << endl;
	cout << "Nazwisko: " << (*wsk).nazwisko << endl;
	cout << "Wiek:" << (*wsk).wiek << endl;
	cout << "Ocena zawodnika: " << (*wsk).ocena << endl;
	cout << "Pierwsza litera imienia matki: " << (*wsk).pierwsza_litera_imienia_ojca << endl;

	system("PAUSE");
	return 0;
}