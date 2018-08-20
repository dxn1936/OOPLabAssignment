#ifndef NONTEACHINGSTAFF_H
#define NONTEACHINGSTAFF_H

#include<iostream>
#include"Staff.h"
#include"Pay.h"

class NonTeachingStaff: protected Staff {
    protected:
        int noOfWorkingHours;
    public:
        NonTeachingStaff();
        ~NonTeachingStaff();
        NonTeachingStaff(string firstName, string lastName, int noOfWorkingHours);

    protected:

    private:
};

#endif // NONTEACHINGSTAFF_H
