//Question 3
//Calculate factorial of a number
#include<iostream>
using namespace std;
int factorial(int num){
	int fact=1;
	for(int i=1;i<=num;i++){
		fact = fact*i;
	}
	return fact;
}
int main(){
	int num;
	cout<<"Enter number";
	cin>>num;
	int fact  = factorial(num);
	cout<<"Factorial of "<<num<<" is "<<fact<<endl;
	
}