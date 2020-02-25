// zajecia4.2.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include<iostream>
#include <cmath>

using namespace std;

struct srodek {
	float x;
	float y;
};
class Okrag
{
public:
	float promien;
	srodek naszsrodek;
	
	Okrag(float r, float fx, float fy) {
		promien = r;
		naszsrodek.x = fx;
		naszsrodek.y = fy;
	};
	friend bool Przecinaja_sie(Okrag &a, Okrag &b);
};

bool Przecinaja_sie(Okrag &a, Okrag &b) {

	float d = sqrt((b.naszsrodek.x - a.naszsrodek.x)*(b.naszsrodek.x - a.naszsrodek.x) + (b.naszsrodek.y - a.naszsrodek.y)*(b.naszsrodek.y - a.naszsrodek.y));
	float roznicar = abs(a.promien - b.promien);
	float sumar = (a.promien + b.promien);
	if (roznicar < d && d < sumar) {
		cout << "okregi sie przecinaja" << endl;
		return 1;
	}
	else {
		cout << "okregi sie nie przecinaja" << endl;
		return 0;

	}
}


int main() {
	Okrag obiekt1(5, 0, 0);
	Okrag obiekt2(5, 10, 10);
	Przecinaja_sie(obiekt1, obiekt2);

	system("PAUSE");
    return 0;
}

