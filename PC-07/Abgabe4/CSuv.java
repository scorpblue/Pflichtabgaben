public class CSuv extends CAuto
{
	private final boolean m_offroadFahrbar;
	
	public CSuv(final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final boolean p_offroadFahrbar)
	{
	    super( p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit );
	    m_offroadFahrbar = p_offroadFahrbar;
	}
}
