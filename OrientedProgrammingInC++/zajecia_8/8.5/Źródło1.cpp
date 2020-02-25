#include<iostream>
#include<string>
#define _USE_MATH_DEFINES
#include<math.h>

using namespace std;

class Prostopadloscian {
public:
	template<typename T>
	T PolePrastopadloscianu(T, T, T);
};
template<typename T>
T Prostopadloscian::PolePrastopadloscianu(T a, T b, T h) {
	cout << "Pole prostopadloscianu dla a=" << a << ", b=" << b << ", h=" << h << " wynosi: ";
	return (2 * a*b + 2 * a*h + 2 * b*h);
}

int main() {

	Prostopadloscian p1;
	Prostopadloscian p2;
	Prostopadloscian p3;
	cout << p1.PolePrastopadloscianu<int>(12.123, 1.123, 1.123) << endl;
	cout << p2.PolePrastopadloscianu<float>(13.123, 1.123, 1.123) << endl;
	cout << p3.PolePrastopadloscianu<double>(14.123, 1.123, 1.123) << endl;

	system("PAUSE");
	return 0;
}