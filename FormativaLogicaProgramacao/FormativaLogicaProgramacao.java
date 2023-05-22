package FormativaLogicaProgramacao;

import java.util.Random;
import java.util.Scanner;

public class FormativaLogicaProgramacao {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio1() {
        int linhas;
        int colunas;

        System.out.println("Qual o número de linhas da matriz?");
        linhas = sc.nextInt();
        System.out.println("Qual o número de colunas da matriz?");
        colunas = sc.nextInt();
        int matriz[][] = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }

        for (int i = 0; i < linhas; i++) {
            System.out.print(" | ");
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" | ");
        }

        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < linhas; i++) {
            System.out.print(" | ");
            for (int j = 0; j < colunas; j++) {
                if (i > j) {
                    System.out.print("1 ");
                } else if (i == j) {
                    System.out.print("0 ");
                } else {
                    System.out.print("2 ");
                }
            }
            System.out.println(" | ");
        }
    }

    public void exercicio2() {
        Random rd = new Random();
        int valorSorteado = rd.nextInt(0, 1000) + 1;
        boolean tenteNovamente = true;
        double numeroDigitado;
        int tentativas = 0;

        System.out.println(
                "|=============================================================================================================|");
        System.out.println(
                "|  Bem vindo ao Jogo dos Numeros, eu vou pensar em um número de 0 a 1000 e você deve descobrir qual o número!  |");
        System.out.println(
                "|=============================================================================================================|");

        while (tenteNovamente) {
            System.out.println("Digite um número");
            numeroDigitado = sc.nextInt();
            if (numeroDigitado == valorSorteado) {
                tentativas++;
                System.out.println("Parabéns, você acertou! Você precisou de " + tentativas + " tentativas!");
                tenteNovamente = false;
            } else if (numeroDigitado > valorSorteado) {
                tentativas++;
                System.out.println("O número que você digitou é maior do que o sorteado");
                System.out.println("======================");
            } else if (numeroDigitado < valorSorteado) {
                tentativas++;
                System.out.println("O número que você digitou é menor do que o sorteado");
                System.out.println("======================");
            }
        }
    }

    public void exercicio3() {
        int tamanhoVetor = rd.nextInt(100, 1000);
        int vetor[] = new int[tamanhoVetor];
        int cPar = 0;
        int cImpar = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(1, 100);
        }

        System.out.println("Os números pares do vetor são:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print("Vetor" + "["+i + "]" + "=" + vetor[i] +" ");
            }
            if ((i + 1) % 2 == 0) {
                cImpar++; /*
                           * Adiciona-se 1 para não haver erros ao considerar a posição ao invés do
                           * índice, então caso a operação resulte em 0, quer dizer que o número é ímpar e
                           * o contrário para par
                           */
            } else {
                cPar++;
            }

        }
        System.out.println(" ");
        System.out.println("--------------------------------------------------");

        System.out.println("Os números ímpares do vetor são:");
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] % 2 != 0) {
                System.out.print("Vetor" + "["+j+"]" + "=" + vetor[j] + " ");
            }
        }
        System.out.println(" ");
        System.out.println("--------------------------------------------------------");
        System.out.println("A quantidade de números em posições pares é de: " + cPar);
        System.out.println("A quantidade de números em posições ímpares é de: " + cImpar);
    }
}