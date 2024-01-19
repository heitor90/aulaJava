// importação do scanner
import java.util.Scanner;
// declaração do objeto 'TryCatchFinallyThrow'
public class TryCatchFinallyThrow {
     public static void verificarIdade(short idade) { // criação de um novo método publico, estático e sem retorno; criando a variável 
          // 'idade' do tipo 'short'
        if (idade >= 18) { // início do bloco 'if' (estrutura condional); se a 'idade' for MAIOR ou IGUAL a "18"
            System.out.println("Acesso garantido"); // exibe o texto no console para o usuário
        }
        else{ // bloco else = senão;
            throw new ArithmeticException("Idade não permitida"); // exibe este texto 
        }
     }
     public static void main(String[] args) {
        // criação do método executor (main)
        // static: este método não pode ser alterado não pode ser alterado
        // void: não pode retornar nenhum valor
        // String[] args: declaração de todos os paramêtros
         boolean deuRuim = false; // criação da variável 'deuRuim' do tipo 'boolean' com o valor "false" 
        
        try { // início do bloco 'try'
            Scanner sc = new Scanner(System.in); // criação de um input para inserção de dados
            System.out.println("Digite a sua idade: "); // exibe esta pergunta no console para o usuário
            short idadeDigitada = sc.nextShort(); // criação da variável 'idadeDigitada' do tipo 'short' para guardar o valor que for 
             // digitado acima no scanner
            verificarIdade(idadeDigitada); // invocando o método 'verificarIdade' sobre a variável 'idadeDigitada' e irá fazer a comparação
            sc.close(); // fechamento do scanner 'sc'
        } catch (ArithmeticException e) { // bloco catch (captura de excessão)
            deuRuim = true; // mudando o valor da variável 'deuRuim' para "true"
            Scanner scS = new Scanner(System.in); // criação de outro scanner com o nome 'scS'
            System.err.println("Ocorreu um erro" + e); 
            System.err.println("Ocorreu um erro" + e);
            scS.nextLine(); // fazendo o input para o scanner 'scS' (não entendi o porque desse input)
            scS.close(); // fechamento do scanner 'scS'
        }
        finally{ // bloco finally
            if (deuRuim == true) { // início do bloco 'if' (estrutura condional); se 'deuRuim' for IGUAL "true", executa o código abaixo
                System.out.println("Mensagem Final"); // mostra essa mensagem no console
                
            }
            else{ // bloco else = senão
                System.out.println("Concluído"); // mostre esta mensagem no console
            }
        }
     }
}
