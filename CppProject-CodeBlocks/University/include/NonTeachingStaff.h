#ifndef NONTEACHINGSTAFF_H
#define NONTEACHINGSTAFF_H

#include<iostream>
#include"Staff.h"
#include"Pay.h"

class NonTeachingStaff: protected Staff, public Pay {
    protected:
        int noOfWorkingHours;
    public:
        NonTeachingStaff();
        ~NonTeachingStaff();

    protected:

    private:
};

#endif // NONTEACHINGSTAFF_H
