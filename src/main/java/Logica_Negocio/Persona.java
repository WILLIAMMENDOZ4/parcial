/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author william men
 */
public class Persona {
    
    // atributos
   public String nombre;
   public int identificacion;
   public int añonacimiento;
   
   // constructor no parametrizado
   public Persona (){
    
       
   }    
    // constructor parametrizado
    public Persona(String nombre, int identificacion, int añonacimiento) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.añonacimiento = añonacimiento;
    }
      
    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setAñonacimiento(int añonacimiento) {
        this.añonacimiento = añonacimiento;
    }
     
    // getters
    public String getNombre() {
        return nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public int getAñonacimiento() {
        return añonacimiento;
    }
    
    
}
