import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero ");
        String primeiroNome = scanner.nextLine();

        System.out.println("Digite outro numero ");
        String segundoNome = scanner.nextLine(); 

        System.out.println("Sua conta foi criada, seja bem-vindo " + primeiroNome + " "+ segundoNome+" !!");
    }
}
