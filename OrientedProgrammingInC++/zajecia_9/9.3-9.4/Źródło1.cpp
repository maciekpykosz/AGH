#include<iostream>
#include<fstream>
#include<string>

using namespace std;

int main() {

	fstream plik;
	plik.open("wizytowka.txt", ios::app);
	if (plik.good()) {
		string imie = "", nazwisko = "", tel = "";
		cin >> imie;
		cin >> nazwisko;
		cin >> tel;
		plik << imie << endl << nazwisko  << endl << tel << endl;
	}
	plik.close();

	system("PAUSE");
	return 0;
}