public class CLkw extends CAuto {
private int m_max_Beladung;
    public CLkw( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final int p_max_Beladung )
  {
    // Aufruf des Konstruktur von CAuto
    super( p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit );
    m_max_Beladung = p_max_Beladung;

  }
    public int max_Beladung(){
        return m_max_Beladung;
    }

    /**
     * Settermethode für offroad fahrbar
     * @param 
     */

    public void setmax_Beladung(int p_max_Beladung){
        m_max_Beladung = p_max_Beladung;
    }   

    @Override
    public String toString(){
        return "LKW: " + m_marke + " " + m_autoId + " " + m_max_Beladung;
    }
}