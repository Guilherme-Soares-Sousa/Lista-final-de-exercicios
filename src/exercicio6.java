import java.util.Arrays;

import javax.swing.JOptionPane;

// Fazer um programa que lê um conjunto de 10 valores e os imprime ordenados.

public class exercicio6 {
    
    public static void main(String[] args){
    //inicialização do array receptor dos 10 números
        int conjunto[] = new int[10];

    //preenchimento das 10 casas do array
        for (int i = 0; i < 10; i++) {
            conjunto[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite valores para lista de 10"));
            
        }
        //ordenação do array com o método sort
        Arrays.sort(conjunto);
        //percorrer o array ordenado para mostrar os valores
        for (int i = 0; i < conjunto.length; i++) {

            JOptionPane.showMessageDialog(null, conjunto[i]);
            

        }
    }
}
