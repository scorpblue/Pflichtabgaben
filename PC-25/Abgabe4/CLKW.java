public class CLKW extends CAuto implements IFahrzeug {
	
 final boolean m_beladbar;
	
	public CLKW (final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final boolean p_beladbar)
	{
		super( p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit );
		m_beladbar = p_beladbar;
	}
	
	public boolean getBeladbar()
	{
		return m_beladbar;
	}

}
