/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import javax.swing.JOptionPane;
import trabalhoFinalPoo.Estocavel;
import trabalhoFinalPoo.Estoque;
import trabalhoFinalPoo.Item;

/**
 *
 * @author Alison Lopes
 */
public class telaPrincipal extends javax.swing.JFrame {
    Estoque estoque;
    /**
     * Creates new form telaPrincipal
     */
    public telaPrincipal(Estoque estoque1) {
        this.estoque = estoque1;
        initComponents();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        adicionarItemBotao = new javax.swing.JButton();
        removerItemBotao = new javax.swing.JButton();
        mostrarItemBotao = new javax.swing.JButton();
        salvarItemBotao = new javax.swing.JButton();
        carregarItemBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adicionarItemBotao.setText("Adicionar item");
        adicionarItemBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarItemBotaoActionPerformed(evt);
            }
        });

        removerItemBotao.setText("Remover item");
        removerItemBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerItemBotaoActionPerformed(evt);
            }
        });

        mostrarItemBotao.setText("Mostrar/alterar item");
        mostrarItemBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarItemBotaoActionPerformed(evt);
            }
        });

        salvarItemBotao.setText("Salvar itens em arquivo");
        salvarItemBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarItemBotaoActionPerformed(evt);
            }
        });

        carregarItemBotao.setText("Carregar itens de arquivo");
        carregarItemBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregarItemBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(adicionarItemBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removerItemBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mostrarItemBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(carregarItemBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salvarItemBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarItemBotao)
                    .addComponent(removerItemBotao)
                    .addComponent(salvarItemBotao))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carregarItemBotao)
                    .addComponent(mostrarItemBotao))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarItemBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarItemBotaoActionPerformed
        new telaAdicionaItem(this.estoque).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_adicionarItemBotaoActionPerformed

    private void mostrarItemBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarItemBotaoActionPerformed
        String procuraNome;
        this.dispose();
        procuraNome = JOptionPane.showInputDialog("Qual item voc?? est?? procurando? ");
        this.estoque.testaItens();
        if ((this.estoque.searchData("nome", procuraNome)).size()>0){
            new telaMostraItem(this.estoque,procuraNome).setVisible(true);

        }else{
            new telaPrincipal(this.estoque).setVisible(true);

        }
    
        
    }//GEN-LAST:event_mostrarItemBotaoActionPerformed

    private void removerItemBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerItemBotaoActionPerformed
        String procuraNome;
        this.dispose();
        procuraNome = JOptionPane.showInputDialog("Qual item voc?? deseja remover? ");
        this.estoque.deleteItem(procuraNome);
        new telaPrincipal(this.estoque).setVisible(true);
    }//GEN-LAST:event_removerItemBotaoActionPerformed

    private void salvarItemBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarItemBotaoActionPerformed
        this.estoque.exportData();
        JOptionPane.showMessageDialog(null,"Arquivo salvo com sucesso", "Salvar itens em arquivo", JOptionPane.INFORMATION_MESSAGE);
        new telaPrincipal(this.estoque).setVisible(true);
    }//GEN-LAST:event_salvarItemBotaoActionPerformed

    private void carregarItemBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregarItemBotaoActionPerformed
        this.estoque.exportData();
        JOptionPane.showMessageDialog(null,"Arquivo carregado com sucesso", "carreagar itens", JOptionPane.INFORMATION_MESSAGE);
        new telaPrincipal(this.estoque).setVisible(true);
    }//GEN-LAST:event_carregarItemBotaoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarItemBotao;
    private javax.swing.JButton carregarItemBotao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mostrarItemBotao;
    private javax.swing.JButton removerItemBotao;
    private javax.swing.JButton salvarItemBotao;
    // End of variables declaration//GEN-END:variables
}
