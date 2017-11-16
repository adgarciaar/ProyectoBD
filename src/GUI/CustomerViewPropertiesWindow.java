/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import World.Customer;
import World.Property;
import java.util.LinkedHashMap;
import javax.swing.JFrame;

/**
 *
 * @author adrian
 */
public class CustomerViewPropertiesWindow extends javax.swing.JFrame {
    
    private final Customer customer;
    private LinkedHashMap<Integer,Property> listProperties;
    private final JFrame OwnerWindow;
    private Property property;   

    /**
     * Creates new form CustomerViewPropertiesWindow
     * @param customer
     * @param listProperties
     * @param OwnerWindow
     */
    public CustomerViewPropertiesWindow(Customer customer, LinkedHashMap<Integer,Property> listProperties, JFrame OwnerWindow) {
        initComponents();
        this.customer = customer;
        this.listProperties = listProperties;
        this.OwnerWindow = OwnerWindow;
        //ImageLabel.setText("");        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        AddToVisitingListPropertyButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        NumberRoomsTextField = new javax.swing.JTextField();
        DeletionStatusTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ImageLabel = new javax.swing.JLabel();
        RentTextField = new javax.swing.JTextField();
        ShowPropertyButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AddressTextField = new javax.swing.JTextField();
        PropertiesComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        OrderByNumberRoomsButton = new javax.swing.JButton();
        OrderByRentButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        PhotosComboBox = new javax.swing.JComboBox<>();
        ShowPhotoButton = new javax.swing.JButton();
        FilenameTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        OrderByNumberRoomsButton1 = new javax.swing.JButton();
        LocationTextField = new javax.swing.JTextField();
        TypeTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(995, 731));

        jLabel4.setText("Location");

        AddToVisitingListPropertyButton.setText("Add to visiting list");
        AddToVisitingListPropertyButton.setEnabled(false);
        AddToVisitingListPropertyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToVisitingListPropertyButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Number of rooms");

        jLabel11.setText("Deletion status");

        NumberRoomsTextField.setEnabled(false);

        DeletionStatusTextField.setEnabled(false);

        jLabel6.setText("Rent");

        ImageLabel.setText("theImage");
        ImageLabel.setMaximumSize(new java.awt.Dimension(389, 215));
        ImageLabel.setPreferredSize(new java.awt.Dimension(350, 200));

        RentTextField.setEnabled(false);

        ShowPropertyButton.setText("Show property");
        ShowPropertyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPropertyButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("View properties");

        jLabel2.setText("Type");

        jLabel3.setText("Address");

        AddressTextField.setEnabled(false);

        PropertiesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PropertiesComboBoxActionPerformed(evt);
            }
        });

        jLabel7.setText("My properties");

        jLabel8.setText("Photos of the property");

        jLabel9.setText("Property information");

        OrderByNumberRoomsButton.setText("Order by country");
        OrderByNumberRoomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderByNumberRoomsButtonActionPerformed(evt);
            }
        });

        OrderByRentButton.setText("Order by date");
        OrderByRentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderByRentButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("Filename");

        jLabel16.setText("Image");

        PhotosComboBox.setEnabled(false);
        PhotosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhotosComboBoxActionPerformed(evt);
            }
        });

        ShowPhotoButton.setText("Show photo");
        ShowPhotoButton.setEnabled(false);
        ShowPhotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPhotoButtonActionPerformed(evt);
            }
        });

        FilenameTextField.setEnabled(false);

        jLabel12.setText("Date");

        jTextField1.setEnabled(false);

        jLabel13.setText("Country");

        jTextField2.setEnabled(false);

        jLabel14.setText("Description");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        OrderByNumberRoomsButton1.setText("Order by description");
        OrderByNumberRoomsButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderByNumberRoomsButton1ActionPerformed(evt);
            }
        });

        LocationTextField.setEnabled(false);

        TypeTextField.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(281, 281, 281)
                                .addComponent(AddToVisitingListPropertyButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                        .addComponent(PropertiesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(ShowPropertyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(2, 2, 2)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel6)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel3))
                                                            .addComponent(jLabel11)))
                                                    .addComponent(jLabel2))
                                                .addGap(57, 57, 57)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(RentTextField)
                                                    .addComponent(NumberRoomsTextField)
                                                    .addComponent(AddressTextField)
                                                    .addComponent(DeletionStatusTextField)
                                                    .addComponent(LocationTextField)
                                                    .addComponent(TypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(OrderByNumberRoomsButton)
                                                        .addGap(12, 12, 12)
                                                        .addComponent(OrderByRentButton)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(OrderByNumberRoomsButton1))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel12)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel16)
                                                            .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel10)
                                                            .addComponent(jLabel8)
                                                            .addComponent(jLabel13)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(BackButton)
                                                                .addComponent(jLabel14)))
                                                        .addGap(0, 0, Short.MAX_VALUE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(ShowPhotoButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(PhotosComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(FilenameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(29, 29, 29)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PropertiesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(ShowPropertyButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(PhotosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(ShowPhotoButton)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OrderByNumberRoomsButton)
                            .addComponent(OrderByRentButton)
                            .addComponent(OrderByNumberRoomsButton1))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FilenameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel9)
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumberRoomsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(LocationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(DeletionStatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddToVisitingListPropertyButton)
                    .addComponent(BackButton))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddToVisitingListPropertyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToVisitingListPropertyButtonActionPerformed

        
    }//GEN-LAST:event_AddToVisitingListPropertyButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.dispose();
        this.OwnerWindow.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ShowPropertyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPropertyButtonActionPerformed
        //this.showProperty();
    }//GEN-LAST:event_ShowPropertyButtonActionPerformed

    private void PropertiesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PropertiesComboBoxActionPerformed

    }//GEN-LAST:event_PropertiesComboBoxActionPerformed

    private void OrderByNumberRoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderByNumberRoomsButtonActionPerformed
        /*this.clean();
        ISystemFacade facade = new SystemFacade();
        this.listProperties = facade.propertiesByOwner(this.owner.getId(),"NumberRooms");
        this.stablishListProperties();*/
    }//GEN-LAST:event_OrderByNumberRoomsButtonActionPerformed

    private void OrderByRentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderByRentButtonActionPerformed
        /*this.clean();
        ISystemFacade facade = new SystemFacade();
        this.listProperties = facade.propertiesByOwner(this.owner.getId(),"Rent");
        this.stablishListProperties();*/
    }//GEN-LAST:event_OrderByRentButtonActionPerformed

    private void PhotosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhotosComboBoxActionPerformed

    }//GEN-LAST:event_PhotosComboBoxActionPerformed

    private void ShowPhotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPhotoButtonActionPerformed
        //this.showPhoto();
    }//GEN-LAST:event_ShowPhotoButtonActionPerformed

    private void OrderByNumberRoomsButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderByNumberRoomsButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderByNumberRoomsButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerViewPropertiesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerViewPropertiesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerViewPropertiesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerViewPropertiesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CustomerViewPropertiesWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToVisitingListPropertyButton;
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField DeletionStatusTextField;
    private javax.swing.JTextField FilenameTextField;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JTextField LocationTextField;
    private javax.swing.JTextField NumberRoomsTextField;
    private javax.swing.JButton OrderByNumberRoomsButton;
    private javax.swing.JButton OrderByNumberRoomsButton1;
    private javax.swing.JButton OrderByRentButton;
    private javax.swing.JComboBox<String> PhotosComboBox;
    private javax.swing.JComboBox<String> PropertiesComboBox;
    private javax.swing.JTextField RentTextField;
    private javax.swing.JButton ShowPhotoButton;
    private javax.swing.JButton ShowPropertyButton;
    private javax.swing.JTextField TypeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
