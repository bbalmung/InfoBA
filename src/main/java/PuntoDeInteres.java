public abstract class PuntoDeInteres
{
   public String Nombre;
   public Direccion Direccion;
   public Coordenadas Coordenadas;

   public String Descripcion;

   //¿Que hace tags?... Por ahora nada
   public Collection<Tag> tags;

   public PuntoDeInteres(String nombre, Direccion direccion, Coordenadas coordenadas)
   {
     this.Nombre = nombre;
     this.Direccion = direccion;
     this.Coordenadas = coordenadas;
   }

   public Boolean distanciaMenorA(Double metros, PuntoDeInteres otroPunto)
   {
       Double distancia = this.Coordenadas.distanciaCon(otroPunto.Coordenadas);

       return (distancia < metros);
   }

   // Tiene nombre y esta geolocalizado (tiene coordenadas)
   public Boolean esValido()
   {
     return ((Nombre!=null) && !Nombre.isEmpty()&& (Coordenadas!= null));
   }

   public Boolean cercaDe(PuntoDeInteres otroPunto)
   {
      return distanciaMenorA(5.0, otroPunto);
   }

   // TODO: implementar. ¿Que hace esto?
   public String getInfo()
    {
        return "Info.";
    }

    public Boolean buscarTexto(String texto)
    {
    	return false;
    }
}