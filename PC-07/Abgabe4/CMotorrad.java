public class CMotorrad implements IFahrzeug
{
	private final boolean m_Getter;
	private final boolean m_Setter;
	
	private static final int MAX_BESCHLEUNIGUNG = 5;
	private static final int MAX_VERZOEGERUNG = 3;
	
	private static int s_id; // zähler für fz ids, initial 0

	  // unveränderbare Eigenschaft durch final  
	private final int m_autoId;
	private final String m_farbe;
	private final String m_marke;
	private final int m_maxGeschwindigkeit;
	private final int m_anzahlGaenge;

	  // veränderbare Eigenschaften
	private int m_aktGeschwindigkeit; // initial 0
	private int m_gang = 1; // aktueller Gang - hier wird ein Wert vorgegeben
	private int m_position; // hier merkt sich das Auto seine Position auf der Straße, initial 0

	
	public CMotorrad(final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final boolean p_Getter, final boolean p_Setter)
	{
        m_farbe = p_farbe;
        m_marke = p_marke;
        m_anzahlGaenge = p_anzahlGaenge;
        m_maxGeschwindigkeit = p_maxGeschwindigkeit;
        m_autoId=s_id++;

	    m_Getter = p_Getter;
	    m_Setter = p_Setter;
	    
    }

    /**
     * Getter Methode für die eindeutige ID
     * @return der int Wert der ID
     */
    public int getAutoId(){
        return m_autoId;
    }

    /**
     * Getter Methode für die aktuelle Geschwindigkeit
     * @return aktueller Wert als int
     */
    public int getAktGeschwindigkeit(){
        return m_aktGeschwindigkeit;
    }
 
    /**
     * Getter Methode für die aktuelle Position des Autos. Wir nehmen an, dass
     * diese auf einem Strahl mit Ausgangspunkt 0 definiert ist. 
     * @return aktueller Wert als int
     */
    public int getPosition(){
        return m_position;
    }
    
    public String getMarke()
    {
    	return m_marke;
    }

    /**
     * Erhöht Positionswert um ein Inkrement
     * @param p_inc nicht negativer ganzzahliger Wert für Inkrement 
     */
    public void incrementPosition(int p_inc){
        m_position = p_inc > 0 ? m_position + p_inc : m_position;
    }

    /**
     * Ändern des eingelegten Ganges. 
     * @param p_inc zulässiger Wert für Gang.
     */
     public void schalte( final int p_gang )
    {
        // in dieser Implementierung kann man von jedem Gang in jeden anderen schalten
        m_gang = p_gang % (m_anzahlGaenge + 1);
        m_gang = m_gang < 0 ? 0 : m_gang;
    }

    /**
     * Realisiert beschleunigen durch Addieren eines positiven ganzzahligen Wertes zur Geschwindikeit 
     * @param p_inkrement zulässiger Wert für Anzahl der Einheiten, die beschleunigt werden
     */
    public void beschleunige( final int p_inkrement )
    {
        if (p_inkrement < 0) throw new IllegalArgumentException("negative value for increment: " + p_inkrement);

        m_aktGeschwindigkeit += Math.min(p_inkrement, MAX_BESCHLEUNIGUNG);
        m_aktGeschwindigkeit = m_aktGeschwindigkeit > m_maxGeschwindigkeit ? m_maxGeschwindigkeit : m_aktGeschwindigkeit;
    }

    /**
     * Realisiert bremsen durch Verringern der Geschwindigkeit um einen positiven ganzzahligen Wert  
     * @param p_inc zulässiger Wert für Anzahl der Einheiten, die beschleunigt werden
     */
    public void bremse( final int p_dekrement )
    {
        if (p_dekrement < 0) throw new IllegalArgumentException("negative value for decrement: " + p_dekrement);
     
        m_aktGeschwindigkeit -= Math.min(p_dekrement, MAX_VERZOEGERUNG);
        m_aktGeschwindigkeit = m_aktGeschwindigkeit < 0 ? 0 : m_aktGeschwindigkeit;
    }
	public String toString()
	{
		return getMarke()+getAutoId() + ": Position=" + getPosition() + "; Speed=" + getAktGeschwindigkeit()+"; Getter:"+m_Getter+"; Setter:" +m_Setter;
	}
}
