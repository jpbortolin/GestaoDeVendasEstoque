package com.sellsync.gestaovenda.visao.componentes;

import com.sellsync.gestaovenda.visao.modelo.MenuModelo;
import java.awt.Font;

public class MenuItem extends javax.swing.JPanel {

    private boolean selecionado;
    private boolean over;
    
    public MenuItem(MenuModelo menuModelo) {
        initComponents();
        setOpaque(false);
        
        switch(menuModelo.getTipoMenu()) {
            case MENU -> {
                labelMenuItemIcon.setIcon(menuModelo.toIcon());
                labelMenuItemNome.setText(menuModelo.getNome());
            }
            case TITULO -> {
                labelMenuItemIcon.setText(menuModelo.getNome());
                labelMenuItemIcon.setFont(new Font("sanserif", 1, 12));
                labelMenuItemNome.setVisible(false);
            }
            case VAZIO -> {
                labelMenuItemNome.setText("");
            }
        }
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMenuItemIcon = new javax.swing.JLabel();
        labelMenuItemNome = new javax.swing.JLabel();

        labelMenuItemNome.setForeground(new java.awt.Color(255, 255, 255));
        labelMenuItemNome.setText("MenuItem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelMenuItemIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMenuItemNome, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelMenuItemIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMenuItemNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelMenuItemIcon;
    private javax.swing.JLabel labelMenuItemNome;
    // End of variables declaration//GEN-END:variables
}
