import static spark.Spark.*;

public class HelloWorld
{
   public static void main(String[] args)
   {
       Direccion direccion = new Direccion();
       direccion.Calle = "Mozart";
       direccion.Numero = 2400;
       direccion.CodigoPostal = "1580";

       Coordenadas coordenadas = new Coordenadas(-34.605198, -58.384569);
       Coordenadas coordenadas2 = new Coordenadas(-50.342923, -72.389858);

       Double dist = coordenadas2.distanciaCon(coordenadas) / 1000.0;

       String desc = "Distancia entre (-34.605198, -58.384569) y (-50.342923, -72.389858) es: " + dist.toString() + " KM.";

       PuntoDeInteres POI = new Banco(null, null, null);

       get("/hello", (req, res) -> desc);
   }
}