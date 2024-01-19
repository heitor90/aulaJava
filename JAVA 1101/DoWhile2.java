// importação de todas biblioctecas que foram usadas
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// declaração do objeto 'DoWhile'
public class DoWhile2 {
    public static void main(String[] args) {
        List<String> usersLogged = new ArrayList<>(); // criando uma nova lista do tipo 'String' com o nome 'userLogged'
        int usersLimit = 5; // criação da variável 'userLimit' do 'int' com o valor de "5" 
        Scanner sc = new Scanner(System.in); // declaração do Scanner com o nome de 'sc'
        String usuario; // criação da variável 'usuario' do tipo 'String'

        try { // início do bloco 'try' 
            while (usersLogged.size() < usersLimit) { // início do bloco 'while' (loop); enquanto o número de usuários logados for menor
                // que o limite, execute o código abaixo
                System.out.println("Usuários logados: " + usersLogged); // exibe todos os usuários logados no sistema até o momento 
                System.out.println("Digite um nome de usuário para ser adicionado e tecle 'Enter': "); // exibe a pergunta no console 
                // para que o usuário possa digitar
                usuario = sc.nextLine(); // criação de um input para guardar os dados digitados acima na variável 'usuario'
                if (usuario != "") { // inicio do bloco 'if' (estrutura condicional); se a variável 'usuario' estiver ocupada
                    usersLogged.add(usuario); // adicione o 'usuario' digitado
                } else { // bloco else = senão
                    usersLogged.add("user " + Math.random()); // adicione um usuário aleatório
                }
            }
            for (int i = 0; i < usersLimit; i++) { // início do bloco 'for' (laços de repetição; criação da variável 'i' do tipo 'int'
                // com o valor de "0"; enquanto 'i' for MENOR que 'usersLimit'; adicione 1 no 'i'
                System.out.println("Usuário da lista: " + "'" + usersLogged.get(i) + "'"); // exibe no console todos usuários criados
            }
            Thread.sleep(1000); // contador de 1000 milisegundos (1 segundo)
        } catch (Exception e) { // bloco catch (captura de excessão)
            System.err.println("Usuário inválido." + e.getMessage()); // exibe no console uma mensagem de erro e qual o tipo de erro
        }
        sc.close(); // fechamento do scanner 'sc'
    }
}
