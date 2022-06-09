

#include <stdio.h>

int main()
{
    
    int calcMediaUm = 0;
    float calcMediaDois = 0;
    int array[10];
    for (int i = 0; i < 10; i++) {
    printf("Digite os valores para o conjunto: ");
    scanf("%d",&array[i]);
    }
    
    for (int i = 0; i < 10; i++) {
        calcMediaUm += array[i];
    }
    
    calcMediaDois = calcMediaUm / 10;
    
    for (int i = 0; i < 10; i++) {
        if (array[i] == calcMediaDois){
            printf("%d",array[i]);
        }
    }

    
    return 0;
}
