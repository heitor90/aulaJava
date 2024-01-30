package view;

import java.util.*;

public class ViewConfirmarPedido {
    
    public static String respConfirmarPedido = "";
    
    public static void exibirConfirmarPedido() {
        Scanner scanConfirmarPedido = new Scanner(System.in);

        System.out.print("\nSelecione a opção desejada:");
        System.out.print("\n[1] - Realizar pedido\n[2] - Voltar ao menu principal\n[3] - Sair do sistema");
        System.out.print("\nDigite a opção desejada e tecle enter para confirmar: ");
        respConfirmarPedido = scanConfirmarPedido.nextLine();
        scanConfirmarPedido.close();
    }
    public static void opcaoInvalida() {
        System.out.print("Ops, você selecionou uma opção inválida. Por favor selecione novamente uma das opções disponíveis");
    }
}
