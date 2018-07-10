
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * admin.java
 *
 * Created on Jul 10, 2017, 9:47:44 PM
 */

/**
 *
 * @author Santosh
 */
public class admin extends javax.swing.JFrame {
  

    /** Creates new form admin */
    public admin() {
        super("WELCME ADMIN");
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("home.jpg")).getImage());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        addlibBTN = new javax.swing.JButton();
        viewlibBTN = new javax.swing.JButton();
        deletelibBTN = new javax.swing.JButton();
        logoutBTN = new javax.swing.JButton();

        jButton5.setText("jButton5");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel1.setText("-----WELCOME ADMIN-----");

        addlibBTN.setText("ADD LIBRARIAN");
        addlibBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addlibBTNActionPerformed(evt);
            }
        });

        viewlibBTN.setText("VIEW LIBRARIAN");
        viewlibBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewlibBTNActionPerformed(evt);
            }
        });

        deletelibBTN.setText("DELETE LIBRARIAN");
        deletelibBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletelibBTNActionPerformed(evt);
            }
        });

        logoutBTN.setText("Log Out");
        logoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBTN)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deletelibBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                    .addComponent(viewlibBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addlibBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(addlibBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewlibBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletelibBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoutBTN)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void viewlibBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewlibBTNActionPerformed
        // TODO add your handling code here:
       new librarians().setVisible(true);
       dispose();
}//GEN-LAST:event_viewlibBTNActionPerformed

    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed
        // TODO add your handling code here:
        new home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutBTNActionPerformed

    private void addlibBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addlibBTNActionPerformed
        // TODO add your handling code here:
      try{
        Connection conn=ConnectionProvider.getConnection();
        Statement stmt=conn.createStatement();
        String usname=JOptionPane.showInputDialog("Enter Username: ");
        String pswd=JOptionPane.showInputDialog("Enter Password: ");
        if(pswd.equals(null)||pswd.equals("") && usname.equals(null)||usname.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter something!!!");  
        }
        else
        {
            stmt.executeUpdate("insert into librarian values(\""+usname+"\",\""+pswd+"\");");
            JOptionPane.showMessageDialog(null,"SUCCESSFULLY ADDED!!!");  
        }
      }
      
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_addlibBTNActionPerformed

    private void deletelibBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletelibBTNActionPerformed
        // TODO add your handling code here:
         try{
        Connection conn=ConnectionProvider.getConnection();
        Statement stmt=conn.createStatement();
        String usname=JOptionPane.showInputDialog("Enter Username you want to delete: ");
        
         stmt.executeUpdate("Delete from librarian where username=\""+usname+"\";");
         JOptionPane.showMessageDialog(null,"SECCESSFULLY DELETED");   
      }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_deletelibBTNActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addlibBTN;
    private javax.swing.JButton deletelibBTN;
    private javax.swing.JButton jButton5;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JButton viewlibBTN;
    // End of variables declaration//GEN-END:variables

}