package main.java;

import java.util.HashSet;

public class Servicio {
	private String Nombre;
	private HashSet<DisponibilidadHoraria> DisponibilidadHoraria;

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
		return DisponibilidadHoraria;
	}

	public void setDisponibilidadHoraria(HashSet<DisponibilidadHoraria> disponibilidadHoraria) {
		DisponibilidadHoraria = disponibilidadHoraria;
	}

}