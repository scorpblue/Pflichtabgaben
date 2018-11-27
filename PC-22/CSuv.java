public class CSuv extends CAuto{
    
    private final boolean m_offroadFahrbar;


  public boolean getOffroadFahrbar(){
    return m_offroadFahrbar;
  }

  public CSuv()
  {
    // ruft den SUV Konstruktor auf
    this( "rot", "VW", 5, 250,100, false );
  }

  public CSuv( final boolean p_offroadFahrbar )
  {
    // ruft den SUV Konstruktor auf
    this( "rot", "VW", 5, 250,100, p_offroadFahrbar );
  }
    
    public CSuv( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final int p_leistungKW, final boolean p_offroadFahrbar)
  {
    super(p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit, p_leistungKW);
    m_offroadFahrbar = p_offroadFahrbar;
  
  }

  public static void main(String[] p_args){
      CSuv suv1 = new CSuv();
      System.out.println(suv1.getSeriennummer());
      CSuv suv2 = new CSuv();
      System.out.println(suv2.getSeriennummer());
  }
}