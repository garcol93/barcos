
/**
 * Embarcaciones con variable potencia en común.
 * 
 * @author (Lorena Alonso Pedreira) 
 * @version (09/05/18)
 */
public class EmbarcacionAMotor extends Barco
{
    // instance variables - replace the example below with your own
    private int potencia;

    /**
     * Constructor for objects of class EmbarcacionAMotor
     */
    public EmbarcacionAMotor(String matricula, double eslora, int anioFab, Persona propietario, int potencia)
    {
        // initialise instance variables
        super(matricula, eslora, anioFab, propietario);
        this.potencia = potencia;
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
        return potencia;
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
        aDevolver += "Potencia del barco: " + potencia + "\n";
        return aDevolver;
    }
}
