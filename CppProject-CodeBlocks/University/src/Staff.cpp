#include "Staff.h"

Staff::Staff()
{
    cout << "Staff object created" << endl;
    this->firstName = "";
    this->lastName = "";
}
Staff::Staff(string firstName)
{
    this->firstName = firstName;
    this->lastName = "";
}
Staff::Staff(string firstName, string lastName)
{
    this->firstName = firstName;
    this->lastName = lastName;
}
Staff::~Staff()
{
    cout << "Staff object destroyed" << endl;
}
string Staff::getFullName()
{
    return this->lastName +  ", " + this->firstName;
}
