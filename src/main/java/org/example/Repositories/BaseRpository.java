package org.example.Repositories;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseRpository {

    private static final String DB_URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static final String DB_USER = "rm551886";
    private static final String DB_PASSWORD = "040204";

    protected Connection getConnection() throws Exception {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}
