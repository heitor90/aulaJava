public class DoWhile {
    public static void main(String[] args) {
        boolean deuRuim = false;
        int tempoTotal = 2;
        int minutoContado = 0;
        int segundoContado = 0;
        while (minutoContado <= tempoTotal) {
            try {
                System.out.println("Assistindo filme. Se passaram " + minutoContado + " minuto(s) e " + segundoContado + " segundo(s)");
                Thread.sleep(1000);
                segundoContado++;
                if (segundoContado == 60) {
                    minutoContado ++;
                    segundoContado = 0;
                }
            } catch (Exception e) {
                deuRuim = true;
                System.out.println("Ops! Ocorreu um erro " + e);
            }
            finally{
                if (deuRuim) {
                    if(deuRuim = true){
                        System.out.println("ACABOU!!");
                    }
                    else{
                        System.out.println("isso ai");
                    }
                }
            }
        }
    }
}
