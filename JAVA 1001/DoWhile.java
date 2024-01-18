// declaração do objeto 'DoWhile'
public class DoWhile {
    public static void main(String[] args) {
        // criação do método executor (main)
        // static: este método não pode ser alterado não pode ser alterado
        // void: não pode retornar nenhum valor
        // String[] args: declaração de todos os paramêtros
        boolean deuRuim = false; // criação da variável 'deuRuim' do tipo 'boolean' com o valor "false"
        int tempoTotal = 2; // criação da variável 'tempoTotal' do tipo 'int' com o valor "2"
        int minutoContado = 0; // criação da variável 'minutoContado' do tipo 'int' com o valor "0"
        int segundoContado = 0; // // criação da variável 'segundoContado' do tipo 'int' com o valor "0"
        while (minutoContado <= tempoTotal) { // início do bloco de repetição 'while'
            try { // inicio do bloco 'try'
                System.out.println("Assistindo filme. Se passaram " + minutoContado + " minuto(s) e " + segundoContado + " segundo(s)");
                Thread.sleep(1000); // contador de 1000 milisegundos que será iniciado na variável na linha abaixo
                segundoContado++;  
                if (segundoContado == 60) { // início do bloco de estrutura condicional. A cada 60 segundos contados
                    minutoContado ++; // será adicinado 1 na variável 'minutoContado'
                    segundoContado = 0; // e a variável 'segundoContado' irá ser zerada novamente
                }
            } catch (Exception e) { // bloco catch (captura a excessão/erro gerada)
                deuRuim = true; // mudança da variável 'deuRuim' para "true"
                System.out.println("Ops! Ocorreu um erro " + e); // exbição de mensagem no console + o tipo de erro capturado
            }
            finally{ // bloco finally                
                    if(deuRuim = true){ // início de outro bloco 'if' (estrutura condicional), se a variaável 'deuRuim' for "true"
                        System.out.println("ACABOU!!"); // exiba a seguint mensagem no console
                    }
                    else{ // bloco senao 
                        System.out.println("isso ai"); // Senão, exiba a seguinte mensagem no console
                    }
                }
            }
        }
    }
}
