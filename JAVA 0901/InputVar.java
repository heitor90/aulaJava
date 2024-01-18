// importando todas as bibliotecas 'util'
import java.util.*;
// declaração do objeto 'InputVar'
public class InputVar {
    public static void main(String[] args) {
        // criação do método executor (main)
        // static: este método não pode ser alterado não pode ser alterado
        // void: não pode retornar nenhum valor
        // String[] args: declaração de todos os paramêtros

        System.out.println("Calculadora de idade!"); // exbibição de texto no console
        System.out.print("Digite o ano de nascimento: "); // input para entrada de dados do usuário
        
        Scanner scnAno = new Scanner(System.in); // declaração do 'Scanner' com o nome 'scAno' para guardar os dados que serão inseridos pelo usuário
        int anoNascimento = scnAno.nextInt(); // criação da variável 'anoNascimento' do tipo 'int' para receber o valor do input
        
        System.out.println("Você tem "+(2024-anoNascimento)+" ano(s)."); // exibição da variavel concatenada no console, utilizando subtração (2024-anoNascimento)  
        scnAno.close(); // fechamento do Scanner 
    }
}
