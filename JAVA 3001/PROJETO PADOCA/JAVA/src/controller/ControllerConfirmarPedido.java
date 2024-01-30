package controller;

import view.ViewConfirmarPedido;
import view.ViewMenuPrincipal;

public class ControllerConfirmarPedido {
    public static void confirmarOpcao() {
        String opConfirmarPedido = "";
        opConfirmarPedido = ViewConfirmarPedido.respConfirmarPedido;
        switch (opConfirmarPedido) {
            case "1": // Realizar o pedido
            
                break;
            case "2": // Voltar ao menu
                ViewMenuPrincipal.exibirMenu();
                ControllerMenuPrincipal.verificarOpcao();
                break;
            case "3":

                break;
            default: // Sair do sistema
                ViewConfirmarPedido.opcaoInvalida();
                ViewConfirmarPedido.exibirConfirmarPedido();
                break;    
        }
    }
}
