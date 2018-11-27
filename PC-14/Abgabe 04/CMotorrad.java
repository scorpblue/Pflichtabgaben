
public class CMotorrad implements IFahrzeug 
{
	  private static final int MAX_BESCHLEUNIGUNG = 5;
	  private static final int MAX_VERZOEGERUNG = 3;
	  
	  private static int s_id;
	
	  private final int m_motorradId;
	  private final String m_marke;
	  private final String m_farbe;
	  private final int m_maxGeschwindigkeit;
	  private final int m_anzahlGaenge;
	  
	  
	// veränderbare Eigenschaften
	  private int m_aktGeschwindigkeit; // initial 0
	  private int m_gang = 1; // aktueller Gang - hier wird ein Wert vorgegeben
	  private int m_position;
	  private int m_inkrement;
	  private int m_dekrement;
	  
	  public CMotorrad()
	  {
		  this( "Yamaha", "Rot", 6, 220 );
	  }
	  public CMotorrad( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit)
	  {
	      m_farbe = p_farbe;
	      m_marke = p_marke;
	      m_anzahlGaenge = p_anzahlGaenge;
	      m_maxGeschwindigkeit = p_maxGeschwindigkeit;
	      m_motorradId=s_id++;
	  }
	  public int getMotorradId()
	    {
	        return m_motorradId;
	    }
	  public int getAktGeschwindigkeit()
	  {
		  return m_aktGeschwindigkeit;
	  }
	  public int getGang()
	  {
		  return m_gang;
	  }
	  public int getPostion()
	  {
		  return m_position;
	  }
	  public void incrementPosition(int p_inc){
	        m_position = p_inc > 0 ? m_position + p_inc : m_position;
	    }
	 
	  @Override
	  public void schalte(final int p_gang)
	  {
		// in dieser Implementierung kann man von jedem Gang in jeden anderen schalten
	        m_gang = p_gang % (m_anzahlGaenge + 1);
	        m_gang = m_gang < 0 ? 0 : m_gang;
	  }
	  @Override
	  public void beschleunige( final int p_inkrement)
	  {
		  if (p_inkrement < 0) throw new IllegalArgumentException("negative value for increment: " + p_inkrement);
	        m_inkrement = p_inkrement;
	        m_aktGeschwindigkeit += Math.min(p_inkrement, MAX_BESCHLEUNIGUNG);
	        m_aktGeschwindigkeit = m_aktGeschwindigkeit > m_maxGeschwindigkeit ? m_maxGeschwindigkeit : m_aktGeschwindigkeit;
	  }
	  public int getInkrement()
	  {
	    	return m_inkrement;
	  }
	  
	  @Override
	  public void bremse(final int p_dekrement)
	  {
		  if (p_dekrement < 0) throw new IllegalArgumentException("negative value for decrement: " + p_dekrement);
	        m_dekrement = p_dekrement;
	        m_aktGeschwindigkeit -= Math.min(p_dekrement, MAX_VERZOEGERUNG);
	        m_aktGeschwindigkeit = m_aktGeschwindigkeit < 0 ? 0 : m_aktGeschwindigkeit;
	  }
	  public int getDekrement()
	  {
	    	return m_dekrement;
	  }
	  
	  @Override
	    public String toString()
	  {
	       return "CMotorrad: "+ m_motorradId + " " + m_marke + " " + m_farbe + " " + m_anzahlGaenge + " " + m_maxGeschwindigkeit;
	  }
	  
	  
	
	
}
