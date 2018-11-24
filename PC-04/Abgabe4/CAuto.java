public class CAuto implements IFahrzeug
{
    protected final String m_farbe;
    protected final String m_marke;
    protected final int m_maxGeschwindigkeit;
    protected final int m_anzahlGaenge;
    protected final double m_kw;
    protected final String m_seriennummer;
    private static int zahl1;
    private static int zahl2;

    protected double m_aktGeschwindigkeit;
    protected int m_gang = 1;
    public CAuto()
    {
      this( "rot", "VW", 51, 5, 250 );
    }
    public CAuto( final String p_farbe, final String p_marke, final double p_kw, final int p_anzahlGaenge, final int p_maxGeschwindigkeit)
    {
      m_farbe = p_farbe;
      m_marke = p_marke;
      m_kw = p_kw;
      m_anzahlGaenge = p_anzahlGaenge;
      m_maxGeschwindigkeit = p_maxGeschwindigkeit;
      m_seriennummer = zahl2+"-"+zahl1;
      zahl1++;
      if(zahl1>9)
      {
          zahl1=0;
          zahl2++;
      }
    }
    /*protected CAuto( final String p_farbe, final String p_marke, final int p_kw, final int p_anzahlGaenge, final int p_maxGeschwindigkeit){
        this(p_farbe, p_marke, (double)p_kw,p_anzahlGaenge,p_maxGeschwindigkeit);
    }*/
    public String getSernr(){
        return m_seriennummer;
    }
    // Funktionen
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
        m_aktGeschwindigkeit += p_inkrement;
        m_aktGeschwindigkeit = (int)m_aktGeschwindigkeit > m_maxGeschwindigkeit ? m_maxGeschwindigkeit : m_aktGeschwindigkeit;
    }
    /*public void beschleunige( final int p_inkrement)
    {
        m_aktGeschwindigkeit += p_inkrement;
        m_aktGeschwindigkeit = m_aktGeschwindigkeit > m_maxGeschwindigkeit ? m_maxGeschwindigkeit : m_aktGeschwindigkeit;
    }*/
    @Override
    public void bremse(final int p_dekrement)
    {
        m_aktGeschwindigkeit -= p_dekrement;
        m_aktGeschwindigkeit = m_aktGeschwindigkeit < 0 ? 0 : m_aktGeschwindigkeit;
    }
    // Getter
    public double getPS()
    {
        return (m_kw * 1.36) - ((m_kw * 1.36)%1);
    }
    public String getGang()
    {
        final String Gang;
        if(m_gang == -1)
        {
            Gang = "Das Auto ist im Rueckwertsgang.";
            return Gang;
        }
        else
        {
            if(m_gang == 0)
            {
                Gang = "Das Auto ist im Neutralen Gang.";
                return Gang;
            }
            else
            {
                Gang = "Das Auto ist im " + m_gang + ". Gang.";
                return Gang;
            }
        }
    }
    public int getMaxGang()
    {
        return m_anzahlGaenge;
    }
    public String getFarbe()
    {
        return m_farbe;
    }
    public String getName()
    {
        return m_marke;
    }
    public double getVel()
    {
        return m_aktGeschwindigkeit;
    }
    public int getMaxVel()
    {
        return m_maxGeschwindigkeit;
    }
    @Override
    public String toString() {
		String ausgabe ="Dies ist ein "+m_farbe+"es Auto der Marke "+m_marke+".\n";
		ausgabe = ausgabe + "Es hat "+m_anzahlGaenge+" Gaenge und eine Leistung von "+m_kw+" kW.\n";
		ausgabe = ausgabe + "Das SUV hat eine Spitzengeschwindigkeit von "+ m_maxGeschwindigkeit+".\n";
        ausgabe = ausgabe + "Es faehrt aktuell "+m_aktGeschwindigkeit + " im "+ m_gang +". Gang .\n";
		return ausgabe;
	}
}