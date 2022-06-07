// Fazer um programa que solicita um número decimal e imprime o correspondente em hexa e octal.
import javax.swing.JOptionPane;
public class exercicio2 {

    public static void main(String[] args) {
    
    //var para receber entrada
    int nmrInput = 0;
    //var para receber conversão
    String hexaDeci = "", octal = "";
    //entrada
    nmrInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número para conversão"));
    //conversão
    hexaDeci = Integer.toHexString(nmrInput);
    octal = Integer.toOctalString(nmrInput);
    //exibição dos resultados
    JOptionPane.showMessageDialog(null, "Número decimal entrado: "+nmrInput+"\nSua forma hexadecimal: "+hexaDeci+"\nSua forma octal: "+octal);

    }
}
