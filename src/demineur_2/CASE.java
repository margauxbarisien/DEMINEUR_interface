/*BROUART & BARISIEN*/
package demineur_2;

/**
 *
 * @author marga
 */
public class CASE {
    boolean mine ; 
    boolean case_cliquée ;
    boolean drapeau ;
    
    
    public CASE (boolean mine){
        this.mine = mine;
        this.case_cliquée = false; 
        this.drapeau = false;
    }

    

    public boolean isMine() {
        return mine;
    }

    public boolean isCase_cliquée() {
        return case_cliquée;
    }

    public boolean isDrapeau() {
        return drapeau;
    }


    public void setMine(boolean Mines) {
        this.mine = Mines;
    }

    public void setCase_cliquée(boolean c_cliquée) {
        this.case_cliquée = c_cliquée;
    }

    public void setDrapeau(boolean drap) {
        this.drapeau = drap;
    }
    
    
    
}
