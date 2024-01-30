package view;
import controller.*;

public class ViewApresentaCardapio {
    public static void mostrarCardapio() {
        System.out.println("Lista de produtos:");
        System.out.printf(ControllerInterfaceController.receitasDisponiveis);
        System.out.printf(ControllerInterfaceController.receitasIndisponiveis);
    }
}
