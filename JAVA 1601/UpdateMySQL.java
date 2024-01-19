// importação das bibliotecas
import java.util.*;
import java.sql.*;
// declaração do objeto 'UpdateMySQL'
public class UpdateMySQL {
    public static void main(String[] args) {
        String status;

        try {
            // Conexão com o banco de dados
            Connection conn = App.conectar();

            // Scanner para entrada do usuário
            Scanner scBusca = new Scanner(System.in);
            System.out.println("Digite o seu login para verificar as informações: ");
            String strBusca = scBusca.nextLine();

            // Construção da consulta SQL de UPDATE
            String strSqlUpdate = "UPDATE `mysql_connector`.`tbl_login` SET `login` = '" + strBusca + "';";

            // Criação do Statement e execução da consulta UPDATE
            Statement stmSql = conn.createStatement();
            int rowsAffected = stmSql.executeUpdate(strSqlUpdate);

            // Exibição do número de linhas afetadas pela atualização
            System.out.println("Número de linhas afetadas: " + rowsAffected);

            stmSql.close(); // Fechamento do 'statement'
            scBusca.close(); // Fechamento do scanner

        } catch (Exception e) {
            // Tratamento de exceções
            System.out.println("Ops! Ocorreu o erro " + e);
        }
    }
}
