#include<iostream>
#include<fstream>
#include<string>

using namespace std;

int main() {

	string line;
	ifstream obiekt;
	obiekt.open("nowy_plik.txt");
	if (obiekt.is_open() == true) {
		while (!obiekt.eof()) {
			getline(obiekt, line);
			cout << line << endl;
		}
	}
	obiekt.close();

	system("PAUSE");
	return 0;
}