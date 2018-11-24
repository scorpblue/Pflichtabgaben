public class CLkw implements IFahrzeug{
	private final String m_farbe;
    private final String m_marke;
    private final int m_anzahlGaenge;
    private final double m_kw;
    private final int m_maxLadung;
    
    private int m_maxGeschwindigkeit;
    
    private int m_gang = 1;
	private double m_aktGeschwindigkeit = 0;
	private int m_currentLadung; 
	private ELadeTyp m_ladetyp = ELadeTyp.NICHT;
	
	public CLkw()
    {
      this( "blau", "Man", 470, 6, 130,200 );
    }
    public CLkw( final String p_farbe, final String p_marke, final double p_kw, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final int p_maxLadung)
    {
      m_farbe = p_farbe;
      m_marke = p_marke;
      m_kw = p_kw;
      m_anzahlGaenge = p_anzahlGaenge;
      m_maxGeschwindigkeit = p_maxGeschwindigkeit;
      m_maxLadung = p_maxLadung;
    }
    
	@Override
    public void schalte(final String p_gang)
    {
        if(p_gang.equals("R") || p_gang.equals("N"))
        {
            if(p_gang.equals("R"))
            {
                m_gang = -1 % (m_anzahlGaenge + 1);
                m_gang = m_gang < -1 ? 0 : m_gang;
            }
            else
            {
                m_gang = 0;
                m_gang = m_gang < -1 ? 0 : m_gang;
            }
        }
        else
        {
            m_gang = Integer.parseInt(p_gang) % (m_anzahlGaenge + 1);
            m_gang = m_gang < -1 ? 0 : m_gang;
        }
    }
    @Override
    public void beschleunige( final double p_inkrement)
    {
        m_aktGeschwindigkeit = p_inkrement;
        m_aktGeschwindigkeit = (int)m_aktGeschwindigkeit > m_maxGeschwindigkeit ? m_maxGeschwindigkeit : m_aktGeschwindigkeit;
    }
    @Override
    public void bremse(final int p_dekrement)
    {
        m_aktGeschwindigkeit -= p_dekrement;
        m_aktGeschwindigkeit = m_aktGeschwindigkeit < 0 ? 0 : m_aktGeschwindigkeit;
    }
	
	public void lade(int menge) {
		m_currentLadung = m_currentLadung+menge>m_maxLadung?m_maxLadung:m_currentLadung+menge;
		if(m_currentLadung>0) {
			if(m_currentLadung<m_maxLadung/10) {
				m_ladetyp = ELadeTyp.LEICHT;
				m_maxGeschwindigkeit = m_maxGeschwindigkeit - (int)m_maxGeschwindigkeit/10;
			}
			else if(m_currentLadung<m_maxLadung/5) {
				m_ladetyp = ELadeTyp.NORMAL;
				m_maxGeschwindigkeit = m_maxGeschwindigkeit - (int)m_maxGeschwindigkeit/7;
			}
			else {
				m_ladetyp = ELadeTyp.SCHWER;
				m_maxGeschwindigkeit = m_maxGeschwindigkeit - (int)m_maxGeschwindigkeit/5;
				
			}
			if(m_aktGeschwindigkeit>m_maxGeschwindigkeit) {
				m_aktGeschwindigkeit = m_maxGeschwindigkeit;
			}
		}
	}
	public double getM_aktGeschwindigkeit() {
		return m_aktGeschwindigkeit;
	}
	public int getM_maxLadung() {
		return m_maxLadung;
	}
	public int getM_currentLadung() {
		return m_currentLadung;
	}
	public ELadeTyp getM_ladetyp() {
		return m_ladetyp;
	}
	
	@Override
	public String toString() {
		String ladung;
		switch(m_ladetyp) {
		case LEICHT:
			ladung="leichte";
			break;
		case NORMAL:
			ladung="normale";
			break;
		case SCHWER:
			ladung="schwere";
			break;
		default:
			ladung="keine";
			break;	
		}
		String ausgabe ="Dies ist ein "+m_farbe+"er LKW der Marke "+m_marke+".\n";
		ausgabe = ausgabe + "Es hat "+m_anzahlGaenge+" Gaenge und eine Leistung von "+m_kw+" kW.\n";
		ausgabe = ausgabe + "Der LKW hat eine Spitzengeschwindigkeit von "+ m_maxGeschwindigkeit+".\n";
		ausgabe = ausgabe + "Es faehrt aktuell "+m_aktGeschwindigkeit + " im "+ m_gang +". Gang .\n";
		ausgabe = ausgabe + "Es hat aktuell eine "+ladung+" Ladung von " + m_currentLadung + "kg bei einer maximalen Beladung von "  + m_maxLadung+ "kg.\n";
		return ausgabe;
	}
}