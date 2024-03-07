/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CRUDG;

/**
 *
 * @author hecto
 */
public class ReportesGrupo extends javax.swing.JFrame {

    private java.util.ArrayList<Clases.Grupo> grup;

    private int indiceActual = 0;

    /**
     * Creates new form ReportesGrupo
     */
    public ReportesGrupo() {
        initComponents();

        try {
            java.io.FileInputStream fis = new java.io.FileInputStream("Grupos");
            java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
            grup = (java.util.ArrayList<Clases.Grupo>) ois.readObject();
            ois.close();
            mostrarDatos(indiceActual);
        } catch (java.io.IOException | ClassNotFoundException es) {
            System.out.println("Error al cargar datos desde el archivo: " + es.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        Modificar = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();
        Principio = new javax.swing.JButton();
        Anterior = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        Ultimo = new javax.swing.JButton();
        lblGrupo = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setText("REPORTES - GRUPO");

        Modificar.setText("MODIFICAR");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Siguiente.setText("Siguiente");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        Principio.setText("Principio");
        Principio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrincipioActionPerformed(evt);
            }
        });

        Anterior.setText("Anterior");
        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorActionPerformed(evt);
            }
        });

        Regresar.setText("REGRESAR");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        Ultimo.setText("Ultimo");
        Ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltimoActionPerformed(evt);
            }
        });

        lblGrupo.setText("Grupo:");

        lblId.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Anterior)
                                .addGap(18, 18, 18)
                                .addComponent(Siguiente)
                                .addGap(18, 18, 18)
                                .addComponent(Ultimo)
                                .addGap(18, 18, 18)
                                .addComponent(Principio))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(Modificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                                .addComponent(Regresar)
                                .addGap(31, 31, 31))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId)
                    .addComponent(lblGrupo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(lblId)
                .addGap(9, 9, 9)
                .addComponent(lblGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Anterior)
                    .addComponent(Siguiente)
                    .addComponent(Ultimo)
                    .addComponent(Principio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regresar)
                    .addComponent(Modificar))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        this.dispose();

        ModificarGrupo modificar = new ModificarGrupo();
        modificar.setVisible(true);
    }//GEN-LAST:event_ModificarActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        mostrarDatos(++indiceActual);
    }//GEN-LAST:event_SiguienteActionPerformed

    private void PrincipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrincipioActionPerformed
        indiceActual = 0;
        mostrarDatos(indiceActual);
    }//GEN-LAST:event_PrincipioActionPerformed

    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorActionPerformed
        mostrarDatos(--indiceActual);
    }//GEN-LAST:event_AnteriorActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        this.dispose();

        Menus.MenuGrupo menuPrincipal = new Menus.MenuGrupo();
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_RegresarActionPerformed

    private void UltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltimoActionPerformed
        indiceActual = grup.size() - 1;
        mostrarDatos(indiceActual);
    }//GEN-LAST:event_UltimoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Principio;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton Siguiente;
    private javax.swing.JButton Ultimo;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblId;
    // End of variables declaration//GEN-END:variables

    private void mostrarDatos(int index) {
        if (index >= 0 && index < grup.size()) {
            Clases.Grupo grupo = grup.get(index);
            lblId.setText("Matricula: " + grupo.getId());
            lblGrupo.setText("Nombre: " + grupo.getGrupo());
        }
    }

}
