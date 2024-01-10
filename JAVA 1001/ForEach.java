public class ForEach {
    public static void main(String[] args) {
        String[] frutas = {"Maçâ","Banana","Pera","Uva","Manga","Melancia"};

        System.out.println("Você tem [" + frutas.length + "]");

        for(int i=0; i < frutas.length; i++){
            System.out.println("Fruta: " + frutas[i]);
        }
    }
}
