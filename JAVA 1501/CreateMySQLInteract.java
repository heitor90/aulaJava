// importação das bibliotecas
import java.util.Scanner;
import java.sql.Connection;
import java.sql.Statement;
// declaração do objeto 'CreateMySQLInteract'
public class CreateMySQLInteract {
    public static void main(String[] args) {
        // criação do método executor (main)
        // static: este método não pode ser alterado não pode ser alterado
        // void: não pode retornar nenhum valor
        // String[] args: declaração de todos os paramêtros
        // Inicialização da variável 'sair' do tipo boolean para controle do loop while
        boolean sair = false;

        // Inicialização da variável 'status' que será utilizada para indicar o status da criação da tabela
        String status = "Nada aconteceu ainda";

        // Strings para construir a instrução SQL de criação da tabela
        String str1 = "CREATE TABLE `mysql_connector`.`";
        String str2 = "` (`id` INT NOT NULL AUTO_INCREMENT, `";
        String str3 = "` VARCHAR(255) NULL, PRIMARY KEY (`id`));";

        // Inicialização da conexão ao banco de dados e do objeto 'Statement'
        Connection conn = App.conectar();
        Statement stmSql = null;

        // Inicialização do objeto 'Scanner' para leitura de entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Loop while: executa o bloco de código enquanto 'sair' for igual a 'false'
        while (sair == false) {
            try {
                // Solicita ao usuário o nome da tabela a ser criada
                System.out.println("Digite o nome da tabela: ");
                String strTabela = sc.nextLine();

                // Solicita ao usuário o nome do campo a ser adicionado à tabela
                System.out.println("Digite o nome do campo: ");
                String strNomeCampo = sc.nextLine();

                // Construção da instrução SQL completa usando as entradas do usuário
                String strCreateTable = str1 + strTabela + str2 + strNomeCampo + str3;

                // Estabelecimento da conexão ao banco de dados usando o método 'conectar' da classe 'App'
                conn = App.conectar();

                // Criação de um objeto 'Statement' para executar a instrução SQL
                stmSql = conn.createStatement();

                // Adição da instrução SQL ao lote (batch) de execução
                stmSql.addBatch(strCreateTable);

                // Execução do lote de instruções SQL
                stmSql.executeBatch();

                // Atualização do status indicando que a tabela foi criada com sucesso
                status = "Tabela criada com sucesso!";

                // Fechamento do objeto 'Statement'
                stmSql.close();

                // Alteração da variável de controle 'sair' para encerrar o loop
                sair = true;

            } catch (Exception e) {
                // Captura de exceções em caso de erro durante a criação da tabela
                System.err.println("Erro: " + e);
            }
        }
    }
}
