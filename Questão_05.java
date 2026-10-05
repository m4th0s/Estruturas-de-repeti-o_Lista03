import java.util.Scanner;

public class Questão_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maiorIdade = 0;
        int menorIdade = 0;
        int quantidade = 0;
        boolean primeiraPessoa = true;

        while (true) {

            System.out.print("Digite a idade (-1 para terminar): ");
            int idade = sc.nextInt();

            if (idade == -1) {
                break;
            }

            System.out.println("Digite o sexo (m/f): ");
            char sexo = sc.next().charAt(0);

            System.out.println("Digite a cor dos olhos (azuis/verdes/castanhos): ");
            String olhos = sc.next();

            System.out.println("Digite a cor dos cabelos (louros/castanhos/pretos): ");
            String cabelos = sc.next();

            // Maior e menor idade
            if (primeiraPessoa) {
                maiorIdade = idade;
                menorIdade = idade;
                primeiraPessoa = false;
            } else {

                if (idade > maiorIdade) {
                    maiorIdade = idade;
                }

                if (idade < menorIdade) {
                    menorIdade = idade;
                }
            }

            // Mulheres entre 18 e 35 anos,
            // com olhos verdes e cabelos louros
            if (sexo == 'f' &&
                idade >= 18 &&
                idade <= 35 &&
                olhos.equals("verdes") &&
                cabelos.equals("louros")) {

                quantidade++;
            }
        }

        System.out.println();
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Quantidade de mulheres: " + quantidade);

        sc.close();
    }
}