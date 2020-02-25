#include<iostream>
#include<string>
using namespace std;

template<typename T>
T suma(T l1, T l2) {
	return (l1+l2);
}

int main() {

	cout << "znaki: " << suma<string>("Maciek", "Pykosz")<<endl;
	cout << "calkowite: " << suma<int>(7, 8)<<endl;
	cout << "double: " << suma<double>(2.3, 3.4)<<endl;

	system("PAUSE");
	return 0;
}