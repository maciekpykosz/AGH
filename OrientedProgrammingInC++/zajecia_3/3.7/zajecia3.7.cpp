// zajecia3.7.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include <string>

using namespace std;

class Laptop{
	string model;
	string procesor;

public:
	Laptop() {
		cout << "domyslny";
	}
	Laptop(string m){
		model = m;
		cout << model;
	}
	Laptop(string m, string p) {
		model = m;
		procesor = p;
	}
	void wypisz() {
		cout << "model " << model << endl;
		cout << "procesor " << procesor << endl;
	}
};

int main() {
	


	system("PAUSE");
	return(0);
}


