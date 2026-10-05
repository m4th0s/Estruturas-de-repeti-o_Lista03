import java.util.Scanner;

public class Questão_02 {

    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia da primeira data:");
        int dia1 = sc.nextInt();

        System.out.println("Digite o mes da primeira data:");
        int mes1 = sc.nextInt();

        System.out.println("Digite o ano da primeira data:");
        int ano1 = sc.nextInt();

        System.out.println("Digite o dia da segunda data:");
        int dia2 = sc.nextInt();

        System.out.println("Digite o mes da segunda data:");
        int mes2 = sc.nextInt();

        System.out.println("Digite o ano da segunda data:");
        int ano2 = sc.nextInt();

        int dias = 0;

        for (int ano = ano1; ano < ano2; ano++) {

            if (ano % 4 == 0) {
                dias = dias + 366;
            } else {
                dias = dias + 365;
            }
        }

        int[] meses = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (ano1 % 4 == 0) {
            meses[1] = 29;
        }

        for (int i = 1; i < mes1; i++) {
            dias = dias - meses[i - 1];
        }

        dias = dias - dia1;

        if (ano2 % 4 == 0) {
            meses[1] = 29;
        } else {
            meses[1] = 28;
        }

        for (int i = 1; i < mes2; i++) {
            dias = dias + meses[i - 1];
        }

        dias = dias + dia2;

        System.out.println("Dias decorridos: " + dias);

        sc.close();


    }
}
