/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_testing;

import Calcul.calcul;
import projet.projet;

/**
 *
 * @author vincent
 */
public class Projet_testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        projet proj = new projet("projet 1",-232000,15,0.1);
        for(int i=0;i<15;i++)
            proj.addCashflow(38800);
        
        double npv = calcul.CalculateNPV(proj);
        System.out.println("npv de "+proj.getName()+" = "+npv);
        
        projet proj2 = new projet("projet 2",-7500,4,0.1);
        proj2.addCashflow(3000);
        proj2.addCashflow(5000);
        proj2.addCashflow(1200);
        proj2.addCashflow(4000);
        
        double npv2 = calcul.CalculateNPV(proj2);
        double irr = calcul.CalculateIRR(proj2, 0.1);
        System.out.println("npv de "+proj2.getName()+" : "+npv2);
        System.out.println("IRR de " +proj2.getName()+" : "+irr);
        
        projet pr = new projet("projet 3",-10000,3,0.1);
        pr.addCashflow(3000);
        pr.addCashflow(4200);
        pr.addCashflow(6800);
        
        double npv3 = calcul.CalculateNPV(pr);
        System.out.println("npv "+pr.getName()+" : " + npv3 );
    }
    
}
