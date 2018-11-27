public class CLkw extends CAuto implements IFahrzeug
{
	private final boolean m_Getter;
	private final boolean m_Setter;
	
	public CLkw(final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final boolean p_Getter, final boolean p_Setter)
	{
	    super( p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit );
	    m_Getter = p_Getter;
	    m_Setter = p_Setter;
	}
	public String toString()
	{
		return getMarke()+getAutoId() + ": Position=" + getPosition() + "; Speed=" + getAktGeschwindigkeit()+"; Getter:"+m_Getter+"; Setter:" +m_Setter;
	}
}
