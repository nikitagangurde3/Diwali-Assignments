
//Question 2
//Generate all prime numbers upto n
#include <iostream>
using namespace std;

bool isPrime(int num) {
    if( num==0 || num==1 ){
        return false;
    }
    for(int i=2;i<=num-1;i++){
        if(num % i == 0){
            return false; 
        }
    }
    return true;
}

void printPrimesUpTo(int n) {
    cout << "Prime numbers up to " << n << " are:\n";
    for (int i = 2; i <= n; i++) {
        if (isPrime(i))
            cout << i << " ";
    }
    cout << endl;
}

int main() {
    int num;
    cout << "Enter a number: ";
    cin >> num;

    printPrimesUpTo(num);
}