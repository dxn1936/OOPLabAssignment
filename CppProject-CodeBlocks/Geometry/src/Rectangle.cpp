#include "Rectangle.h"

Rectangle::Rectangle() {
    this->length = 0;
    this->breadth = 0;
    this->area = 0;
    this->perimeter = 0;
}

Rectangle::Rectangle(int length, int breadth) {
    this->length = length;
    this->breadth = breadth;
    this->area = 0;
    this->perimeter = 0;
}

Rectangle::~Rectangle() {
    this->length = NULL;
    this->breadth = NULL;
    this->area = NULL;
    this->perimeter = NULL;
}

int Rectangle::calculateArea() {
    this->area = this->length * this->breadth;
    return this->area;
}

int Rectangle::calculatePerimeter() {
    this->perimeter = ( 2 * this->length ) + ( 2 * this->breadth );
    return this->perimeter;
}

/*Rectangle& Rectangle::operator=(Rectangle& oldRectangle) {
    cout << this->getLength() << endl;
    Rectangle newRectangle = Rectangle(this->getLength() + oldRectangle->getLength(), this->getBreadth() + oldRectangle->getBreadth());
    return newRectangle;
}
*/
