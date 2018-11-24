public class CMotorrad implements IFahrzeug{
    private final String m_farbe;
    private final String m_marke;
    private final int m_maxGeschwindigkeit;
    private final int m_anzahlGaenge;
    private final double m_kw;
    
    private int m_drehmoment = 0;
    private int m_gang = 1;
	private double m_aktGeschwindigkeit = 0;
    
    public CMotorrad()
    {
      this( "schwarz", "Yamaha", 35, 5, 125 );
    }
    public CMotorrad( final String p_farbe, final String p_marke, final double p_kw, final int p_anzahlGaenge, final int p_maxGeschwindigkeit)
    {
      m_farbe = p_farbe;
      m_marke = p_marke;
      m_kw = p_kw;
      m_anzahlGaenge = p_anzahlGaenge;
      m_maxGeschwindigkeit = p_maxGeschwindigkeit;
    }
    
    @Override
    public void schalte(final String p_gang)
    {
        if(p_gang.equals("R") || p_gang.equals("N"))
        {
            if(p_gang.equals("R"))
            {
                m_gang = -1 % (m_anzahlGaenge + 1);
                m_gang = m_gang < -1 ? 0 : m_gang;
            }
            else
            {
                m_gang = 0;
                m_gang = m_gang < -1 ? 0 : m_gang;
            }
        }
        else
        {
            m_gang = Integer.parseInt(p_gang) % (m_anzahlGaenge + 1);
            m_gang = m_gang < -1 ? 0 : m_gang;
        }
    }
    @Override
    public void beschleunige( final double p_inkrement)
    {
        m_aktGeschwindigkeit = p_inkrement;
        m_aktGeschwindigkeit = (int)m_aktGeschwindigkeit > m_maxGeschwindigkeit ? m_maxGeschwindigkeit : m_aktGeschwindigkeit;
    }
    @Override
    public void bremse(final int p_dekrement)
    {
        m_aktGeschwindigkeit -= p_dekrement;
        m_aktGeschwindigkeit = m_aktGeschwindigkeit < 0 ? 0 : m_aktGeschwindigkeit;
    }
    
    public int getM_drehmoment() {
		return m_drehmoment;
	}
	public void setM_drehmoment(int m_drehmoment) {
		this.m_drehmoment = m_drehmoment;
	}
	public double getM_aktGeschwindigkeit() {
		return m_aktGeschwindigkeit;
	}
    
	@Override
	public String toString() {
		String ausgabe ="Dies ist ein "+m_farbe+"es Motorrad der Marke "+m_marke+".\n";
		ausgabe = ausgabe + "Es hat "+m_anzahlGaenge+" Gaenge und eine Leistung von "+m_kw+" kW.\n";
		ausgabe = ausgabe + "Das Motorrad hat eine Spitzengeschwindigkeit von "+ m_maxGeschwindigkeit+".\n";
		ausgabe = ausgabe + "Es faehrt aktuell "+m_aktGeschwindigkeit + " im "+ m_gang +". Gang .\n";
		ausgabe = ausgabe + "Es hat aktuell einen Drehmoment von "+m_drehmoment+".\n";
		return ausgabe;
	}

    
}