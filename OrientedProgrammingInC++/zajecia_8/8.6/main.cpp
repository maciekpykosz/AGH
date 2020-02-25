#include<iostream>
#include <cmath>
#include "plik.h"

using namespace std;

int main() {
	Okrag obiekt1(5, 0, 0);
	Okrag obiekt2(5, 10, 10);
	Przecinaja_sie(obiekt1, obiekt2);

	system("PAUSE");
	return 0;
}
