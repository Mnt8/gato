/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato_tres.en.raya;
import java.util.Scanner; 
/**
 *
 * @author LABMOVIL
 */
public class Gato_tresEnRaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    }    
    public static void jugar (){
      char P1 = 'X';
      char P2 = 'O';
      char Sin = '*';
      
      boolean turno = true;
      
      char tabla[][] = new char[3][3];
      rellenartablero(tabla, Sin);
      int fila, columna;
     Scanner teclado = new Scanner(System.in);
      
     while(findepartida(tabla)){
     turnoactual(turno);    
       mostrartablero(tabla); 
    
       fila = teclado.nextInt();
       columna = teclado.nextInt();
       boolean validacion = comprobarpos(tabla, fila, columna);
       if(validacion){
           
       }
       
       
       
       turno =! turno;
     }
    }
     
    public static void mostrartablero(char[][] tablero){
        for(int i = 0; i < tablero.length; i++) { 
            for (int f = 0; f< tablero.length; f++){
                System.out.print(tablero[i][f] +  " ");
            }
            System.out.println(" ");
        }    
    }

    public static int pedirpos(string mensaje){
        System.out.println("ingrese fila");
        
    }
    
    public static void rellenartablero(char[][] tablero, char simbolo){
        
        for(int i = 0; i < tablero.length; i++) { 
            for (int f = 0; f< tablero.length; f++){
                tablero [i][f]= simbolo; 
            }
        }
    }

   public static boolean comprobarpos (char[][]tabla, int fila, int columna){
     if(fila >= 0 && fila<tabla.length && columna >= 0 && columna<tabla.length){
      return true;   
     }
    return false;
}   
    
   public static boolean findepartida(char[][] tablero){
        
    }

  public static void turnoactual (boolean turno){
      if(turno){
          System.out.println("turno de P1"); 
                }else {
                  System.out.println("turno de P2");
                }
            }
        }
  




    
    

