package ejemplo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.gson.annotations.SerializedName;

/**
 * Clase Glosario
 * @author Ivan0886
 * @see GlossDiv
 */
@XmlRootElement
@XmlType(propOrder = { "title", "glossDiv" })
public class Glossary 
{
	private String title;
	@SerializedName("GlossDiv") private GlossDiv glossDiv;

	/**
	 * Constructor por defecto
	 */
	public Glossary() 
	{
		this.title = "";
		this.glossDiv = new GlossDiv();
	}

	
	/**
	 * Constructor con parámetros
	 * @param title
	 * @param glossDiv
	 */
	public Glossary(String title, GlossDiv glossDiv) 
	{
		this.title = title;
		this.glossDiv = glossDiv;
	}

	
	/**
	 * Método que devuelve el título
	 * @return title
	 */
	public String getTitle() 
	{
		return title;
	}

	
	/**
	 * Método que establece el título
	 * @param title
	 */
	public void setTitle(String title) 
	{
		System.out.println("poniendo titulo");
		this.title = title;
	}


	/**
	 * Método que devuelve el objeto GlossDiv
	 * @return glossDiv
	 */
	@XmlElement(name = "GlossDiv")
	public GlossDiv getGlossDiv() 
	{
		return glossDiv;
	}

	
	/**
	 * Método que establece el objeto GlossDiv
	 * @param glossDiv
	 */
	public void setGlossDiv(GlossDiv glossDiv) 
	{
		this.glossDiv = glossDiv;
	}

	
	/**
	 * Método que devuleve la cadena de texto
	 */
	@Override
	public String toString() 
	{
		return "Glossary [title=" + title + ", glossDiv=" + glossDiv + "]";
	}
}