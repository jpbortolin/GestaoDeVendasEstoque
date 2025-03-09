package com.sellsync.gestaovenda.visao.formulario;

import com.sellsync.gestaovenda.controlador.LoginControlador;
import com.sellsync.gestaovenda.visao.componentes.Botao;
import com.sellsync.gestaovenda.visao.componentes.CampoDeSenha;
import com.sellsync.gestaovenda.visao.componentes.CampoDeTexto;
import com.sellsync.gestaovenda.visao.componentes.PanelCarregar;
import com.sellsync.gestaovenda.visao.util.MensagemUtil;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;

public class Login extends javax.swing.JFrame {

    private MigLayout layout;
    private PanelCarregar panelCarregar;
    private MensagemUtil mensagemUtil;
    private LoginControlador loginControlador;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
        
        loginControlador = new LoginControlador(this);

        layout = new MigLayout("fill, insets");
        panelCarregar = new PanelCarregar();
        
        background.setLayout(layout);
        background.add(panelCarregar, "pos 0 0 100% 100%");
        background.add(panelBoard1, "pos 0 0 100% 100%");
        
        mensagemUtil = new MensagemUtil(background, layout);
        evento();
    }

    private void evento() {
        botaoLogin.addActionListener(loginControlador);
    }

    public MensagemUtil getMensagemUtil() {
        return mensagemUtil;
    }
    
    public PanelCarregar getPanelCarregar() {
        return panelCarregar;
    }
    
    public CampoDeSenha getCampoDeSenha() {
        return campoDeSenha;
    }
    
    public CampoDeTexto getCampoDeTextoEmail() {
        return campoDeTextoEmail;
    }

    public Botao getBotaoLogin() {
        return botaoLogin;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBoard1 = new com.sellsync.gestaovenda.visao.componentes.PanelBoard();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        campoDeTextoEmail = new com.sellsync.gestaovenda.visao.componentes.CampoDeTexto();
        campoDeSenha = new com.sellsync.gestaovenda.visao.componentes.CampoDeSenha();
        botaoLogin = new com.sellsync.gestaovenda.visao.componentes.Botao();
        background = new javax.swing.JLayeredPane();

        panelBoard1.setToolTipText("");
        panelBoard1.setCor1(new java.awt.Color(28, 28, 28));
        panelBoard1.setCor2(new java.awt.Color(14, 14, 16));

        jPanel1.setOpaque(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\João Bortolin\\Documents\\NetBeansProjects\\gestaovenda\\src\\main\\java\\com\\sellsync\\gestaovenda\\visao\\icon\\SellSync92x92.png")); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(130, 130, 130)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jSeparator2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        campoDeTextoEmail.setForeground(new java.awt.Color(102, 102, 102));
        campoDeTextoEmail.setCor(new java.awt.Color(255, 255, 255));
        campoDeTextoEmail.setDicas("Email");
        campoDeTextoEmail.setPrefixoIcon(new javax.swing.ImageIcon("C:\\Users\\João Bortolin\\Documents\\NetBeansProjects\\gestaovenda\\src\\main\\java\\com\\sellsync\\gestaovenda\\visao\\icon\\mail.png")); // NOI18N

        campoDeSenha.setForeground(new java.awt.Color(102, 102, 102));
        campoDeSenha.setCor(new java.awt.Color(255, 255, 255));
        campoDeSenha.setDicas("Senha");
        campoDeSenha.setPrefixoIcon(new javax.swing.ImageIcon("C:\\Users\\João Bortolin\\Documents\\NetBeansProjects\\gestaovenda\\src\\main\\java\\com\\sellsync\\gestaovenda\\visao\\icon\\pass.png")); // NOI18N
        campoDeSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDeSenhaActionPerformed(evt);
            }
        });

        botaoLogin.setBackground(new java.awt.Color(246, 120, 40));
        botaoLogin.setForeground(new java.awt.Color(0, 0, 0));
        botaoLogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\João Bortolin\\Documents\\NetBeansProjects\\gestaovenda\\src\\main\\java\\com\\sellsync\\gestaovenda\\visao\\icon\\login.png")); // NOI18N
        botaoLogin.setText("LOGIN");
        botaoLogin.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N

        javax.swing.GroupLayout panelBoard1Layout = new javax.swing.GroupLayout(panelBoard1);
        panelBoard1.setLayout(panelBoard1Layout);
        panelBoard1Layout.setHorizontalGroup(
            panelBoard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoard1Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(panelBoard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoDeTextoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoDeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
            .addGroup(panelBoard1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBoard1Layout.setVerticalGroup(
            panelBoard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoard1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoDeTextoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoDeSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDeSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDeSenhaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane background;
    private com.sellsync.gestaovenda.visao.componentes.Botao botaoLogin;
    private com.sellsync.gestaovenda.visao.componentes.CampoDeSenha campoDeSenha;
    private com.sellsync.gestaovenda.visao.componentes.CampoDeTexto campoDeTextoEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private com.sellsync.gestaovenda.visao.componentes.PanelBoard panelBoard1;
    // End of variables declaration//GEN-END:variables
}
