package controller;
import model.ModelCardapio;
import view.*;

public class ControllerMenuPrincipal {
    public static void verificarOpcao() {

        int OpEscolhida = ViewMenuPrincipal.opMenuPrincipal;

        switch (OpEscolhida) {
            case 1: // Exibir cardápio
                ModelCardapio.consultarEstoque();
                ViewApresentaCardapio.mostrarCardapio();
                ViewConfirmarPedido.exibirConfirmarPedido();
                ControllerConfirmarPedido.confirmarOpcao();
                break;
            case 2: // Visualizar carrinho

            break;
            case 3: // Visualizar pedidos feitos

            break;
            case 4: // Sair do sistema

            break;
            default:
                view.ViewMenuPrincipal.opcaoInvalida();
                ViewMenuPrincipal.exibirMenu();
            break;
        }
    }
}
