#include<iostream>

using namespace std;

class Kszta速 {
public:
	virtual void ObliczPole() = 0;
};
class Kolo :public Kszta速 {
	float r;
public:
	Kolo(float x) {
		r = x;
	}
	virtual void ObliczPole() {
		cout << "Pole kola: " << 3.14*r*r<< endl;
	}
};
class Kwadrat :public Kszta速 {
	float a;
public:
	Kwadrat(float x) {
		a = x;
	}
	virtual void ObliczPole() {
		cout << "Pole kwadratu: " << a*a << endl;
	}
};
int main() {
	Kolo Ko(1);
	Kwadrat Kw(2);
	Kszta速 *wsk;
	wsk = &Ko;
	wsk->ObliczPole();
	wsk = &Kw;
	wsk->ObliczPole();

	system("PAUSE");
	return 0;
}