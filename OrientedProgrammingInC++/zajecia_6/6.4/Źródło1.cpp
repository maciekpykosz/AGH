#include<iostream>
#include<string>

using namespace std;

class Zwierze
{
	string wiek;
	float ilosc_nog;
};
class Zwierze_domowe :public Zwierze
{
	string imie, kolor_siersci;
};
class Hipopotam :public Zwierze
{

};
class Kot :public Zwierze_domowe
{
public:
	void Glos(){
		cout << "Miaaaa³";
	}
};
class Pies :public Zwierze_domowe
{
public:
	void Glos() {
		cout << "Auuuu";
	}
};

int main() {

	Hipopotam hipcio;
	Kot k1;
	Pies p1;
	k1.Glos();
	p1.Glos();

	system("PAUSE");
	return 0;
};