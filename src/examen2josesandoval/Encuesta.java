
package examen2josesandoval;

import java.util.Random;


public class Encuesta {
    public static  int numEncuesta;
    public static String nombre;
    public static int edad;
    public static String correo;
    private boolean carroPropio;
    
     
        
    
    public Encuesta(int numEncuesta, String nombre, int edad, String correo, boolean carroPropio) {
        this.numEncuesta = numEncuesta;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.carroPropio = carroPropio;
    }

    public int getNumEncuesta() {
        return numEncuesta;
    }

    public void setNumEncuesta(int numEncuesta) {
        this.numEncuesta = numEncuesta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isCarroPropio() {
        return carroPropio;
    }

    public void setCarroPropio(boolean carroPropio) {
        this.carroPropio = carroPropio;
    }
    
  
    
    
}
