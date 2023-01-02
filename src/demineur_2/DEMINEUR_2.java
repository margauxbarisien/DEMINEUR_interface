/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demineur_2;

import java.util.Scanner;

/**
 *
 * @author marga
 */
public class DEMINEUR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nombre de lignes : ");
        int nm_lig = sc.nextInt();
        System.out.print("Entrez le nombre de colonnes : ");
        int nm_col = sc.nextInt();
        System.out.print("Entrez le nombre de bombes : ");
        int nb_mines = sc.nextInt();
        System.out.print("Entrez le nombre de kits de déminage : ");
        int nb_kits = sc.nextInt();
        JEU jeu = new JEU(nm_lig, nm_col, nb_mines, nb_kits);

        while (true) {
            CASE[][] grille = jeu.getGrille();
            for (int i = 0; i < nm_lig; i++) {
                for (int j = 0; j < nm_col; j++) {
                    CASE c = grille[i][j];
                    if (c.isCase_cliquée()) {
                        System.out.println("C");

                    } else if (c.isMine()) {
                        System.out.println("X");
                    } else {
                        int minescotés = 0;
                        for (int k = Math.max(0, i - 1); k <= Math.min(nm_lig - 1, i + 1); k++) {
                            for (int l = Math.max(0, j - 1); l <= Math.min(nm_col - 1, j + 1); l++) {
                                if (grille[k][l].isMine()) {
                                    minescotés++;
                                }
                            }
                        }
                        System.out.print(minescotés + " ");
                    }
                }
                System.out.println();
                System.out.print("Entrez une action (U pour découvrir,F pour marquer, D pour désamorcer) : ");
                String action = sc.next();
                System.out.print("Entrez la ligne : ");
                int row = sc.nextInt();
                System.out.print("Entrez la colonne : ");
                int col = sc.nextInt();
                if (action.equals("U")) {
                    jeu.case_non_cliquée(row, col);
                }
                if (jeu.gagner()) {
                    break;
                }
                if (jeu.getvies() == 0) {
                    break;
                }
            }
        }
    }
}
                
        

            

         
        
        
        
        
        
        
        
        
        
