#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int n, sum = 0, temp, digit, digits = 0;
    cout << "Enter a number: ";
    cin >> n;

    temp = n;

    while (temp != 0) {
        digits++;
        temp /= 10;
    }

    temp = n;

   
    while (temp != 0) {
        digit = temp % 10;
        sum += pow(digit, digits);
        temp /= 10;
    }

    if (sum == n)
        cout << "Armstrong number";
    else
        cout << "Not an Armstrong number";

    return 0;
}
