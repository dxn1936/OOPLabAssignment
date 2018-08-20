#include "Numeral.h"

Numeral::Numeral()
{
    this->value = 0;
}

Numeral::Numeral(int value) {
    this->value = value;
}

Numeral::~Numeral()
{
    //dtor
}

void Numeral::operator++() {
    this->value = this->value + 3;
}

Numeral operator+(Numeral& num) {
    //cout << n1.getValue();
    return Numeral(num->getValue() + this->value);
}
