/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SISCU
 */
public class Tablero {
    public int turno;
    public boolean J1Juega, hayFicha;
    public String pos1,pos2,pos3,pos4,pos5,pos6,pos7,pos8,pos9;
    
    
    public Tablero() {
        this.turno = 1;
        this.J1Juega = true;
        this.pos1 = " ";
        this.pos2 = " ";
        this.pos3 = " ";
        this.pos4 = " ";
        this.pos5 = " ";
        this.pos6 = " ";
        this.pos7 = " ";
        this.pos8 = " ";
        this.pos9 = " ";
    }

    public void mostrarTablero(){         
        System.out.println("       Tablero       " + "        " + "     Posiciones      ");
        System.out.println("                     " + "Turno: " + turno + "                     ");
        System.out.println("      *       *      " + "        " + "      *       *      ");
        System.out.println("  " + pos1 + "   *   " + pos2 + "   *   " + pos3 + "  " + "        " + "  1   *   2   *   3  ");
        System.out.println("      *       *      " + "        " + "      *       *      ");
        System.out.println("* * * * * * * * * * *" + "        " + "* * * * * * * * * * *");
        System.out.println("      *       *      " + "        " + "      *       *      ");
        System.out.println("  " + pos4 + "   *   " + pos5 + "   *   " + pos6 + "  " + "        " + "  4   *   5   *   6  ");
        System.out.println("      *       *      " + "        " + "      *       *      ");
        System.out.println("* * * * * * * * * * *" + "        " + "* * * * * * * * * * *");
        System.out.println("      *       *      " + "        " + "      *       *      ");
        System.out.println("  " + pos7 + "   *   " + pos8 + "   *   " + pos9 + "  " + "        " + "  7   *   8   *   9  ");
        System.out.println("      *       *      " + "        " + "      *       *      ");
    }
    	
    public void aumentarTurno(){
        turno = turno + 1;
        
        if(J1Juega == true){
            J1Juega = false;
        }else{
            J1Juega = true;
        }
    }
}
