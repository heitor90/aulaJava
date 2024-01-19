import java.sql.*;
import java.util.*;
public class InteractiveCreateTable {
    public static void main(String[] args) {
        // criação do método executor (main)
        // static: este método não pode ser alterado não pode ser alterado
        // void: não pode retornar nenhum valor
        // String[] args: declaração de todos os paramêtros

        Boolean sair = false; // variável 'sair' do tipo 'boolean' com o valor "false"
        String SouN, tableName, strCreateTable, status = "Nada aconteceu ainda"; // criação de 4 variáveis do tipo 'String'
        
        // declaração de todos os scanners que vao ser usados
        Scanner scnTable = new Scanner(System.in);
        Scanner scnQtdCampos = new Scanner(System.in);
        Scanner scnCampos = new Scanner(System.in);
        Scanner scnSair = new Scanner(System.in);
       
        Connection conn = App.conectar();
        Statement stmSql = null; // criação de uma variável do tipo 'statement'
        List<String> colunas = new ArrayList<>(); // criação de uma lista do tipo 'String'
        int qtdCampos; // variável 'qtdCampos' do tipo 'int'
        status = "Nada aconteceu ainda..."; // variável 'status' do tipo 'String'
        System.out.println("Bem vindo ao criador de tabelas."); // mensagem exibida no console
        while (sair == false) { // bloco 'while (estrutura de repetição)
            try {
                stmSql = conn.createStatement(); // criando um novo 'statement'
                System.out.println("Digite o nome da tabela que deseja criar: "); // mensagem exibida no console
                tableName = scnTable.nextLine(); // input para guardar os dados que serão inseridos acima
                System.out.println("Digite a quantidade de campos (colunas) que deseja criar: "); // mensagem exibida no console
                qtdCampos = scnQtdCampos.nextInt(); // input para guardar os dados que serão inseridos acima

                for (int i = 1; i <= qtdCampos; i++) { // bloco 'for' (estrutura de repetição); variável 'i' do tipo 'int' com valor "0";
                    // enquanto 'i' for MENOR ou IGUAL; adicione 1 no 'i'
                    System.out.println("Digite o nome do campo [" + i + "]: "); // mensagem exibida no console para que seja digitado o 
                    // nome do campo
                    colunas.add(scnCampos.nextLine()); // adicionar as colunas conforme for sendo digitados os campos
                }

                String strColunas = ""; // variável 'strColunas' com valor ""
                for (int c = 0; c < colunas.size(); c++) { // bloco 'for'
                    strColunas = "`" + colunas.get(c) + "` VARCHAR(255) NULL,";
                    // ad
                }

                // Criação da string final para a tabela
                strCreateTable = "CREATE TABLE `mysql_connector`.`" + tableName + "`(" +
                                 "`id` INT NOT NULL AUTO_INCREMENT, " +
                                 strColunas +
                                 "PRIMARY KEY (`id`));";

                // Adição da instrução ao lote e execução do lote
                stmSql.addBatch(strCreateTable);
                stmSql.executeBatch();
                stmSql.close();

                // Pergunta se deseja criar outra tabela
                System.out.println("Deseja criar outra tabela? Digite [s] para criar outra tabela ou [n] para encerrar.");
                SouN = scnSair.nextLine();
                if (SouN.equals("n") || SouN.equals("N")) {
                    sair = true;
                    status = "Tabela(s) criada(s) com sucesso.";
                }
            } catch (Exception e) {
                System.err.println("Ops! Ocorreu o erro " + e);
            }
            System.out.println(status);
        }

        // Fechamento dos scanners
        scnTable.close();
        scnQtdCampos.close();
        scnCampos.close();
        scnSair.close();
    }
}
