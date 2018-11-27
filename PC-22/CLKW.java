public class CLKW extends CAuto{

  private int m_Beladung;
  private final int m_maxBeladung;

  public CLKW()
  {
    // ruft den SUV Konstruktor auf
    this( "rot", "VW", 5, 250,100, 20,40 );
  }

  public CLKW( final int p_Beladung, final int p_maxBeladung)
  {
    // ruft den SUV Konstruktor auf
    this( "rot", "VW", 5, 250,100, p_Beladung, p_maxBeladung );
  }
    
    public CLKW( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final int p_leistungKW, final int p_Beladung, final int p_maxBeladung)
    {
      super(p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit, p_leistungKW);
      m_Beladung = p_Beladung;
      m_maxBeladung = p_maxBeladung;
  }

    public int getBeladung(){
      return m_Beladung;
    }
    public int getMaxBeladung(){
      return m_maxBeladung;
    }
}