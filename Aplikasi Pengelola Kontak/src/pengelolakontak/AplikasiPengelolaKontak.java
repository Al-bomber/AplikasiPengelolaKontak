/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pengelolakontak;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class AplikasiPengelolaKontak extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiPengelolaKontak
     */
    public AplikasiPengelolaKontak() {
        initComponents();
        tampilkanData();
        clean();
    }
    
    String id;
    Connection con = PengelolaKontak.getKoneksi();
    PreparedStatement pst;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tNama = new javax.swing.JTextField();
        tTelp = new javax.swing.JTextField();
        bTambah = new javax.swing.JButton();
        bUlang = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        tCari = new javax.swing.JTextField();
        tKategori = new javax.swing.JComboBox<>();
        bSimpan = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setText("Nama");

        jLabel3.setText("No. Telpon");

        jLabel4.setText("Kategori");

        tTelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tTelpKeyTyped(evt);
            }
        });

        bTambah.setText("Tambah");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        bUlang.setText("Ulang");
        bUlang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUlangActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bEdit.setText("Edit");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setText("Cari Kontak Berdasarkan Nama");

        tCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tCariKeyReleased(evt);
            }
        });

        tKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Kategori -", "Keluarga", "Teman", "Kerja" }));

        bSimpan.setText("Simpan");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tNama)
                            .addComponent(tTelp, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bTambah)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bEdit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bDelete))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bUlang)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bSimpan))))
                            .addComponent(tKategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTambah)
                    .addComponent(bUlang)
                    .addComponent(bDelete)
                    .addComponent(bEdit)
                    .addComponent(bSimpan))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aplikasi Pengelola Kontak");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        try {
            if (tNama.getText().isEmpty() || tTelp.getText().isEmpty() || tKategori.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Data Ada Yang Belum Diisi!!", "Gagal Menambahkan Data", 2);
            } else {
                String queryTambah = "INSERT INTO kontak VALUES (null, ?, ?, ?);";
                pst = con.prepareStatement(queryTambah);
                pst.setString(1, tNama.getText());
                pst.setString(2, tTelp.getText());
                pst.setString(3, tKategori.getSelectedItem().toString());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan!!", "Sukses Menambahkan", 1);
                tampilkanData();
                clean();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AplikasiPengelolaKontak.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bTambahActionPerformed

    private void tTelpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tTelpKeyTyped
        char c = evt.getKeyChar();
                
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        
        if (tTelp.getText().length() >= 12) {
            JOptionPane.showMessageDialog(null, "Angka Yang Dimasukkan Harus tidak lebih dari 12!!", "Peringatan", 2);
            evt.consume();
        }
    }//GEN-LAST:event_tTelpKeyTyped

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        try {
            if (tNama.getText().isEmpty() || tTelp.getText().isEmpty() || tKategori.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Data Belum Diubah!!", "Gagal Mengubah Data", 2);
            } else {
                String queryUbah = "UPDATE kontak SET nama = ?, no_telp = ?, kategori = ? WHERE id = ?;";
                pst = con.prepareStatement(queryUbah);
                pst.setString(1, tNama.getText());
                pst.setString(2, tTelp.getText());
                pst.setString(3, tKategori.getSelectedItem().toString());          
                pst.setString(4, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate!!", "Sukses Menambahkan", 1);
                tampilkanData();
                clean();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AplikasiPengelolaKontak.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bEditActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        id = jTable1.getValueAt(row, 0).toString();
        
        tNama.setText(jTable1.getValueAt(row, 1).toString());
        tTelp.setText(jTable1.getValueAt(row, 2).toString());
        tKategori.setSelectedItem(jTable1.getValueAt(row, 3).toString());
        bTambah.setEnabled(false);
        bEdit.setEnabled(true);
        bDelete.setEnabled(true);   
        bSimpan.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void bUlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUlangActionPerformed
        clean();
    }//GEN-LAST:event_bUlangActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        try {
            if (tNama.getText().isEmpty() || tTelp.getText().isEmpty() || tKategori.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Data Belum Dipilih!!", "Gagal Menghapus Data", 2);
            } else {
                int confirm = JOptionPane.showConfirmDialog(null,"Hapus Data Kontak Ini?", "Konfirmasi Hapus", 0);
                
                if (confirm == 0) {
                    String queryHapus = "DELETE FROM kontak WHERE id = ?;";
                    pst = con.prepareStatement(queryHapus);
                    pst.setString(1, id);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!!", "Sukses Dooooooooong", 1);
                    tampilkanData();
                    clean();
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AplikasiPengelolaKontak.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void tCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCariKeyReleased
        tampilkanData();
    }//GEN-LAST:event_tCariKeyReleased

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
        simpanFile();
    }//GEN-LAST:event_bSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(AplikasiPengelolaKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiPengelolaKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiPengelolaKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiPengelolaKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiPengelolaKontak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bSimpan;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bUlang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tCari;
    private javax.swing.JComboBox<String> tKategori;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tTelp;
    // End of variables declaration//GEN-END:variables

    private void tampilkanData() {
        try {
            String[] judul = {"ID", "Nama Kontak", "No. Telpon", "Kategori"};
            DefaultTableModel dtm = new DefaultTableModel(null, judul);
            jTable1.setModel(dtm);
            
            String sql = "SELECT * FROM kontak";
            
            if (!tCari.getText().isEmpty()) {
                sql = "SELECT * FROM kontak WHERE nama LIKE '%" + tCari.getText() + "%';";
            }
            
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                String[] data = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                dtm.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AplikasiPengelolaKontak.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clean() {
        tNama.setText("");
        tTelp.setText("");
        tKategori.setSelectedIndex(0); 
        bTambah.setEnabled(true);
        bEdit.setEnabled(false);
        bDelete.setEnabled(false);  
        bSimpan.setEnabled(false);
    }

    private void simpanFile() {
        if (tNama.getText().isEmpty() || tTelp.getText().isEmpty() || tKategori.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Data Belum Dipilih!!", "Gagal Menyimpan Data", 2);
        } else {
            StringBuilder content = new StringBuilder();
            content.append("Kontak Yang Disimpan :").append("\n\n");
            
            content.append("Nama Kontak : ").append(tNama.getText()).append("\n");
            content.append("Nomer Telepon : ").append(tTelp.getText()).append("\n");
            content.append("Kategori Kontak : ").append(tKategori.getSelectedItem()).append("\n");
            
            
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Simpan Kontak");
            int userSelection = fileChooser.showSaveDialog(this);
            
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                try (FileWriter fileWriter = new FileWriter(fileChooser.getSelectedFile() + ".txt")) {
                    fileWriter.write(content.toString());
                    JOptionPane.showMessageDialog(this, "Data kontak berhasil disimpan ke file.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan file: " + ex.getMessage());
                }
            }
        }
    }
}
