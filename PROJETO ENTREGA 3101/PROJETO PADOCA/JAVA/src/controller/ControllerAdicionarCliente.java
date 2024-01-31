package controller;

import view.*;

public class ControllerAdicionarCliente {

    public static String nomeCliente, cpfCliente;

    public static void adicionarCliente() {
        nomeCliente = ViewAdicionarCliente.nomeDoCliente;
        cpfCliente = ViewAdicionarCliente.cpfDoCliente;
    }
}
