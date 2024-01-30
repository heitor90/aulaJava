package view;

import java.util.Scanner;

public class ViewAdicionarProdutos {
    public static int receita = 0;
    public static int qtdDoProduto = 0;

    public static void identificarCliente() {
        Scanner scanReceita = new Scanner(System.in);
        Scanner scanQtdDoProduto = new Scanner(System.in);

        System.out.print("Digite a opção de produto desejada: ");
        receita = scanReceita.nextInt();
        
        System.out.print("Digite a quantidade do produto: ");
        qtdDoProduto = scanQtdDoProduto.nextInt();
        
        scanReceita.close();
        scanQtdDoProduto.close();
    }
}
