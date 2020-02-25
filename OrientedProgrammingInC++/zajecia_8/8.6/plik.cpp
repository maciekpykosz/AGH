#include<iostream>
#include <cmath>
#include "plik.h"

using namespace std;

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


