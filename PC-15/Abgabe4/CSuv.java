public class CSuv extends CAuto
{
  private boolean m_offroadFahrbar;
  private static int s_anzahl;
  private final int m_seriennummer;

  public CSuv()
  {
    // ruft den SUV Konstruktor auf
    this( "rot", "VW", 5, 250, 250,  false );
  }

  public CSuv( final boolean p_offroadFahrbar )
  {
    // ruft den SUV Konstruktor auf
    this( "rot", "VW", 5, 250, 250, p_offroadFahrbar );
  }

  public CSuv( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit,final int p_kw, final boolean p_offroadFahrbar )
  {
    // Aufruf des Konstruktur von CAuto
    super( p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit, p_kw );
    m_offroadFahrbar = p_offroadFahrbar;
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
    return "S" + x +"-"+ y;
  }
  public void setOffroadFahrbar(boolean p_offroadFahrbar)
  {
    m_offroadFahrbar = p_offroadFahrbar;
  }

  
}