#include <iostream>
using namespace std;

int main()
{
    cout << "Bubble Sort!" << endl;
    int data[] = {1,5,2,9,23,3,77,45,34,22,23};
    int dataSize = (sizeof(data)/sizeof(*data));
    cout << "INPUT: ";
    for(int i = 0; i < dataSize; i++) {
        cout << "..." << data[i];
        for(int j = 0; j < i; j++) {
            if(data[i] < data[j]) {
                data[i] += data[j];
                data[j] = data[i] - data[j];
                data[i] = data[i] - data[j];
            }
        }
    }
    cout << endl << "OUTPUT: ";
    for(int i = 0; i < dataSize; i++) {
        cout << "..." << data[i];
    }
    cout << endl;

    return 0;
}
