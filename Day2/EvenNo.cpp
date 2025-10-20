#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter n: ";
    cin >> n;

    // Formula for sum of first n even numbers = n * (n + 1)
    int sum = n * (n + 1);

    cout << "Sum of first " << n << " even numbers is: " << sum << endl;

    return 0;
}
