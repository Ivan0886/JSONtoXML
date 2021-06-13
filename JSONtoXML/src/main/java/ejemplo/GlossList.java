package ejemplo;

import com.google.gson.annotations.SerializedName;

/**
 * Clase GlossList
 * @author Ivan0886
 * @see GlossEntry
 */
public class GlossList 
{
	@SerializedName("GlossEntry") private GlossEntry glossEntry;

	/**
	 * Constructor por defecto
	 */
	public GlossList() 
	{
		this.glossEntry = new GlossEntry();
	}

	
	/**
	 * Método que devuelve el objeto GlossEntry
	 * @return glossEntry
	 */
	public GlossEntry getGlossEntry() 
	{
		return glossEntry;
	}

	
	/**
	 * Método que establece el objeto GlossEntry
	 * @param glossEntry
	 */
	public void setGlossEntry(GlossEntry glossEntry) 
	{
		this.glossEntry = glossEntry;
	}

	
	/**
	 * Método que devuelve la cadena de texto
	 */
	@Override
	public String toString() 
	{
		return "GlossList [glossEntry=" + glossEntry + "]";
	}
}