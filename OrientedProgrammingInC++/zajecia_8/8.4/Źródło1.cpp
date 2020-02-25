#include<iostream>
#include<string>
#define _USE_MATH_DEFINES
#include<math.h>

using namespace std;

template<typename T>
T PolePrastopadloscianu(T a, T b, T h) {
	cout << "Pole prostopadloscianu dla a=" << a << ", b=" << b << ", h=" << h << " wynosi: ";
	return (2 * a*b + 2 * a*h + 2 * b*h);
}

int main() {

	cout << PolePrastopadloscianu<int>(12.2, 12.2, 1.123) << " (int)" << endl;
	cout << PolePrastopadloscianu<float>(14.123, 1.123, 1.123) << " (float)" << endl;
	cout << PolePrastopadloscianu<double>(12.123, 1.123, 1.123) << " (double)" << endl;

	system("PAUSE");
	return 0;
}