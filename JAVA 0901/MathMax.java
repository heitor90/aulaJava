// declaração do objeto 'MathMax'
public class MathMax {
    public static void main(String[] args) {
        // criação do método executor (main)
        // static: este método não pode ser alterado não pode ser alterado
        // void: não pode retornar nenhum valor
        // String[] args: declaração de todos os paramêtros
        double doubleNum = 23.000; // criação da variável 'doubleNum' do tipo 'double' com o valor "23.000"
        double doubleNum2 = 79.000; // criação da variável 'doubleNum2' do tipo 'double' com o valor "79.000" 

        System.out.println(Math.max(doubleNum, doubleNum2)); // exibição das duas variáveis no console com o uso da biblioteca, que 
        // irá pegar o maior valor e vai exibi-lo
    }
}
