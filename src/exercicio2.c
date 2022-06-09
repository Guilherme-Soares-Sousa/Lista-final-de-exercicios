

#include <stdio.h>

int main()
{
    float maior, menor;
    float array[10];
    for (int i = 0; i < 10; i++) {
    printf("Digite os valores para o conjunto: ");
    scanf("%f",&array[i]);
    }
    maior = array[0];
    menor = array[0];
    
    for (int i = 0; i < 10; i++) {
        if (maior > array[i]){
            maior = array[i];
        }
        if (menor < array[i]){
            menor = array[i];
    }
  }
    printf("O maior é %f, e o menor é %f", maior, menor);
    
    return 0;
}
