#include "ComplexNumber.h"

ComplexNumber::ComplexNumber() {
    this->real = 0;
    this->imaginary = 0;
}

ComplexNumber::~ComplexNumber()
{
    this->real = NULL;
    this->imaginary = NULL;
}
