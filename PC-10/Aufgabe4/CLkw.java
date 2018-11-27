public class CLkw extends CAuto 
{
    private boolean m_Nasszelleintegriert; 
/**
   * @param p_farbe Farbe des Autos
   * @param p_marke Automarke
    *@param p_anzahlGaenge  Anzahl der Gänge
    *@param p_maxGeschwindigkeit Höchstgeschwindigkeit 
    *@param p_Nasszelleintegriert Toilette? (boolean)
   */
  public CLkw( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final boolean p_Nasszelleintegriert )
  {
    super( p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit );
    m_Nasszelleintegriert = p_Nasszelleintegriert;

  }
    public boolean isNasszelleintegriert(){
        return m_Nasszelleintegriert;
    }
    public void setNasszelleintegriert(boolean p_Nasszelleintegriert){
        m_Nasszelleintegriert = p_Nasszelleintegriert;
    }   

    @Override
    public String toString(){
        return "CLkw: " + m_marke + " " + m_anzahlGaenge + " " + m_Nasszelleintegriert; 
    }
}