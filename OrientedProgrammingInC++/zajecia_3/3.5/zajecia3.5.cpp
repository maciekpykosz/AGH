// zajecia3.5.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"


#include <iostream>
using namespace std;
#include <cmath>



struct srodek {
	float x;
	float y;
};

class Okrag
{
private:
	float r;
	srodek naszsrodek;
public:
	Okrag(float r, float x, float y);
	friend bool Przecinaja_sie(Okrag &s, Okrag &b);
};





bool Przecinaja_sie(Okrag &a, Okrag &b) {

	float d = sqrt((b.naszsrodek.x - a.naszsrodek.x)*(b.naszsrodek.x - a.naszsrodek.x) + (b.naszsrodek.y - a.naszsrodek.y)*(b.naszsrodek.y - a.naszsrodek.y));
	float roznicar = abs(a.r - b.r);
	float sumar = (a.r + b.r);
	if (roznicar < d && d < sumar) {
		cout << "okregi sie przecinaja" << endl;
		return true;
	}
	else {
		cout << "okregi sie nie przecinaja" << endl;
		return false;

	}
}


int main() {
	Okrag obiekt1(5, 2, 3);
	Okrag obiekt2(5, 2, 2);
	Przecinaja_sie(obiekt1, obiekt2);




	system("PAUSE");
	return 0;
}
