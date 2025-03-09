package com.sellsync.gestaovenda.modelo.servicos;

import com.sellsync.gestaovenda.modelo.entidade.Usuario;
import com.sellsync.gestaovenda.modelo.repositorio.impl.UsuarioRepositorioImpl;
import java.util.Optional;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UsuarioServico {
    
    private UsuarioRepositorioImpl usuarioRepositorio;
    
    public UsuarioServico() {
        usuarioRepositorio = new UsuarioRepositorioImpl();
    }
    
    public String login(String email, String senha) {
        Optional usuarioOptional = usuarioRepositorio.buscarpeloEmail(email);
    
        if (usuarioOptional.isPresent()) {
            Usuario usuario = (Usuario) usuarioOptional.get();
            
            if (validaSenha(senha, usuario.getSenha())) {
                if (!usuario.getEstado()) 
                    return "Usuário bloqueado. Validar com o Admin!";
                    
                return "Email e senha corretos";                               
            }
            return "Email ou senha incorreta(o)...";
        }
        
        return "Usuário inexistente...";
    }
    
    public boolean validaSenha(String senhaInsirida, String senhaUsuario) {
        return new BCryptPasswordEncoder().matches(senhaInsirida, senhaUsuario);
    }
}
