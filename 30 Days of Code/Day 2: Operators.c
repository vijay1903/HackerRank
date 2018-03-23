#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    float meal,tip,tax,total;
    scanf("%f %f %f",&meal,&tip,&tax);
    total=(meal*(1+(tip/100)+(tax/100)));
    if(fmod(total,1.0)>0.5)
        total++;
    printf("The total meal cost is %d dollars.",(int)total);
    return 0;
}
