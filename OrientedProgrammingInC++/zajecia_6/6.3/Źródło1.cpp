#include<iostream>
#include<math.h>
#include<string>

using namespace std;

class Punkt
{
	float x, y;
	string nazwa;

public:
	void wyswietl() {
		cout << nazwa << "(" << x << "," << y << ")" << endl;
	}
	Punkt(string n = "S", float a = 0, float b = 0) {
		nazwa = n;
		x = a;
		y = b;
	}
};

class Kolo :public Punkt {
	float promien;
	string nazwa;

public:
	void wyswietl() {
		cout << "Kolo o nazwie: " << nazwa << endl;
		cout << "Srodek kola: " << endl;
		Punkt::wyswietl();
		cout << "Promien: " << promien << endl;
		cout << "Pole kola: " << 3.14*promien*promien << endl;
	}
	Kolo(string nk = "Kolko", string np = "S", float a = 0, float b = 0, float pr = 1) :Punkt(np, a, b) {
		nazwa = nk;
		promien = pr;
	}
};

int main() {

	Kolo k1;
	k1.wyswietl();

	system("PAUSE");
	return 0;
}