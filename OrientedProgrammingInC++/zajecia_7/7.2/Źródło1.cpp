#include<iostream>
#define _USE_MATH_DEFINES
#include<math.h>

using namespace std;

class Bryla {
	virtual double PolePowierzchni() = 0;
	virtual double Objetosc() = 0;
};
class Kula :public Bryla {
	double r;
public:
	Kula(float x) {
		r = x;
	}
	virtual double PolePowierzchni() {
		cout << "Pole powierzchni kuli: ";
		return (4*M_PI*r*r);
	}
	virtual double Objetosc() {
		cout << "Objetosc kuli: ";
		return (4 / 3 * M_PI*r*r*r);
	}
};
class Prostopadloscian :public Bryla {
	double a, b, h;
public:
	Prostopadloscian(float x, float y, float z) {
		a = x;
		b = y;
		h = z;
	}
	virtual double PolePowierzchni() {
		cout << "Pole powierzchni prostopadloscianu: ";
		return (2 * a*b + 2 * a*h + 2 * b*h);
	}
	virtual double Objetosc() {
		cout << "Objetosc prostopadloscianu: ";
		return (a*b*h);
	}
};

int main() {
	Kula K(1);
	Prostopadloscian P(2, 2, 2);
	cout << K.PolePowierzchni() << endl;
	cout << K.Objetosc() << endl;
	cout << P.PolePowierzchni() << endl;
	cout << P.Objetosc() << endl;

	system("PAUSE");
	return 0;
}