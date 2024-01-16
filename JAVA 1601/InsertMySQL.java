import java.util.*;
import java.sql.*;

public class InsertMySQL {
    public static void main(String[] args) {
        String status = "Nada aconteceu ainda";
        
        boolean sair = false;
        while (sair == false) {
            Scanner scLogin = new Scanner(System.in);
            Scanner scNome = new Scanner(System.in);
            Scanner scSenha = new Scanner(System.in);
            System.out.println("Bem vindo ao cadastro de login.");
            try {

                System.out.println("Digite o login que será cadastro: ");
                String Login = scLogin.nextLine();
                System.out.println("Digite o nome que será cadastro: ");
                String Nome = scNome.nextLine();
                System.out.println("Digite o senha que será cadastro: ");
                String Senha = scSenha.nextLine();
                String strInsert = "insert into mysql_connector. tbl_login (login, nome, senha) values ('"+ Login + "','" + Nome + "','" + Senha + "'););";
                Connection conn = App.conectar();
                Statement stmSql = conn.createStatement();
                stmSql.addBatch(strInsert);
                stmSql.executeBatch();
                stmSql.close();
                sair = true;
            } catch (Exception e) {
                System.err.println("Ops! ocorreu um erro " + e);
            }
            System.out.println(status);
            scLogin.close();
            scNome.close();
            scSenha.close();
        }
    }
}