//Question 4
//Generte fibonacci series upto n terms
#include<iostream>
using namespace std;

void fibonacci(int n){	
	int a=0;
	int b=1;
	int next;
	for(int i=0;i<n;i++){
		cout<<a<<" " ;
		next = a+b;
		a = b;
		b = next;
	}
}
int main(){
	int n;
	cout<<"Enter no of terms upto you want fibonacci series ";
	cin>>n;
	
	cout<<"Fibonacci series: ";
	fibonacci(n);
	
}