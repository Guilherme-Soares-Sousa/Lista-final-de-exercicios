// Faça um programa que lê dois valores e imprime:
// + se o primeiro valor for menor que o segundo, a lista de valores do primeiro até o segundo;
// + se o segundo valor for menor que o primeiro a lista de valores do segundo até o primeiro em ordem decrescente;
// + se ambos forem iguais a mensagem "valores iguais".
import javax.swing.JOptionPane;
public class exercicio4 {
    
    public static void main (String[] args){
        //var receptoras da entrada
        int nmrUm = 0;
        int nmrDois = 0;
        String lista = "";
        //entrada dos valores
        nmrUm = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o primeiro numero"));
        nmrDois = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o segundo numero"));
        //verificação entre ambos
        if (nmrUm < nmrDois){

            JOptionPane.showMessageDialog(null, "Primeiro número é menor que o segundo\n");
            for (int i = nmrUm; i < nmrDois + 1; i++) {
            
                JOptionPane.showMessageDialog(null, lista += i + "\n");
                nmrUm++;
            }

        } else if(nmrUm > nmrDois){
            JOptionPane.showMessageDialog(null, "Segundo número é menor que o primeiro");
            for (int i = nmrDois; i <= nmrUm; i++) {
                JOptionPane.showMessageDialog(null, lista += i + "\n");
                nmrDois++;
            
            }

        } else {

            JOptionPane.showMessageDialog(null, "Os dois números são iguais");

        }

    }

}
