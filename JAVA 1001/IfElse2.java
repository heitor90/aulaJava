import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {
        final String nome = "Heitor", senha = "Senac";
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome1 = sc.nextLine();

        System.out.println("Digite a sua senha: ");
        String senha1 = sc.nextLine();

        if (nome1.equals(senha) && senha1.equals(senha)) {
            System.out.println("Erro ao efetuar o login");
        } else {
            System.out.println("Login feito com sucesso.");
        }
    }
}