import java.util.*;
import java.sql.*;

public class CreateMySQLInteract {
    public static void main(String[] args) {
        boolean sair = false;
        String status = "Nada aconteceu ainda";
        String str1 = "CREATE TABLE `mysql_connector`.`";
        String str2 = "` (`id` INT NOT NULL AUTO_INCREMENT, `";
        String str3 = "` VARCHAR(255) NULL, PRIMARY KEY (`id`));";
        Connection conn = App.conectar();
        Statement stmSql = null;
        
        Scanner sc = new Scanner(System.in);

        while (sair == false) {
            try {
                System.out.println("Digite o nome da tabela: ");
                String strTabela = sc.nextLine();

                System.out.println("Digite o nome do campo: ");
                String strNomeCampo = sc.nextLine();

                String strCreateTable = str1 + strTabela + str2 + strNomeCampo + str3;

                 conn = App.conectar();
                 stmSql = conn.createStatement();

                stmSql.addBatch(strCreateTable);
                stmSql.executeBatch();
                status = "Tabela criada com sucesso!";
                stmSql.close();
                sair = true;
            } catch (Exception e) {
                System.err.println("Erro: " + e);
            }
        }
    }
}