// declaração do objeto 'Teste' 
public class Teste {
    public static void main(String[] args) {
            // criação do método executor (main)
            // static: este método não pode ser alterado não pode ser alterado
            // void: não pode retornar nenhum valor
            // String[] args: declaração de todos os paramêtros
            System.out.println("Hello Word"); // exibição do texto "Hello Word" no console 
    }

    // declaração de outro objeto estático do tipo 'String' com o nome 'ImprimirTextoMaiusculo' com parametro 'Texto'
    public static String ImprimirTextoMaiusculo(String Texto){
        return Texto.toUpperCase(); // retornando o valor 'Texto' que é 'Hello Word' e o transfornando em um texto com todas as letrar maiúsculas
    }
}
