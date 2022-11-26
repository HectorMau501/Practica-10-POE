/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.Math.pow;
import javax.swing.ImageIcon;

/**
 *
 * @author HECTOR MAURICIO
 */
public class frmCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form frmCalculadora
     */
    private boolean punto = true;
    String numero1,numero2;
    String signo,contenido;
    float resultado;
    ImagenFondo fondo;
    
    public frmCalculadora() {
        //fondo = new ImagenFondo("src/Imagenes/calculator-cartoon-object-vector.jpg");
        //this.setContentPane(fondo);
       
        initComponents();
    jbnOcho.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlbCero.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlbCinco.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlbCuatro.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlbDivision.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlbDos.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlbIgual.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlbMenos.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlbMultiplicacion.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlbNueve.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlbPunto.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlbResiduo.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlbSeis.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlbSiete.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlbSuma.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlbTres.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlbUno.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlbCerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlbPotencia.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlbRetroceder.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlbBorrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
       
          //Definimos un objeto con la ruta del archivo
        /*ImageIcon imagenIcono = new ImageIcon("src/Imagenes/calculator-cartoon-object-vector.jpg");
        //Transformar a imagen
        Image imagen = imagenIcono.getImage();
        //Escalar la imagen a un tamanio personalizado (75*75 pixeles por ejemplo)
        Image imagenEscalada = imagen.getScaledInstance(48,48,java.awt.Image.SCALE_SMOOTH);
        //Atualizar imagen de fondo de icono
        imagenIcono = new ImageIcon(imagenEscalada);
        //Asignar a Etiqueta
        jlbCalculadora.setIcon(imagenIcono);*/
    }
    
    @Override
    public Image getIconImage()
    {
        Image valorRetorno = Toolkit.getDefaultToolkit().getImage(
        ClassLoader.getSystemResource("Imagenes/iconmonstr-calculator-1-32.png"));
        return valorRetorno;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbPunto = new javax.swing.JLabel();
        jlbResiduo = new javax.swing.JLabel();
        jlbDivision = new javax.swing.JLabel();
        jlbMultiplicacion = new javax.swing.JLabel();
        jlbNueve = new javax.swing.JLabel();
        jlbSiete = new javax.swing.JLabel();
        jbnOcho = new javax.swing.JLabel();
        jlbSeis = new javax.swing.JLabel();
        jlbCinco = new javax.swing.JLabel();
        jlbCuatro = new javax.swing.JLabel();
        jlbCero = new javax.swing.JLabel();
        jlbMenos = new javax.swing.JLabel();
        jlbSuma = new javax.swing.JLabel();
        jlbTres = new javax.swing.JLabel();
        jlbDos = new javax.swing.JLabel();
        jlbUno = new javax.swing.JLabel();
        jlbIgual = new javax.swing.JLabel();
        jlbCerrar = new javax.swing.JLabel();
        jlbBorrar = new javax.swing.JLabel();
        jlbPotencia = new javax.swing.JLabel();
        jlbRetroceder = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlbResultado = new javax.swing.JTextField();
        jlbImagen = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbPunto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbPuntoMouseClicked(evt);
            }
        });
        getContentPane().add(jlbPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 40, 30));

        jlbResiduo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbResiduoMouseClicked(evt);
            }
        });
        getContentPane().add(jlbResiduo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 40, 30));

        jlbDivision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbDivisionMouseClicked(evt);
            }
        });
        getContentPane().add(jlbDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 40, 30));

        jlbMultiplicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbMultiplicacionMouseClicked(evt);
            }
        });
        getContentPane().add(jlbMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 40, 30));

        jlbNueve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbNueveMouseClicked(evt);
            }
        });
        getContentPane().add(jlbNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 50, 30));

        jlbSiete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbSieteMouseClicked(evt);
            }
        });
        getContentPane().add(jlbSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 40, 30));

        jbnOcho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbnOchoMouseClicked(evt);
            }
        });
        getContentPane().add(jbnOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 40, 30));

        jlbSeis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbSeisMouseClicked(evt);
            }
        });
        getContentPane().add(jlbSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 50, 40));

        jlbCinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbCincoMouseClicked(evt);
            }
        });
        getContentPane().add(jlbCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 40, 40));

        jlbCuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbCuatroMouseClicked(evt);
            }
        });
        getContentPane().add(jlbCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 40, 40));

        jlbCero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbCeroMouseClicked(evt);
            }
        });
        getContentPane().add(jlbCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 40, 30));

        jlbMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbMenosMouseClicked(evt);
            }
        });
        getContentPane().add(jlbMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 40, 40));

        jlbSuma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbSumaMouseClicked(evt);
            }
        });
        getContentPane().add(jlbSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 310, 40, 80));

        jlbTres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbTresMouseClicked(evt);
            }
        });
        getContentPane().add(jlbTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 50, 30));

        jlbDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbDosMouseClicked(evt);
            }
        });
        getContentPane().add(jlbDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 40, 30));

        jlbUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbUnoMouseClicked(evt);
            }
        });
        getContentPane().add(jlbUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 40, 30));

        jlbIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbIgualMouseClicked(evt);
            }
        });
        getContentPane().add(jlbIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 50, 30));

        jlbCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(jlbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 40, 30));

        jlbBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbBorrarMouseClicked(evt);
            }
        });
        getContentPane().add(jlbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 40, 30));

        jlbPotencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbPotenciaMouseClicked(evt);
            }
        });
        getContentPane().add(jlbPotencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 50, 40));

        jlbRetroceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbRetrocederMouseClicked(evt);
            }
        });
        getContentPane().add(jlbRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 40, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vector-potencia-del-icono-aislado-en-el-fondo-blanco-superscrip-133798952.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 40, -1));

        jlbResultado.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jlbResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(jlbResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 30, 240, 60));

        jlbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calculator-cartoon-object-vector.jpg"))); // NOI18N
        jlbImagen.setText("jLabel1");
        getContentPane().add(jlbImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 420));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlbUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbUnoMouseClicked
        // TODO add your handling code here:
        jlbResultado.setText(jlbResultado.getText()+"1");
        
    }//GEN-LAST:event_jlbUnoMouseClicked

    private void jlbCeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCeroMouseClicked
        // TODO add your handling code here:
        jlbResultado.setText(jlbResultado.getText()+"0");
        
    }//GEN-LAST:event_jlbCeroMouseClicked

    private void jlbDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbDosMouseClicked
        // TODO add your handling code here:
        jlbResultado.setText(jlbResultado.getText()+"2");
    }//GEN-LAST:event_jlbDosMouseClicked

    private void jlbTresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbTresMouseClicked
        // TODO add your handling code here:
        jlbResultado.setText(jlbResultado.getText()+"3");
    }//GEN-LAST:event_jlbTresMouseClicked

    private void jlbCuatroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCuatroMouseClicked
        // TODO add your handling code here:
        jlbResultado.setText(jlbResultado.getText()+"4");
    }//GEN-LAST:event_jlbCuatroMouseClicked

    private void jlbCincoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCincoMouseClicked
        // TODO add your handling code here:
        jlbResultado.setText(jlbResultado.getText()+"5");
    }//GEN-LAST:event_jlbCincoMouseClicked

    private void jlbSeisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSeisMouseClicked
        // TODO add your handling code here:
        jlbResultado.setText(jlbResultado.getText()+"6");
    }//GEN-LAST:event_jlbSeisMouseClicked

    private void jlbSieteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSieteMouseClicked
        // TODO add your handling code here:
        jlbResultado.setText(jlbResultado.getText()+"7");
    }//GEN-LAST:event_jlbSieteMouseClicked

    private void jbnOchoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnOchoMouseClicked
        // TODO add your handling code here:
        jlbResultado.setText(jlbResultado.getText()+"8");
    }//GEN-LAST:event_jbnOchoMouseClicked

    private void jlbNueveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbNueveMouseClicked
        // TODO add your handling code here:
        jlbResultado.setText(jlbResultado.getText()+"9");
    }//GEN-LAST:event_jlbNueveMouseClicked

    private void jlbCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jlbCerrarMouseClicked

    private void jlbBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbBorrarMouseClicked
        // TODO add your handling code here:
        jlbResultado.setText("");
    }//GEN-LAST:event_jlbBorrarMouseClicked

    private void jlbDivisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbDivisionMouseClicked
        // TODO add your handling code here:
        if(!jlbResultado.getText().equals(""))
        {
            numero1 = jlbResultado.getText();
            signo = "/";
            jlbResultado.setText("");
        }
    }//GEN-LAST:event_jlbDivisionMouseClicked

    private void jlbMultiplicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbMultiplicacionMouseClicked
        // TODO add your handling code here:
        if(!jlbResultado.getText().equals(""))
        {
            numero1 = jlbResultado.getText();
            signo = "*";
            jlbResultado.setText("");
        };
    }//GEN-LAST:event_jlbMultiplicacionMouseClicked

    private void jlbMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbMenosMouseClicked
        // TODO add your handling code here:
        if(!jlbResultado.getText().equals(""))
        {
            numero1 = jlbResultado.getText();
            signo = "-";
            jlbResultado.setText("");
        }
    }//GEN-LAST:event_jlbMenosMouseClicked

    private void jlbSumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSumaMouseClicked
        // TODO add your handling code here:
        
        if(!jlbResultado.getText().equals(""))
        {
            numero1 = jlbResultado.getText();
            signo = "+";
            jlbResultado.setText("");
        }
        
    }//GEN-LAST:event_jlbSumaMouseClicked

    private void jlbIgualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbIgualMouseClicked
        // TODO add your handling code here:
        String resultadoTotal;
        numero2 = jlbResultado.getText();
       
        
        if(!numero2.equals(""))
        {          
            resultadoTotal = operaciones( numero1,  numero2,  signo);
            jlbResultado.setText("="+resultadoTotal);
        }
        
        numero2 = jlbResultado.getText();
        
        

    }//GEN-LAST:event_jlbIgualMouseClicked

    private void jlbResiduoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbResiduoMouseClicked
        // TODO add your handling code here:
        numero1 = jlbResultado.getText();
        signo= "%";
        jlbResultado.setText("");
    }//GEN-LAST:event_jlbResiduoMouseClicked

    public static String operaciones(String numero1, String numero2, String signo)
    {
        Double resultadoOperacion = 0.0;
        String respuesta;
        double Numero1, Numero2;
        Numero1 = Double.parseDouble(numero1);
        Numero2 = Double.parseDouble(numero2);
        
        if(signo.equals("+"))
        {
            resultadoOperacion = Double.parseDouble(numero1)+ Double.parseDouble(numero2);
        }
        else if(signo.equals("-"))
        {
            resultadoOperacion = Double.parseDouble(numero1) - Double.parseDouble(numero2);
        }
        else if(signo.equals("*"))
        {
            resultadoOperacion = Double.parseDouble(numero1) * Double.parseDouble(numero2);
        }
        else if(signo.equals("/"))
        {
            resultadoOperacion = Double.parseDouble(numero1) / Double.parseDouble(numero2);
        }
        else if(signo.equals("^"))
        {
            resultadoOperacion = Math.pow(Double.parseDouble(numero1),Double.parseDouble(numero2));
        }
        else if(signo.equals("%"))
        {
            resultadoOperacion = Double.parseDouble(numero1) % Double.parseDouble(numero2);
        }
        
        
        respuesta = resultadoOperacion.toString();
        return respuesta;
    }
    
    private void jlbPuntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbPuntoMouseClicked
        // TODO add your handling code here:
        contenido = jlbResultado.getText();
        if(contenido.length() <= 0) 
        {
            jlbResultado.setText("0.");
        }else
        {
            if(jlbResultado.getText().contains("."))
            {
            }
            else
            {
                jlbResultado.setText(jlbResultado.getText()+".");
                punto = false;
            }
        }
    }//GEN-LAST:event_jlbPuntoMouseClicked

    private void jlbPotenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbPotenciaMouseClicked
        // TODO add your handling code here:
        if(!jlbResultado.getText().equals(""))
        {
            numero1 = jlbResultado.getText();
            signo = "^";
            jlbResultado.setText("");
        }
    }//GEN-LAST:event_jlbPotenciaMouseClicked

    private void jlbRetrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbRetrocederMouseClicked
        // TODO add your handling code here:
        contenido = jlbResultado.getText();
        if(contenido.length() > 0)
        {
            contenido = contenido.substring(0, contenido.length() -1);
            jlbResultado.setText(contenido);
        }
    }//GEN-LAST:event_jlbRetrocederMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jbnOcho;
    private javax.swing.JLabel jlbBorrar;
    private javax.swing.JLabel jlbCero;
    private javax.swing.JLabel jlbCerrar;
    private javax.swing.JLabel jlbCinco;
    private javax.swing.JLabel jlbCuatro;
    private javax.swing.JLabel jlbDivision;
    private javax.swing.JLabel jlbDos;
    private javax.swing.JLabel jlbIgual;
    private javax.swing.JLabel jlbImagen;
    private javax.swing.JLabel jlbMenos;
    private javax.swing.JLabel jlbMultiplicacion;
    private javax.swing.JLabel jlbNueve;
    private javax.swing.JLabel jlbPotencia;
    private javax.swing.JLabel jlbPunto;
    private javax.swing.JLabel jlbResiduo;
    private javax.swing.JTextField jlbResultado;
    private javax.swing.JLabel jlbRetroceder;
    private javax.swing.JLabel jlbSeis;
    private javax.swing.JLabel jlbSiete;
    private javax.swing.JLabel jlbSuma;
    private javax.swing.JLabel jlbTres;
    private javax.swing.JLabel jlbUno;
    // End of variables declaration//GEN-END:variables
}