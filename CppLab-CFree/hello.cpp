#include <iostream>
using namespace std;

class stud {
	protected:
    int roll, m1, m2;

	public:
    void get()
    {
        cout << "Enter the Roll No.: "; cin >> roll;
        cout << "Enter the two highest marks: "; cin >> m1 >> m2;
    }
};
class extracurriculam {
	protected:
    int xm;

	public:
    void getsm()
    {
        cout << "\nEnter the mark for Extra Curriculam Activities: "; cin >> xm;
    }
};
class output : public stud, public extracurriculam {
    int tot, avg;

	public:
    void display()
    {
        tot = (m1 + m2 + xm);
        avg = tot / 3;
        cout << "\n\n\tRoll No    : " << roll << "\n\tTotal      : " << tot;
        cout << "\n\tAverage    : " << avg << "\n";
    }
};
int main()
{
    output O;
    O.get();
    O.getsm();
    O.display();
}
