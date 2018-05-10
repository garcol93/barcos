
/**
 * Clase persona.
 * 
 * @author (Lorena Alonso Pedreira) 
 * @version (09/05/18)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String dni;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre, String dni)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * Método en el cual al invocarlo nos muestra toda la información
     * de la clase Persona.
     * 
     * @return  Devuelve la informacion de la clase Persona.
     */
    public String toString()
    {
        //Almacenamos todos los datos a una variable String que será la que
        //nos muestre la informacion
        String aDevolver = " ";
        aDevolver += "Propietario del barco: " + nombre + "\n";
        aDevolver += "DNI del propietario: " + dni + "\n";
        return aDevolver;
    }
}
