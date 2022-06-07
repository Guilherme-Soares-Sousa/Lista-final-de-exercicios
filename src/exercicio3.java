// Fazer um programa que solicite 2 números e informe:
// + A soma dos números;
// + O produto do primeiro número pelo quadrado do segundo;
// + O quadrado do primeiro número;
// + A raiz quadrada da soma dos quadrados;
// + O seno da diferença do primeiro número pelo segundo;
// + O módulo do primeiro número.
import javax.swing.JOptionPane;
public class exercicio3 {

    public static void main(String[] args){
        //receptores das entradas
        int nmrUm = 0, nmrDois = 0;
        //var's recptora de calculos
        double soma, produtoPeloQuadrado, quadradoNmrUm, raizSomaQuadrados, senoDifer, moduloNmrUm;
        //entrada valores
        nmrUm = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o primeiro número"));
        nmrDois = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o segundo número"));
        //calculos
        soma = nmrUm + nmrDois;
        produtoPeloQuadrado = nmrUm * (nmrDois*nmrDois);
        quadradoNmrUm = nmrUm * nmrUm;
        raizSomaQuadrados = Math.sqrt((nmrUm*nmrUm)+(nmrDois*nmrDois));
        senoDifer = Math.sin(nmrUm - nmrDois);
        moduloNmrUm = Math.abs(nmrUm);
        //exibição dos resultados
        JOptionPane.showMessageDialog(null, "A soma do número um e dois é: "+soma+"\nO produto do primeiro número pelo quadrado do segundo é: "+produtoPeloQuadrado+"\nO quadrado do primeiro número é: "+quadradoNmrUm+"\nA raiz quadrada da soma dos quadrados é: "+raizSomaQuadrados+"\nO seno de diferença do primeiro número pelo segundo é: "+senoDifer+"\nO módulo do primeiro número é: "+moduloNmrUm);
    }
    
}
