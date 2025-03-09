package com.sellsync.gestaovenda.modelo.repositorio.impl;

import com.sellsync.gestaovenda.modelo.conexao.Conexao;
import com.sellsync.gestaovenda.modelo.conexao.ConexaoMySQL;
import com.sellsync.gestaovenda.modelo.entidade.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UsuarioRepositorioImpl extends CrudRepositorioImpl{
    
    Conexao conexao;
    
    public UsuarioRepositorioImpl() {
        super(Usuario.class);
    }
    
    public Optional<Object> buscarpeloEmail(String email) {
        conexao = new ConexaoMySQL();
        try {
            String SQL = "SELECT * FROM usuario WHERE email = ?";
            
            PreparedStatement ps = this.conexao.obterConexao().prepareStatement(SQL);
            ps.setString(1, email);
            ResultSet resultSet = ps.executeQuery();
            
            if (resultSet.next()) {
                return Optional.ofNullable(getT(resultSet));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
     
        return Optional.empty();
    }
    
    public static void main(String[] args) {
        Usuario usuario = Usuario.builder()
                .nome("Marcos Gabriel")
                .email("marcosgabriel@sellsync.com")
                .estado(true)
                .senha(new BCryptPasswordEncoder().encode("12345"))
                .perfil("PADRAO")
                .dataCriacao(LocalDateTime.now())                
                .build();
        
        UsuarioRepositorioImpl rep = new UsuarioRepositorioImpl();
        rep.salvar(usuario);
    }
}
