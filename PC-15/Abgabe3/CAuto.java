public class  CAuto implements IFahrzeug{
    // --- definiere Eigenschaften ---
    
    private static int s_anzahl;
    // unveränderbare Eigenschaft durch final  
    private final String m_farbe;
    private final String m_marke;
    private final int m_maxGeschwindigkeit;
    private final int m_anzahlGaenge;
    private final int m_kw;
    private final int m_seriennummer;
    // veränderbare Eigenschaften
    // aktuelle Geschwindigkeit - der Wert bei Java mit 0 automatisch belegt
    private int m_aktGeschwindigkeit;
    // aktueller Gang - hier wird ein Wert vorgegeben
    private int m_gang = 1;
  
    // --- definiere Methoden ---
  
    // Default-Konstruktor ohne Parameter
    public CAuto()
    {
      // ruft den Konstruktor mit Parametern auf
      this( "rot", "VW", 5, 250, 140 );
    }
  
    // Konstruktor mit Parametern
    public CAuto( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final int p_kw)
    {
      m_farbe = p_farbe;
      m_marke = p_marke;
      m_anzahlGaenge = p_anzahlGaenge;
      m_maxGeschwindigkeit = p_maxGeschwindigkeit;
      m_kw= p_kw;

      m_seriennummer = s_anzahl;
      // inkrementieren der statischen Variablen
      s_anzahl++;
    }
    public static int getAnzahl()
  {
    return s_anzahl;
  }

  // Methode des Autos, um die individuelle Seriennummer zu erhalten
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
    return "A" + x +"-"+ y;
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
    
  public String getFarbe()
  {
    return m_farbe;
  }

  public CAuto get()
  {
    return this;
  }
}