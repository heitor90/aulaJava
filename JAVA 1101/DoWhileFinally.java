// declaração do objeto 'DoWhileFinally'
public class DoWhileFinally {
    public static void main(String[] args) {
        // criação do método executor (main)
        // static: este método não pode ser alterado não pode ser alterado
        // void: não pode retornar nenhum valor
        // String[] args: declaração de todos os paramêtros
        boolean sair = false;
        int tempoTotal = 2; // criação da variável 'tempoTotal' do tipo 'int' com o valor de "2"
        int minutoContado = 0; // criação da variável 'minutoContado' do tipo 'int' com o valor de "0"
        int segundoContado = 0; // criação da variável 'segundoContado' do tipo 'int' com o valor de "0"
        while (minutoContado <= tempoTotal) { // início do bloco 'while' (estrutura de repetição)
            try { // início do bloco 'try'
                System.out.println("Assistindo filme. Se passaram " + minutoContado + " minuto(s) e " + segundoContado + " segundo(s)");
                Thread.sleep(1000); // contador de 1000 milisegundos (1 segundo) que será adicionada na variável 'segundoContado' abaixo
                segundoContado++; 
                if (segundoContado == 60) { //  início do bloco 'if' (estrutura condicional); quando a variável 'segundoContado' chegar 
                    // no valor "60"
                    minutoContado ++; // adicionará 1 na variável 'minutoContado'
                    segundoContado = 0; // e a variável 'segundoContado' será resetada para o valor "0"
                }
            } catch (Exception e) { // bloco catch(captura de excessão)
                System.out.println("Ops! Ocorreu um erro " + e); // exibe na tela uma mensagem indicando que alguma coisa deu errado
                // juntamente com o tipo de erro 'e'
            }
            finally{ // bloco finally
                if(sair = true;){ // início do bloco 'if' (estrutura condional); se a variável 'sair' for 'true' execute o código abaixo
                System.out.println("Reinicie o programa") // exibe na tela essa mensagem para o usuário    
                }
            }
        }
    }
}
