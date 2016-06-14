public abstract class PointOfInterest
{
   public String Nombre;
   public Direccion Direccion;
   public Coordenadas Coordenadas;

   // Si es un kiosko, parada de colectivos, etc...
   public String Descripcion;

   //¿Que hace tags?
   //public string [] tags;

   public PointOfInterest(String nombre, Direccion direccion, Coordenadas coordenadas)
   {
     this.Nombre = nombre;
     this.Direccion = direccion;
     this.Coordenadas = coordenadas;
   }

   // TODO: implementar.
   public Number distancia(PointOfInterest poi)
   {
       return 0;
   }

   // TODO: implementar.
   public Boolean distanciaMenorA(Number metros, PointOfInterest poi)
   {
       return false;
   }

   // TODO: implementar.
   // Tiene nombre y esta geolocalizado (?)
   public Boolean esValido()
   {
     return true;
   }

    // TODO: implementar. ¿Que hace esto?
    /*
    public String getInfo()
    {
        return "info";
    }
    */

}