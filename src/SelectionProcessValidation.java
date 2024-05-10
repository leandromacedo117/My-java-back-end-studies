import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SelectionProcessValidation {
    public static void main(String[] args) {
        /*System.out.println("Seja bem-vindo ao Processo");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Qual seu salário ? ");
        double salary = scanner.nextDouble();

        checkCandicate(salary);*/
        //selectCandicate();
        String [] candicates = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MOCINA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        for(String candicate: candicates){
            gettingTouch(candicate);
        }
    }

    static void gettingTouch(String candicate){
        int attempted = 1;
        boolean continueTly = true;
        boolean a = false;
        do {
            a = meet();
            continueTly = !meet();
            if(continueTly) attempted++;
            else System.out.println("CONTATO REALIZADO COM SUCESSO");
        } while(continueTly && attempted < 3);

        if(a)System.out.println("CONSEGUIMOS COM "+ candicate +"NA " +attempted +" TENTATIVA");
        else System.out.println("Não foi possivel realizar com o candidato de "+ candicate);
    }

    static boolean meet(){
        return new Random().nextInt(3)==1;
    }

    static void selectCandicate() {
        String [] candicates = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MOCINA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int selectCandicate = 0;
        int currentCandicate = 0;
        double salary = 2000.0;
        while (selectCandicate < 5 && currentCandicate < candicates.length) {
            String candicate = candicates[currentCandicate]; 
            double intendedSalary = intendedValue();

            System.out.println(" O candidato "+ candicate + " Solicitou este valor de salário: "+ intendedSalary);

            if(salary >= intendedSalary) selectCandicate++;
            currentCandicate++;
        }
    }

    static double intendedValue() {
        return ThreadLocalRandom.current().nextDouble(1000, 2200);
    }

    static void checkCandicate(double intendedSalary) {
        double salaryCurrent = 2000.0;
        if(salaryCurrent > intendedSalary) System.out.println("Ligar para Candidato");
        else if(salaryCurrent < intendedSalary) System.out.println("Ligar para o candidato com proposta");
        else System.out.println("Aguardando o resultado dos demais candidatos");
    }
}