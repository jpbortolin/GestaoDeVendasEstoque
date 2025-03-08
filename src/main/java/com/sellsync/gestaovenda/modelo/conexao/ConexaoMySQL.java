package com.sellsync.gestaovenda.modelo.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL implements Conexao {

    private static Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/gestaovenda";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    @Override
    public Connection obterConexao() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return connection;
    }

    @Override
    public void fechaConexao() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
