public class CMotorrad {
  protected final int m_motorradId;
  protected final String m_marke;
  protected final int m_maxGeschwindigkeit;

  public CMotorrad(final int p_motorradId,final String p_marke,final int p_maxGeschwingigkeit){
      m_motorradId = p_motorradId;
      m_marke = p_marke;
      m_maxGeschwindigkeit = p_maxGeschwingigkeit;
  } 
  public int getMotorradId(){
      return m_motorradId;
  }
  public String getMarke(){
      return m_marke;
  }
  public int getGeschwindigkeit(){
      return m_maxGeschwindigkeit;
  }
  @Override
  public String toString(){
      return "Motorrad: " + m_motorradId + " " + m_marke + " " + m_maxGeschwindigkeit;
  }
}