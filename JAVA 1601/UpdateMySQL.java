import java.util.*;
import java.sql.*;

public class UpdateMySQL {
    public static void main(String[] args) {
            String status;
        
            Connection conn = App.conectar();
            Scanner scBusca = new Scanner(System.in);
            System.out.println("Digite o seu login para verificar as informações: ");
            String strBusca = scBusca.nextLine();
            String strSqlUpdate = "UPDATE `mysql_connector`.`tbl_login` SET `login` = '" + strBusca + "';";
            Statement stmSql = conn.createStatement();
            ResultSet rsSql = stmSql.executeQuery(strSqlUpdate);
            String nomes = "";
            while (rsSql.next()) {
                nomes += "[" + rsSql.getString("nome") + "] ";
            }
        }
    }