package ejemplo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.google.gson.annotations.SerializedName;

/**
 * Clase GlossEntry
 * @author Ivan0886
 * @see GlossDef
 */
@XmlType(propOrder = { "sortAs", "glossTerm", "acronym", "abbrev", "glossDef", "glossSee" })
public class GlossEntry 
{
	@SerializedName("ID") private String id;
	@SerializedName("SortAs") private String sortAs;
	@SerializedName("GlossTerm") private String glossTerm;
	@SerializedName("Acronym") private String acronym;
	@SerializedName("Abbrev") private String abbrev;
	@SerializedName("GlossDef") private GlossDef glossDef;
	@SerializedName("GlossSee") private String glossSee;

	/**
	 * Constructor por defecto
	 */
	public GlossEntry() 
	{
		id = "";
		sortAs = "";
		glossTerm = "";
		acronym = "";
		abbrev = "";
		glossDef = new GlossDef();
	}

	
	/**
	 * Constructor con parámetros
	 * @param id
	 * @param sortAs
	 * @param glossTerm
	 * @param acronym
	 * @param abbrev
	 * @param glossDef
	 */
	public GlossEntry(String id, String sortAs, String glossTerm, String acronym, String abbrev, GlossDef glossDef) 
	{
		this.id = id;
		this.sortAs = sortAs;
		this.glossTerm = glossTerm;
		this.acronym = acronym;
		this.abbrev = abbrev;
		this.glossDef = glossDef;
	}

	
	/**
	 * Método que devuelve el id
	 * @return id
	 */
	@XmlAttribute(name = "ID")
	public String getId() 
	{
		return id;
	}

	
	/**
	 * Método que establece el id
	 * @param id
	 */
	public void setId(String id) 
	{
		this.id = id;
	}

	
	/**
	 * Método que devuelve sortAs
	 * @return sortAs
	 */
	@XmlElement(name = "SortAs")
	public String getSortAs() 
	{
		return sortAs;
	}

	
	/**
	 * Método que establece el sortAs
	 * @param sortAs
	 */
	public void setSortAs(String sortAs) 
	{
		this.sortAs = sortAs;
	}

	
	/**
	 * Método que devuelve el glossTerm
	 * @return glossTerm
	 */
	@XmlElement(name = "GlossTerm")
	public String getGlossTerm() 
	{
		return glossTerm;
	}

	
	/**
	 * Método que establece el glossTerm
	 * @param glossTerm
	 */
	public void setGlossTerm(String glossTerm) 
	{
		this.glossTerm = glossTerm;
	}

	
	/**
	 * Método que devuelve acronym
	 * @return acronym
	 */
	@XmlElement(name = "Acronym")
	public String getAcronym() 
	{
		return acronym;
	}

	
	/**
	 * Método que establece el acronym
	 * @param acronym
	 */
	public void setAcronym(String acronym) 
	{
		this.acronym = acronym;
	}

	
	/**
	 * Método que devuelve abbrev
	 * @return abbrev
	 */
	@XmlElement(name = "Abbrev")
	public String getAbbrev() 
	{
		return abbrev;
	}

	
	/**
	 * Método que establece el abbrev
	 * @param abbrev
	 */
	public void setAbbrev(String abbrev) 
	{
		this.abbrev = abbrev;
	}

	
	/**
	 * Método que devuelve el objeto GlossDef
	 * @return glossDef
	 */
	@XmlElement(name = "GlossDef")
	public GlossDef getGlossDef() 
	{
		return glossDef;
	}


	/**
	 * Método que establece el glossDef
	 * @param glossDef
	 */
	public void setGlossDef(GlossDef glossDef) 
	{
		this.glossDef = glossDef;
	}

	
	/**
	 * Método que devuelve el glossSee
	 * @return glossSee
	 */
	@XmlElement(name = "GlossSee")
	public String getGlossSee() 
	{
		return glossSee;
	}

	
	/**
	 * Método que establece el glossSee
	 * @param glossSee
	 */
	public void setGlossSee(String glossSee) 
	{
		this.glossSee = glossSee;
	}

	
	/**
	 * Método que devuelve la cadena de texto
	 */
	@Override
	public String toString() 
	{
		return "GlossEntry [id=" + id + ", sortAs=" + sortAs + ", glossTerm=" + glossTerm + ", acronym=" + acronym
				+ ", abbrev=" + abbrev + ", glossDef=" + glossDef + ", glossSee=" + glossSee + "]";
	}
}