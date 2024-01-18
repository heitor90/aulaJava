// declaração objeto 'ForEach'
public class ForEach {
    public static void main(String[] args) {
        // criação do método executor (main)
        // static: este método não pode ser alterado não pode ser alterado
        // void: não pode retornar nenhum valor
        // String[] args: declaração de todos os paramêtros
        String[] frutas = {"Maçâ","Banana","Pera","Uva","Manga","Melancia"}; // criação de uma 'ArrayList' com o nome frutas do tipo 'String'
        // com 6 itens

        System.out.println("Você tem [" + frutas.length + "]"); // exibe na tela uma mensagem de quantas frutas existem na lista com o 
        // comando '.lenght' que irá fazer a contagem dos itens dentro da lista e irá exibi-la no console

        for(int i=0; i < frutas.length; i++){ // criação do loop 'for', inicia uma variável 'i' do tipo 'int' com o valor "0";
            // enquanto 'i' for menor que 'frutas.length'(total de frutas dentro da lista); adicione 1.
            System.out.println("Fruta: " + frutas[i]); // exibindo o nome das frutas contidas na lista
        }
    }
}
