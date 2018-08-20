#ifndef PAY_H
#define PAY_H

#include<iostream>

using namespace std;

class Pay
{
    private:
        int salary;

    public:
        Pay();
        Pay(int salary);
        virtual ~Pay();

    public:
        int getSalary() { return this->salary; }
        void setSalary(int salary) { this->salary = salary; }
        void printSalary();
};

#endif // PAY_H
