package ejemplo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.google.gson.annotations.SerializedName;

/**
 * Clase GlossDef
 * @author Ivan0886
 * @see GlossSeeAlso
 */
@XmlType(propOrder = { "para", "glossSeeAlso" })
public class GlossDef 
{
	String para;
	@SerializedName("GlossSeeAlso") List<String> glossSeeAlso;

	/**
	 * Constructor por defecto
	 */
	public GlossDef() 
	{
		para = "";
		glossSeeAlso = new ArrayList<String>();
	}
	
	
	/**
	 * Método que devuelve para
	 * @return para
	 */
	public String getPara() 
	{
		return para;
	}

	
	/**
	 * Método que establece el para
	 * @param para
	 */
	public void setPara(String para) 
	{
		this.para = para;
	}

	
	/**
	 * Método que devulve una lista
	 * @return glossSeeAlso
	 */
	@XmlElement(name = "GlossSeeAlso")
	public List<String> getGlossSeeAlso() 
	{
		return glossSeeAlso;
	}

	
	/**
	 * Método que establece la lista
	 * @param glossSeeAlso
	 */
	public void setGlossSeeAlso(List<String> glossSeeAlso) 
	{
		this.glossSeeAlso = glossSeeAlso;
	}

	
	/**
	 * Método que devuelve la cadena de texto
	 */
	@Override
	public String toString() 
	{
		return "GlossDef [para=" + para + ", glossSeeAlso=" + glossSeeAlso + "]";
	}
}