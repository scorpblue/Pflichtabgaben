public class CSuv extends CAuto
{
  public boolean m_offroadFahrbar;

  public CSuv()
  {
    // ruft den SUV Konstruktor auf
    this( "rot", "SUV", EAutoTyp.MITTEL, 5, 250, false );
  }

  public CSuv( final boolean p_offroadFahrbar )
  {
    // ruft den SUV Konstruktor auf
    this( "rot", "SUV", EAutoTyp.MITTEL, 5, 250, p_offroadFahrbar );
  }

  public CSuv( final String p_farbe, final String p_marke, final EAutoTyp p_typA, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final boolean p_offroadFahrbar )
  {
    // Aufruf des Konstruktur von CAuto
    super( p_farbe, p_marke, p_typA, p_anzahlGaenge, p_maxGeschwindigkeit );
   
  }
   public void setm_offroadFahrbar(boolean p_offroadFahrbar)
   {
    m_offroadFahrbar = p_offroadFahrbar;
  }
  
  @Override
    public String toString(){
        return "Offroad " + m_offroadFahrbar;
    }
}