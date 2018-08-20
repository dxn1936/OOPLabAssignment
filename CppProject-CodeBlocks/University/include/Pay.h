#ifndef PAY_H
#define PAY_H
<<<<<<< HEAD

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
=======


class Pay
{
    public:
        Pay();
        virtual ~Pay();

    protected:

    private:
>>>>>>> c80703dc240cf2f8d335f11b561b13b5b5d8caa2
};

#endif // PAY_H
