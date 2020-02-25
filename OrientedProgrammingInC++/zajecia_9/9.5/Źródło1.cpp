#include<iostream>
#include<fstream>
#include<string>

using namespace std;

int main() {

	fstream plik;
	string imie = "", nazwisko = "", linia;
	int telefon;

	plik.open("wizytowka.txt", ios::out);
	if (plik.good() == true) {
		
		getline(cin, imie);
		getline(cin, nazwisko);
		cin >> telefon;
		plik << imie << endl << nazwisko << endl << to_string(telefon) << endl;
		plik.close();

		plik.open("wizytowka.txt", ios::in);
		while (!plik.eof()) {
			getline(plik, linia);
			cout << linia << endl;
		}
		plik.close();
	}
	else {
		cout << "Plik nie istnieje!";
		return 0;
	}
	

	system("PAUSE");
	return 0;
}