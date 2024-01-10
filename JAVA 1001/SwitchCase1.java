import java.util.Scanner;

public class SwitchCase1 {
    public static void main(String[] args) {
        Scanner scTeste = new Scanner(System.in);
        String[] varOpcoes = { "Criar", "Ler", "Editar", "Excluir" };

        System.out.println("Digite a opção desejada: ");

        for ( int o = 0; o < varOpcoes.length; o++) {
            System.out.println("Opção ["+ o +"] - " + varOpcoes[o]);
        }
        System.out.println("Digite uma opção: ");
        int opcao = scTeste.nextInt();
        switch (opcao) {
            case 0:
                System.out.println("Você selecionou a opção " + varOpcoes[0]);
                break;
            case 1:
                System.out.println("Você selecionou a opção " + varOpcoes[1]);
                break;
            case 2:
                System.out.println("Você selecionou a opção " + varOpcoes[2]);
                break;
            case 3:
                System.out.println("Você selecionou a opção " + varOpcoes[3]);
                break;

            default:
                break;
        }
        scTeste.close();
    }
}