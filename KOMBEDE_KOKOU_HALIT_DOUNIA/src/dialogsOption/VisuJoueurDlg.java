/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package dialogsOption;

import autresClasses.BoutonImage;
import autresClasses.Joueur;
import autresClasses.PanneauImage;

/**
 *
 * @author kk558433
 */
public class VisuJoueurDlg extends javax.swing.JDialog {

    //déclaration d'attribut 
    private Joueur lejoueur;  
    private BoutonImage btImg;
    /**
     * Creates new form VisuJoueurDlg
     */
    public VisuJoueurDlg(java.awt.Frame parent, boolean modal, Joueur j) {
        super(parent, modal); // appel du constructeur  de la JDialog
        initComponents();            /// initialisation de l'interface 
        this.lejoueur=j; // affectation du joueur donné  en parametre à la la variable lejoueur de cette classe
        btImg= new BoutonImage();
        initInfos();  //appel de la fonction qui initialise l'interface avec les informations du joueur 
    }
    
    private void initInfos(){
        //affichage des infos du joueur dans la boite de dialogue 
        this.pseudo.setText(lejoueur.getPseudo());
        this.couleur.setBackground(lejoueur.getCouleur());
        this.solde.setText(""+lejoueur.getSolde());
         // affichage du text descriptif du joueur dans la zone de text dédiée  
        this.Edition.setText("le joueurs s'appelle : "+this.lejoueur.getPseudo()+"\n\n Il aime la couleur: "+this.lejoueur.getCouleur()+"\n\n Il dispose de la somme de "+this.lejoueur.getSolde());
        btImg.setImg(lejoueur.getPhoto().getImage());// getPhoto retourne ImageIcon donc on convertie en Image
        Photo.add(btImg);
       // Photo.setIcon(lejoueur.getPhoto()); // affichagede la photo du joueur dans la zone dédiée ; ,
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nord = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Centre = new javax.swing.JPanel();
        CG = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pseudo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        couleur = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        solde = new javax.swing.JLabel();
        CD = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Edition = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        Photo = new javax.swing.JButton();
        Sud = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        fermer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Informations relatives à un joueur ");
        Nord.add(jLabel1);

        getContentPane().add(Nord, java.awt.BorderLayout.NORTH);

        Centre.setLayout(new java.awt.GridLayout(1, 2));

        CG.setLayout(new java.awt.GridLayout(3, 2));

        jLabel2.setText("Pseudo");
        CG.add(jLabel2);
        CG.add(pseudo);

        jLabel4.setText("Couleur");
        CG.add(jLabel4);

        couleur.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout couleurLayout = new javax.swing.GroupLayout(couleur);
        couleur.setLayout(couleurLayout);
        couleurLayout.setHorizontalGroup(
            couleurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        couleurLayout.setVerticalGroup(
            couleurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        CG.add(couleur);

        jLabel5.setText("Solde");
        CG.add(jLabel5);
        CG.add(solde);

        Centre.add(CG);

        CD.setLayout(new java.awt.GridLayout(1, 2));

        jPanel2.setLayout(new java.awt.GridLayout(1, 1));

        Edition.setColumns(20);
        Edition.setRows(5);
        jScrollPane1.setViewportView(Edition);

        jPanel2.add(jScrollPane1);

        CD.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(1, 1));
        jPanel3.add(Photo);

        CD.add(jPanel3);

        Centre.add(CD);

        getContentPane().add(Centre, java.awt.BorderLayout.CENTER);

        Sud.setLayout(new java.awt.GridLayout(1, 2));
        Sud.add(jButton1);

        fermer.setText("Fermer");
        fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermerActionPerformed(evt);
            }
        });
        Sud.add(fermer);

        getContentPane().add(Sud, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerActionPerformed
       // fermeture de la boite 
        this.setVisible(false);
       // this.dispose();       
 // TODO add your handling code here:
    }//GEN-LAST:event_fermerActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CD;
    private javax.swing.JPanel CG;
    private javax.swing.JPanel Centre;
    private javax.swing.JTextArea Edition;
    private javax.swing.JPanel Nord;
    private javax.swing.JButton Photo;
    private javax.swing.JPanel Sud;
    private javax.swing.JPanel couleur;
    private javax.swing.JButton fermer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pseudo;
    private javax.swing.JLabel solde;
    // End of variables declaration//GEN-END:variables
}
