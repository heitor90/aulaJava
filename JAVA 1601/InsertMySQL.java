// importação das bibliotecas
import java.util.*;
import java.sql.*;
// declaração do objeto 'InsertMySQL
public class InsertMySQL {
    public static void main(String[] args) {
        // criação do método executor (main)
        // static: este método não pode ser alterado não pode ser alterado
        // void: não pode retornar nenhum valor
        // String[] args: declaração de todos os paramêtros
        String status = "Nada aconteceu ainda"; // variável 'status' do tipo 'String' com valor "Nada aconteceu ainda"
        
        boolean sair = false; // variável 'sair' do tipo 'boolean' com o valor "false"
        while (sair == false) { // bloco 'while' (estrutura de repetição)

            // declarações dos scanners
            Scanner scLogin = new Scanner(System.in);
            Scanner scNome = new Scanner(System.in);
            Scanner scSenha = new Scanner(System.in);
            System.out.println("Bem vindo ao cadastro de login."); // mensagem exibida no console
            try { // bloco 'try'
                System.out.println("Digite o login que será cadastro: ");
                String Login = scLogin.nextLine(); // input para guardar o login
                System.out.println("Digite o nome que será cadastro: ");
                String Nome = scNome.nextLine(); // input para guardar o nome do cadastro
                System.out.println("Digite o senha que será cadastro: ");
                String Senha = scSenha.nextLine(); // input para guardar a senha do cadastro
                String strInsert = "insert into mysql_connector. tbl_login (login, nome, senha) values ('"+ Login + "','" + Nome + "','" + Senha + "'););";
                // instruções para inserção de dados
                Connection conn = App.conectar();
                Statement stmSql = conn.createStatement(); // criação do 'statement' para realizar as instruções
                stmSql.addBatch(strInsert); // não sei
                stmSql.executeBatch(); // não sei
                stmSql.close(); // fechamento do 'statement'
                sair = true; // valor do 'sair' atualizado para "true"
            } catch (Exception e) { // bloco catch (captura de excessão)
                System.err.println("Ops! ocorreu um erro " + e); // mensagem de erro exibida no console
            }
            System.out.println(status); // 'status' exbido no console
            
            // fechamento de todos os scanners
            scLogin.close();
            scNome.close();
            scSenha.close();
        }
    }
}
