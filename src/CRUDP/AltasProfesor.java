/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CRUDP;

/**
 *
 * @author hecto
 */
public class AltasProfesor extends javax.swing.JFrame {

    private java.util.ArrayList<Clases.Profesor> prof;

    private ReportesProfesor reportes;

    /**
     * Creates new form AltasProfesor
     */
    public AltasProfesor() {
        prof = new java.util.ArrayList();
        initComponents();
        
        reportes = new ReportesProfesor();
        reportes.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEdad = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        Mostrar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        txtSemestre = new javax.swing.JTextField();
        txtCarrera = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        lblSemestre = new javax.swing.JLabel();
        lblCarrera = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEdad.setText("Edad:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setText("ALTAS - PROFESOR");

        lblApellidos.setText("Apellidos: ");

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre: ");

        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });

        lblId.setText("ID");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        lblSemestre.setText("Semestre:");

        lblCarrera.setText("Carrera:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblId)
                                    .addComponent(lblNombre))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApellidos)
                                    .addComponent(lblEdad)
                                    .addComponent(lblCarrera)
                                    .addComponent(lblSemestre))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(Guardar)
                        .addGap(51, 51, 51)
                        .addComponent(Mostrar)
                        .addGap(49, 49, 49)
                        .addComponent(Regresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApellidos)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarrera)
                    .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSemestre)
                    .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Mostrar)
                    .addComponent(Regresar))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        this.dispose();

        Menus.MenuProfesor menuPrincipal = new Menus.MenuProfesor();
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_RegresarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        try {
            java.io.FileInputStream fis = new java.io.FileInputStream("Profesores");
            java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
            prof = (java.util.ArrayList) ois.readObject();
            ois.close();
        } catch (java.io.IOException | ClassNotFoundException es) {
            System.out.println("Error al Guardar en el archivo " + es.toString());
        }
        for (Clases.Profesor a : prof) {
            System.out.println(a);
        }

        this.dispose();

        reportes.setVisible(true);
    }//GEN-LAST:event_MostrarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        boolean datosIngresados = !txtId.getText().isEmpty() || !txtNombre.getText().isEmpty() || !txtApellidos.getText().isEmpty() || !txtEdad.getText().isEmpty() || !txtCarrera.getText().isEmpty() || !txtSemestre.getText().isEmpty();

        if (!datosIngresados) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se han ingresado datos para guardar.", "Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (txtId.getText().isEmpty() || txtNombre.getText().isEmpty() || txtApellidos.getText().isEmpty() || txtEdad.getText().isEmpty() || txtCarrera.getText().isEmpty() || txtSemestre.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Todos los campos deben ser llenados.", "Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int id = Integer.parseInt(txtId.getText());
        String nom = txtNombre.getText();
        String ap = txtApellidos.getText();
        byte ed = Byte.parseByte(txtEdad.getText());
        String car = txtCarrera.getText();
        byte sem = Byte.parseByte(txtSemestre.getText());
        Clases.Profesor prf = new Clases.Profesor(id, nom, ap, ed, car, sem);

        try {
            java.io.FileInputStream fis = new java.io.FileInputStream("Profesores");
            java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
            prof = (java.util.ArrayList<Clases.Profesor>) ois.readObject();
            ois.close();
        } catch (java.io.IOException | ClassNotFoundException ex) {
            //Si no hay datos existentes, no hacer nada
        }

        prof.add(prf);

        try {
            java.io.FileOutputStream fos = new java.io.FileOutputStream("Profesores");
            java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(fos);
            oos.writeObject(prof);
            oos.close();

            txtId.setText("");
            txtNombre.setText("");
            txtApellidos.setText("");
            txtEdad.setText("");
            txtCarrera.setText("");
            txtSemestre.setText("");

        } catch (java.io.IOException es) {
            System.out.println("Error al Guardar en el archivo " + es.toString());
        }
    }//GEN-LAST:event_GuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSemestre;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSemestre;
    // End of variables declaration//GEN-END:variables
}
