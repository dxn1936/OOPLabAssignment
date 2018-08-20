#ifndef NUMERAL_H
#define NUMERAL_H

#include<iostream>

using namespace std;

class Numeral {
    private:
        int value;

    public:
        Numeral();
        Numeral(int value);
        virtual ~Numeral();

    public:
        int getValue() { return this->value; }
        void setValue(int value) { this->value = value; }
        void operator++();
        Numeral operator+(Numeral& n1);
};

#endif // NUMERAL_H
