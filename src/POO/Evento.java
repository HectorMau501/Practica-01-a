
package POO;


public class Evento {
    
    //Atributos -
    private String fecha;
    private String hora;
    private String lugar;
    private int capacidad;
    private double costoBoleto;
    
    //Metodos 
    
    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }
    public String getFecha()
    {
        return  fecha;
    }

    public void setCostoBoleto(double costoBoleto) 
    {
        this.costoBoleto = costoBoleto;
    }
    
    public double getCostoBoleto() 
    {
        return costoBoleto;
    }

    
    
    
    
}
