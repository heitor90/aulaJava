// declaração do objeto 'ReadOnlyInteger'
public class ReadOnlyInteger {
    public static void  main(String[] args) {
        // criação do método executor (main)
        // static: este método não pode ser alterado não pode ser alterado
        // void: não pode retornar nenhum valor
        // String[] args: declaração de todos os paramêtros
        final int Var = 100; // criação de uma variável 'Var' do tipo int e também do tipo 'final', que a partir de agora essa
        // variável NÃO poderá ser alterada enquanto ser 'final' com o valor "100", 
        System.out.println(Var); // exibição da variável no console
      }
}
