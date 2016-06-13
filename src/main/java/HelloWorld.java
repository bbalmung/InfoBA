/**
 * Created by Rulo on 13/06/2016.
 */
import static spark.Spark.*;

public class HelloWorld
{
   public static void main(String[] args)
   {
        get("/hello", (req, res) -> "Hello World");
   }
}