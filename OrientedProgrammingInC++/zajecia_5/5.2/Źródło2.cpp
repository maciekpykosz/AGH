#include<iostream>

using namespace std;

class Zbior {
public:
	int x, y;
	Zbior();
	Zbior(int, int);
	Zbior operator+ (Zbior const&);
	friend ostream& operator<< (ostream &, const Zbior &);
};

ostream& operator<< (ostream &wyjscie, const Zbior &z) {
	wyjscie << "zwracam sume x : " << z.x << endl << "zwracam sume y: " << z.y << endl;
	return wyjscie;
}

Zbior::Zbior() {
	x = y = 0;
}
Zbior::Zbior(int a, int b) {
	x = a;
	y = b;
}

Zbior Zbior::operator+ (Zbior const& z)
{
	Zbior suma;
	suma.x = x + z.x;
	suma.y = y + z.y;
	return suma;
}

int main() {
	Zbior zb1(2,3), zb2(8,9), zb3;
	zb3 = zb1 + zb2;
	cout << zb3;

	system("PAUSE");
	return 0;
}