// Fazer um programa que imprime a tabela ASCII (código decimal, código hexa, caracter) para os códigos de 0 a 127.
public class exercicio5 {
    
    public static void main(String[] args){
        //var para conversão
        int decimal = 0;
        String hexadeci = "";
        String crcter = "";

        for (int i = 0; i <= 127; i++) {

            decimal = i;
            hexadeci = Integer.toHexString(i);
            crcter = Character.toString((char)i);

            System.out.println("Decimal: " + decimal + " Hexadecimal: " + hexadeci + " Caracter: " + crcter);
        }

    }
}
