package Ventanas;

import cjb.ci.Validaciones;
import clases.Incidentes1;
import clases.ManipulaBD;
import clases.Personas;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Incidentes extends javax.swing.JFrame implements Runnable
{

    private String hora, minuto;
    private Thread hilo;
    int total;

    /**
     * Creates new form Incidentes
     */
    public Incidentes()
    {
        initComponents();
        TFecha.setText(Fecha());
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);

        ArrayList<Incidentes1> tmp = null;
        tmp = ManipulaBD.ConsultasIncidentes("id!=", "-1");
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

    public void hora()
    {
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        minuto = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
    }

    @Override
    public void run()
    {
        Thread current = Thread.currentThread();

        while (current == hilo)
        {
            hora();
            THora.setText(hora + ":" + minuto);
        }

    }

    public static String Fecha()
    {
        Date Fecha = new Date();
        SimpleDateFormat fomatofecha = new SimpleDateFormat("dd/MM/yyyy");
        return fomatofecha.format(Fecha);
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

        jLabel1 = new javax.swing.JLabel();
        TFecha = new javax.swing.JLabel();
        THora = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TIncidentes = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Descripción");

        TFecha.setText("DD/MM/AAAA");

        THora.setText("HH:MM");

        TIncidentes.setColumns(20);
        TIncidentes.setRows(5);
        TIncidentes.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                TIncidentesKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(TIncidentes);

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
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
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TFecha)
                        .addGap(45, 45, 45)
                        .addComponent(THora)
                        .addGap(24, 24, 24)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFecha)
                    .addComponent(THora))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TIncidentesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TIncidentesKeyTyped
        if (TIncidentes.getText().length() == 150)
        {
            evt.consume();
        } else
        {
            Validaciones.validaAlfanumerico(evt);
        }
    }//GEN-LAST:event_TIncidentesKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed

        int id = total++;
        String descripcion = TIncidentes.getText();
        int hora = Integer.parseInt(this.hora);
        int minuto = Integer.parseInt(this.minuto);
        String fecha = TFecha.getText();
        ManipulaBD.AltasIncidentes(id, descripcion, hora, minuto, fecha);
        JOptionPane.showMessageDialog(null, "Incidente enviado Agragado");
        TIncidentes.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Incidentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Incidentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Incidentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Incidentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Incidentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TFecha;
    private javax.swing.JLabel THora;
    private javax.swing.JTextArea TIncidentes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
