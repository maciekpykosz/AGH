// zajecia3.8.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include <string>

using namespace std;

class Laptop {
	int l1, l2, w;

public:
	inline int mul(int l1, int l2)
	{
		w = l1 * l2;
		cout << w << endl;
		return 0 ;
	}
};

int main() {

	Laptop wynik;
	wynik.mul(10,30);
	
		system("PAUSE");
	return(0);
}
