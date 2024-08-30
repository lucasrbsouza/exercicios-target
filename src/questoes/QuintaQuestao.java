package questoes;

import java.util.Scanner;

//5) Escreva um programa que inverta os caracteres de um string.
//
//IMPORTANTE:
//a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
//b) Evite usar funções prontas, como, por exemplo, reverse;
public class QuintaQuestao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva uma palavra para reverte-la: ");
        String word = input.next();

        char[] arrays = word.toCharArray();

        for(int i = arrays.length-1; i>=0; i--){
            System.out.print(arrays[i]);
        }
    }
}
