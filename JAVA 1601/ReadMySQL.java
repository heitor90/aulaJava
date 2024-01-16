import java.sql.*;
import java.util.*;
public class ReadMySQL {
    public static void main(String[] args) {
        String status = "Nada aconteceu ainda...";
        try {
            Connection conn = App.conectar();
            Scanner scnInput = new Scanner(System.in);
            System.out.println("Digite o login para verificação: ");
            String strBusca = scnInput.nextLine();
            String strSqlSelect = "select * from `mysql_connector`.`tbl_login` where `login` = '" + strBusca + "';";
            Statement stmSql = conn.createStatement();
            ResultSet rsSql = stmSql.executeQuery(strSqlSelect);
            String nomes = "";
            while (rsSql.next()) {
                nomes += "[" + rsSql.getString("nome") + "] ";
            }
            status = "Nome(s): " + nomes;
            stmSql.close();
            rsSql.close();
            scnInput.close();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e);
        }
        System.out.println(status);
    }
}