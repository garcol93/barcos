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
     * Constructor de objetos de la clase puerto
     */
    public Puerto()
    {
        alquileres= new Alquiler[4];
    }

    /**
     * imprime la informacion del puerto 
     */
    public void verEstadoAmarres()
    {
        System.out.println(this);              
    }

    /**
     * metodo que comprueba si hay amarres libres en el puerto
     *
     * @param numDias numero de dias alquilado
     * @param barco barco que se quiere alquilar
     * @return -1 si noy amarres o coste alquiler si hay libre
     */
    public double alquilarAmarre(int numDias, Barco barco)
    {
        double aDevolver = -1;
        boolean alquilado = false;
        for(int i = 0; i < alquileres.length && alquilado == false ; i++)
        {
            if (alquileres[i] == null)
            {
                alquileres[i] = new Alquiler(numDias, barco);
                aDevolver = alquileres[i].getPrecio();
                alquilado = true;
            }
        }

        return aDevolver;  
    }

    /**
     * liquida el alquiler del amarre si no existe devuelve -1
     *
     * @param numAmarre numero del amarre
     * @return  -1 si no existe y precio si existe
     */
    public double liquidarAlquilerAmarre(int numAmarre)
    {
        double aDevolver = -1;
        if(numAmarre <= 3 && alquileres[numAmarre] != null)
        {
            aDevolver = alquileres[numAmarre].getPrecio();
            alquileres[numAmarre] = null;
        }
        return aDevolver;
    }

    /**
     *metodo que devuelve toda la informacion del puerto en un String
     *
     * @return     the sum of x and y
     */
    public String toString()
    {
        String aDevolver = "";
        for(int i = 0; i < alquileres.length ; i++)
        {
            if (alquileres[i] == null)
            {
                aDevolver += "Posicion amarre " + i + " Libre" +"\n";              
            }
            else 
            {           
                aDevolver += "Posicion amarre " + i + alquileres[i].toString() + "\n";
            }
        }
        return aDevolver;
    }

}
