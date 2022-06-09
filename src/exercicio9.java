// Fazer um programa que lê valores para uma matriz do tipo "float"de 5 linhas por 3 colunas e imprime a diferença entre a média dos elementos das colunas pares e a média dos elementos das linhas ímpares.

import java.util.Scanner;
public class exercicio9 {

    public static void main(String[] args) {
        float colunaMedia = 0, linhaMedia = 0, diferMedias;
        int counter = 0;
        Scanner inputUser = new Scanner(System.in);
        float[][] matriz = new float[5][3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Digite os valores");
                matriz[i][j] = inputUser.nextInt();
            }            
        }    
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++){

                if (j % 2==0){
                    counter++;
                    colunaMedia += matriz[i][j];
                }
            
            }
        }
        colunaMedia = colunaMedia / counter;
        counter = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                
                if (i % 2 != 0){
                    counter++;
                    linhaMedia += matriz[i][j];
                }
                
            }
        }
        linhaMedia = linhaMedia/counter;
        diferMedias = colunaMedia - linhaMedia;

        System.out.println("A diferença das médias é: " + diferMedias);
    }
}
