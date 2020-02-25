#include<iostream>

using namespace std;

class Ulamek{
	int licznik, mianownik;
public:
	friend ostream& operator<< (ostream &, const Ulamek &);
	Ulamek(int l, int m) : licznik(l), mianownik(m){}

	void ustaw_licz(int l) {
		licznik = l;
	}
	void ustaw_mian(int m) {
		mianownik = m;
	}

	int licznik() const {
		return licznik;
	}
	int mianownik() const {
		return mianownik;
	}

	Ulamek Mnozenie(const Ulamek& u1, const Ulamek& u2) {
		return Ulamek(u1.licznik()*u2.licznik(), u1.mianownik()*u2.mianownik());
	}

	Ulamek(int liczba): licznik(liczba), mianownik(1){}

	operator float() {
		float a = static_cast<float>(licznik) / static_cast<float>(mianownik);
		return a;
	}

	float Kwadrat(float liczba) {
		return liczba * liczba;
	}

};

ostream& operator<< (ostream &wyjscie, const Ulamek &w) {
	wyjscie << "zwracam x: " << w.licznik << endl << "zwracam y: " << w.mianownik << endl;
	return wyjscie;
}

int main() {

	Ulamek u1(2, 5);
	Ulamek u2(3, 8);
	Ulamek wynik1 = Mnozenie(u1, u2);
	Ulamek wynik2 = Mnozenie(u1, 10);
	Ulamek wynik3 = Kwadrat(u1);

	system("PAUSE");
	return 0;
}