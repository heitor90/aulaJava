// importacao do Scanner 
import java.util.Scanner;
// declaração do objeto 'SwitchCase1'
public class SwitchCase1 {
    public static void main(String[] args) {
        
        Scanner scTeste = new Scanner(System.in); // declaração do Scanner com nome 'scTeste'
        String[] varOpcoes = { "Criar", "Ler", "Editar", "Excluir" }; // criação de uma lista do tipo 'String' com 4 opções
        

        for ( int o = 0; o < varOpcoes.length; o++) { // início do bloco de repetição 'for'; criação da variável 'o' do tipo 'int' com
            // valor "0"; enquanto 'o' for MENOR que a lista criada; some 1 no 'o'
            System.out.println("Opção ["+ o +"] - " + varOpcoes[o]); // exibe os itens da lista no console
        }
        
        
        System.out.println("Digite uma opção: "); // criação de um input para inserção de dados
        int opcao = scTeste.nextInt(); // criação da variável 'opcao' do tipo 'int', e o que for digitado nela será guardada dentro do scanner
        switch (opcao) { // início do bloco 'switch' (estrutura condional); seleciona a variável 'opcao' para realizar a verifição do valor.
            // todo case irá verificar o valor que for digitado pelo usuário, dependendo do número digitado pelo usuário, irá selecionar o
            // case correto de acordo com o valor e irá executar o código definido por ele.
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

            default: // caso nenhuma das opções válidas por digitadas pelo usuário, irá parar de executar o bloco/finalizar o programa.
                break; // utilizado para quebrar laços de repetições
        }
        scTeste.close(); // fechamento do Scanner declarado
    }
}
