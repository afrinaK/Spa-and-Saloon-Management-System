
package salon.and.spa.management;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
         Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }
     public class BasicJTable2 extends JFrame implements ActionListener { 
   private Object[][] data; 
   private String[] columnNames = {"Name","Day","Month","Time","Phone number","Email","ID"}; 
   private DefaultTableModel tableModel; 
   private JTable table; 
   private SimpleBookList2 myList;
  public BasicJTable2(String title) { 
      super(title); 
      setBounds(100,100,400,300); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myList = new SimpleBookList2();
      myList.readFromCSV("sample.csv");
      data = myList.convert2Data();
      tableModel = new DefaultTableModel(data, columnNames); 
      table = new JTable(tableModel); 
      table.setAutoCreateRowSorter(true);
      JScrollPane scrollPane = new JScrollPane(table); 
      scrollPane.setPreferredSize(new Dimension(880,880)); 
      JPanel panel = new JPanel(); 
      panel.add(scrollPane); 
      add(panel,BorderLayout.CENTER);
  }

       

        @Override
        public void actionPerformed(ActionEvent ae) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Appointement = new javax.swing.JButton();
        employee_record = new javax.swing.JButton();
        inventory_record = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setMinimumSize(new java.awt.Dimension(600, 700));
        setSize(new java.awt.Dimension(700, 700));
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        Appointement.setBackground(new java.awt.Color(255, 204, 204));
        Appointement.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        Appointement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salon/and/spa/management/appointment.png"))); // NOI18N
        Appointement.setText("Appointment");
        Appointement.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Appointement.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Appointement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppointementActionPerformed(evt);
            }
        });
        jPanel2.add(Appointement);
        Appointement.setBounds(140, 60, 347, 83);

        employee_record.setBackground(new java.awt.Color(255, 204, 204));
        employee_record.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        employee_record.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salon/and/spa/management/employee.png"))); // NOI18N
        employee_record.setText("Employee Record ");
        employee_record.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        employee_record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employee_recordActionPerformed(evt);
            }
        });
        jPanel2.add(employee_record);
        employee_record.setBounds(140, 170, 347, 83);

        inventory_record.setBackground(new java.awt.Color(255, 204, 204));
        inventory_record.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        inventory_record.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salon/and/spa/management/inven.jpg"))); // NOI18N
        inventory_record.setText("Inventory record ");
        inventory_record.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inventory_record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventory_recordActionPerformed(evt);
            }
        });
        jPanel2.add(inventory_record);
        inventory_record.setBounds(140, 290, 347, 83);

        logout.setBackground(new java.awt.Color(255, 204, 204));
        logout.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salon/and/spa/management/logout.png"))); // NOI18N
        logout.setText("Logout");
        logout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel2.add(logout);
        logout.setBounds(140, 400, 347, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salon/and/spa/management/v700batch2-kul-08-floralframe_1.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, -10, 600, 660);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-3, -2, 610, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AppointementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppointementActionPerformed
       // new check_appointments().setVisible(true);
       // this.setVisible(false);
        BasicJTable2 CAL = new BasicJTable2("List of Appointments");
        CAL.setVisible(true);
        
        
    }//GEN-LAST:event_AppointementActionPerformed

    private void employee_recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employee_recordActionPerformed
       
        new EmployeeRecord().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_employee_recordActionPerformed

    private void inventory_recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventory_recordActionPerformed
       new inventory().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inventory_recordActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new Final_login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        salon.and.spa.management.BasicJTable2 myApp = new salon.and.spa.management.BasicJTable2("Basic JTable"); 
      myApp.setVisible(true);
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Appointement;
    private javax.swing.JButton employee_record;
    private javax.swing.JButton inventory_record;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
