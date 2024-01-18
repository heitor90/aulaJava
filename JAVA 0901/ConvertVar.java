// importando todas as bibliotecas dentro do 'util'
import java.util.*;
// declaração do objeto 'ConvertVar'
public class ConvertVar {
    public static void main(String[] args) {
        // criação do método executor (main)
        // static: este método não pode ser alterado não pode ser alterado
        // void: não pode retornar nenhum valor
        // String[] args: declaração de todos os paramêtros
        try { // iniando o bloco 'try' 
            System.out.println("Digite apenas um número de 0 a 9"); // iniciando um campo para entrada de dados, entre os "" é o que irá aparecer pra o usuário
            Scanner sc = new Scanner(System.in); // declaração do Scanner com o nome 'sc' para guardar os dados que serão inseridos pelo usuário 
            int intVar = Integer.valueOf(sc.nextLine()); // criação da variável 'intVar' do tipo 'int' e fazendo a locação no scanner que foi declarado acima
            System.out.println("O número digitado é: " + intVar); //  exibição da variável 'intVar' usando o valor que o usuário digitou e usando a concatenação
            sc.close(); // fechamento do scanner
        } catch (Exception e) { // início do bloco 'catch', capturando a excessão(erro)
            System.out.println("Ops! Você não digitou um número. Tente novamente"); // exibição de uma mensagem de erro para o usuário
        }
    }
}
