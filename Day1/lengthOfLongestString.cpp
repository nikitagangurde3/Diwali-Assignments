#include<iostream>
#include<string>
using namespace std;

int main(){
    string arr[] = {"apple","banana","orange","pomegranate","strawberry"};
    string longest = arr[0];
    for(int i=0;i<5;i++){
        if(arr[i].length() > longest.length()){
            longest = arr[i];
        }
    }
    cout<<"Longest string : "<<longest;
    cout<<"Length of Longest string : "<<longest.length();
    return 0;
}