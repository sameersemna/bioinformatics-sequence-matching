/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SequenceMaching;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

class sequence {
    
    int index;
    char CTItem;
    String PTValue;
    int occurance;
    
    public sequence(int index, char CTItem, String PTValue, int occurance) {
        this.index = index;
        this.CTItem = CTItem;
        this.PTValue = PTValue;
        this.occurance = occurance;
        
    }
    
    void setOccurance() {
        occurance = occurance + 1;
    }
}

/**
 *
 * @author Sanket
 */
public class SequenceMatching extends javax.swing.JFrame {

    /**
     * Creates new form SequenceMatching
     */
    static List<sequence> seqobj = new ArrayList<sequence>();
    
    public SequenceMatching() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtoutput = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtinput = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sequence Matching");

        jLabel1.setText("Text file paste here");

        txtoutput.setColumns(20);
        txtoutput.setRows(5);
        jScrollPane1.setViewportView(txtoutput);

        jButton1.setText("Run");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtinput.setColumns(20);
        txtinput.setRows(5);
        jScrollPane2.setViewportView(txtinput);

        jButton2.setText("Clear All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String pt = "";
        String ct = "";
        for (String line : txtinput.getText().split("\\n")) {
            line = line.trim();
            if (!line.isEmpty()) {
                if (line.contains(":")) {
                } else if (line.contains("-")) {
                    ct = ct + line;
                } else {
                    pt = pt + line;
                }
            }
        }
        
        if (pt.length() == ct.length()) {
            
            int x = 0;
            int ptlength = pt.length();
            
            String[][] data = new String[ptlength][2];
            while (x < ptlength) {
                data[x][0] = (String.valueOf(pt.charAt(x)).isEmpty() ? "" : String.valueOf(pt.charAt(x)));
                data[x][1] = (String.valueOf(ct.charAt(x)).isEmpty() ? "" : String.valueOf(ct.charAt(x)));
                x++;
            }
            
            x = 1;
            String value = data[0][0];
            for (int i = 0; i < data.length; i++) {
                if (i + 1 != data.length) {
                    if (!data[i][1].equals(data[i + 1][1])) {
                        
                        operateSeqence(x, data[i][1], value);
                        x++;
                        value = "" + data[i + 1][0];
                    } else {
                        value = value + data[i + 1][0];
                    }
                } else {
                    operateSeqence(x, data[i][1], value);
                }
                
            }
            showSequence();
        } else {
            JOptionPane.showMessageDialog(null, "Mismatch Sequence Values Please Try Again", "Alert", JOptionPane.WARNING_MESSAGE);
            txtoutput.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtinput.setText("");
        txtoutput.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public static void operateSeqence(int x, String ctvalue, String ptvalue) {
        Iterator<sequence> itr = seqobj.iterator();
        int has = 0;
        while (itr.hasNext()) {
            sequence element = itr.next();
            if ((String.valueOf(element.CTItem)).equals(ctvalue) && element.PTValue.equals(ptvalue)) {
                has = 1;
                element.setOccurance();
            }
        }
        if (has == 1) {
        } else {
            seqobj.add(new sequence(x, ctvalue.charAt(0), ptvalue, 1));
            
        }
    }
    
    public void showSequence() {
        txtoutput.setText("");
        Iterator<sequence> itr = seqobj.iterator();
        while (itr.hasNext()) {
            sequence element = itr.next();
            txtoutput.append(element.index + "," + element.CTItem + "," + element.PTValue + "," + element.occurance + "\n");
        }
    }

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
            java.util.logging.Logger.getLogger(SequenceMatching.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SequenceMatching.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SequenceMatching.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SequenceMatching.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SequenceMatching().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtinput;
    private javax.swing.JTextArea txtoutput;
    // End of variables declaration//GEN-END:variables
}