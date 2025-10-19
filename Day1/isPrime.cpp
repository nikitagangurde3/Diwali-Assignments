//Question 1
//check wether no is prime or not 

#include<iostream>
using namespace std;

bool isPrime(int num){
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

int main(){
    int num;
    cout<<"Enter a number";
    cin>>num;

    if(isPrime(num)){
        cout<<"True  "<<num<<"Number is prime";
    }
    else{
        cout<<"False  "<<num<<"Number is not prime";
    }
}