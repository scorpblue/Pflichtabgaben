public class CLkw extends CAuto
{  private final boolean m_ladung;
    public CLkw( final String p_farbe, final String p_marke, final EAutoTyp p_typA, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final boolean p_ladung )
  {
    // Aufruf des Konstruktur von CAuto
    super( p_farbe, p_marke, p_typA, p_anzahlGaenge, p_maxGeschwindigkeit );
    m_ladung = p_ladung;
  }
    public boolean getLadung(){
        return m_ladung;
    }
}