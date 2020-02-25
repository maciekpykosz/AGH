#include<iostream>

using namespace std;

class Rodzic{
	virtual void Metoda() = 0;
};
class Potomek {
public:
	virtual void Metoda() {
		cout << "Nazwa klasy: Potomek" << endl;
	}
};

int main() {
	//Rodzic R;
	//R.Metoda();
	Potomek P;
	P.Metoda();

	system("PAUSE");
	return 0;
}