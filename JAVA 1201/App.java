// importação das bibliotecas usadas
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// declaração do objeto 'App'
public class App {
    public static void main(String[] args) {
        // criação do método executor (main)
        // static: este método não pode ser alterado não pode ser alterado
        // void: não pode retornar nenhum valor
        // String[] args: declaração de todos os paramêtros
        System.out.println("Conectando ao banco de dados"); // mensagem mostrada no console
        conectar(); // invocando o método 'conectar'
    }
    public static Connection conectar(){ // criação de outro método público, estático, do tipo 'Connection' com o nome 'conectar' 
        // criação das variáveis para configurar conexão com o banco de dados MySQL
        String status = "Nada aconteceu ainda"; // variável que será exibida no final 
        String mysqlHost = "127.0.0.1";
        String mysqlDb = "mysql_connector";
        String mysqlUser = "heitor";
        String mysqlPassword = "";
        String mysqlUrl = "jdbc:mysql://" + mysqlHost + "/" + mysqlDb + "?user=" + mysqlUser + "&password=" + mysqlPassword;
        
        Connection conn = null; // objeto 'Connection' que representará a conexão ao banco de dados

        try { // iníco do bloco 'try'
            Class.forName("com.mysql.jdbc.Driver").newInstance(); // carregamento do driver JDBC para MySQL
            conn = DriverManager.getConnection(mysqlUrl); // variável 'conn' realiza a conexão com o banco com os dados da variável 'mysqlUrl'
            status = "Conexão realizadas com sucesso"; // atualização do valor do 'status' para ser exibida no console
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            // captura de exceções em caso de falha e atualização do status com a mensagem de erro
            status = "Ops! Algo de errado não está certo " + e;
        }
        System.out.println(status); // mensagem mostrada no console
        return conn; // retorno da 'Connection'
    }
}
