package view;
import java.util.Scanner;

public class ViewAdicionarCliente {

    public static String nomeDoCliente = "", cpfDoCliente = "";

    public static void identificarCliente() {
        Scanner scanLerNomeECPF = new Scanner(System.in);

        System.out.print("Digite o seu CPF, por gentileza: ");
        nomeDoCliente = scanLerNomeECPF.nextLine();
        System.out.print("Digite o seu nome completo, por gentileza: ");
        cpfDoCliente = scanLerNomeECPF.nextLine();
        scanLerNomeECPF.close();
    }
}
