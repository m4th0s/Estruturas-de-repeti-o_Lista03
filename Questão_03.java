import java.util.Scanner;

public class Questão_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de n: ");
        int n = sc.nextInt();

        double soma = 0;

        for (int i = 1; i <= n; i++) {
            soma = soma + (double) i / i;
        }

        System.out.println("Resultado: " + soma);

        sc.close();
    
    }
}