
package view;
import java.util.Scanner;

public class ViewMenuPrincipal {
    public static int opMenuPrincipal;

    

    public static void exibirMenu() {

        Scanner scanOpMenuPrincipal = new Scanner(System.in);

        System.out.println("\nBem-vindo(a) ao Menu Principal. Selecione a opção desejada: ");
        System.out.println("[1] - visualizar cardápio\n[2] - visualizar carrinho de compras\n[3] - visualizar pedidos feitos\n[4] - sair do sistema");
        System.out.print("\nDigite a opção desejada e tecle enter para continuar > ");
        opMenuPrincipal = scanOpMenuPrincipal.nextInt();
        scanOpMenuPrincipal.close();
    }
    public static void opcaoInvalida() {
        System.out.println("Opa, amigão... Parece que você selecionou uma opção inválida. Favor selecionar uma que esteja na lista por gentileza!");
    }
}
