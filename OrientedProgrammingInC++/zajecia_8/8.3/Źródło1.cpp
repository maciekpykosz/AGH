#include<iostream>
#include<string>
#define _USE_MATH_DEFINES
#include<math.h>

using namespace std;

template<typename T = double>
class Kula{
	T r;
public:
	T PolePowierzchni(T r) {
		cout << "Dla r = " << r << " pole powierzchni wynosi: ";
		return(4 * M_PI*r*r);
	}
	T Objetosc(T r) {
		cout << "Dla r = " << r << " objetosc wynosi: ";
		return(4 / 3 * M_PI*r*r*r);
	}
};

int main() {

	Kula<int> k1;
	Kula<float> k2;
	Kula<double> k3;
	cout << k1.PolePowierzchni(1.123) << endl;
	cout << k1.Objetosc(1.123) << endl << endl;
	cout << k2.PolePowierzchni(1.123) << endl;
	cout << k2.Objetosc(1.123) << endl << endl;
	cout << k3.PolePowierzchni(1.123) << endl;
	cout << k3.Objetosc(1.123) << endl << endl;

	system("PAUSE");
	return 0;
}