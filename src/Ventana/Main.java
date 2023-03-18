/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;

import Controlador.RandomAccess;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Main extends javax.swing.JFrame {
    
    RandomAccess ra; 
    RandomAccessFile raf;
   
    public Main() {
            initComponents();
            setLocationRelativeTo(null);
            
            try {
            ra = new RandomAccess();
            raf = new RandomAccessFile("archivo.dat", "rw");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cajaBuscar = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        botonAgregarInicio = new javax.swing.JButton();
        botonAgregarFinal = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonMostrar = new javax.swing.JButton();
        cajaAddInicio = new javax.swing.JTextField();
        cajaAddFinal = new javax.swing.JTextField();
        cajaEditar = new javax.swing.JTextField();
        cajaEliminar = new javax.swing.JTextField();
        cajaEditarNuevo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botonCrearArchivo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboNumeros = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Buscar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));
        jPanel1.add(cajaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 143, -1));

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        botonAgregarInicio.setText("Agregar al inicio");
        botonAgregarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarInicioActionPerformed(evt);
            }
        });
        jPanel1.add(botonAgregarInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        botonAgregarFinal.setText("Agregar al final");
        botonAgregarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarFinalActionPerformed(evt);
            }
        });
        jPanel1.add(botonAgregarFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });
        jPanel1.add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, -1));

        botonMostrar.setText("Cargar datos");
        botonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));
        jPanel1.add(cajaAddInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 140, -1));
        jPanel1.add(cajaAddFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 140, -1));
        jPanel1.add(cajaEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 49, -1));
        jPanel1.add(cajaEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 140, -1));
        jPanel1.add(cajaEditarNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 60, -1));

        jLabel2.setText("a");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 19, -1));

        botonCrearArchivo.setText("Limpiar");
        botonCrearArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(botonCrearArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        jLabel3.setText("Dato:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel4.setText("Dato:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel5.setText("Datos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel6.setText("Posicion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));
        jPanel1.add(comboNumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 140, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 450, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarActionPerformed
        comboNumeros.removeAllItems();
        ArrayList<Double> numeros = ra.Recuperar();
        int i=0;
        for(Double num: numeros){
            comboNumeros.addItem("Posicion["+i+"] = "+num.toString());
            i++;
        }
        numeros.clear();
        
    }//GEN-LAST:event_botonMostrarActionPerformed

    private void botonAgregarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarInicioActionPerformed

        try {
            double number = Double.parseDouble(cajaAddInicio.getText());
            ra.AgregarInicio(number);
            JOptionPane.showMessageDialog(null, "Dato agregado al inicio");
            cajaAddInicio.setText("");
        } catch (Exception ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonAgregarInicioActionPerformed

    private void botonAgregarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarFinalActionPerformed
        try {
            double number = Double.parseDouble(cajaAddFinal.getText());
            ra.AgregarFinal(number);
            JOptionPane.showMessageDialog(null, "Dato agregado al final");
            cajaAddFinal.setText("");
        } catch (Exception ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonAgregarFinalActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        try {
            int pos = Integer.parseInt(cajaEliminar.getText());
            ra.Eliminar(pos);
            JOptionPane.showMessageDialog(null, "Dato eliminados");
            cajaEliminar.setText("");
        } catch (Exception ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        
        try {
            double number = Double.parseDouble(cajaEditar.getText());
            double nuevo = Double.parseDouble(cajaEditarNuevo.getText());
            
            ra.Editar(number, nuevo);
            JOptionPane.showMessageDialog(null, "Dato editado");
            cajaEditar.setText("");
            cajaEditarNuevo.setText("");
        } catch (Exception ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        try {
            double number = Double.parseDouble(cajaBuscar.getText());
            double retorno = ra.Buscar(number);
            JOptionPane.showMessageDialog(null, "Esta en la posicion: "+(int)retorno);
            cajaBuscar.setText("");
        } catch (Exception ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonCrearArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearArchivoActionPerformed
        comboNumeros.setSelectedItem(null);
        cajaAddInicio.setText("");
        cajaAddFinal.setText("");
        cajaEditar.setText("");
        cajaEditarNuevo.setText("");
        cajaEliminar.setText("");
    }//GEN-LAST:event_botonCrearArchivoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarFinal;
    private javax.swing.JButton botonAgregarInicio;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCrearArchivo;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonMostrar;
    private javax.swing.JTextField cajaAddFinal;
    private javax.swing.JTextField cajaAddInicio;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JTextField cajaEditar;
    private javax.swing.JTextField cajaEditarNuevo;
    private javax.swing.JTextField cajaEliminar;
    private javax.swing.JComboBox<String> comboNumeros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables
}
