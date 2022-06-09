import javax.swing.JOptionPane;

// Fazer uma rotina que recebe como parâmetro um array de 5 posições contendo
// as notas de um aluno ao longo do ano e devolve a média do aluno.

public class exercicio7 {

    public static void main (String[] args){
        //var para recepção de valores e inicializaçao do array
        float media=0;
        float notas[] = new float[5];
        //inserção das 5 notas
        for (int i = 0; i < 5; i++) {

            notas[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite as notas recebidas ao longo do ano"));
        }
        //percorrer o array e somar os valores
        for (int i = 0; i < notas.length; i++) {
            
            media += notas[i]; 
        }
        //fazer a média do array com as notas somadas, levando em consideração suas posições
        media /= notas.length;

        JOptionPane.showMessageDialog(null, "Média foi de: "+media);
    }
    
}
