// import java.util.Scanner;

// public class IfElse {
//     public static void main(String[] args) {

//         System.out.println("Escreva seu nome sem abreviações: ");
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();

//         if (name.equals("Heitor")) {
//             System.out.println("Ok, correto");
//         }
//         else{
//             System.out.println("Incorreto");
//         }
//         sc.close();
//     }
// }

import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner scR = new Scanner(System.in);
        String letra = "De tudo, ao meu amor serei atento";
        boolean sair = false;
        
        String resposta;
        String palavra;
        int posicaoPalavra;

        while (sair == false) {

            System.out.println(letra);
            System.out.println("Digite uma palavra a ser pesquisada no texto: ");

            palavra = sc.nextLine();
            posicaoPalavra = letra.indexOf(palavra);
            if (posicaoPalavra >= 0) {
                System.out.println(
                        "A palavra " + palavra + " foi encontrada na posição " + posicaoPalavra + " no texto");
            } else {
                System.out.println("A palavra não foi encontrada");
            }
                System.out.println("Digite 'continuar' para continuar ou 'sair' para sair");
                resposta = scR.nextLine();

            if (scR.nextLine().equals("sair")) {
                sair = true;
            }
        }
        sc.close();
        scR.close();
    }
}