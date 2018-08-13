#include "NonTeachingStaff.h"
#include "Staff.h"

NonTeachingStaff::NonTeachingStaff()
{
    Staff("hello", "goodbye");
    cout << "Non Teaching Staff object created" << endl;
}

NonTeachingStaff::~NonTeachingStaff()
{
    cout << "Non Teaching Staff object destroyed" << endl;
}

// extending a customized constructor
NonTeachingStaff::NonTeachingStaff(string firstName, string lastName, int noOfWorkingHours): Staff(firstName, lastName){
    this->noOfWorkingHours = noOfWorkingHours;
};
