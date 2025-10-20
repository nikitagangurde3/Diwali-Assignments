#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter n: ";
    cin >> n;

    int sum = n * n; // since sum of first n odd numbers = n^2

    cout << "Sum of first " << n << " odd numbers = " << sum << endl;
    return 0;
}
