import java.util.Scanner;

public class Questão_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maiorIndice = 0;
        int menorIndice = 0;
        int cidadeMaior = 0;
        int cidadeMenor = 0;

        int somaVeiculos = 0;
        int somaAcidentesMenos2000 = 0;
        int cidadesMenos2000 = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Digite o codigo da cidade: ");
            int codigo = sc.nextInt();

            System.out.println("Digite o numero de veiculos: ");
            int veiculos = sc.nextInt();

            System.out.println("Digite o numero de acidentes: ");
            int acidentes = sc.nextInt();

            int indice = acidentes * 100 / veiculos;

            somaVeiculos = somaVeiculos + veiculos;

            if (i == 1) {

                maiorIndice = indice;
                menorIndice = indice;

                cidadeMaior = codigo;
                cidadeMenor = codigo;

            } else {

                if (indice > maiorIndice) {
                    maiorIndice = indice;
                    cidadeMaior = codigo;
                }

                if (indice < menorIndice) {
                    menorIndice = indice;
                    cidadeMenor = codigo;
                }
            }

            if (veiculos < 2000) {
                somaAcidentesMenos2000 =
                    somaAcidentesMenos2000 + acidentes;

                cidadesMenos2000++;
            }
        }

        double mediaVeiculos = somaVeiculos / 5.0;

        double mediaAcidentes = 0;

        if (cidadesMenos2000 > 0) {
            mediaAcidentes =
                somaAcidentesMenos2000 / (double) cidadesMenos2000;
        }

        System.out.println();
        System.out.println("Maior indice de acidentes: " + maiorIndice);
        System.out.println("Cidade com maior indice: " + cidadeMaior);

        System.out.println("Menor indice de acidentes: " + menorIndice);
        System.out.println("Cidade com menor indice: " + cidadeMenor);

        System.out.println("Media de veiculos: " + mediaVeiculos);

        System.out.println(
            "Media de acidentes nas cidades com menos de 2000 veiculos: "
            + mediaAcidentes
        );

        sc.close();
    }
}
