/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demineur_2;
import java.util.Random;
/**
 *
 * @author marga
 */
public class JEU {
    private CASE[][] grille ;
    int lig;
    int col; 
    int nb_mines;
    int nb_kits;
    int vies;
    
    public JEU(int nm_lig, int nm_col, int nb_mines, int nb_kits) {
        this.lig = nm_lig;
        this.col = nm_col;
        this.nb_mines = nb_mines;
        this.nb_kits = nb_kits;
        this.vies = 3;
        this.grille = new CASE[lig][col];     
    
          
    for (int i = 0; i<lig ; i++){
        for (int j = 0 ; j<col ; j++) {
            this.grille[i][j] = new CASE(false);
            
        }
    }
    
    Random aléa = new Random();
    int minesposées = 0;
    while (minesposées < nb_mines){
        int ligne = aléa.nextInt(lig);
        int colonne = aléa.nextInt(col);
        if (!this.grille[ligne][colonne].isMine()){
            this.grille[ligne][colonne].setMine(true);
            minesposées++;
            
            
        }
        
    }
    }
    public void case_non_cliquée(int ligne, int colonne){
        if (this.grille[ligne][colonne].isCase_cliquée()){
            this.grille[ligne][colonne].setCase_cliquée(false);
            if (this.grille[ligne][colonne].isMine()){
                this.vies--;
                if (this.vies == 0){
                    System.out.println("partie perdue");
                }
                else{
                    for (int i = Math.max(0, ligne - 1); i <= Math.min(lig - 1, ligne + 1); i++) {
                        for (int j = Math.max(0, col - 1); j <= Math.min(col - 1, colonne + 1); j++) {
                            case_non_cliquée(i, j);
                            
                }
            }
            
    }
        
}
        }
    }
        public boolean gagner(){
            for (int i = 0 ; i<lig;i++){
                for (int j = 0 ; j<col ; j++){
                    if (!this.grille[i][j].isMine() && this.grille[i][j].isCase_cliquée()) {
                        return false;
                    }
                }
            }
            return true;

                }
        
        public int getvies() {
            return vies;
}
        public CASE[][] getGrille() {
            return grille;
}
}
            

    


