
import java.sql.Connection;
import java.sql.*;
// declaração do objeto 'CreateMySQL'
public class CreateMySQL {
    public static void main(String[] args) {
        // criação do método executor (main)
        // static: este método não pode ser alterado não pode ser alterado
        // void: não pode retornar nenhum valor
        // String[] args: declaração de todos os paramêtros
        String status = "Nada aconteceu ainda"; // criação da variável 'status' do tipo 'String' com o valor "Nada aconteceu ainda"
        
        boolean sair = false; // criação da variável 'sair' do tipo boolean com o valor "false"
        while (sair == false) { // bloco while (estrutura de repetição); enquanto 'sair' for IGUAL a 'false', execute o bloco 'try' abaixo
            try { //  bloco 'try'
                String strCreateTable = "CREATE TABLE `mysql_connector`.`tbl_create` (`id` INT NOT NULL AUTO_INCREMENT, `nome` VARCHAR(255) NULL, PRIMARY KEY (`id`));";
                Connection conn = App.conectar(); // realizando a conexão com o banco de dados
                Statement stmSql = conn.createStatement(); // criação do objeto 'Statement' para executar a instrução SQL
                stmSql.addBatch(strCreateTable); // não entendi
                stmSql.executeBatch(); // não entendi
                status = "Tabela criada com sucesso!"; // atualização do 'status'
                stmSql.close(); // fechamento do 'statement
            } catch (Exception e) { // bloco catch
                System.err.println("Ops! ocorreu um erro " + e); // exibição da mensagem de erro no console
            }
            System.out.println(status); // exibição do 'status' no console 
        }
    }
}
