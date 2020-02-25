#include<iostream>

using namespace std;

class Figura
{
protected:
	float wysokosc, szerokosc;
public:
	void Ustaw_wartosc(float a, float b) {
		wysokosc = a;
		szerokosc = b;
	}
};
class Prostokat :public Figura {
public:
	float Zwroc() {
		return (wysokosc*szerokosc);
	}
};
class Trojkat :public Figura {
public:
	float Zwroc() {
		return (wysokosc*szerokosc);
	}
};

int main() {

	Prostokat p1;
	p1.Ustaw_wartosc(10, 20);
	cout<<p1.Zwroc()<<endl;

	Trojkat t1;
	t1.Ustaw_wartosc(13, 23);
	cout<<t1.Zwroc()<<endl;

	system("PAUSE");
	return 0;
}