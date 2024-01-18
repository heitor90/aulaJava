// importação da biblioteca 'Math'
import java.lang.Math;
// declaração do objeto 'MathAbsolute'
public class MathAbsolute {
    public static void main(String[] args) {
        // criação do método executor (main)
        // static: este método não pode ser alterado não pode ser alterado
        // void: não pode retornar nenhum valor
        // String[] args: declaração de todos os paramêtros

        double num = -9; // criação da variável 'num' do tipo 'double' com o valor de "-9"  
        int num2 = -8; // criação da variável 'num2' do tipo 'int' com o valor de "-8"
        float num3 = -7; // criação da variável 'num3' do tipo 'float' com o valor de "-7" 

        System.out.println("Sem biblioteca: " + num); // exibição da variável concatenada sem o uso da biblioteca
        System.out.println("Com biblioteca: " + (Math.abs(num))); // exibição da variável concatenada usando a biblioteca

        System.out.println("Sem biblioteca: " + num2); // exibição da variável concatenada sem o uso da biblioteca
        System.out.println("Com biblioteca: " + (Math.abs(num2))); // exibição da variável concatenada usando a biblioteca

        System.out.println("Sem biblioteca: " + num3); // exibição da variável concatenada sem o uso da biblioteca
        System.out.println("Com biblioteca: " + (Math.abs(num3))); // exibição da variável concatenada usando a biblioteca
    }
}
