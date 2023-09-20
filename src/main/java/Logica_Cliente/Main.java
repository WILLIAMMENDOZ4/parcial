/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Persona;
import java.util.Scanner;

/**
 *
 * @author william men
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre="";
        int identificacion=0;
        int añonacimiento=0;
        int añoactual=2023;
        
        
       Persona objpersona=new Persona(); 
       
       Scanner scan= new Scanner(System.in );
       
       
       System.out.println(" Digite su nombre ");
       nombre = scan.nextLine();
       objpersona.setNombre(nombre);
       
       System.out.println(" Digite su numero de identificacion");
       identificacion =scan.nextInt();
       objpersona.setIdentificacion(identificacion);
       
       System.out.println("ingrese su año de nacimiento ");
       añonacimiento= scan.nextInt();
       objpersona.setAñonacimiento(añonacimiento);
       
       // operacion
       int mensaje= añoactual-objpersona.getAñonacimiento();
       
       // creacion del objeto con contructor parametrizado
       Persona objpersona1=new Persona(nombre,identificacion,añonacimiento);
       int mensaje1= añoactual-objpersona.getAñonacimiento();
       
       // salida del constructor no parametrizado
       System.out.println(" El nombre del cliente es: "+"\t"+objpersona.getNombre());
       System.out.println(" el numero de identificacion del cliente es: "+"\t"+objpersona.getIdentificacion());
       System.out.println(" El cliente nacio en el año: "+"\t"+objpersona.getAñonacimiento());
       System.out.println(" La edad del cliente es de:  "+"\t"+mensaje+ "años"); 
       
       // salida del constructor parametrizado
       System.out.println(" El nombre del cliente es: "+"\t"+objpersona1.getNombre());
       System.out.println(" el numero de identificacion del cliente es: "+"\t"+objpersona1.getIdentificacion());
       System.out.println(" El cliente nacio en el año: "+"\t"+objpersona1.getAñonacimiento());
       System.out.println(" La edad del cliente es de:  "+"\t"+mensaje1+ "años"); 
       
       
       
       
    
       
       
    }
    
}
