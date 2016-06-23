package main.java;

import java.util.HashSet;

public class Banco extends PuntoDeInteres
{
	private HashSet<Servicio> Servicios;
    public Banco(String nombre, Direccion direccion, Coordenadas coordenadas)
    {
        // Llamada al constructor de POI.
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
}
