/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUI.java
 *
 * Created on Jul 19, 2012, 4:34:39 PM
 */
package anomalous_filters;

import ij.IJ;
import ij.WindowManager;

/**
 *
 * @author antonio
 */
public class GUI extends javax.swing.JFrame {

    /** Creates new form GUI */
    public GUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        comboFilters = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        spinnerD = new javax.swing.JSpinner();
        spinnerK = new javax.swing.JSpinner();
        combogFunction = new javax.swing.JComboBox();
        spinnerQ = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        runButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        spinnerInterations = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Anomalous Filters");

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 12));
        jLabel1.setText("Type of Filter");

        comboFilters.setFont(new java.awt.Font("DejaVu Sans", 0, 12));
        comboFilters.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Isotropic ", "Anisotropic " }));
        comboFilters.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFiltersItemStateChanged(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(158, 158, 158));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 12));
        jLabel2.setText("List of Parameters");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 0, 12));
        jLabel3.setText("Iterations:");

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 12));
        jLabel4.setText("Coefficient D:");

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 0, 12));
        jLabel5.setText("Coefficient K:");

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 0, 12));
        jLabel6.setText("Edge Function:");

        spinnerD.setFont(new java.awt.Font("DejaVu Sans", 0, 12));
        spinnerD.setModel(new javax.swing.SpinnerNumberModel(1.0d, 0.0d, 1.0d, 0.0010d));

        spinnerK.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        spinnerK.setModel(new javax.swing.SpinnerNumberModel(80, 1, 1500, 1));
        spinnerK.setEnabled(false);

        combogFunction.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        combogFunction.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Exponential", "Fractional" }));
        combogFunction.setEnabled(false);

        spinnerQ.setFont(new java.awt.Font("DejaVu Sans", 0, 12));
        spinnerQ.setModel(new javax.swing.SpinnerNumberModel(1.0d, 0.0d, 2.0d, 0.0010d));

        jLabel7.setIcon(new javax.swing.ImageIcon("/home/antonio/NetBeansProjects/Filters_Diffusion/ajuda.png")); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon("/home/antonio/NetBeansProjects/Filters_Diffusion/ajuda.png")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon("/home/antonio/NetBeansProjects/Filters_Diffusion/ajuda.png")); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon("/home/antonio/NetBeansProjects/Filters_Diffusion/ajuda.png")); // NOI18N

        runButton.setText("Run");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("DejaVu Sans", 1, 10));
        jLabel11.setText("Senra Filho, A. C. - CSIM Lab.");

        jLabel12.setFont(new java.awt.Font("DejaVu Sans", 0, 12));
        jLabel12.setText("Coefficient Q:");

        spinnerInterations.setFont(new java.awt.Font("DejaVu Sans", 0, 12));
        spinnerInterations.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1000, 1));

        jLabel13.setIcon(new javax.swing.ImageIcon("/home/antonio/NetBeansProjects/Filters_Diffusion/ajuda.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(comboFilters, 0, 161, Short.MAX_VALUE))
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(spinnerK, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(spinnerD, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel8))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(spinnerInterations, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                        .addComponent(spinnerQ))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel13))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combogFunction, 0, 125, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))))
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboFilters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(spinnerInterations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spinnerQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(spinnerD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(spinnerK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(combogFunction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(runButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        if (WindowManager.getCurrentImage() == null) {
            IJ.noImage();
        } else {

            ImageAccess input = new ImageAccess(WindowManager.getCurrentImage().getProcessor());

            anomalous_filters.Diffusion diff = new anomalous_filters.Diffusion();
            double D = new Double(spinnerD.getValue().toString());
            diff.setK(new Integer(spinnerK.getValue().toString()));
            diff.setQ(new Double(spinnerQ.getValue().toString()));
            diff.setNumInteration(new Integer(spinnerInterations.getValue().toString()));

            switch (comboFilters.getSelectedIndex()) {
                case 0:
                    diff.AnomalousIsoDiff(input, D).show("Isotropic Anomalous");
                    break;
                case 1:
                    diff.AnomalousAnisoDiff(input, combogFunction.getSelectedIndex()).show("Anisotropic Anomalous");
                    break;
            }

        }
    }//GEN-LAST:event_runButtonActionPerformed

    private void comboFiltersItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFiltersItemStateChanged
        if (comboFilters.getSelectedIndex() == 0) {
            spinnerD.setEnabled(true);
            spinnerInterations.setEnabled(true);
            spinnerK.setEnabled(false);
            spinnerQ.setEnabled(true);
            combogFunction.setEnabled(false);
        } else {
            spinnerD.setEnabled(false);
            spinnerInterations.setEnabled(true);
            spinnerK.setEnabled(true);
            spinnerQ.setEnabled(true);
            combogFunction.setEnabled(true);
        }
    }//GEN-LAST:event_comboFiltersItemStateChanged

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox comboFilters;
    private javax.swing.JComboBox combogFunction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton runButton;
    private javax.swing.JSpinner spinnerD;
    private javax.swing.JSpinner spinnerInterations;
    private javax.swing.JSpinner spinnerK;
    private javax.swing.JSpinner spinnerQ;
    // End of variables declaration//GEN-END:variables
}
