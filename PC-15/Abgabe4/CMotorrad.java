public class  CMotorrad implements IFahrzeug
{
    
    private static int s_anzahl;
	private boolean m_sport;
    private final String m_farbe;
    private final String m_marke;
    private final int m_maxGeschwindigkeit;
    private final int m_anzahlGaenge;
    private final int m_kw;
    private final int m_seriennummer;
    private int m_aktGeschwindigkeit;
    private int m_gang = 1;
  
    public CMotorrad()
    {
      this( "rot", "Kawasaki", 5, 250, 140 );
    }

    public CMotorrad( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final int p_kw, final boolean p_sport)
    {
      m_farbe = p_farbe;
      m_marke = p_marke;
      m_anzahlGaenge = p_anzahlGaenge;
      m_maxGeschwindigkeit = p_maxGeschwindigkeit;
      m_kw= p_kw;
	  m_sport= p_sport;
      m_seriennummer = s_anzahl;

      s_anzahl++;
    }
    public static int getAnzahl()
  {
    return s_anzahl;
  }


  public String getSeriennummer()
  {
    int x=0;
    int y=0;
    if(m_seriennummer > 9)
    {
      x = m_seriennummer;
      x = x/10; 
      y = m_seriennummer - x*10;
    }
    else
    {
      y= m_seriennummer;
    }
    return "M" + x +"-"+ y;
  }
   @Override
  public void schalte( final int p_gang )
    {
        m_gang = p_gang % (m_anzahlGaenge + 1);
        m_gang = m_gang < 0 ? 0 : m_gang;
    }
  @Override
  public void beschleunige( final int p_inkrement )
    {
        m_aktGeschwindigkeit += p_inkrement;
        m_aktGeschwindigkeit = m_aktGeschwindigkeit > m_maxGeschwindigkeit ? m_maxGeschwindigkeit : m_aktGeschwindigkeit;
    }
  @Override
  public void bremse( final int p_dekrement )
    {
        m_aktGeschwindigkeit -= p_dekrement;
        m_aktGeschwindigkeit = m_aktGeschwindigkeit < 0 ? 0 : m_aktGeschwindigkeit;
    }
}