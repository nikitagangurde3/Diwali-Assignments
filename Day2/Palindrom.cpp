#include <iostream>
using namespace std;

int main() {
    int n, rev = 0, temp;
    cout << "Enter a number: ";
    cin >> n;

    temp = n;  // store original number

    while (n != 0) {
        rev = rev * 10 + (n % 10);  // reverse the number
        n = n / 10;
    }

    if (temp == rev)
        cout << "True";
    else
        cout << "False";

    return 0;
}
