import static spark.Spark.*;

public class HelloWorld
{
   public static void main(String[] args)
   {
       Direccion direccion = new Direccion();
       direccion.Calle = "Mozart";
       direccion.Numero = 2400;
       direccion.CodigoPostal = "1580";

       Coordenadas coordenadas = new Coordenadas(57, 25);

       PuntoDeInteres POI = new Banco("Banco UTN", direccion, coordenadas);

       get("/hello", (req, res) -> POI.getInfo());
   }
}