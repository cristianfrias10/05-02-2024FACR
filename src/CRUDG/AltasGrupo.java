/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CRUDG;

/**
 *
 * @author hecto
 */
public class AltasGrupo extends javax.swing.JFrame {

    private java.util.ArrayList<Clases.Grupo> grup;

    private ReportesGrupo reportes;

    /**
     * Creates new form AltasGrupo
     */
    public AltasGrupo() {
        grup = new java.util.ArrayList();
        initComponents();
        
        reportes = new ReportesGrupo();
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

        jLabel7 = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblGrupo = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setText("ALTAS - GRUPOS");

        lblId.setText("ID:");

        lblGrupo.setText("Grupo:");

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId)
                    .addComponent(lblGrupo))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(Guardar)
                        .addGap(51, 51, 51)
                        .addComponent(Mostrar)
                        .addGap(49, 49, 49)
                        .addComponent(Regresar)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGrupo)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Mostrar)
                    .addComponent(Regresar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        this.dispose();

        Menus.MenuGrupo menuPrincipal = new Menus.MenuGrupo();
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_RegresarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        boolean datosIngresados = !txtId.getText().isEmpty() || !txtGrupo.getText().isEmpty();

        if (!datosIngresados) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se han ingresado datos para guardar.", "Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (txtId.getText().isEmpty() || txtGrupo.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Todos los campos deben ser llenados.", "Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int id = Integer.parseInt(txtId.getText());
        String gr = txtGrupo.getText();
        Clases.Grupo gru = new Clases.Grupo(id, gr);

        try {
            java.io.FileInputStream fis = new java.io.FileInputStream("Grupos");
            java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
            grup = (java.util.ArrayList<Clases.Grupo>) ois.readObject();
            ois.close();
        } catch (java.io.IOException | ClassNotFoundException ex) {
            //Si no hay datos existentes, no hacer nada
        }

        grup.add(gru);

        try {
            java.io.FileOutputStream fos = new java.io.FileOutputStream("Grupos");
            java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(fos);
            oos.writeObject(grup);
            oos.close();

            txtId.setText("");
            txtGrupo.setText("");

        } catch (java.io.IOException es) {
            System.out.println("Error al Guardar en el archivo " + es.toString());
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        try {
            java.io.FileInputStream fis = new java.io.FileInputStream("Grupos");
            java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
            grup = (java.util.ArrayList) ois.readObject();
            ois.close();
        } catch (java.io.IOException | ClassNotFoundException es) {
            System.out.println("Error al Guardar en el archivo " + es.toString());
        }
        for (Clases.Grupo a : grup) {
            System.out.println(a);
        }

        this.dispose();

        reportes.setVisible(true);
    }//GEN-LAST:event_MostrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblId;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
