package paquete.prueba;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import paquete.clases.*;
import paquete.gestion.*;

public class Ejecutar extends javax.swing.JFrame {


    private DefaultTableModel tb1;
    private DefaultTableModel tb2;

    private GestionRedes refGR;
    private Router refR;

    public Ejecutar() {
        initComponents();
        tb1 = new DefaultTableModel();
        tb2 = new DefaultTableModel();
        tb1.addColumn("Nickname");
        this.jTable1.setModel(tb1);
        tb2.addColumn("IPv4");
        tb2.addColumn("Red");
        tb2.addColumn("Router de llegada");
        tb2.addColumn("Nombre de salida");
        tb2.addColumn("Interfaz de salida");
        tb2.addColumn("Proximo salto");
        tb2.addColumn("Número de saltos");
        this.jTable2.setModel(tb2);
        refGR = new GestionRedes();
        refR = new Router("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField9 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        jTextField9.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("RIPv2");

        jLabel2.setText("Ingreso de Routers:");

        jLabel3.setText("Nombre:");

        jLabel6.setText("Ipv4:");

        jLabel7.setText("Red:");

        jLabel8.setText("Netmask:");

        jLabel9.setText("Nombre:");

        jTextField2.setToolTipText("");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("Crear Router");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ingresar interfaz");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField3.setToolTipText("");

        jTextField4.setToolTipText("");

        jTextField5.setToolTipText("");

        jLabel10.setText("Ingreso de Interfaces:");

        jLabel11.setText("Nombre de router:");

        jButton3.setText("Finalizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Generar tablas de routeo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre:");

        jButton4.setText("Borrar router");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Mostrar tabla de routeo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Cargar Topología Básica");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Cargar Topología Mediana");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Cargar Topología Compleja");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel5.setText("Topologías preingresadas");

        jLabel12.setText("Tabla de Routers:");

        jLabel13.setText("Tabla de routeo del router:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("------");
        jLabel15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton10.setText("Eliminar topología ingresada");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel16.setText("Tiempo (Segundos) Respuesta:");

        jLabel17.setText("-------------------");
        jLabel17.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel18.setText("-------------------");
        jLabel18.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel19.setText("-------------------");
        jLabel19.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(6, 6, 6))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel7))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel10)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3)))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6)))))
                        .addContainerGap(37, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(jLabel12)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombrerout = this.jTextField1.getText();
        Objeto(nombrerout);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nombre = this.jTextField2.getText();
        String ip = this.jTextField3.getText();
        String red = this.jTextField4.getText();
        String netmask = this.jTextField5.getText();
        Interfaz intf = new Interfaz(red, ip, netmask, nombre);
        this.jTextField2.setText("");
        this.jTextField3.setText("");
        this.jTextField4.setText("");
        this.jTextField5.setText("");
        refR.Adicionar(intf);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String codElimina =  this.jTextField6.getText();
        refGR.EliminarPorNick(codElimina);
        this.jTextField6.setText("");
        refGR.IntercambioTablasRouteo();
        PoblarTabla1();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        PoblarTabla2();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        refGR.IngresarRouter(refR);
        this.jTextField1.setText("");
        PoblarTabla1();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        refGR.IntercambioTablasRouteo();
        PoblarTabla1();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //PRIMERA TOPOLOGÍA EN NIVEL DE COMPLEJIDAD
        refGR = new GestionRedes();
        
                            // CREACIÓN DE INTERFACES
                Interfaz RAI1 = new Interfaz("10.0.0.0", "10.0.0.2", "255.0.0.0", "Gig0/0");
                Interfaz RAI2 = new Interfaz("16.0.0.0", "16.0.0.1", "255.0.0.0", "Gig0/1");
                Interfaz RAI3 = new Interfaz("20.0.0.0", "20.0.0.1", "255.0.0.0", "Gig0/2");

                Interfaz RBI1 = new Interfaz("10.0.0.0", "10.0.0.1", "255.0.0.0", "Gig0/0");
                Interfaz RBI2 = new Interfaz("12.0.0.0", "12.0.0.1", "255.0.0.0", "Gig0/1");
                Interfaz RBI3 = new Interfaz("14.0.0.0", "14.0.0.1", "255.0.0.0", "Gig0/2");

                Interfaz RCI1 = new Interfaz("14.0.0.0", "14.0.0.2", "255.0.0.0", "Gig0/0/0");
                Interfaz RCI2 = new Interfaz("22.0.0.0", "22.0.0.2", "255.0.0.0", "Gig0/0/1");

                Interfaz RDI1 = new Interfaz("20.0.0.0", "20.0.0.2", "255.0.0.0", "Gig0/0/0");
                Interfaz RDI2 = new Interfaz("22.0.0.0", "22.0.0.1", "255.0.0.0", "Gig0/0/1");

                Interfaz REI1 = new Interfaz("12.0.0.0", "12.0.0.2", "255.0.0.0", "Gig0/0");
                Interfaz REI2 = new Interfaz("16.0.0.0", "16.0.0.2", "255.0.0.0", "Gig0/1");
                Interfaz REI3 = new Interfaz("18.0.0.0", "18.0.0.1", "255.0.0.0", "Gig0/2");

                Interfaz RFI1 = new Interfaz("18.0.0.0", "18.0.0.2", "255.0.0.0", "Gig0/0/0");

                
                
                            // CREACIÓN DE ROUTERS
                Router RA = new Router("A");
                Router RB = new Router("B");
                Router RC = new Router("C");
                Router RD = new Router("D");
                Router RE = new Router("E");
                Router RF = new Router("F");

                
                
                            // INGRESO DE INTERFACES A ROUTERS Y CREACIÓN DE TABLA DE ROUTEO
                RA.Adicionar(RAI1);
                RA.Adicionar(RAI2);
                RA.Adicionar(RAI3);

                RB.Adicionar(RBI1);
                RB.Adicionar(RBI2);
                RB.Adicionar(RBI3);

                RC.Adicionar(RCI1);
                RC.Adicionar(RCI2);

                RD.Adicionar(RDI1);
                RD.Adicionar(RDI2);

                RE.Adicionar(REI1);
                RE.Adicionar(REI2);
                RE.Adicionar(REI3);

                RF.Adicionar(RFI1);

                
                
                            // INGRESO DE ROUTERS A GESTIÓN
                refGR.IngresarRouter(RA);
                refGR.IngresarRouter(RB);
                refGR.IngresarRouter(RC);
                refGR.IngresarRouter(RD);
                refGR.IngresarRouter(RE);
                refGR.IngresarRouter(RF);

                
                
                            // LOS ROUTERS INGRESADOS A GESTIÓN INTERCAMBIAN TODAS SUS TABLAS DE ROUTEO Y SE TERMINA RIP.v2
                long T1inicio=0,T1fin=0;
                double T1tiempoTranscurrido=0;
                float T1tiempoCorto=0;
                
                            //EN ESTE MOMENTO SE COMENZARÁ EL CRONÓMETRO PORQUE DESDE AQUÍ SE INTERCAMBIAN LAS TABLAS DE ROUTEO
                T1inicio=System.nanoTime();
                refGR.IntercambioTablasRouteo();
                T1fin=System.nanoTime();
                            //EN ESTE MOMENTO SE PAUSA EL CRONÓMETRO PORQUE YA SE TERMINARON DE COMPARTIR TODAS LAS TABLAS DE ROUTEO
                            
                T1tiempoTranscurrido=(double)(T1fin-T1inicio)*(1.0e-9);
                T1tiempoCorto = (float) T1tiempoTranscurrido;
                if(this.jLabel17.getText().equalsIgnoreCase("-------------------")){
                    this.jLabel17.setText(Float.toString(T1tiempoCorto));
                }
                PoblarTabla1();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        //SEGUNDA TOPOLOGÍA EN NIVEL DE COMPLEJIDAD
        refGR = new GestionRedes();
        
                            // CREACIÓN DE INTERFACES
                Interfaz RAI1 = new Interfaz("128.1.0.0", "128.1.0.2", "255.255.0.0", "Gig0/0/0");

                Interfaz RBI1 = new Interfaz("130.1.0.0", "130.1.0.2", "255.255.0.0", "Gig0/0");
                Interfaz RBI2 = new Interfaz("128.1.0.0", "128.1.0.1", "255.255.0.0", "Gig0/1");
                Interfaz RBI3 = new Interfaz("146.1.0.0", "146.1.0.1", "255.255.0.0", "Gig0/2");

                Interfaz RCI1 = new Interfaz("130.1.0.0", "130.1.0.1", "255.255.0.0", "Gig0/0");
                Interfaz RCI2 = new Interfaz("134.1.0.0", "134.1.0.2", "255.255.0.0", "Gig0/1");
                Interfaz RCI3 = new Interfaz("150.1.0.0", "150.1.0.2", "255.255.0.0", "Gig0/2");

                Interfaz RDI1 = new Interfaz("152.1.0.0", "152.1.0.1", "255.255.0.0", "Gig0/0");
                Interfaz RDI2 = new Interfaz("150.1.0.0", "150.1.0.1", "255.255.0.0", "Gig0/1");
                Interfaz RDI3 = new Interfaz("148.1.0.0", "148.1.0.1", "255.255.0.0", "Gig0/2");

                Interfaz REI1 = new Interfaz("146.1.0.0", "146.1.0.2", "255.255.0.0", "Gig0/0");
                Interfaz REI2 = new Interfaz("144.1.0.0", "144.1.0.1", "255.255.0.0", "Gig0/1");
                Interfaz REI3 = new Interfaz("148.1.0.0", "148.1.0.2", "255.255.0.0", "Gig0/2");

                Interfaz RFI1 = new Interfaz("134.1.0.0", "134.1.0.1", "255.255.0.0", "Gig0/0");
                Interfaz RFI2 = new Interfaz("136.1.0.0", "136.1.0.2", "255.255.0.0", "Gig0/1");
                Interfaz RFI3 = new Interfaz("132.1.0.0", "132.1.0.1", "255.255.0.0", "Gig0/2");

                Interfaz RGI1 = new Interfaz("144.1.0.0", "144.1.0.2", "255.255.0.0", "Gig0/0/0");
                Interfaz RGI2 = new Interfaz("142.1.0.0", "142.1.0.1", "255.255.0.0", "Gig0/0/1");

                Interfaz RHI1 = new Interfaz("142.1.0.0", "142.1.0.2", "255.255.0.0", "Gig0/0");
                Interfaz RHI2 = new Interfaz("152.1.0.0", "152.1.0.2", "255.255.0.0", "Gig0/1");
                Interfaz RHI3 = new Interfaz("140.1.0.0", "140.1.0.1", "255.255.0.0", "Gig0/2");

                Interfaz RII1 = new Interfaz("140.1.0.0", "140.1.0.2", "255.255.0.0", "Gig0/0");
                Interfaz RII2 = new Interfaz("136.1.0.0", "136.1.0.1", "255.255.0.0", "Gig0/1");
                Interfaz RII3 = new Interfaz("138.1.0.0", "138.1.0.1", "255.255.0.0", "Gig0/2");

                Interfaz RJI1 = new Interfaz("132.1.0.0", "132.1.0.2", "255.255.0.0", "Gig0/0/0");

                Interfaz RKI1 = new Interfaz("138.1.0.0", "138.1.0.2", "255.255.0.0", "Gig0/0/0");



                            // CREACIÓN DE ROUTERS
                Router RA = new Router("A");
                Router RB = new Router("B");
                Router RC = new Router("C");
                Router RD = new Router("D");
                Router RE = new Router("E");
                Router RF = new Router("F");
                Router RG = new Router("G");
                Router RH = new Router("H");
                Router RI = new Router("I");
                Router RJ = new Router("J");
                Router RK = new Router("K");



                            // INGRESO DE INTERFACES A ROUTERS
                RA.Adicionar(RAI1);

                RB.Adicionar(RBI1);
                RB.Adicionar(RBI2);
                RB.Adicionar(RBI3);

                RC.Adicionar(RCI1);
                RC.Adicionar(RCI2);
                RC.Adicionar(RCI3);

                RD.Adicionar(RDI1);
                RD.Adicionar(RDI2);
                RD.Adicionar(RDI3);

                RE.Adicionar(REI1);
                RE.Adicionar(REI2);
                RE.Adicionar(REI3);

                RF.Adicionar(RFI1);
                RF.Adicionar(RFI2);
                RF.Adicionar(RFI3);

                RG.Adicionar(RGI1);
                RG.Adicionar(RGI2);

                RH.Adicionar(RHI1);
                RH.Adicionar(RHI2);
                RH.Adicionar(RHI3);

                RI.Adicionar(RII1);
                RI.Adicionar(RII2);
                RI.Adicionar(RII3);

                RJ.Adicionar(RJI1);

                RK.Adicionar(RKI1);



                            // INGRESO DE ROUTERS A GESTIÓN
                refGR.IngresarRouter(RA);
                refGR.IngresarRouter(RB);
                refGR.IngresarRouter(RC);
                refGR.IngresarRouter(RD);
                refGR.IngresarRouter(RE);
                refGR.IngresarRouter(RF);
                refGR.IngresarRouter(RG);
                refGR.IngresarRouter(RH);
                refGR.IngresarRouter(RI);
                refGR.IngresarRouter(RJ);
                refGR.IngresarRouter(RK);



                            // LOS ROUTERS INGRESADOS A GESTIÓN INTERCAMBIAN TODAS SUS TABLAS DE ROUTEO Y SE TERMINA RIP.v2
                long T2inicio=0,T2fin=0;
                double T2tiempoTranscurrido=0;
                float T2tiempoCorto=0;
                
                            //EN ESTE MOMENTO SE COMENZARÁ EL CRONÓMETRO PORQUE DESDE AQUÍ SE INTERCAMBIAN LAS TABLAS DE ROUTEO
                T2inicio=System.nanoTime();
                refGR.IntercambioTablasRouteo();
                T2fin=System.nanoTime();
                            //EN ESTE MOMENTO SE PAUSA EL CRONÓMETRO PORQUE YA SE TERMINARON DE COMPARTIR TODAS LAS TABLAS DE ROUTEO
                            
                T2tiempoTranscurrido=(double)(T2fin-T2inicio)*(1.0e-9);
                T2tiempoCorto = (float) T2tiempoTranscurrido;
                if(this.jLabel18.getText().equalsIgnoreCase("-------------------")){
                    this.jLabel18.setText(Float.toString(T2tiempoCorto));
                }
                PoblarTabla1();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        //TERCERA TOPOLOGÍA EN NIVEL DE COMPLEJIDAD
        refGR = new GestionRedes();
        
                            // CREACIÓN DE INTERFACES
                Interfaz RAI1 = new Interfaz("10.0.0.0", "10.0.0.2", "255.0.0.0", "Gig0/0");
                Interfaz RAI2 = new Interfaz("16.0.0.0", "16.0.0.2", "255.0.0.0", "Gig0/1");
                Interfaz RAI3 = new Interfaz("18.0.0.0", "18.0.0.1", "255.0.0.0", "Gig0/2");

                Interfaz RBI1 = new Interfaz("20.0.0.0", "20.0.0.2", "255.0.0.0", "Gig0/0");
                Interfaz RBI2 = new Interfaz("18.0.0.0", "18.0.0.2", "255.0.0.0", "Gig0/1");
                Interfaz RBI3 = new Interfaz("24.0.0.0", "24.0.0.1", "255.0.0.0", "Gig0/2");

                Interfaz RCI1 = new Interfaz("26.0.0.0", "26.0.0.1", "255.0.0.0", "Gig0/0");
                Interfaz RCI2 = new Interfaz("24.0.0.0", "24.0.0.2", "255.0.0.0", "Gig0/1");
                Interfaz RCI3 = new Interfaz("28.0.0.0", "28.0.0.1", "255.0.0.0", "Gig0/2");

                Interfaz RDI1 = new Interfaz("46.0.0.0", "46.0.0.1", "255.0.0.0", "Gig0/0");
                Interfaz RDI2 = new Interfaz("28.0.0.0", "28.0.0.2", "255.0.0.0", "Gig0/1");
                Interfaz RDI3 = new Interfaz("48.0.0.0", "48.0.0.1", "255.0.0.0", "Gig0/2");

                Interfaz REI1 = new Interfaz("16.0.0.0", "16.0.0.1", "255.0.0.0", "Gig0/0");
                Interfaz REI2 = new Interfaz("20.0.0.0", "20.0.0.1", "255.0.0.0", "Gig0/1");
                Interfaz REI3 = new Interfaz("22.0.0.0", "22.0.0.2", "255.0.0.0", "Gig0/2");

                Interfaz RFI1 = new Interfaz("32.0.0.0", "32.0.0.2", "255.0.0.0", "Gig0/0");
                Interfaz RFI2 = new Interfaz("30.0.0.0", "30.0.0.2", "255.0.0.0", "Gig0/1");
                Interfaz RFI3 = new Interfaz("26.0.0.0", "26.0.0.2", "255.0.0.0", "Gig0/2");

                Interfaz RGI1 = new Interfaz("44.0.0.0", "44.0.0.1", "255.0.0.0", "Gig0/0");
                Interfaz RGI2 = new Interfaz("30.0.0.0", "30.0.0.1", "255.0.0.0", "Gig0/1");
                Interfaz RGI3 = new Interfaz("48.0.0.0", "48.0.0.2", "255.0.0.0", "Gig0/2");

                Interfaz RHI1 = new Interfaz("42.0.0.0", "42.0.0.1", "255.0.0.0", "Gig0/0");
                Interfaz RHI2 = new Interfaz("44.0.0.0", "44.0.0.2", "255.0.0.0", "Gig0/1");
                Interfaz RHI3 = new Interfaz("46.0.0.0", "46.0.0.2", "255.0.0.0", "Gig0/2");

                Interfaz RII1 = new Interfaz("22.0.0.0", "22.0.0.1", "255.0.0.0", "Gig0/0");
                Interfaz RII2 = new Interfaz("14.0.0.0", "14.0.0.2", "255.0.0.0", "Gig0/1");
                Interfaz RII3 = new Interfaz("34.0.0.0", "34.0.0.2", "255.0.0.0", "Gig0/2");

                Interfaz RJI1 = new Interfaz("34.0.0.0", "34.0.0.1", "255.0.0.0", "Gig0/0");
                Interfaz RJI2 = new Interfaz("36.0.0.0", "36.0.0.2", "255.0.0.0", "Gig0/1");
                Interfaz RJI3 = new Interfaz("32.0.0.0", "32.0.0.1", "255.0.0.0", "Gig0/2");

                Interfaz RKI1 = new Interfaz("40.0.0.0", "40.0.0.1", "255.0.0.0", "Gig0/0");
                Interfaz RKI2 = new Interfaz("42.0.0.0", "42.0.0.2", "255.0.0.0", "Gig0/1");

                Interfaz RLI1 = new Interfaz("12.0.0.0", "12.0.0.1", "255.0.0.0", "Gig0/0");
                Interfaz RLI2 = new Interfaz("10.0.0.0", "10.0.0.1", "255.0.0.0", "Gig0/1");

                Interfaz RMI1 = new Interfaz("12.0.0.0", "12.0.0.2", "255.0.0.0", "Gig0/0");
                Interfaz RMI2 = new Interfaz("14.0.0.0", "14.0.0.1", "255.0.0.0", "Gig0/1");

                Interfaz RNI1 = new Interfaz("36.0.0.0", "36.0.0.1", "255.0.0.0", "Gig0/0");
                Interfaz RNI2 = new Interfaz("38.0.0.0", "38.0.0.2", "255.0.0.0", "Gig0/1");

                Interfaz ROI1 = new Interfaz("38.0.0.0", "38.0.0.1", "255.0.0.0", "Gig0/0");
                Interfaz ROI2 = new Interfaz("40.0.0.0", "40.0.0.2", "255.0.0.0", "Gig0/1");



                            // CREACIÓN DE ROUTERS
                Router RA = new Router("A");
                Router RB = new Router("B");
                Router RC = new Router("C");
                Router RD = new Router("D");
                Router RE = new Router("E");
                Router RF = new Router("F");
                Router RG = new Router("G");
                Router RH = new Router("H");
                Router RI = new Router("I");
                Router RJ = new Router("J");
                Router RK = new Router("K");
                Router RL = new Router("L");
                Router RM = new Router("M");
                Router RN = new Router("N");
                Router RO = new Router("O");



                            // INGRESO DE INTERFACES A ROUTERS
                RA.Adicionar(RAI1);
                RA.Adicionar(RAI2);
                RA.Adicionar(RAI3);

                RB.Adicionar(RBI1);
                RB.Adicionar(RBI2);
                RB.Adicionar(RBI3);

                RC.Adicionar(RCI1);
                RC.Adicionar(RCI2);
                RC.Adicionar(RCI3);

                RD.Adicionar(RDI1);
                RD.Adicionar(RDI2);
                RD.Adicionar(RDI3);

                RE.Adicionar(REI1);
                RE.Adicionar(REI2);
                RE.Adicionar(REI3);

                RF.Adicionar(RFI1);
                RF.Adicionar(RFI2);
                RF.Adicionar(RFI3);

                RG.Adicionar(RGI1);
                RG.Adicionar(RGI2);
                RG.Adicionar(RGI3);

                RH.Adicionar(RHI1);
                RH.Adicionar(RHI2);
                RH.Adicionar(RHI3);

                RI.Adicionar(RII1);
                RI.Adicionar(RII2);
                RI.Adicionar(RII3);

                RJ.Adicionar(RJI1);
                RJ.Adicionar(RJI2);
                RJ.Adicionar(RJI3);

                RK.Adicionar(RKI1);
                RK.Adicionar(RKI2);

                RL.Adicionar(RLI1);
                RL.Adicionar(RLI2);

                RM.Adicionar(RMI1);
                RM.Adicionar(RMI2);

                RN.Adicionar(RNI1);
                RN.Adicionar(RNI2);

                RO.Adicionar(ROI1);
                RO.Adicionar(ROI2);



                            // INGRESO DE ROUTERS A GESTIÓN
                refGR.IngresarRouter(RA);
                refGR.IngresarRouter(RB);
                refGR.IngresarRouter(RC);
                refGR.IngresarRouter(RD);
                refGR.IngresarRouter(RE);
                refGR.IngresarRouter(RF);
                refGR.IngresarRouter(RG);
                refGR.IngresarRouter(RH);
                refGR.IngresarRouter(RI);
                refGR.IngresarRouter(RJ);
                refGR.IngresarRouter(RK);
                refGR.IngresarRouter(RL);
                refGR.IngresarRouter(RM);
                refGR.IngresarRouter(RN);
                refGR.IngresarRouter(RO);



                            // LOS ROUTERS INGRESADOS A GESTIÓN INTERCAMBIAN TODAS SUS TABLAS DE ROUTEO Y SE TERMINA RIP.v2
                long T3inicio=0,T3fin=0;
                double T3tiempoTranscurrido=0;
                float T3tiempoCorto=0;
                
                            //EN ESTE MOMENTO SE COMENZARÁ EL CRONÓMETRO PORQUE DESDE AQUÍ SE INTERCAMBIAN LAS TABLAS DE ROUTEO
                T3inicio=System.nanoTime();
                refGR.IntercambioTablasRouteo();
                T3fin=System.nanoTime();
                            //EN ESTE MOMENTO SE PAUSA EL CRONÓMETRO PORQUE YA SE TERMINARON DE COMPARTIR TODAS LAS TABLAS DE ROUTEO
                            
                T3tiempoTranscurrido=(double)(T3fin-T3inicio)*(1.0e-9);
                T3tiempoCorto = (float) T3tiempoTranscurrido;
                if(this.jLabel19.getText().equalsIgnoreCase("-------------------")){
                    this.jLabel19.setText(Float.toString(T3tiempoCorto));
                }
                PoblarTabla1();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        refGR = new GestionRedes();
        PoblarTabla1();
        JOptionPane.showMessageDialog(null, "Se ha eliminado la topología ingresada","Felicitaciones",2);
    }//GEN-LAST:event_jButton10ActionPerformed

    public void Objeto(String nom) {
        refR = new Router(nom);
    }
    
    public void Ingresar(Router obj,Interfaz intf){
        obj.Adicionar(intf);
    }
    
    public void PoblarTabla1() {
        int filas = this.jTable1.getRowCount();
        for (int i = 0; i < filas; i++) {
            tb1.removeRow(0);
        }

        String datos[] = new String[1];
        Router[] arreglo = refGR.getArreglo();
        for (int i = 0; i < refGR.getCont(); i++) {
            datos[0] = arreglo[i].getNickname();
            tb1.addRow(datos);
        }
    }

    public void PoblarTabla2() {
        int filas = this.jTable2.getRowCount();
        for (int i = 0; i < filas; i++) {
            tb2.removeRow(0);
        }

        String datos[] = new String[7];
        Router[] arreglo = refGR.getArreglo();
        String nombre = this.jTextField7.getText();
        int b = 0;
        for (int i = 0; i < refGR.getCont(); i++) {
            if (nombre.equalsIgnoreCase(arreglo[i].getNickname())) {
                b = 1;
                this.jLabel15.setText(arreglo[i].getNickname());
                for (int j = 0; j < arreglo[i].getRTcontIngresados(); j++) {
                    datos[0] = arreglo[i].RTip[j];
                    datos[1] = arreglo[i].RTred[j];
                    datos[2] = arreglo[i].RTnombreRouter[j];
                    datos[3] = arreglo[i].RTnombreSalida[j];
                    datos[4] = arreglo[i].RTinterfazSalida[j];
                    datos[5] = arreglo[i].RTnextHop[j];
                    datos[6] = String.valueOf(arreglo[i].RThop[j]);
                    tb2.addRow(datos);
                }
            }
        }
        if (b == 0) {
            this.jLabel15.setText("------");
            JOptionPane.showMessageDialog(null, "No existe el router buscado","¡ERROR!",0);
            
        }else{
            this.jTextField7.setText("");
        }
        
    }

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
            java.util.logging.Logger.getLogger(Ejecutar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejecutar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejecutar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejecutar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejecutar().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
