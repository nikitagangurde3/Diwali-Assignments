//Question 5
//check if number is even or odd
#include<iostream>
using namespace std;

bool isEven(int num){
    if( num % 2 == 0){
        return true;
    }
    return false;
}

int main(){
    int num;
    cout<<"Enter a number";
    cin>>num;

    if(isEven(num)){
        cout<<num<<" is even";
    }
    else{
        cout<<num<<" is odd";
    }
}