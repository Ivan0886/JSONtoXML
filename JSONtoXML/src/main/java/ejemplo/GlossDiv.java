package ejemplo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.google.gson.annotations.SerializedName;

/**
 * Clase GlossDiv
 * @author Ivan0886
 * @see GlossList
 */
@XmlType(propOrder = { "title", "glossList" })
public class GlossDiv 
{
	private String title;
	@SerializedName("GlossList") private GlossList glossList;

	/**
	 * Constructor por defecto
	 */
	public GlossDiv() 
	{
		this.title = "";
		this.glossList = new GlossList();
	}

	
	/**
	 * Constructor con parámetros
	 * @param title
	 * @param glossList
	 */
	public GlossDiv(String title, GlossList glossList) 
	{
		this.title = title;
		this.glossList = glossList;
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
		this.title = title;
	}

	
	/**
	 * Método que devuelve el objeto GlossList
	 * @return glossList
	 */
	@XmlElement(name = "GlossList")
	public GlossList getGlossList() 
	{
		return glossList;
	}

	
	/**
	 * Método que establece el objeto GlossList
	 * @param glossList
	 */
	public void setGlossList(GlossList glossList) 
	{
		this.glossList = glossList;
	}
	
	
	/**
	 * Método que devuelve la cadena de texto
	 */
	@Override
	public String toString() 
	{
		return "GlossDiv [title=" + title + ", glossList=" + glossList + "]";
	}
}