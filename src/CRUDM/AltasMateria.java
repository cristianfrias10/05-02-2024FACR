/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CRUDM;

/**
 *
 * @author hecto
 */
public class AltasMateria extends javax.swing.JFrame {

    private java.util.ArrayList<Clases.Materia> mate;

    private ReportesMateria reportes;

    /**
     * Creates new form AltasMaterias
     */
    public AltasMateria() {
        mate = new java.util.ArrayList();
        initComponents();

        reportes = new ReportesMateria();
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

        txtHoras = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        Mostrar = new javax.swing.JButton();
        lblProfesor = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        lblCreditos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblDias = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblHoras = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtProfesor = new javax.swing.JTextField();
        txtCreditos = new javax.swing.JTextField();
        txtDias = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblId.setText("ID:");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre: ");

        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });

        lblProfesor.setText("Profesor:");

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        lblCreditos.setText("Creditos:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setText("ALTAS - MATERIA");

        lblDias.setText("Dias:");

        lblHoras.setText("Horas x Semana: ");

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
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProfesor)
                                    .addComponent(lblCreditos)
                                    .addComponent(lblDias)
                                    .addComponent(lblHoras))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProfesor)
                    .addComponent(txtProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreditos)
                    .addComponent(txtCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDias)
                    .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoras)
                    .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Mostrar)
                    .addComponent(Regresar))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        boolean datosIngresados = !txtId.getText().isEmpty() || !txtNombre.getText().isEmpty() || !txtProfesor.getText().isEmpty() || !txtCreditos.getText().isEmpty() || !txtDias.getText().isEmpty() || !txtHoras.getText().isEmpty();

        if (!datosIngresados) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se han ingresado datos para guardar.", "Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (txtId.getText().isEmpty() || txtNombre.getText().isEmpty() || txtProfesor.getText().isEmpty() || txtCreditos.getText().isEmpty() || txtDias.getText().isEmpty() || txtHoras.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Todos los campos deben ser llenados.", "Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int id = Integer.parseInt(txtId.getText());
        String nom = txtNombre.getText();
        String prof = txtProfesor.getText();
        byte cred = Byte.parseByte(txtCreditos.getText());
        String dii = txtDias.getText();
        byte hors = Byte.parseByte(txtHoras.getText());
        Clases.Materia mat = new Clases.Materia(id, nom, prof, cred, dii, hors);

        try {
            java.io.FileInputStream fis = new java.io.FileInputStream("Materias");
            java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
            mate = (java.util.ArrayList<Clases.Materia>) ois.readObject();
            ois.close();
        } catch (java.io.IOException | ClassNotFoundException ex) {
            //Si no hay datos existentes, no hacer nada
        }

        mate.add(mat);

        try {
            java.io.FileOutputStream fos = new java.io.FileOutputStream("Materias");
            java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(fos);
            oos.writeObject(mate);
            oos.close();

            txtId.setText("");
            txtNombre.setText("");
            txtProfesor.setText("");
            txtCreditos.setText("");
            txtDias.setText("");
            txtHoras.setText("");

        } catch (java.io.IOException es) {
            System.out.println("Error al Guardar en el archivo " + es.toString());
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        try {
            java.io.FileInputStream fis = new java.io.FileInputStream("Materias");
            java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
            mate = (java.util.ArrayList) ois.readObject();
            ois.close();
        } catch (java.io.IOException | ClassNotFoundException es) {
            System.out.println("Error al Guardar en el archivo " + es.toString());
        }
        for (Clases.Materia a : mate) {
            System.out.println(a);
        }

        this.dispose();

        reportes.setVisible(true);
    }//GEN-LAST:event_MostrarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        this.dispose();

        Menus.MenuMateria menuPrincipal = new Menus.MenuMateria();
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_RegresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblCreditos;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblProfesor;
    private javax.swing.JTextField txtCreditos;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProfesor;
    // End of variables declaration//GEN-END:variables
}
