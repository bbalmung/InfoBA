public abstract class PuntoDeInteres
{
   public String Nombre;
   public Direccion Direccion;
   public Coordenadas Coordenadas;

   // Si es un kiosko, parada de colectivos, etc...
   public String Descripcion;

   //¿Que hace tags?... Por ahora nada
   public Collection<Tag> tags;

   public PuntoDeInteres(String nombre, Direccion direccion, Coordenadas coordenadas)
   {
     this.Nombre = nombre;
     this.Direccion = direccion;
     this.Coordenadas = coordenadas;
   }

   // TODO: implementar.
   public Number distancia(PuntoDeInteres poi)
   {
       return 0;
   }

   // TODO: implementar.
   public Boolean distanciaMenorA(Number metros, PuntoDeInteres poi)
   {
       return false;
   }

   // TODO: implementar.
   // Tiene nombre y esta geolocalizado (tiene coordenadas)
   public Boolean esValido()
   {
     return ((Nombre!=null) && !Nombre.isEmpty()&& (Coordenadas!= null));
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