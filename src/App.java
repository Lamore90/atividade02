import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int numero; 

        System.out.print("Informe o numero: ");
         numero = teclado.nextInt();
        System.out.print("O numero é: "+numero);

        teclado.close();
    }
}