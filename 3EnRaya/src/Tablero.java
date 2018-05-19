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

    public void hayFicha(int posicion){
        switch(posicion){
            case 1:
                if(pos1.equals(" ")){
                    hayFicha = false;
                }else{
                    hayFicha = true;
                    System.out.println("Ya hay una ficha en esta posicion.");
                }
            break;
            case 2:
                if(pos2.equals(" ")){
                    hayFicha = false;
                }else{
                    hayFicha = true;
                    System.out.println("Ya hay una ficha en esta posicion.");
                }
            break;
            case 3:
                if(pos3.equals(" ")){
                    hayFicha = false;
                }else{
                    hayFicha = true;
                    System.out.println("Ya hay una ficha en esta posicion.");
                }
            break;
            case 4:
                if(pos4.equals(" ")){
                    hayFicha = false;
                }else{
                    hayFicha = true;
                    System.out.println("Ya hay una ficha en esta posicion.");
                }
            break;
            case 5:
                if(pos5.equals(" ")){
                    hayFicha = false;
                }else{
                    hayFicha = true;
                    System.out.println("Ya hay una ficha en esta posicion.");
                }
            break;
            case 6:
                if(pos6.equals(" ")){
                    hayFicha = false;
                }else{
                    hayFicha = true;
                    System.out.println("Ya hay una ficha en esta posicion.");
                }
            break;
            case 7:
                if(pos7.equals(" ")){
                    hayFicha = false;
                }else{
                    hayFicha = true;
                    System.out.println("Ya hay una ficha en esta posicion.");
                }
            break;
            case 8:
                if(pos8.equals(" ")){
                    hayFicha = false;
                }else{
                    hayFicha = true;
                    System.out.println("Ya hay una ficha en esta posicion.");
                }
            break;
            case 9:
                if(pos9.equals(" ")){
                    hayFicha = false;
                }else{
                    hayFicha = true;
                    System.out.println("Ya hay una ficha en esta posicion.");
                }
            break;
            default:
                System.out.println("Error. Introduce una opcion valida.");
            break;
        }
    }
        
    public void colocarFicha(int posicion, String ficha){
        switch(posicion){
            case 1:
                pos1 = ficha;
            break;
            case 2:
                pos2 = ficha;
            break;
            case 3:
                pos3 = ficha;
            break;
            case 4:
                pos4 = ficha;
            break;
            case 5:
                pos5 = ficha;
            break;
            case 6:
                pos6 = ficha;
            break;
            case 7:
                pos7 = ficha;
            break;
            case 8:
                pos8 = ficha;
            break;
            case 9:
                pos9 = ficha;
            break;
        }
    }

    public boolean tableroLleno(){
        if(!" ".equals(pos1) && !" ".equals(pos2) && !" ".equals(pos3) && !" ".equals(pos4) && !" ".equals(pos5) && !" ".equals(pos6) && !" ".equals(pos7) && !" ".equals(pos8) && !" ".equals(pos9)){
            return true;
        }else{
            return false;
        }
    }

    
    public String tresEnRaya(){
        if(pos1.equals(pos2) && pos1.equals(pos3)){ 
            return pos1;
        }else if(pos4.equals(pos5) && pos4.equals(pos6)){
            return pos4;
        }else if(pos7.equals(pos8) && pos7.equals(pos9)){
            return pos7;
        }else if(pos1.equals(pos4) && pos1.equals(pos7)){
            return pos1;
        }else if(pos2.equals(pos5) && pos2.equals(pos8)){
            return pos2;
        }else if(pos3.equals(pos6) && pos3.equals(pos9)){
            return pos3;
        }else if(pos1.equals(pos5) && pos1.equals(pos9)){
            return pos1;
        }else if(pos3.equals(pos5) && pos3.equals(pos7)){
            return pos3;
        }else{
            return " ";
        }
    }
    
    public void quienGana(String ficha){
        System.out.println("");
        if(ficha.equals("X")){
            System.out.println("El jugador 1 ha ganado la partida.");
        }else if(ficha.equals("O")){
            System.out.println("El jugador 2 ha ganado la partida.");
        }else{
            System.out.println("El tablero esta lleno. La partida se ha acabado.");
        }
    }

}
