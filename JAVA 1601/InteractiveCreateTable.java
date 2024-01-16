import java.sql.*;
import java.util.*;
public class InteractiveCreateTable {
    public static void main(String[] args) {
        Boolean sair = false;
        String SouN, tableName, strCreateTable, status = "Nada aconteceu ainda";
        Scanner scnTable = new Scanner(System.in);
        Scanner scnQtdCampos = new Scanner(System.in);
        Scanner scnCampos = new Scanner(System.in);
        Scanner scnSair = new Scanner(System.in);
        Connection conn = App.conectar();
        Statement stmSql = null;
        List<String> colunas = new ArrayList<>();
        int qtdCampos;
        status = "Nada aconteceu ainda...";
        System.out.println("Bem vindo ao criador de tabelas.");
        while (sair == false) {
            try {
                stmSql = conn.createStatement();
                System.out.println("Digite o nome da tabela que deseja criar: ");
                tableName = scnTable.nextLine();
                System.out.println("Digite a quantidade de campos (colunas) que deseja criar: ");
                qtdCampos = scnQtdCampos.nextInt();

                for (int i = 1; i <= qtdCampos; i++) {
                    System.out.println("Digite o nome do campo [" + i + "]: ");
                    colunas.add(scnCampos.nextLine());
                }

                String strColunas = "";
                for (int c = 0; c < colunas.size(); c++) {
                    strColunas = "`" + colunas.get(c) + "` VARCHAR(255) NULL,";
                }

                strCreateTable = "CREATE TABLE `mysql_connector`.`" + tableName + "`(`id` INT NOT NULL AUTO_INCREMENT, " + strColunas + " PRIMARY KEY (`id`));";
                stmSql.addBatch(strCreateTable);
                stmSql.executeBatch();
                stmSql.close();

                System.out.println("Deseja criar outra tabela? Digite [s] para criar outra tabela ou [n] para encerrar.");
                SouN = scnSair.nextLine();
                if (SouN.equals("n") || SouN.equals("N")) {
                    sair = true;
                    status = "Tabela(s) criada(s) com sucesso.";
                }
            } catch (Exception e) {
                System.err.println("Ops! ocorreu o erro " + e);
            }
            System.out.println(status);
        }
        scnTable.close();
        scnQtdCampos.close();
        scnCampos.close();
        scnSair.close();
    }
}