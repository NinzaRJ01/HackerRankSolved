#include <stdio.h>

void update(int *a,int *b) {
    // Complete this function 
    //*a = valOf(a)
    //*b = valOf(b) because pointer to a and b are passed as an argument to function 
    int temp = *a;//temp<-valueOf(a)
    *a = *a + *b;
    if(temp>*b)
    {*b= temp - *b;}
    else
        *b = *b - temp;
    
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;
    
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}
