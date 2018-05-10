
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    // instance variables - replace the example below with your own
    private int numDias;
    private Barco barco;
    private int PRECIOBASE = 300;
    private int MULTIPLICADORESLORA = 10;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int numDias, Barco barco)
    {
        this.barco= barco;  
        this.numDias = numDias;
    }

   

    /**
     * devuelve el precio calculado segun el tipo de barco
     * 
     * @return     precio del Alquiler
     */
    public int getPrecio()
    {
        int aDevolver;

        return aDevolver;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public String toString()
    {
        String aDevolver = numDias + " Dias";        
        aDevolver += barco;//llama a to String barco;

        return aDevolver;       
    }

}