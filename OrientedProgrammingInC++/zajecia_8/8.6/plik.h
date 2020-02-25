#pragma once

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
