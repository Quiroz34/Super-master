package Ventanas;

import cjb.ci.CtrlInterfaz;
import clases.ManipulaBD;
import clases.Personas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Agregar_U extends javax.swing.JFrame
{
    
    int total;

    /**
     * Creates new form Agregar_U
     */
    public Agregar_U()
    {
        initComponents();
        CtrlInterfaz.habilita(false, BAceptar);
        ArrayList<Personas> tmp = null;
        tmp = ManipulaBD.ConsultasPersonas("id!=", "-1");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TApellidoP = new javax.swing.JTextField();
        TNombre = new javax.swing.JTextField();
        TApellidoM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TSexo = new javax.swing.JTextField();
        TSueldo = new javax.swing.JTextField();
        BAceptar = new javax.swing.JButton();
        BRegresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TContrasenia = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        TUsuario = new javax.swing.JTextField();
        JCTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombres");

        jLabel2.setText("Apellido Paterno");

        jLabel3.setText("Apellido Materno");

        TApellidoP.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                TApellidoPKeyTyped(evt);
            }
        });

        TNombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                TNombreKeyTyped(evt);
            }
        });

        TApellidoM.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                TApellidoMKeyTyped(evt);
            }
        });

        jLabel4.setText("Sexo");

        jLabel5.setText("Sueldo");

        TSexo.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                TSexoKeyTyped(evt);
            }
        });

        TSueldo.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                TSueldoKeyTyped(evt);
            }
        });

        BAceptar.setText("Agregar");
        BAceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BAceptarActionPerformed(evt);
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

        jLabel6.setText("Tipo de Empleado");

        jLabel7.setText("Contraseña");

        TContrasenia.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                TContraseniaKeyTyped(evt);
            }
        });

        jLabel9.setText("Usuario");

        TUsuario.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                TUsuarioKeyTyped(evt);
            }
        });

        JCTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Gerente", "SubGerente" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TApellidoP)
                            .addComponent(TNombre)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BRegresar)
                                .addGap(168, 168, 168)
                                .addComponent(BAceptar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(TUsuario)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TSexo)
                            .addComponent(TApellidoM)
                            .addComponent(TSueldo)
                            .addComponent(JCTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JCTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BAceptar)
                    .addComponent(BRegresar))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void TNombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_TNombreKeyTyped
    {//GEN-HEADEREND:event_TNombreKeyTyped
        if (TNombre.getText().length() == 30)
        {
            evt.consume();
        } else
        {
            cjb.ci.Validaciones.validaAlfabeticos(evt);
        }
    }//GEN-LAST:event_TNombreKeyTyped

    private void TApellidoPKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_TApellidoPKeyTyped
    {//GEN-HEADEREND:event_TApellidoPKeyTyped
        if (TApellidoP.getText().length() == 30)
        {
            evt.consume();
        } else
        {
            cjb.ci.Validaciones.validaAlfabeticos(evt);
        }
    }//GEN-LAST:event_TApellidoPKeyTyped

    private void BAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BAceptarActionPerformed
    {//GEN-HEADEREND:event_BAceptarActionPerformed
        int id = total++;
        System.out.println(id);
        String usuario = TUsuario.getText();
        String contrasenia = TContrasenia.getText();
        boolean estatus = true;
        int clasificacion = 0;
        String item = (String) JCTipo.getSelectedItem();
        switch (item)
        {
            case "Empleado": //3
                clasificacion = 3;
                break;
            case "Gerente": //1
                clasificacion = 1;
                break;
            case "SubGerente": //2
                clasificacion = 2;
                break;
        }
        float sueldo = Float.parseFloat(TSueldo.getText());
        String nombre = TNombre.getText();
        String apellidoP = TApellidoP.getText();
        String apellidoM = TApellidoM.getText();
        String sexo = TSexo.getText();
        ManipulaBD.AltasPersonas(id, usuario, contrasenia, estatus, clasificacion, sueldo, nombre,
                apellidoP, apellidoM, sexo);
       
        JOptionPane.showMessageDialog(null, "Usuario Agragado");
         cjb.ci.CtrlInterfaz.habilita(false, BAceptar);
        cjb.ci.CtrlInterfaz.limpia(TNombre,TApellidoP,TApellidoM,TSexo,TSueldo,TUsuario,TContrasenia);
        
        

    }//GEN-LAST:event_BAceptarActionPerformed

    private void TApellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TApellidoMKeyTyped
        if (TApellidoM.getText().length() == 30)
        {
            evt.consume();
        } else
        {
            cjb.ci.Validaciones.validaAlfabeticos(evt);
        }
    }//GEN-LAST:event_TApellidoMKeyTyped

    private void TSexoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TSexoKeyTyped
        if (TSexo.getText().length() == 10)
        {
            evt.consume();
        } else
        {
            cjb.ci.Validaciones.validaAlfabeticos(evt);
        }
    }//GEN-LAST:event_TSexoKeyTyped

    private void TSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TSueldoKeyTyped
        if (TSueldo.getText().length() == 5)
        {
            evt.consume();
        } else
        {
            cjb.ci.Validaciones.validaFlotantes(evt);
        }
    }//GEN-LAST:event_TSueldoKeyTyped

    private void TUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TUsuarioKeyTyped
        if (TUsuario.getText().length() == 15)
        {
            evt.consume();
        } else
        {
            cjb.ci.Validaciones.validaAlfanumerico(evt);
        }
    }//GEN-LAST:event_TUsuarioKeyTyped

    private void TContraseniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TContraseniaKeyTyped
        if (TContrasenia.getText().length() == 16)
        {
            evt.consume();
        } else
        {
            cjb.ci.Validaciones.validaAlfanumerico(evt);
            CtrlInterfaz.habilita(true, BAceptar);
        }
    }//GEN-LAST:event_TContraseniaKeyTyped

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
            java.util.logging.Logger.getLogger(Agregar_U.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Agregar_U.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Agregar_U.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Agregar_U.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Agregar_U().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAceptar;
    private javax.swing.JButton BRegresar;
    private javax.swing.JComboBox<String> JCTipo;
    private javax.swing.JTextField TApellidoM;
    private javax.swing.JTextField TApellidoP;
    private javax.swing.JPasswordField TContrasenia;
    private javax.swing.JTextField TNombre;
    private javax.swing.JTextField TSexo;
    private javax.swing.JTextField TSueldo;
    private javax.swing.JTextField TUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
