package com.sellsync.gestaovenda.controlador;

import com.sellsync.gestaovenda.modelo.servicos.UsuarioServico;
import com.sellsync.gestaovenda.visao.componentes.Mensagem;
import com.sellsync.gestaovenda.visao.formulario.Dashboard;
import com.sellsync.gestaovenda.visao.formulario.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginControlador implements ActionListener {

    private Login login;
    private UsuarioServico usuarioServico;

    public LoginControlador(Login login) {
        this.login = login;
        usuarioServico = new UsuarioServico();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String acao = e.getActionCommand().toLowerCase();

        switch (acao) {
            case "login" -> login();
        }
    }

    private void login() {
        validarCampo();
        String email = login.getCampoDeTextoEmail().getText();
        String senha = String.valueOf(login.getCampoDeSenha().getPassword());

        String mensagem = usuarioServico.login(email, senha);

        if (mensagem.startsWith("Email e senha")) {
            login.getMensagemUtil().mostrarMensagem(Mensagem.TipoMensagem.SUCESSO, mensagem);
            login.getPanelCarregar().setVisible(true);

            new Thread(
                    () -> {
                        try {
                            Thread.sleep(2000);
                            limpaCampo();
                            login.setVisible(false);
                            new Dashboard().setVisible(true);
                        } catch (Exception e) {
                        }
                    }).start();
        } else {
            login.getMensagemUtil().mostrarMensagem(Mensagem.TipoMensagem.ERRO, mensagem);
        }
    }

    private void validarCampo() {
        String email = login.getCampoDeTextoEmail().getText();
        String senha = String.valueOf(login.getCampoDeSenha().getPassword());

        if (email.isBlank() || senha.isBlank()) {
            String mensagem = "Email e senha são obrigatórios";
            login.getMensagemUtil().mostrarMensagem(Mensagem.TipoMensagem.ERRO, mensagem);
            throw new RuntimeException(mensagem);
        }
    }

    private void limpaCampo() {
        login.getCampoDeTextoEmail().setText("");
        login.getCampoDeSenha().setText("");
    }
}
