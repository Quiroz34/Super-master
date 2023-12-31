package Ventanas;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Validaciones;
import clases.ManipulaBD;
import clases.Productos;
import clases.Proveedores;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Agregar_Productos extends javax.swing.JFrame
{

    int total;
    private ArrayList<Proveedores> nombres = null;

    /**
     * Creates new form Agregar_Productos
     */
    public Agregar_Productos()
    {
        initComponents();
        CtrlInterfaz.limpia(TNombre, TCompra, TFVenta, TMarca, TVenta);

        ArrayList<Productos> tmp = null;
        tmp = ManipulaBD.ConsultasProductos("id!=", "-1");
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

        nombres = ManipulaBD.ConsultasProveedores("id!=", "-1");
        for (int i = 0; i < nombres.size(); i++)
        {
            JCProveedor.addItem(nombres.get(i).getNombre());
        }

    }

    private SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

    public String ObtenerFecha(JDateChooser jd)
    {
        if (jd.getDate() != null)
        {
            return formato.format(jd.getDate());
        } else
        {
            return null;
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

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcPerec = new javax.swing.JCheckBox();
        TNombre = new javax.swing.JTextField();
        TMarca = new javax.swing.JTextField();
        TCompra = new javax.swing.JTextField();
        TVenta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JCTipo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        TFVenta = new javax.swing.JTextField();
        BAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabelDesc = new javax.swing.JLabel();
        TDescripcion = new javax.swing.JTextField();
        JCProveedor = new javax.swing.JComboBox<>();
        TCad = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Marca");

        jLabel3.setText("$Compra");

        jLabel4.setText("$Venta");

        jLabel5.setText("Proveedor");

        jcPerec.setText("Perecedero");
        jcPerec.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jcPerecActionPerformed(evt);
            }
        });

        TNombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                TNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                TNombreKeyTyped(evt);
            }
        });

        TMarca.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                TMarcaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                TMarcaKeyTyped(evt);
            }
        });

        TCompra.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                TCompraKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                TCompraKeyTyped(evt);
            }
        });

        TVenta.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                TVentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                TVentaKeyTyped(evt);
            }
        });

        jLabel6.setText("Fecha de Caducidad");
        jLabel6.setEnabled(false);

        JCTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cantidad", "Peso" }));

        jLabel7.setText("Forma de venta");

        TFVenta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                TFVentaActionPerformed(evt);
            }
        });
        TFVenta.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                TFVentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                TFVentaKeyTyped(evt);
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

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabelDesc.setText("Descripcion");

        TDescripcion.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                TDescripcionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                TDescripcionKeyTyped(evt);
            }
        });

        TCad.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabelDesc))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(TNombre)
                            .addComponent(TMarca)
                            .addComponent(TCompra)
                            .addComponent(TDescripcion)
                            .addComponent(JCProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcPerec)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JCTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TFVenta))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BAceptar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabelDesc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(TCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JCProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcPerec)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JCTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(TFVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(TCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(BAceptar)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BAceptarActionPerformed
    {//GEN-HEADEREND:event_BAceptarActionPerformed

        int id = total++;
        String item = (String) JCProveedor.getSelectedItem();
        int id_Proveedor = 0;
        for (int i = 0; i < nombres.size(); i++)
        {
            if (item.compareTo(nombres.get(i).getNombre()) == 0)
            {
                id_Proveedor = nombres.get(i).getId();
            }
        }
        int codigo = id + id_Proveedor + 1 * 3;
        String nombre = TNombre.getText();
        String descripcion = TDescripcion.getText();
        float precio_Venta = Float.parseFloat(TVenta.getText());
        float precio_Compra = Float.parseFloat(TCompra.getText());
        boolean perecedero;
        String caducidad = "";
        if (jcPerec.isSelected())
        {
            perecedero = true;
            String cadu = ObtenerFecha(TCad);

            if (cadu != null)
            {
                caducidad = cadu;
            }

        } else
        {
            perecedero = false;
        }
        item = (String) JCTipo.getSelectedItem();
        int cantidad = 0;
        float peso = 0;
        if (item.compareTo("Cantidad") == 0)
        {
            cantidad = Integer.parseInt(TFVenta.getText());
            peso = 0;
        } else
        {
            if (item.compareTo("Peso") == 0)
            {
                peso = Float.parseFloat(TFVenta.getText());
                cantidad = 0;
            }
        }
        String marca = TMarca.getText();
        boolean estatus = true;
        boolean existencias;
        if (cantidad > 0 || peso > 0)
        {
            existencias = true;
        } else
        {
            existencias = false;
        }
        int ventas = 0;

        ManipulaBD.AltasProductos(id, id_Proveedor, codigo, nombre, descripcion, precio_Venta, precio_Compra,
                perecedero, cantidad, peso, caducidad, marca, estatus, existencias, ventas);
        btnCancelarActionPerformed(evt);
        
        
        JOptionPane.showMessageDialog(null, "Producto agregado");
        CtrlInterfaz.limpia(TNombre,TCompra,TDescripcion, TFVenta, TMarca, TVenta);
        CtrlInterfaz.habilita(false, BAceptar);
    }//GEN-LAST:event_BAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
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
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void TNombreKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_TNombreKeyPressed
    {//GEN-HEADEREND:event_TNombreKeyPressed
        if (TNombre.getText().isEmpty() != true)
        {
            Validaciones.enter(this, evt, TMarca);
        }
    }//GEN-LAST:event_TNombreKeyPressed

    private void TNombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_TNombreKeyTyped
    {//GEN-HEADEREND:event_TNombreKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_TNombreKeyTyped

    private void TMarcaKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_TMarcaKeyPressed
    {//GEN-HEADEREND:event_TMarcaKeyPressed
        if (TMarca.getText().isEmpty() != true)
        {
            Validaciones.enter(this, evt, TDescripcion);
        }
    }//GEN-LAST:event_TMarcaKeyPressed

    private void TMarcaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_TMarcaKeyTyped
    {//GEN-HEADEREND:event_TMarcaKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_TMarcaKeyTyped

    private void TCompraKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_TCompraKeyPressed
    {//GEN-HEADEREND:event_TCompraKeyPressed
        if (TCompra.getText().isEmpty() != true)
        {
            Validaciones.enter(this, evt, TVenta);
        }
    }//GEN-LAST:event_TCompraKeyPressed

    private void TCompraKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_TCompraKeyTyped
    {//GEN-HEADEREND:event_TCompraKeyTyped
        Validaciones.validaFlotantes(evt);
    }//GEN-LAST:event_TCompraKeyTyped

    private void TVentaKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_TVentaKeyPressed
    {//GEN-HEADEREND:event_TVentaKeyPressed
        if (TVenta.getText().isEmpty() != true)
        {
            Validaciones.enter(this, evt, JCProveedor);
        }
    }//GEN-LAST:event_TVentaKeyPressed

    private void TVentaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_TVentaKeyTyped
    {//GEN-HEADEREND:event_TVentaKeyTyped
        Validaciones.validaFlotantes(evt);
    }//GEN-LAST:event_TVentaKeyTyped

    private void TFVentaKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_TFVentaKeyPressed
    {//GEN-HEADEREND:event_TFVentaKeyPressed
        if (TFVenta.getText().isEmpty() != true)
        {
            Validaciones.enter(this, evt, evt); 
            CtrlInterfaz.habilita(true, BAceptar);
        }
    }//GEN-LAST:event_TFVentaKeyPressed

    private void TFVentaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_TFVentaKeyTyped
    {//GEN-HEADEREND:event_TFVentaKeyTyped
        Validaciones.validaFlotantes(evt);
        
    }//GEN-LAST:event_TFVentaKeyTyped

    private void jcPerecActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jcPerecActionPerformed
    {//GEN-HEADEREND:event_jcPerecActionPerformed
        if (jcPerec.isSelected())
        {
            TCad.setEnabled(true);
            jLabel6.setEnabled(true);
        } else
        {
            TCad.setEnabled(false);
            jLabel6.setEnabled(false);
        }
    }//GEN-LAST:event_jcPerecActionPerformed

    private void TDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TDescripcionKeyPressed
        if (TDescripcion.getText().isEmpty() != true)
        {
            Validaciones.enter(this, evt, TCompra);
        }
    }//GEN-LAST:event_TDescripcionKeyPressed

    private void TDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TDescripcionKeyTyped
        Validaciones.validaAlfanumerico(evt);
    }//GEN-LAST:event_TDescripcionKeyTyped

    private void TFVentaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_TFVentaActionPerformed
    {//GEN-HEADEREND:event_TFVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFVentaActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Agregar_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Agregar_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Agregar_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Agregar_Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAceptar;
    private javax.swing.JComboBox<String> JCProveedor;
    private javax.swing.JComboBox<String> JCTipo;
    private com.toedter.calendar.JDateChooser TCad;
    private javax.swing.JTextField TCompra;
    private javax.swing.JTextField TDescripcion;
    private javax.swing.JTextField TFVenta;
    private javax.swing.JTextField TMarca;
    private javax.swing.JTextField TNombre;
    private javax.swing.JTextField TVenta;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelDesc;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JCheckBox jcPerec;
    // End of variables declaration//GEN-END:variables
}
