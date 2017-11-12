/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import World.Country;
import World.DateValidator;
import World.ISystemFacade;
import World.Photo;
import World.Property;
import World.SystemFacade;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class AddPhotoWindow extends javax.swing.JFrame {
    
    private final Property property;
    private final JFrame previousWindow;
    private int i;
    private File file;
    private HashMap<Integer,Photo> listPhotos;

    /**
     * Creates new form AddPhotoWindow
     * @param property
     * @param previousWindow
     * @param i
     */
    public AddPhotoWindow(Property property, JFrame previousWindow, int i) {
        initComponents();
        this.property = property;
        this.previousWindow = previousWindow;        
        
        AddPhotoLabel.setText("Add photo "+i);
        
        ISystemFacade facade = new SystemFacade(); 
        
        HashMap<Integer,Country> listCountries;
        listCountries = facade.retrieveCountries();
        Country country;
        
        Set set = listCountries.entrySet();        
        Iterator iterator = set.iterator();

        while(iterator.hasNext()) {
               
            Map.Entry mentry = (Map.Entry)iterator.next();               
            country = (Country) mentry.getValue();
            CountryComboBox.addItem(country.getId()+". "+country.getName());
            
        }
        
        this.listPhotos = new HashMap<Integer,Photo>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddPhotoLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FilenameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        UploadButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescriptionTextArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        NextButton = new javax.swing.JButton();
        DateTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CountryComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddPhotoLabel.setText("Add photo n");

        jLabel2.setText("Filename");

        jLabel3.setText("Image");

        UploadButton.setText("Upload");
        UploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Description");

        DescriptionTextArea.setColumns(20);
        DescriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(DescriptionTextArea);

        jLabel5.setText("Date (dd/mm/yyyy)");

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        NextButton.setText("Next");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        DateTextField.setText("dd/mm/yyyy");

        jLabel6.setText("Country");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddPhotoLabel)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FilenameTextField)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(UploadButton)
                    .addComponent(DateTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CountryComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(NextButton)
                .addGap(68, 68, 68)
                .addComponent(CancelButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(AddPhotoLabel)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FilenameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UploadButton)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CountryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton)
                    .addComponent(NextButton))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadButtonActionPerformed
        JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
        fc.showOpenDialog(fc);
        this.file = fc.getSelectedFile();
    }//GEN-LAST:event_UploadButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.dispose();
        this.previousWindow.setVisible(true);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        if(validateFields() == true){
            try {
                if(this.i == 5){
                    
                    this.property.setPhotos(this.listPhotos);
                    //add property
                    this.dispose();
                    this.previousWindow.setVisible(true);
                    
                }else{
                    
                    Photo photo;
                    
                    String country = (String)CountryComboBox.getSelectedItem();
                    int idCountry = Integer.parseInt(country.substring(0, 1));

                    photo = new Photo(FilenameTextField.getText(),this.file,
                            DescriptionTextArea.getText(),
                            new SimpleDateFormat("dd/MM/yyyy").parse(DateTextField.getText()),
                            idCountry,this.property.getId());
                    
                    this.listPhotos.put(this.i, photo);
                    
                    this.i = this.i+1;
                    FilenameTextField.setText("");
                    DescriptionTextArea.setText("");
                    DateTextField.setText("dd/mm/yyyy");
                    CountryComboBox.setSelectedIndex(0);
                    this.file = null;
                }
                
            } catch (ParseException ex) {
                Logger.getLogger(AddPhotoWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_NextButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddPhotoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPhotoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPhotoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPhotoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AddPhotoWindow().setVisible(true);
            }
        });
    }
    
    private boolean validateFields(){
        
        boolean b = true;
        boolean fill = true;
        
        if(FilenameTextField.getText().compareTo("") == 0){      
            b = false;
            fill = false;
        }else{
            if (FilenameTextField.getText().matches("[a-zA-Z0-9]*") == false){
                b = false;
                JOptionPane.showMessageDialog(null, "Filename can contain only letters and numbers");
            }else{
                if(FilenameTextField.getText().length() > 35){ 
                    b = false;
                    JOptionPane.showMessageDialog(null, "Filename has a maximum lenght of 35 characters");
                }
            }
        }
        
        if(DescriptionTextArea.getText().compareTo("") == 0){      
            b = false;
            fill = false;
        }else{
            if(DescriptionTextArea.getText().length() > 100){ 
                b = false;
                JOptionPane.showMessageDialog(null, "Description has a maximum lenght of 100 characters");
            }
        }
        
        if(DateTextField.getText().compareTo("") == 0){      
            b = false;
            fill = false;
        }else{
            DateValidator dateValidator = new DateValidator();
            if (dateValidator.validate(DateTextField.getText()) == false){
                b = false;
                JOptionPane.showMessageDialog(null, "Incorrect date");            
            }else{
                try {
                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    Date dateobj = new Date();
                    System.out.println(dateobj);
                    
                    Date dateText=new SimpleDateFormat("dd/MM/yyyy").parse(DateTextField.getText());
                    
                    if (dateText.compareTo(dateobj) > 0) {
                        System.out.println("Date is incorrect");
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(AddPhotoWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        
        if (fill == false){
            JOptionPane.showMessageDialog(null, "Warning: you have to fill all the fields");
        }
        
        return b;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddPhotoLabel;
    private javax.swing.JButton CancelButton;
    private javax.swing.JComboBox<String> CountryComboBox;
    private javax.swing.JTextField DateTextField;
    private javax.swing.JTextArea DescriptionTextArea;
    private javax.swing.JTextField FilenameTextField;
    private javax.swing.JButton NextButton;
    private javax.swing.JButton UploadButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
