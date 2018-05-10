import java.util.Arrays;
/**
 * clase principal puerto
 * 
 * @author (Lorena y Omar) 
 * @version (9.5.18)
 */
public class Puerto
{
    // instance variables - replace the example below with your own
    private Alquiler[] alquileres;

    /**
     * Constructor for objects of class puerto
     */
    public Puerto()
    {
        alquileres= new Alquiler[4];
    }

    /**
     * 
     */
    public void verEstadosAmarres()
    {
        for(int i = 0; i < alquileres.length ; i++)
        {
            if (alquileres[i] == null)
            {
                System.out.println("Posicion amarre " + i + " Libre" );              
            }
            else 
            {           
                System.out.println("Posicion amarre " + i + alquileres[i].toString());
            }
        }
    }

    /**
     * metodo que comprueba si hay amarres libres en el puerto
     *
     * @param numDias numero de dias alquilado
     * @param barco barco que se quiere alquilar
     * @return -1 si noy amarres o coste alquiler si hay libre
     */
    public int alquilarAmarre(int numDias, Barco barco)
    {
        int aDevolver = -1;
        for(int i = 0; i < alquileres.length ; i++)
        {
            if (alquileres[i] == null)
            {
                alquileres[i] = new Alquiler(numDias, barco);
                aDevolver = alquileres[i].getPrecio();
            }
        }

        return aDevolver;  
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public int liquidarAlquiler(int numAmarre)
    {
        int aDevolver = -1;
        if(alquileres[numAmarre] != null)
        {
            aDevolver = alquileres[numAmarre].getPrecio();
        }
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

    }

}
