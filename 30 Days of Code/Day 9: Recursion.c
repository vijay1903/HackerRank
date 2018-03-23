#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int factorial(int n);
int main() {
    int n,f=1;
    scanf("%d",&n);
    f=factorial(n);
    printf("%d",f);    
    return 0;
}
int factorial(int n)
    {
    if(n<=1)
        return 1;
    else
        return n*factorial(n-1);
    }
