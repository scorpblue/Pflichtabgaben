
public class CAuto implements IFahrzeug
{

  // --- definiere Eigenschaften ---

  // unveränderbare Eigenschaft durch final  
  private static int s_anzahl;

  private final String m_farbe;
  private final String m_marke;
  private final int m_maxGeschwindigkeit;
  private final int m_anzahlGaenge;
  private int m_leistung;
  private final String m_seriennummer;
  private final boolean m_offroadFahrbar;
  private final int m_tragLast;
  private final boolean m_zweiRad;
    

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
    this( "rot", "VW", 5, 250,false,0 ,false);
  }

  // Konstruktor mit Parametern
  public CAuto( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final boolean p_offroadFahrbar, final int p_tragLast, final boolean p_zweiRad)
  {
    m_farbe = p_farbe;
    m_marke = p_marke;
    m_anzahlGaenge = p_anzahlGaenge;
    m_maxGeschwindigkeit = p_maxGeschwindigkeit;
    m_seriennummer = CSeriennummer.Seriennummer();
    m_offroadFahrbar = p_offroadFahrbar;
    m_tragLast = p_tragLast;
    m_zweiRad = p_zweiRad;
  }
  public static int getAnzahl()
  {
      return s_anzahl;
  }

  public int getGeschwindigkeit() {
      return m_aktGeschwindigkeit;
  }
  
  public int getGang(){
      return m_gang;
  }
  public String getSeriennummer()
  {
      return m_seriennummer;
  }
    @Override// Methoden / Verhalten
    public void schalte( final int p_gang )
  {
      m_gang = p_gang % (m_anzahlGaenge + 1);
      if (m_gang==0)
      {
          System.out.println("Leerlauf");
      }
      if (m_gang== -1)
     {
        System.out.println("Rückwärtsgang");
     }
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
        if (m_aktGeschwindigkeit==0)
        {
            System.out.println("Leerlauf");
     

        }
    }
    public int getkw()
    {
        return m_leistung;
    }
    public void leistung( final int p_leistung)
    {
        m_leistung = p_leistung;
    }
    public double getPS()
    {
        return m_leistung * 1.36;
    }
}

class CSeriennummer
 {
     private static int a=0;
     
     private static int b=0;

public static String Seriennummer(){
    String Ausgabe = a +"-" +b;
    b++;
    if(b>9)
    {
        a++;
        b=0;
    }
    return Ausgabe;
}
}
