import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero ");
        int numero = scanner.nextInt();

        System.out.println("Digite outro numero ");
        int numero1 = scanner.nextInt(); 
        int soma = numero1 + numero;

        System.out.println("A soma é igual: "+ soma);
    }
}
