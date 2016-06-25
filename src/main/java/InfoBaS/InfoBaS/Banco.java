package InfoBaS.InfoBaS;

import java.util.HashSet;
import java.util.Date;


public class Banco extends PuntoDeInteres
{
	private HashSet<Servicio> Servicios;
	
    public Banco(String nombre, Direccion direccion, Coordenadas coordenadas)
    {
        super(nombre, direccion, coordenadas);
        Servicios = new HashSet<Servicio>();
    }
    
    public boolean buscarServicios(String texto){
 	   return Servicios.stream().anyMatch(serv -> serv.getNombre().contains(texto));
    }
    
    public boolean agregarServicio(Servicio servicio){
    	return Servicios.add(servicio);
    }
    
    public boolean removerServicio(Servicio servicio){
    	return Servicios.remove(servicio);
    }
	       	
	public boolean disponibilidad(Date tiempo , Servicio servicio)
	    {
		
		 if(tiempo.getHours() <= 15 && tiempo.getHours() >= 10)
	    	{
			
	    	if( servicio != null)
	    	{
	    		return servicio.estoyDisponible(tiempo);
	    	}
	    	else
	    	{
	    		for (Servicio s : Servicios) {
	    		    if(s.estoyDisponible(tiempo))
	    		    {
	    		    	return true;
	    		    }
	    		}
	    		return false;
	    	}
	    	
	    }
		 return false;
	    }
}
