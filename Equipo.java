
/**
 * Una clase que modela el Equipo.
 * 
 * @author sercadel 
 * @version 0.1
 */

public class Equipo
{
    // Nombre del equipo
    private String nombre;
    
    // Jugador 1
    private Jugador jugador1;
    
    // Jugador 2
    private Jugador jugador2;
    
    // Jugador 3
    private Jugador jugador3;

    /**
     * Constructor para objetos de clase Equipo
     * 
     * @param  nombre  Nombre del equipo
     */
    public Equipo(String nombre)
    {
        // inicializar las variables de la instancia
        
        // Nombre del equipo
        this.nombre = nombre;
        
        // Referencia de Jugador1
        jugador1 = null;
        
        // Referencia de Jugador2
        jugador2 = null;
        
        // Referencia de Jugador3
        jugador3 = null;
    }

    /**
     * Función que devuelve el número de jugadores del equipo
     * 
     * @return  Número de jugadores del equipo
     */
    public int cuantosJugadores()
    {
        if (jugador1 == null) {
            return 0;
        }
        
        if (jugador2 == null) {
            return 1;
        }
        
        if (jugador3 == null) {
            return 2;
        }
        
        return 3;
    }
    
    /**
     * Función que añade un jugador pasando un objeto como argumento
     * 
     * @param  jugador  Instancia de un jugador
     */
    public void addJugador(Jugador jugador)
    {
        switch (cuantosJugadores())
        {
            case 0:
                jugador1 = jugador;
                break;
            case 1:
                jugador2 = jugador;
                break;
            case 2:
                jugador3 = jugador;
                break;
            case 3:
                borrarPantalla();
                System.out.println("Equipo completo");
                break;
            default:
                borrarPantalla();
                System.out.println("Error inesperado");
                break;
        }
    }
    
    /**
     * Función que crea y añade un jugador pasando nombre y sueldo como argumento
     * 
     * @param  nombre  Nombre que se asignará al jugador
     * @param  sueldo  Sueldo que se asignará al jugador
     */
    public void addJugador(String nombre, double sueldo)
    {
        Jugador nuevoJugador = new Jugador(nombre, sueldo);
        
        addJugador(nuevoJugador);
    }
    
    /**
     * Función que devuelve si el equipo esta o no completo
     * 
     * @return  boolean true si el equipo esta completo, false si el equipo no esta completo
     */
    public boolean equipoCompleto()
    {
        if (cuantosJugadores() < 3) {
            return false;
        }
        return true;
    }
    
    /**
     * Función que devuelve el nombre del jugador o jugadores con mas goles
     * 
     * @return  String Nombre del jugador o jugadores con mas goles
     */
    public String pichichi()
    {
        switch (cuantosJugadores())
        {
            case 0:
                return "No hay jugadores en el equipo";
            case 1:
                return jugador1.getNombre();
            case 2:
                if (jugador1.getGoles() > jugador2.getGoles()) {
                    return jugador1.getNombre();
                }
                
                if (jugador1.getGoles() < jugador2.getGoles()) {
                    return jugador2.getNombre();
                }
                
                return jugador1.getNombre() + " y " + jugador2.getNombre();
                
            case 3:
                if (jugador1.getGoles() > jugador2.getGoles()) {
                    if (jugador1.getGoles() > jugador3.getGoles()) {
                        return jugador1.getNombre();
                    }
                    
                    if (jugador1.getGoles() < jugador3.getGoles()) {
                        return jugador3.getNombre();
                    }
                    
                    return jugador1.getNombre() + " y " + jugador3.getNombre();
                }
                
                if (jugador1.getGoles() < jugador2.getGoles()) {
                    if (jugador2.getGoles() > jugador3.getGoles()) {
                        return jugador2.getNombre();
                    }
                    
                    if (jugador2.getGoles() < jugador3.getGoles()) {
                        return jugador3.getNombre();
                    }
                    
                    return jugador2.getNombre() + " y " + jugador3.getNombre();
                }
                
                if (jugador1.getGoles() == jugador2.getGoles()) {
                    if (jugador1.getGoles() > jugador3.getGoles()) {
                        return jugador1.getNombre() + " y " + jugador2.getNombre();
                    }
                    
                    if (jugador1.getGoles() < jugador3.getGoles()) {
                        return jugador3.getNombre();
                    }
                    
                    return jugador1.getNombre() + ", " + jugador2.getNombre() + " y " + jugador3.getNombre();
                }
                
                
            default:
                return "Error inesperado";
        }
    }
    
    /**
     * Función que imprime en pantalla la información del equipo y de los jugadores que pertenecen al equipo
     * 
     */
    public void printEquipo()
    {
        // Llamada a la función para borrar la salida de la consola
        borrarPantalla();
        
        // Imprime en pantalla el resultado obtenido de la función toString
        System.out.println(toString());
    }
    
    /**
     * Función que borra la salida de la consola
     * 
     */
    private void borrarPantalla()
    {
        System.out.print('\u000C');
    }
    
    /**
     * Función que devuelve una cadena con información del equipo de los los jugadores que lo integran
     * 
     * @return  String Cadena con información del equipo de los los jugadores que lo integran
     */
    public String toString()
    {
        // variable auxiliar en donde se almacenará la información de los jugadores que pertenecen al equipo
        String cadena = "";
        
        if (jugador1 != null) {
            cadena = "\n" + jugador1.toString();
        }
        
        if (jugador2 != null) {
            cadena += "\n" + jugador2.toString();
        }
        
        if (jugador3 != null) {
            cadena += "\n" + jugador3.toString();
        }
        
        return "Equipo - " + nombre + "\n"
            + "Jugadores:\n"
            + cadena;
    }
}
