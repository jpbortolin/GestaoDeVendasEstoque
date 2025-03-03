package com.sellsync.gestaovenda.modelo.conexao;

import java.sql.Connection;
import java.sql.SQLException;

public interface Conexao {
    
    public Connection obterConexao() throws SQLException;
    public void fechaConexao() throws SQLException;
}
