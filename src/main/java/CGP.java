package main.java;

import java.util.HashSet;

public class CGP extends PuntoDeInteres
{
	private HashSet<Servicio> Servicios;
	
    public CGP(String nombre, Direccion direccion, Coordenadas coordenadas)
    {
        // Llamada al constructor de POI.
        super(nombre, direccion, coordenadas);
        Servicios = new HashSet<Servicio>();
        }

    /*
     * TODO: Los CGP cumplen la condición de cercanía, si su coordenada está dentro de la zona
     * delimitada por la comuna.
     */
    public boolean buscarServicios(String texto){
  	   return Servicios.stream().anyMatch(serv -> serv.getNombre().contains(texto));
     }
    
    public boolean agregarServicio(Servicio servicio){
    	return Servicios.add(servicio);
    }
    
    public boolean removerServicio(Servicio servicio){
    	return Servicios.remove(servicio);
    }
}
