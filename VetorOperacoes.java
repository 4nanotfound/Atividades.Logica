import java.util.Scanner;

public class VetorOperacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 0;

        while (tamanho <= 1 || tamanho <= 0) {
            System.out.print("Digite o tamanho do vetor, deve ser um número positivo, maior que 1: ");
            tamanho = scanner.nextInt();

            if (tamanho <= 1) {
                System.out.println("Valor inválido, digite um número positivo e maior que um!!!");
            }

        }

        int[] vetor = new int[tamanho];
        System.out.println("Digite os números do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        int soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }

        double media = (double) soma / tamanho;

        int maior = vetor[0];
        for (int valor : vetor) {
            if (valor > maior) {
                maior = valor;
            }
        }

        int menor = vetor[0];
        for (int valor : vetor) {
            if (valor < menor) {
                menor = valor;
            }
        }

        System.out.println("A soma dos valores do vetor é: " + soma);
        System.out.println("A média dos valores do vetor é: " + media);
        System.out.println("O maior número no vetor é: " + maior);
        System.out.println("O menor número no vetor é: " + menor);

        System.out.print("Digite a posição do 1° valor a ser trocado (0 a " + (tamanho - 1) + "):");
        int mudan1;

        for (mudan1 = scanner.nextInt(); mudan1 < 0 || mudan1 > tamanho - 1; mudan1 = scanner.nextInt()) {
            System.out.println("Valor inválido! Digite um valor entre 0 e " + (tamanho - 1) + ":");
        }
        System.out.print("Digite o novo valor para a posição " + (mudan1) + ": ");
        vetor[mudan1] = scanner.nextInt();


        System.out.print("Digite a posição do 2° valor a ser trocado (0 a " + (tamanho - 1) + "): ");
        int mudan2;

        for (mudan2 = scanner.nextInt(); mudan2 < 0 || mudan2 > tamanho - 1; mudan2 = scanner.nextInt()) {
            System.out.println("Valor inválido! Digite um valor entre 0 e " + (tamanho - 1) + ":");
        }
        System.out.print("Digite o novo valor para a posição " + (mudan2) + ":");
        vetor[mudan2] = scanner.nextInt();


        soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }
        media = (double) soma / tamanho;

        System.out.println("Nova soma dos valores do vetor: " + soma);
        System.out.println("Nova média dos valores do vetor: " + media);


    }

}
