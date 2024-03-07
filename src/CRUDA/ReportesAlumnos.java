/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CRUDA;

/**
 *
 * @author hecto
 */
public class ReportesAlumnos extends javax.swing.JFrame {

    private java.util.ArrayList<Clases.Alumno> alums;
    
    private int indiceActual = 0;

    /**
     * Creates new form ReportesAlumnos
     */
    public ReportesAlumnos() {
        initComponents();
        
        try {
            java.io.FileInputStream fis = new java.io.FileInputStream("Alumnos");
            java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
            alums = (java.util.ArrayList<Clases.Alumno>) ois.readObject();
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

        Siguiente = new javax.swing.JButton();
        Anterior = new javax.swing.JButton();
        Ultimo = new javax.swing.JButton();
        Principio = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblSemestre = new javax.swing.JLabel();
        lblCarrera = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Siguiente.setText("Siguiente");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        Anterior.setText("Anterior");
        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorActionPerformed(evt);
            }
        });

        Ultimo.setText("Ultimo");
        Ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltimoActionPerformed(evt);
            }
        });

        Principio.setText("Principio");
        Principio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrincipioActionPerformed(evt);
            }
        });

        Regresar.setText("REGRESAR");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        Modificar.setText("MODIFICAR");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setText("REPORTES - ALUMNOS");

        lblSemestre.setText("Semestre:");

        lblCarrera.setText("Carrera:");

        lblEdad.setText("Edad:");

        lblApellidos.setText("Apellidos: ");

        lblNombre.setText("Nombre: ");

        lblMatricula.setText("Matricula: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMatricula)
                                .addComponent(lblNombre)
                                .addComponent(lblApellidos)
                                .addComponent(lblEdad)
                                .addComponent(lblCarrera)
                                .addComponent(lblSemestre))
                            .addComponent(Anterior))
                        .addGap(18, 18, 18)
                        .addComponent(Siguiente)
                        .addGap(18, 18, 18)
                        .addComponent(Ultimo)
                        .addGap(18, 18, 18)
                        .addComponent(Principio)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Regresar)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblApellidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEdad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCarrera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSemestre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Anterior)
                    .addComponent(Siguiente)
                    .addComponent(Ultimo)
                    .addComponent(Principio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regresar)
                    .addComponent(Modificar))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        mostrarDatos(++indiceActual);
    }//GEN-LAST:event_SiguienteActionPerformed

    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorActionPerformed
        mostrarDatos(--indiceActual);
    }//GEN-LAST:event_AnteriorActionPerformed

    private void UltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltimoActionPerformed
        indiceActual = alums.size() - 1;
        mostrarDatos(indiceActual);
    }//GEN-LAST:event_UltimoActionPerformed

    private void PrincipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrincipioActionPerformed
        indiceActual = 0;
        mostrarDatos(indiceActual);
    }//GEN-LAST:event_PrincipioActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        this.dispose();

        Menus.MenuAlumnos menuPrincipal = new Menus.MenuAlumnos();
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_RegresarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        this.dispose();

        ModificarAlumnos modificar = new ModificarAlumnos();
        modificar.setVisible(true);
    }//GEN-LAST:event_ModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Principio;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton Siguiente;
    private javax.swing.JButton Ultimo;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSemestre;
    // End of variables declaration//GEN-END:variables
    
    private void mostrarDatos(int index) {
        if (index >= 0 && index < alums.size()) {
            Clases.Alumno alumno = alums.get(index);
            lblMatricula.setText("Matricula: " + alumno.getMatricula());
            lblNombre.setText("Nombre: " + alumno.getNombre());
            lblApellidos.setText("Apellidos: " + alumno.getApellidos());
            lblEdad.setText("Edad: " + alumno.getEdad());
            lblSemestre.setText("Semestre: " + alumno.getSemestre());
        }
    }
}
