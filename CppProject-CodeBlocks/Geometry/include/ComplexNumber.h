#ifndef COMPLEXNUMBER_H
#define COMPLEXNUMBER_H

#include<iostream>
#include<stddef.h>

class ComplexNumber
{
    private:
        double real;
        double imaginary;

    public:
        ComplexNumber();
        ComplexNumber(double real, double imaginary);
        virtual ~ComplexNumber();

};

#endif // COMPLEXNUMBER_H
