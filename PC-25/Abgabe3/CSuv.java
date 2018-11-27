public class CSuv extends CAuto implements IFahrzeug
{
	private final boolean m_offroadFahrbar;

	public CSuv()
	{		
		this( "rot", "VW", 5, 250, false );
	}

	public CSuv( final boolean p_offroadFahrbar )
	{
		this( "rot", "VW", 5, 250, p_offroadFahrbar );
	}

	public CSuv( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final boolean p_offroadFahrbar )
	{
			super( p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit );
			m_offroadFahrbar = p_offroadFahrbar;
	}
  
	public boolean getOffroad()
	{
      return m_offroadFahrbar;
	}
	
	public int getSeriennummer()
	{
		return m_seriennummer;
	}
	}
