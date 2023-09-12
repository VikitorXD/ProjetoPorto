package org.example.Infraestructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleDatabaseSetup {

    private static final String DB_URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static final String DB_USER = "rm551886";
    private static final String DB_PASSWORD = "040204";

    public  void createTales(){
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement statement = connection.createStatement()) {

            // Criar tabela Artista
            String createTales = "CREATE TABLE NOVO_CLIENTE_CADASTRO (" +
                    "ID NUMBER NOT NULL," +
                    "NOME VARCHAR2(255) NOT NULL," +
                    "CPF VARCHAR2(11 CHAR) NOT NULL," +
                    "NUMERO_CNH VARCHAR2(20) NOT NULL" +
                    ")";
            statement.execute(createTales);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
