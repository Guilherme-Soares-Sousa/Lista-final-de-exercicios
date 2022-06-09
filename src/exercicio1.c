
#include <stdio.h>

int main()
{
    float precoProduto;
    printf("Digite o valor do produto: ");
    scanf("%f",&precoProduto);
    if(precoProduto < 100){
    
        precoProduto = precoProduto * 1.1;   
    } else if(precoProduto >= 100){
        
        precoProduto = precoProduto * 1.2;
    }
    
    printf("%f",precoProduto);
    return 0;
}
