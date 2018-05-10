
/**
 * Clase barco la cual será la principal de la que hereden los tipos de barcos
 * y la clase abstracta.
 * 
 * @author (Lorena Alonso Pedreira) 
 * @version (09/05/18)
 */
public abstract class Barco 
{
    // instance variables - replace the example below with your own
    private String matricula;
    private double eslora;
    private int anioFab;
    private Persona propietario;

    /**
     * Constructor for objects of class Barco
     */
    public Barco(String matricula, double eslora, int anioFab, Persona propietario)
    {
        // initialise instance variables
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFab = anioFab;
        this.propietario = propietario;
    }

    /**
     * Método get para que muestre la informacion de la Eslora
     * 
     * @return  la eslora que contiene el barco
     */
    public double getEslora()
    {
        // put your code here
        return eslora;
    }
    
    /**
     * Metodo para mostrar la informacion del coeficiente de Bernua.
     * 
     * @return el coeficiente de Bernua.
     */
    public abstract int getBernua();
    
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
        aDevolver += "Propietario del barco: " + propietario + "\n";
        aDevolver += "Matricula del barco: " + matricula + "\n";
        aDevolver += "Cantidad de eslora que tienen: " + eslora + "\n";
        aDevolver += "Anyo de fabricacion: " + anioFab + "\n";
        return aDevolver;
    }
}
