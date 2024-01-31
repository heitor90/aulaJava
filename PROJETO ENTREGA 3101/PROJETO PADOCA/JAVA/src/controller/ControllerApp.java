package controller;

import view.*;
import model.*;

// ESTE É O FILE EXECUTÁVEL!

public class ControllerApp {
    public static void main(String[] args) throws Exception {
        ViewBemVindo.bemVindo();
        ViewMenuPrincipal.exibirMenu();
        ControllerMenuPrincipal.verificarOpcao();
    }
}
