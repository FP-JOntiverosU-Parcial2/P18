/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema18;
import java.util.*;
/**
 *
 * @author jaime
 */
public class Problema18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int n1,n2,n3,o;
    n1=solicitarDato("a");  //se introducen los datos
    n2=solicitarDato("b");
    n3=solicitarDato("c");
    o=operacion(n1,n2,n3);
    mensajeSalida();


    
    }
    public static int solicitarDato(String d){  
        int dato;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce el numero " + d);
        dato= teclado.nextInt();
        return dato ;
    }
    
    public static int operacion(int n1, int n2, int n3){
        int i,m;         //se hace la operacion para buscar el menor numero
        m= n1;
        if(n2<m)m=n2;
        if (n3<m)m=n3;
         i =m;
        while ((i % n1 != 0) || (i % n2 != 0) || (i % n3 != 0)) {   //se dividen 
            if (n1%i==0) n1=n1/i;
                if (n2%i==0) n2=n2/i;
               if (n3%i==0) n3=n3/i;
                i++;
        }
           
 
        System.out.println( "El MCM es: " + i );
        return i;
    }
     public static void mensajeSalida(){
        System.out.println("Gracias por usar el programa"); //se agradece
        System.exit(0);//Sale del programa
     }
}
               
        
        
    