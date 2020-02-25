#include<iostream>

using namespace std;

class Punkt2D {
public:
	int x, y;
	Punkt2D(){}
	Punkt2D(int a, int b) {
		x = a;
		y = b;
	}
	friend ostream& operator<< (ostream &, const Punkt2D &);
	friend istream& operator>> (istream &, Punkt2D &);
};
ostream& operator<< (ostream &wyjscie, const Punkt2D &ob) {
	wyjscie << "zwracam x: " << ob.x << endl << "zwracam y: " << ob.y << endl;
	return wyjscie;
}
istream& operator>> (istream &wejscie, Punkt2D &ob) {
	wejscie >> ob.x >> ob.y;
	return wejscie;
}

int main() {
	Punkt2D obiekt;

	cout << "Musisz podac wspolrzedne punktu!" << endl;
	cin >> obiekt;
	cout << obiekt;

	system("PAUSE");
	return 0;
}