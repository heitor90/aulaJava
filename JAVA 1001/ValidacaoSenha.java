// importação do Scanner
import java.util.Scanner;
// declaração do objeto 'IfElse2'
public class ValidacaoSenha {
    public static void main(String[] args) {
        // criação do método executor (main)
        // static: este método não pode ser alterado não pode ser alterado
        // void: não pode retornar nenhum valor
        // String[] args: declaração de todos os paramêtros
        final String nome = "Heitor", senha = "Senac"; // criando duas variáveis do tipo 'String' e 'final'(o valor NÃO pode ser alterado)
        // variável 'nome' com o valor "Heitor" e variável 'senha' com o valor "Senac"
        
        Scanner sc = new Scanner(System.in); // declarando o Scanner com o nome 'sc'

        System.out.println("Digite o seu nome: "); //  criação de um input para inserção de dados do usuário
        String nome1 = sc.nextLine(); // criando outra variável do tipo 'String' com o nome 'nome1' para guardar o dado digitado acima

        System.out.println("Digite a sua senha: "); //  criação de um input para inserção de dados do usuário
        String senha1 = sc.nextLine(); // criando outra variável do tipo 'String' com o nome 'senha1' para guardar o dado digitado acima

        if (nome1.equals(nome) && senha1.equals(senha)) { // início do bloco 'if' (estrutura condional). se o nome digitado na variável
            // 'nome1' for IGUAL a variável 'nome' E a senha digitada na variável 'senha1' for IGUAL, execute o código abaixo
            System.out.println("Login efetuado com sucesso"); // texto exibido no console
        } else { // bloco else = senão; senão, execute o código abaixo
            System.out.println("Erro ao efetuar o login."); // texto exibido no console
        }
        // fechamento do Scanner declarado
        sc.close();
    }
}
