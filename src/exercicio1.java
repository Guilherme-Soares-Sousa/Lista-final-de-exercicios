// Fazer um programa que pergunta um valor em metros e imprime o correspondente em decímetros, centímetros e milímetros.
import javax.swing.JOptionPane;
public class exercicio1 {

    public static void main(String[] args) {

        //valor de entrada
        float metroEntrada = 0, calcDeci, calcCenti, calcMili;
        //entrada do valor
        metroEntrada =  Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com o valor em metros(Exemplo: 0.00)"));
        //calculos com o valor fornecido
        calcDeci = metroEntrada * 10;
        calcCenti = metroEntrada * 100;
        calcMili = metroEntrada * 1000;
        //exibição dos resultados
        JOptionPane.showMessageDialog(null, "O valor de entrada em metros foi de: "+metroEntrada+"\nSeu valor em decímetros é de: "+calcDeci+"\nEm centímetros: "+calcCenti+"\nEm milímetros: "+calcMili);

    }
    
}
