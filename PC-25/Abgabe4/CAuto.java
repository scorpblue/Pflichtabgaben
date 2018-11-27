public class CAuto implements IFahrzeug {
  
  private final String m_farbe;
  private final String m_marke;
  private final int m_maxGeschwindigkeit;
  private final int m_anzahlGaenge;
  private int m_kwpower;
  private static int s_anzahl;
  
  public int m_seriennummer;
  
  private int m_aktGeschwindigkeit;
  
  private int m_gang = 1;

  //Konstruktoren
  public CAuto()
  {
    this( "rot", "VW", 5, 250 );
  }

  public CAuto( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit)
  {
    m_farbe = p_farbe;
    m_marke = p_marke;
    m_anzahlGaenge = p_anzahlGaenge;
    m_maxGeschwindigkeit = p_maxGeschwindigkeit;
  
    m_seriennummer = s_anzahl;
   
    s_anzahl++;
  }

  public int getPower()
  {
	  return m_kwpower;
  }

  public void power( final int p_kwpower )
  {
      m_kwpower = p_kwpower;
  }

  public double getPS()
  {
    return m_kwpower * 1.36;
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

  public static int getAnzahl()
  {
    return s_anzahl;
  }

  public int getSeriennummer()
  {
    return m_seriennummer;
  }
 
  
}



