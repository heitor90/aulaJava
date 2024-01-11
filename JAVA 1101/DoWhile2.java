// import java.util.Scanner;

// public class DoWhile2 {
//     public static void main(String[] args) {
//         String nome;
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Escreva alguma coisa: ");
//         nome = sc.nextLine();
//             for(int i = 0; i < 5; i++){
//                 do{
//                     System.out.println("boa");
//                 }
//                 while(!nome.equals("heitor"));
//             }
//             sc.close();
//     }
// }

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        List<String> usersLogged = new ArrayList<>();
        int usersLimit = 5;
        Scanner sc = new Scanner(System.in);
        String usuario;

        try {
            while (usersLogged.size() < usersLimit) {
                System.out.println("Usuários logados: " + usersLogged);
                System.out.println("Digite um nome de usuário para ser adicionado e tecle 'Enter': ");
                usuario = sc.nextLine();
                if (usuario != "") {
                    usersLogged.add(usuario);
                } else {
                    usersLogged.add("user " + Math.random());
                }
            }
            for (int i = 0; i < usersLimit; i++) {
                System.out.println("Usuário da lista: " + "'" + usersLogged.get(i) + "'");
            }
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Usuário inválido." + e.getMessage());
        }
        sc.close();
    }
}