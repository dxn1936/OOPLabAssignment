#include <iostream>
#include "Numeral.h"

using namespace std;

int main()
{
    Numeral n1 = Numeral(3);
    cout << "->" << n1.getValue() << endl;
    ++n1;
    cout << "->" << n1.getValue() << endl;



    //Numeral n2 = Numeral(7);
    //Numeral n3 = n1 + n2;
    return 0;
}
