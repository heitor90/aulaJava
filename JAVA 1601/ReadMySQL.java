// importações das bibliotecas
import java.sql.*;
import java.util.*;
// declaração do objeto 'ReadMySQL'
public class ReadMySQL {
    public static void main(String[] args) {
        // Inicialização da variável de status
        String status = "Nada aconteceu ainda...";

        try {
            // Conexão com o banco de dados
            Connection conn = App.conectar();
            
            // Scanner para entrada do usuário
            Scanner scnInput = new Scanner(System.in);
            
            // Solicitação do login para verificação
            System.out.println("Digite o login para verificação: ");
            String strBusca = scnInput.nextLine();

            // Construção da consulta SQL
            String strSqlSelect = "SELECT * FROM `mysql_connector`.`tbl_login` WHERE `login` = '" + strBusca + "';";

            // Criação do Statement e execução da consulta
            Statement stmSql = conn.createStatement();
            ResultSet rsSql = stmSql.executeQuery(strSqlSelect);

            // Processamento dos resultados da consulta
            String nomes = "";
            while (rsSql.next()) {
                nomes += "[" + rsSql.getString("nome") + "] ";
            }

            // Atualização do status com os nomes encontrados
            status = "Nome(s): " + nomes;

            // fechamento dos recursos usados
            stmSql.close();
            rsSql.close();
            scnInput.close();

        } catch (Exception e) {
            // captura de excessões
            System.out.println("Ops! Ocorreu o erro " + e);
        }

        // Exibição do status no console
        System.out.println(status);
    }
}
