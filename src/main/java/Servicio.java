package main.java;

import java.util.Date;
import java.util.HashSet;

public class Servicio {
	private String Nombre;
	private HashSet<DisponibilidadHoraria> DisponibilidadesHoraria;

	public Servicio(String nombre){
		this.Nombre = nombre;
	}
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public HashSet<DisponibilidadHoraria> getDisponibilidadHoraria() {
		return DisponibilidadesHoraria;
	}

	public void setDisponibilidadHoraria(DisponibilidadHoraria disponibilidadHoraria) {
		DisponibilidadesHoraria.add(disponibilidadHoraria);
	}
	public boolean estoyDisponible(Date tiempo) {
		
		return this.DisponibilidadesHoraria.stream().anyMatch(hor -> hor.coincideTiempo(tiempo));
	}

}