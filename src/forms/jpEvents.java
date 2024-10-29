/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;


import data.Student;
import frames.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class jpEvents extends javax.swing.JPanel {

    private MainMenu mainMenu;  

    
    /**
     * Creates new form jpAlumnos
     */
    public jpEvents(MainMenu mainM) {
        initComponents();
        this.mainMenu = mainM;
     
       
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpBtnInfo = new javax.swing.JPanel();
        jlBtnInfo = new javax.swing.JLabel();
        jpBtnNotas = new javax.swing.JPanel();
        jlBtnNotas = new javax.swing.JLabel();
        cbxGrado = new models.CustomComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableAlumno = new models.CustomTable();
        jLabel3 = new javax.swing.JLabel();
        txtProfessor = new models.CustomTextField();

        setMinimumSize(new java.awt.Dimension(760, 606));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("EVENTOS");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("PROFESOR");

        jpBtnInfo.setBackground(new java.awt.Color(222, 8, 163));
        jpBtnInfo.setForeground(new java.awt.Color(255, 255, 255));
        jpBtnInfo.setLayout(new java.awt.BorderLayout());

        jlBtnInfo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jlBtnInfo.setForeground(new java.awt.Color(255, 255, 255));
        jlBtnInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlBtnInfo.setText("CREAR EVENTO");
        jlBtnInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBtnInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlBtnInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlBtnInfoMouseExited(evt);
            }
        });
        jpBtnInfo.add(jlBtnInfo, java.awt.BorderLayout.CENTER);

        jpBtnNotas.setBackground(new java.awt.Color(222, 8, 163));
        jpBtnNotas.setLayout(new java.awt.BorderLayout());

        jlBtnNotas.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jlBtnNotas.setForeground(new java.awt.Color(255, 255, 255));
        jlBtnNotas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlBtnNotas.setText("CONSULTAR NOTAS");
        jlBtnNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBtnNotasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlBtnNotasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlBtnNotasMouseExited(evt);
            }
        });
        jpBtnNotas.add(jlBtnNotas, java.awt.BorderLayout.CENTER);

        cbxGrado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto" }));

        jtableAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Carnet", "Nombre", "Apellido", "Genero"
            }
        ));
        jScrollPane2.setViewportView(jtableAlumno);

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("GRADO");

        txtProfessor.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(367, 367, 367)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxGrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jpBtnNotas, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jpBtnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpBtnNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpBtnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxGradoActionPerformed(java.awt.event.ActionEvent evt) {
        String gradoSeleccionado = (String) cbxGrado.getSelectedItem();
            
        DefaultTableModel modelo = (DefaultTableModel) jtableAlumno.getModel();
 
        modelo.setRowCount(0);
        int i = 0;
        int SelectGrade = 0;
        if (gradoSeleccionado.equals("Primero")){
            SelectGrade = 1;
        } else if (gradoSeleccionado.equals("Segundo")) {
            SelectGrade = 2;
        } else if (gradoSeleccionado.equals("Tercero")) {
            SelectGrade = 3;
        } else if (gradoSeleccionado.equals("Cuarto")) {
            SelectGrade = 4;
        } else if (gradoSeleccionado.equals("Quinto")) {
            SelectGrade = 5;
        } else if (gradoSeleccionado.equals("Sexto")) {
            SelectGrade = 6;
        }
        

        
    }

    
    private void addRows(List<Student> students) {
        DefaultTableModel modelo = (DefaultTableModel) jtableAlumno.getModel();
        modelo.setRowCount(0);
        for (Student student : students) {
            Object[] fila = {
                student.getCarnet(),
                student.getName(),
                student.getLastName(),
                student.getGender()
            };
            modelo.addRow(fila);
        }
        jtableAlumno.setModel(modelo);
    }

    
    public void ConsultarDatos(){    
        int i = 0;

        
    }

    
    private void jlBtnInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseEntered
        jpBtnInfo.setBackground(new Color (232, 50, 22));
    }//GEN-LAST:event_jlBtnInfoMouseEntered

    private void jlBtnInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseExited
        jpBtnInfo.setBackground(new Color (222, 8, 163));
    }//GEN-LAST:event_jlBtnInfoMouseExited

    private void jlBtnInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseClicked
        jpCreateEvent crearEvent = new jpCreateEvent(mainMenu, "");
        crearEvent.setSize(760, 606);
        crearEvent.setLocation(0, 0);

        jpContentMain contentMain = new jpContentMain();
        contentMain.removeAll();
        contentMain.add(mainMenu.jpBarHeader, BorderLayout.NORTH);
        contentMain.add(crearEvent, BorderLayout.CENTER);
        contentMain.revalidate();
        contentMain.repaint();
        
        mainMenu.jpContent.removeAll();
        mainMenu.jpContent.add(contentMain, BorderLayout.CENTER);
        mainMenu.jpContent.revalidate();
        mainMenu.jpContent.repaint();
       
    }//GEN-LAST:event_jlBtnInfoMouseClicked

    private void jlBtnNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnNotasMouseClicked
        try{
            int row = jtableAlumno.getSelectedRow();
        }catch(Exception ex){
            
            return;
        }
        String gradoSel = (String) cbxGrado.getSelectedItem();
       
        Student student = null;
        int row = jtableAlumno.getSelectedRow();
        String carnet = (String) jtableAlumno.getValueAt(row, 0);
        student.setGrade(gradoSel);
        
        jpBtnNotas.setBackground(new Color (222, 8, 163));
    }//GEN-LAST:event_jlBtnNotasMouseClicked

    private void jlBtnNotasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnNotasMouseEntered
        jpBtnNotas.setBackground(new Color (232, 50, 22));
    }//GEN-LAST:event_jlBtnNotasMouseEntered

    private void jlBtnNotasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnNotasMouseExited
        jpBtnNotas.setBackground(new Color (222, 8, 163));
    }//GEN-LAST:event_jlBtnNotasMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private models.CustomComboBox cbxGrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlBtnInfo;
    private javax.swing.JLabel jlBtnNotas;
    private javax.swing.JPanel jpBtnInfo;
    private javax.swing.JPanel jpBtnNotas;
    private models.CustomTable jtableAlumno;
    private models.CustomTextField txtProfessor;
    // End of variables declaration//GEN-END:variables
}
