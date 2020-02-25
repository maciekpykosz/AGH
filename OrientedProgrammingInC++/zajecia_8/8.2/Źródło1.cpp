#include<iostream>
#include<string>
using namespace std;

template<typename T, int rozmiar>
class Klasa {
	T *elementy;
public:
	Klasa(){
		elementy = new T[rozmiar];
	}
};

int main() {

	Klasa<int, 100> tablica1;
	Klasa<float, 200> tablica2;

	system("PAUSE");
	return 0;
}