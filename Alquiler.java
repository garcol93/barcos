
/**
 * clase alquiler controla los alquileres de barcos y numero de dias que estan
 * 
 * @author (Lorena y Omar) 
 * @version (9.5.18)
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
     * @return  precio del Alquiler
     */
    public double getPrecio()
    {
        return (numDias * (barco.getEslora() * MULTIPLICADORESLORA)) + PRECIOBASE * barco.getBernua();
    }

    /**
     * devuelve la informacion de la clase alquiler
     * 
     * @return  aDevolver devuelve un String con la informacion del alquiler
     */
    public String toString()
    {
        String aDevolver = numDias + " Dias";        
        aDevolver += barco;//llama a to String barco;
        return aDevolver;       
    }

}