// declaração do objeto 'OverritingInteger'
public class OverritingInteger {
    public static void main(String[] args) {
        // criação do método executor (main)
        // static: este método não pode ser alterado não pode ser alterado
        // void: não pode retornar nenhum valor
        // String[] args: declaração de todos os paramêtros
       int n1 = 2; // criação da variável 'n1' do tipo 'int' com o valor "2"
       System.out.println(n1); // exibição da variável 'n1' no console
       n1 = 30; // declarando um outro valor para a mesma variável
       System.out.println(n1); // exibição da mesma variável porém com o valor sobrescrito
    }
}
