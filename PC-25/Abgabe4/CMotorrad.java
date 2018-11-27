
public class CMotorrad implements IFahrzeug {
	
	private final boolean m_rennstreckenFahrbar;
	private int m_Gewicht;
	private String m_Marke;
	
	public CMotorrad(final String p_Marke, final int p_Gewicht, final boolean p_rennstreckenFahrbar)
	{
		m_Marke = p_Marke;
		m_Gewicht = p_Gewicht;
		m_rennstreckenFahrbar = p_rennstreckenFahrbar;
	}

	
	
	public boolean getRennstrecke()
	{
		return m_rennstreckenFahrbar;
	}
}
