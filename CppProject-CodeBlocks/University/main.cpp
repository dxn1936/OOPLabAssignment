#include <iostream>
#include"Staff.h"
#include"NonTeachingStaff.h"
using namespace std;

int main()
{
    cout << "-UNIVERSITY-" << endl;

//    Staff s1("Mario", "Lee");
 //   cout << s1.getFullName() << endl;
//    s1.~Staff();

/*

*/
/*
    Staff *s2 = new Staff("max", "payne");
    cout << s2->getFullName() << endl;
    s2->~Staff();
    delete s2;
*/
/*
    Staff s3 = Staff("ember");
    cout << s3.getFullName() << endl;
*/

/*
    NonTeachingStaff *ns1 = new NonTeachingStaff();
    delete ns1;
*/

    NonTeachingStaff *ns4 = new NonTeachingStaff();
    Staff *s4 = (Staff*)ns4;
    delete s4;


    return 0;
}
