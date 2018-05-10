
/**
 * Clase que hereda de la clase Embarcacion a Motor porque también contiene la variable
 * potencia pero, contiene una nueva variable numCamarotes.
 * 
 * @author (Lorena Alonso Pedreira) 
 * @version (09/05/18)
 */
public class Yate extends EmbarcacionAMotor
{
    // instance variables.
    private int numCamarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(String matricula, double eslora, int anioFab, Persona propietario, int potencia, int numCamarotes)
    {
        // initialise instance variables
        super(matricula, eslora, anioFab, propietario, potencia);
        this.numCamarotes = numCamarotes;
    }
    
    /**
     * Metodo para mostrar la informacion del coeficiente de Bernua.
     * 
     * @return el coeficiente de Bernua.
     */
    @Override
    public int getBernua()
    {
        //Al ser un método abstracto vacio le vamos añadiendo las variables, actualmente contiene
        //la variable potencia y se le sumaría la numCamarotes.
        return super.getBernua() + numCamarotes;
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
        aDevolver += "Número de camarotes: " + numCamarotes + "\n";
        return aDevolver;
    }
}
