import java.lang.Math;
// biblioteca

public class MathAbsolute {
    public static void main(String[] args) {
        double num = -9;
        int num2 = -8;
        float num3 = -7;

        System.out.println("Sem biblioteca: " + num);
        System.out.println("Com biblioteca: " + (Math.abs(num)));

        System.out.println("Sem biblioteca: " + num2);
        System.out.println("Com biblioteca: " + (Math.abs(num2)));

        System.out.println("Sem biblioteca: " + num3);
        System.out.println("Com biblioteca: " + (Math.abs(num3)));
    }
}
