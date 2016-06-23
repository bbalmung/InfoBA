package main.java;
public class Comercio extends PuntoDeInteres
{

    public Double RadioCercania;
    public Rubro Rubro;
    public Comercio(String nombre, Direccion direccion, Coordenadas coordenadas, Rubro rubro)
    {
        // Llamada al constructor de POI.
        super(nombre, direccion, coordenadas);

        this.Rubro = rubro;
    }

    // Esta cerca de otra parada de colectivos si esta a menos de una cuadra (e.d 100 metros).
    public Boolean cercaDe(PuntoDeInteres otroPunto)
    {
        return distanciaMenorA(this.RadioCercania, otroPunto);
    }
    
    public boolean buscarRubros(String texto){
 	   return this.Rubro.getNombre().contains(texto);
    }
}
