package prueba.scrapper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	
    	//Conexion login automatizado y cogido algunos datos
    	
    	/*Connection.Response response = Jsoup.connect("http://www.guerramutante.es/signups/login").method(Connection.Method.POST).data("data[Signup][name]", "rase12")
				.data("data[Signup][pass]", "rico90").execute(); 
    	Document doc = response.parse();
    	String prueba = doc.title();
    	System.out.println("VER "+ prueba );
    	
    	String title = doc.title(); 
    	Element tablas = doc.tagName("table"); 
    	Elements anclas = doc.getElementsByTag("table");
    			  System.out.println("TITULO " + title);
    			  System.out.println("contenido " + tablas);*/
    	
    	
    	//Cogemos la pagina web y la guardamos en un archivo en formato html
    
    	Document doc = Jsoup.connect("https://www.carritus.com/producto/15231818-coca-cola-normal").get();
        BufferedWriter  writer = null;
        try
        {
            writer = new BufferedWriter( new FileWriter("C:/desarrollo/supermercado.html"));
            writer.write(doc.toString());

        }
        catch ( IOException e)
        {
        }
   
        
    	
    /*	File input = new File("C:/Users/Yo/Desktop/supermercado2.html");
    	Document doc = Jsoup.parse(input, "UTF-8", "https://www.carritus.com/producto/15231818-coca-cola-normal");*/
    	
    	
   
} 
}
