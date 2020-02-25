#include<iostream>

using namespace std;

class Zbior {
public:
	int x, y;
	Zbior() 
	Zbior(int, int)
	Zbior operator+ (Zbior const&)
};
Zbior::Zbior() {
	x = y = 0;
}
Zbior::Zbior(int a, int b) {
	x = a;
	y = b;
}

int main() {
	Zbior zb1, zb2, zb3;
	zb1.x = 2;
	zb1.y = 3;
	zb2.x = 8;
	zb2.y = 8;


	system("PAUSE");
	return 0;
}