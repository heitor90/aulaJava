import java.util.Scanner;

public class TryCatchFinallyThrow {
     public static void verificarIdade(short idade) {
        if (idade >= 18) {
            System.out.println("Acesso garantido");
        }
        else{
            throw new ArithmeticException("Idade não permitida");
        }
     }
     public static void main(String[] args) {
        
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite a sua idade: ");
            short idadeDigitada = sc.nextShort();
            verificarIdade(idadeDigitada);
            sc.close();
        } catch (ArithmeticException e) {
            Scanner scS = new Scanner(System.in);
            System.err.println("Ocorreu um erro" + e);
            System.err.println("Ocorreu um erro" + e);
            scS.nextLine();
            scS.close();
        }
        finally{
            System.out.println("Mensagem Final");
        }
     }
}

//falta aprimorações------------------condionar o finally