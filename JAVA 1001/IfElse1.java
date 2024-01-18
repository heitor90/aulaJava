// importação do scanner
import java.util.Scanner;
// declaração do objeto 'IfElse'
public class IfElse1 {
    public static void main(String[] args) {
        // criação do método executor (main)
        // static: este método não pode ser alterado não pode ser alterado
        // void: não pode retornar nenhum valor
        // String[] args: declaração de todos os paramêtros
        Scanner sc = new Scanner(System.in); // declaração do Scanner com o nome 'sc'
        Scanner scR = new Scanner(System.in); // declaração do Scanner com o nome 'scR'
        String letra = "De tudo, ao meu amor serei atento"; // criação da variável 'letra' do tipo 'String' com o valor "De tudo, ao meu
        // amor serei atento"
        boolean sair = false; // criação da variável 'sair' do tipo 'boolean' com o valor "false"
        
        String resposta; // criação da variável 'resposta' do tipo 'String'
        String palavra; // criação da variável 'palavra' do tipo 'String'
        int posicaoPalavra; // criação da variável 'posicaoPalavra' do tipo 'int'

        while (sair == false) { // início do bloco de repetição 'while'

            System.out.println(letra); // exibição da variável 'letra' no console
            System.out.println("Digite uma palavra a ser pesquisada no texto: "); // criando um input para inserção de dados do usuário

            palavra = sc.nextLine(); // o que for digitado acima, será armazenado na variável e guardado no scanner 
            posicaoPalavra = letra.indexOf(palavra); // aqui será feita a busca na 'letra', então, a 'posicaoPalavra' receberá a posição 
            // da palavra digitada, o 'letra.indexOf(palavra)' fará o seguinte: letra = variável; indexOf = mecanismo de busca; (palavra)
            // = palavra digitada pelo usuário
            
            if (posicaoPalavra >= 0) { // início do bloco 'if' (estrutura condicional); se o resultado da posição da posição da palavra
                //for MAIOR ou IGUAL a 0, faça o código abaixo
                System.out.println(
                        "A palavra " + palavra + " foi encontrada na posição " + posicaoPalavra + " no texto"); //mensagem exibida no console
            } else { // else = senão; senão, faça o código abaixo
                System.out.println("A palavra não foi encontrada"); // mensagem exibida no console
            }
                System.out.println("Digite 'continuar' para continuar ou 'sair' para sair"); // criação de mais um input para entrada de dados
                resposta = scR.nextLine(); // o que for digitado acima, será armazenada na variável 'resposta' e guardada dentro do scanner 

            if (scR.nextLine().equals("sair")) { // outro bloco 'if' (estrutura condional); se a resposta acima for "sair" execute o código
                // abaixo
                sair = true; // mudança de valor da variável 'sair' para "true"; fechando o programa
            }
            else{ // bloco else = senão; senão, execute o código abaixo (continuando o programa)
                sair = false; // sem mudança de valor na variável 'sair'
            }
        }
        // fechamento dos scanners declarados
        sc.close(); 
        scR.close();
    }
}
