package dialogsOption;

import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author kkmagloire
 */
public class OptionDlg extends javax.swing.JDialog {
private int choixOpt;  // attribut de type int contenant le numéro de l'option 
private int nbCol;     // de type int pour contenir le nombre de col de la carte 
private int nbNum ;   //  de type int pour choisir le nombre de numéro d'une carte 
    /**
     * Creates new form OptionDlg
     */
    public OptionDlg(java.awt.Frame parent, boolean modal, boolean ca, int nc, int nn) {
        super(parent, modal); // appel du constructeur de la classe mere jDialog 
        initComponents();         // methode d'initialisation des composants graphiques de l'interface 
        remplirComboCol(); // Méthode qui permet d’initialiser les valeurs de la liste déroulante à 5,6,7,8 et 9.
        // Cocher  l’option Quine par défaut – Les boutons doivent être groupés
        this.Unequine.setSelected(true);
        this.ComboNbCol.setSelectedItem("1");
        this.NbNumero.setText(5+"");
        if(!ca){// test si des cartes on déjà été achetés
            this.nbNum=5;
            this.nbCol=5;
        }
        else{
            this.nbNum= nn;
            this.nbCol=nc;
            this.NbNumero.setText(""+this.nbNum);
            this.ComboNbCol.setSelectedIndex(nbCol-1);
            this.ComboNbCol.setEnabled(false);
            this.NbNumero.setEnabled(false);
            this.Message.setText("Nb de colonnes et de numéros nom modifiables");
        }
       
    }
    public int getChoix() {
        return choixOpt;
    }

    public int getNbCol() {
        return nbCol;
    }

  
    public int getNbNum() {
        return nbNum;
    }
    
    private void remplirComboCol(){
           for(int i= 0; i<5; i++)
               this.ComboNbCol.addItem(""+(i+5));
           
          
           
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Unequine = new javax.swing.JRadioButton();
        deuxQuine = new javax.swing.JRadioButton();
        cartonPlein = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ComboNbCol = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        NbNumero = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        Message = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        annuler = new javax.swing.JButton();
        valider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setText("Option du jeu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.GridLayout(1, 2));

        jPanel4.setLayout(new java.awt.GridLayout(4, 1));

        jLabel2.setText("Comment voulez-vous jouer?");
        jPanel4.add(jLabel2);

        buttonGroup1.add(Unequine);
        Unequine.setText("Quine-Une ligne complète");
        jPanel4.add(Unequine);

        buttonGroup1.add(deuxQuine);
        deuxQuine.setText("Double Quine-Deux lignes complètes");
        jPanel4.add(deuxQuine);

        buttonGroup1.add(cartonPlein);
        cartonPlein.setText("Carton Plein-TRois lignes comlpètes");
        cartonPlein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartonPleinActionPerformed(evt);
            }
        });
        jPanel4.add(cartonPlein);

        jPanel2.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(4, 2));

        jLabel4.setText("Configuration des cartons");
        jPanel5.add(jLabel4);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 167, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel7);

        jLabel5.setText("Combien de colonnes");
        jPanel5.add(jLabel5);

        jPanel5.add(ComboNbCol);

        jLabel3.setText("Combien de numéros");
        jPanel5.add(jLabel3);
        jPanel5.add(NbNumero);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 167, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Message)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Message)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel5.add(jPanel6);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 167, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel8);

        jPanel2.add(jPanel5);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        annuler.setText("Annuler");
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });
        jPanel3.add(annuler);

        valider.setText("Valider");
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerActionPerformed(evt);
            }
        });
        jPanel3.add(valider);

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cartonPleinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartonPleinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartonPleinActionPerformed

    private void validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerActionPerformed
        // TODO add your handling code here:
        // récupération du nombre de ligne gagnant 
         if(this.Unequine.isSelected()==true)
               this.choixOpt=1;
           
           else if(this.deuxQuine.isSelected()==true)
               this.choixOpt=2;
           else
               this.choixOpt=3;
         // récupération du nombre de colonne des cartes 
           
           this.nbCol= Integer.parseInt(this.ComboNbCol.getSelectedItem().toString());
           
           // récupération du nombre de numéro 
           if(this.NbNumero.getText().equals(""))
               this.Message.setText("veillez le nombre de numéro");
           else{
               int num=  Integer.parseInt(this.NbNumero.getText());
               if(num>=3&& num<=3*this.nbCol){ // le nombr de numéro ne doit pas dépasser le nombre de case disponible qui est 3 *nbCol  et le minimum est 5
                   this.nbNum=  Integer.parseInt(this.NbNumero.getText());
                   this.dispose();
               }
               else
                 this.Message.setForeground(Color.red);
                 this.Message.setText("Numéro entre 3 et "+3*this.nbCol);

           }
        
    }//GEN-LAST:event_validerActionPerformed

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
        // TODO add your handling code here:
          this.dispose();
    }//GEN-LAST:event_annulerActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboNbCol;
    private javax.swing.JLabel Message;
    private javax.swing.JTextField NbNumero;
    private javax.swing.JRadioButton Unequine;
    private javax.swing.JButton annuler;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cartonPlein;
    private javax.swing.JRadioButton deuxQuine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton valider;
    // End of variables declaration//GEN-END:variables
}