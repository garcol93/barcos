
/**
 * Write a description of class Velero here.
 * 
 * @author (Lorena Alonso Pedreira) 
 * @version (09/05/18)
 */
public class Velero extends Barco
{
    // instance variables - replace the example below with your own
    private int numMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(String matricula, double eslora, int anioFab, Persona propietario, int numMastiles)
    {
        // initialise instance variables
        super(matricula, eslora, anioFab, propietario);
        this.numMastiles = numMastiles;
    }

    /**
     * Metodo para mostrar la informacion del coeficiente de Bernua.
     * 
     * @return el coeficiente de Bernua.
     */
    @Override
    public int getBernua()
    {
         //Al ser un método abstracto vacio le vamos añadiendo las variables, en este caso,
         //Le añadimos el numMastiles.
        return numMastiles;
    }
    
    /**
     * Metodo para mostrar toda la informacion de la clase Barco
     * 
     * @return la informacion de barco.
     */
    public String toString() 
    {
        //Almacenamos todos los datos a una variable String que será la que
        //nos muestre la informacion
        String aDevolver = " ";
        aDevolver += super.toString();
        aDevolver += "Número de Mastiles: " + numMastiles + "\n";
        return aDevolver;
    }
}
