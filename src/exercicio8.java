import javax.swing.JOptionPane;

// Fazer uma rotina que recebe um array do tipo double e o número de valores que devem ser solicitados ao usuário e devolve o array preenchido com os valores digitados.

public class exercicio8 {

    public static void main(String[] args){

        int nmrDesejado = 0;
        double[] vtr;
        String txt = "";

        nmrDesejado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de números desejados"));

        vtr =  new double [nmrDesejado];

        for (int i = 0; i < nmrDesejado; i++) {

           vtr [i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite os valores para o vetor"));
            
        }

        for (int i = 0; i < vtr.length; i++) {

            txt +=vtr[i]+" | ";

           
        }
        JOptionPane.showMessageDialog(null, txt);

    }
    
}
