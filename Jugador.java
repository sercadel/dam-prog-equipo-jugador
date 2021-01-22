
/**
 * Una clase que modela a un jugador.
 * 
 * @author sercadel 
 * @version 0.1
 */

public class Jugador
{
    private String nombre;
    
    private double sueldo;
    
    private int golesMarcados;

    /**
     * Constructor para objetos de clase Jugador
     * 
     * @param  nombre  Nombre del jugador
     * @param  sueldo  Sueldo del jugador
     */
    public Jugador(String nombre, double sueldo)
    {
        // inicializar las variables de la instancia
        
        this.nombre = nombre;
        
        this.sueldo = sueldo;
        
        // Goles marcados iniciado a 0
        golesMarcados = 0;
    }

    /**
     * Función que devuelve el nombre del jugador
     * 
     * @return  Nombre del jugador
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * Función que devuelve el sueldo del jugador
     * 
     * @return  Sueldo del jugador
     */
    public double getSueldo()
    {
        return sueldo;
    }
    
    /**
     * Función que suma 1 a golesMarcados del jugador
     */
    public void marcarGol()
    {
        golesMarcados++;
    }
    
    /**
     * Función que devuelve los goles marcados del jugador
     * 
     * @return  Goles marcados del jugador
     */
    public int getGoles()
    {
        return golesMarcados;
    }
    
    /**
     * Función que devuelve información del nombre, sueldo y goles del jugador
     * 
     * @return  Cadena con información del nombre, sueldo y goles del jugador
     */
    public String toString()
    {
        return "\tNombre: " + getNombre() + "\n"
            + "\tSueldo: " + getSueldo() + "\n"
            + "\tGoles marcados: " + getGoles() + "\n";
    }
}
