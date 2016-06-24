package main.java;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DisponibilidadHoraria{
	private int Dia;
	private int HoraDesde;
	private int MinutoDesde;
	private int HoraHasta;
	private int MinutoHasta;
	
	public int getDia() {
		return Dia;
	}
	public void setDia(int dia) {
		Dia = dia;
	}
	public int getHoraDesde() {
		return HoraDesde;
	}
	public void setHoraDesde(int horaDesde) {
		HoraDesde = horaDesde;
	}
	public int getMinutoDesde() {
		return MinutoDesde;
	}
	public void setMinutoDesde(int minutoDesde) {
		MinutoDesde = minutoDesde;
	}
	public int getHoraHasta() {
		return HoraHasta;
	}
	public void setHoraHasta(int horaHasta) {
		HoraHasta = horaHasta;
	}
	public int getMinutoHasta() {
		return MinutoHasta;
	}
	public void setMinutoHasta(int minutoHasta) {
		MinutoHasta = minutoHasta;
	}
	public boolean coincideTiempo(Date tiempo) {
		String diaNumero = new SimpleDateFormat("u").format(tiempo);
		
		if(tiempo.getHours() < this.getHoraHasta() && tiempo.getHours() > this.getHoraDesde())
		{
			if(tiempo.getMinutes() < this.getMinutoHasta() && tiempo.getMinutes() > this.getMinutoDesde())
			{
				if(Integer.parseInt(diaNumero) == this.getDia())
				{
					return true;
				}
			}
		}
		else
		{
			return false;
		}
	}
}