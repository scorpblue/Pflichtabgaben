
public class CLkw extends CAuto 
{
	private String m_groesse;
	
	public CLkw()
	{
		this("Rot", "Ford", 5, 180, "20m");
	}
	
	public CLkw( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final String p_groesse)
	{
		super( p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit );
		m_groesse = p_groesse;
	}
	public String getGroesse()
	{
		return m_groesse;
	}
	
	@Override
    public String toString()
  {
       return "CLkw: " + m_marke + " " + m_farbe + " " + m_anzahlGaenge + " " + m_maxGeschwindigkeit + " " + m_groesse;
  }
}
