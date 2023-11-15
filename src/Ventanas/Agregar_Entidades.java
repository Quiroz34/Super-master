/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import cjb.ci.CtrlInterfaz;
import clases.Entidades;
import clases.ManipulaBD;
import clases.Pais;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Agregar_Entidades extends javax.swing.JFrame
{
    int total;
    ArrayList<Pais> nombres = null;

    /**
     * Creates new form Agregar_Entidades
     */
    public Agregar_Entidades()
    {
        initComponents();
        ArrayList<Entidades> tmp = null;
        tmp = ManipulaBD.ConsultasEntidades("id!=", "-1");
        try
        {
            System.out.println(tmp.isEmpty());
            if (!tmp.isEmpty())
            {
                total = tmp.get(tmp.size() - 1).getId() + 1;
                System.out.println(total);
            } else
            {
                total = 0;
            }
        } catch (java.lang.NullPointerException e)
        {
            total = 0;
        }

        nombres = ManipulaBD.ConsultasPais("id!=", "-1");
        for (int i = 0; i < nombres.size(); i++)
        {
            JCPais.addItem(nombres.get(i).getNombre());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        Pais = new javax.swing.JLabel();
        JCPais = new javax.swing.JComboBox<>();
        Entidad = new javax.swing.JLabel();
        TEntidad = new javax.swing.JTextField();
        BRegresar = new javax.swing.JButton();
        BAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pais.setText("Pais");

        Entidad.setText("Entidad");

        TEntidad.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                TEntidadKeyTyped(evt);
            }
        });

        BRegresar.setText("Regresar");
        BRegresar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BRegresarActionPerformed(evt);
            }
        });

        BAceptar.setText("Aceptar");
        BAceptar.setEnabled(false);
        BAceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pais)
                            .addComponent(Entidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCPais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TEntidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BAceptar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pais)
                    .addComponent(JCPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Entidad)
                    .addComponent(TEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BRegresar)
                    .addComponent(BAceptar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BAceptarActionPerformed
    {//GEN-HEADEREND:event_BAceptarActionPerformed
        int id = total++;
        int id_Pais = 0;
        String item = (String) JCPais.getSelectedItem();
        for (int i = 0; i < nombres.size(); i++)
        {
            if (item.compareTo(nombres.get(i).getNombre()) == 0)
            {
                id_Pais = nombres.get(i).getId();
            }
        }
        String nombres = TEntidad.getText();
        boolean estatus = true;
        ManipulaBD.AltasEntidades(id_Pais, id, nombres, estatus);
        
        JOptionPane.showMessageDialog(null, "Entidad agregada");
       
        cjb.ci.CtrlInterfaz.habilita(false, BAceptar);
        cjb.ci.CtrlInterfaz.limpia(TEntidad);

    }//GEN-LAST:event_BAceptarActionPerformed

    private void TEntidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TEntidadKeyTyped
        if (TEntidad.getText().length() == 30)
        {
            evt.consume();
        } else
        {
            cjb.ci.Validaciones.validaAlfabeticos(evt);
            CtrlInterfaz.habilita(true, BAceptar);
        }
    }//GEN-LAST:event_TEntidadKeyTyped

    private void BRegresarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BRegresarActionPerformed
    {//GEN-HEADEREND:event_BRegresarActionPerformed
        switch (InicioSesion.usuario.get(0).getClasificacion())
        {
            case 1:
                new Menu_Gerente().setVisible(true);
                break;
            case 2:
                new Menu_SubGerente().setVisible(true);
                break;
            case 3:
                new Menu_Empleado().setVisible(true);
                break;
        }
        this.setVisible(false);
    }//GEN-LAST:event_BRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Agregar_Entidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Agregar_Entidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Agregar_Entidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Agregar_Entidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Agregar_Entidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAceptar;
    private javax.swing.JButton BRegresar;
    private javax.swing.JLabel Entidad;
    private javax.swing.JComboBox<String> JCPais;
    private javax.swing.JLabel Pais;
    private javax.swing.JTextField TEntidad;
    // End of variables declaration//GEN-END:variables
}
