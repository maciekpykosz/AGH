#include<iostream>

using namespace std;

class A
{
protected:
	void Wyswietl_1() {
		cout << "nazwa klasy: A" << endl << "metoda: Wyswietl_1"<<endl;
	}
};
class B
{
protected:
	void Wyswietl_2() {
		cout << "nazwa klasy: B" << endl << "metoda: Wyswietl_2"<<endl;
	}
};
class C
{
protected:
	void Wyswietl_3() {
		cout << "nazwa klasy: C" << endl << "metoda: Wyswietl_3"<<endl;
	}
};
class Z :public A, public B, public C {
public:
	void Pokaz() {
		A::Wyswietl_1();
		B::Wyswietl_2();
		C::Wyswietl_3();
	}
};

int main() {

	Z obiekt;
	obiekt.Pokaz();

	system("PAUSE");
	return 0;
};