#ifndef STAFF_H
#define STAFF_H

#include<iostream>
#include<string>

using namespace std;

class Staff
{
    protected:
        string firstName;
        string lastName;
    public:
        Staff();
        Staff(string firstName);
        Staff(string firstName, string lastName);
        virtual ~Staff();

    public:
        string getFirstName() { return this->firstName; }
        string getLastName() { return this->lastName; }
        void setFirstName(string firstName) { this->firstName = firstName; }
        void setLastName(string lastName) { this->lastName = lastName; }
        string getFullName();
};

#endif // STAFF_H
