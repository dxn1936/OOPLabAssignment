#ifndef RECTANGLE_H
#define RECTANGLE_H

#include <iostream>
#include <stddef.h>

using namespace std;

class Rectangle
{
    private:
        int length, breadth, area, perimeter;

    public:
        Rectangle();
        Rectangle(int length, int breadth);
        virtual ~Rectangle();

    public:
        int getLength() { return this->length; }
        int getBreadth() { return this->breadth; }
        int getArea() { return this->area; }
        int getPerimeter() { return this->perimeter; }
        void setLength(int length) { this->length = length; }
        void setBreadth(int breadth) { this->breadth = breadth; }
        int calculateArea();
        int calculatePerimeter();
        //Rectangle& operator=(Rectangle& oldRectangle);
};

#endif // RECTANGLE_H
