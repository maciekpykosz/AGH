#include<iostream>
#include<fstream>

using namespace std;

int main() {

	ofstream obiekt;
	obiekt.open("nowy plik.txt");
	obiekt << "Maciej" << endl << "Pykosz" << endl << "Rok II";
	obiekt.close();

	system("PAUSE");
	return 0;
}