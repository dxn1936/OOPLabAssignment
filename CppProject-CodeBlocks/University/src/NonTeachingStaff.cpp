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
<<<<<<< HEAD
NonTeachingStaff::NonTeachingStaff(string firstName, string lastName, int noOfWorkingHours): Staff(firstName, lastName) {
=======
NonTeachingStaff::NonTeachingStaff(string firstName, string lastName, int noOfWorkingHours): Staff(firstName, lastName){
>>>>>>> c80703dc240cf2f8d335f11b561b13b5b5d8caa2
    this->noOfWorkingHours = noOfWorkingHours;
};
