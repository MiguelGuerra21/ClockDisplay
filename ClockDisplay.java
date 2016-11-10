
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay hora;
    private NumberDisplay minutos;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        // initialise instance variables
        hora = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
    }

    /**
     *
     */
    public void setHour(int h, int min)
    {
        
        hora.setValue(h);
        minutos.setValue(min);
        
    }
    /**
     * 
     */
    public void avanzarHora()
    {
        minutos.increment();
            if(minutos.getValue() == 0)
            hora.increment();
             
    }
    /**
     * Permita devolver una cadena de 5 caracteres consistente en la hora y los minutos separados por dos puntos. Ojo: la cadena siempre debe tener 5 caracteres.
     */
    public String getHour()
    {
        return hora.getDisplayValue() + ":" + minutos.getDisplayValue();
        
    }
}
