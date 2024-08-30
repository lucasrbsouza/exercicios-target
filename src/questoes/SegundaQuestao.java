package questoes;

import java.util.Scanner;

//2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1
// e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
// escreva um programa na linguagem que desejar onde, informado um número,
// ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
//
//IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
public class SegundaQuestao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (pertenceAFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }


    public static boolean pertenceAFibonacci(int n) {
        if (n < 0) return false; // Números negativos não pertencem à sequência

        int a = 0;
        int b = 1;

        if (n == a || n == b) return true;


        while (b < n) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b == n;
    }
}

