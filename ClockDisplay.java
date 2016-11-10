
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private DisplayDosDigitos hora;
    private DisplayDosDigitos minutos;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        // initialise instance variables
        hora = new DisplayDosDigitos(24);
        minutos = new DisplayDosDigitos(60);
    }

    /**
     *
     */
    public void setHour(int h, int min)
    {
        
        hora.setValor(h);
        minutos.setValor(min);
        
    }
    /**
     * 
     */
    public void avanzarHora()
    {
        minutos.incrementaValor();
            if(minutos.getValor() == 1)
            hora.incrementaValor();
    }
    /**
     * Permita devolver una cadena de 5 caracteres consistente en la hora y los minutos separados por dos puntos. Ojo: la cadena siempre debe tener 5 caracteres.
     */
    public String getHour()
    {
        return hora.getValor() + ":" + minutos.getValor();
        
    }
}
