package ejemplo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Optional;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import com.google.gson.Gson;

/**
 * Clase principal de la aplicación
 * @author Ivan0886
 */
public class App 
{
	/**
	 * Método main de la App
	 * @param args
	 */
    public static void main (String[] args)
    {
    	// Lectura fichero JSON y escritura XML
    	readJSON().ifPresent(g -> writeXML(g.getGlossary()));
    }
    
    
    /**
     * Método que lee el fichero JSON
     * @return glossaryWrapper
     */
    public static Optional<GlossaryWrapper> readJSON() 
    {
    	Gson gson = new Gson();
    	Optional<GlossaryWrapper> glossaryWrapper = null;
    	
    	try(Reader read = new FileReader(("GlossaryFile.json"))) 
    	{
    		glossaryWrapper = Optional.ofNullable(gson.fromJson(read, GlossaryWrapper.class));
    	}
    	catch(IOException e)
    	{
    		e.getStackTrace();
    	}
    	
    	return glossaryWrapper;
    }
    
    
    /**
     * Método que escribe el fichero XML
     * @param glossaryFile ficheroXML
     */
    public static void writeXML(Glossary glossaryFile) 
    {
    	try 
    	{
			JAXBContext context = JAXBContext.newInstance(Glossary.class);
			Marshaller ms = context.createMarshaller();
			
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ms.marshal(glossaryFile, new FileWriter("GlossaryFile.xml"));
			// ms.marshal(glossaryFile, System.out);
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
    }
}