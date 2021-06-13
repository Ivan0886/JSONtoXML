package ejemplo;

/**
 * Clase GlossaryWrapper
 * @author Ivan0886
 * @see Glossary
 */
public class GlossaryWrapper 
{
	private Glossary glossary;

	/**
	 * Constructor por defecto
	 */
	public GlossaryWrapper() 
	{
		glossary = new Glossary();
	}

	
	/**
	 * Método que devuelve el objeto Glossary
	 * @return glossary
	 */
	public Glossary getGlossary() 
	{
		return glossary;
	}

	
	/**
	 * Método que establece el objeto Glossary
	 * @param glossary
	 */
	public void setGlossary(Glossary glossary) 
	{
		this.glossary = glossary;
	}


	/**
	 * Método que devuelve la cadena de texto
	 */
	@Override
	public String toString() 
	{
		return "GlossaryWrapper [glossary=" + glossary + "]";
	}
}