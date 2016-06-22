public class Comercio extends PuntoDeInteres
{

    public Double RadioCercania;

    public Comercio(String nombre, Direccion direccion, Coordenadas coordenadas, Double radioCercania)
    {
        // Llamada al constructor de POI.
        super(nombre, direccion, coordenadas);

        this.RadioCercania = radioCercania;
    }

    // Esta cerca de otra parada de colectivos si esta a menos de una cuadra (e.d 100 metros).
    public Boolean cercaDe(PuntoDeInteres otroPunto)
    {
        return distanciaMenorA(this.RadioCercania, otroPunto);
    }
}
