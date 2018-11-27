public class CMotorrad implements IFahrzeug {
    // unveränderbare Eigenschaft durch final
    protected final String m_farbe;
    protected final String m_marke;
    protected final int m_maxGeschwindigkeit;
    protected final int m_anzahlGaenge;
    protected int m_leistungKW;
    protected static int s_anzahl = 0;
    protected final String m_seriennummer;

    private final boolean zweisitzer;
    // veränderbare Eigenschaften
    // aktuelle Geschwindigkeit - der Wert bei Java mit 0 automatisch belegt
    protected int m_aktGeschwindigkeit;
    // aktueller Gang - hier wird ein Wert vorgegeben
    protected int m_gang = 1;

    @Override
    public String getSeriennummer() {
        return m_seriennummer;
    }

    @Override
    public void schalte(final int p_gang) {
        m_gang = p_gang % (m_anzahlGaenge + 1);
        m_gang = m_gang < -1 ? -1 : m_gang;
    }

    @Override
    public void beschleunige(final int p_inkrement) {
        m_aktGeschwindigkeit += p_inkrement;
        m_aktGeschwindigkeit = m_aktGeschwindigkeit > m_maxGeschwindigkeit ? m_maxGeschwindigkeit
                : m_aktGeschwindigkeit;
        m_gang = m_aktGeschwindigkeit * (m_anzahlGaenge) / (m_maxGeschwindigkeit + 1) + 1;
        m_gang = m_gang < -1 ? -1 : m_gang;
    }

    @Override
    public void bremse(final int p_dekrement) {
        m_aktGeschwindigkeit -= p_dekrement;
        m_aktGeschwindigkeit = m_aktGeschwindigkeit < 0 ? 0 : m_aktGeschwindigkeit;
        m_gang = m_aktGeschwindigkeit * (m_anzahlGaenge + 1) / (m_maxGeschwindigkeit + 1);
        m_gang = m_gang < -1 ? -1 : m_gang;
    }

    @Override
    public int getGeschwindigkeit() {
        return m_aktGeschwindigkeit;
    }

    @Override
    public int getMaxGeschwindigkeit() {
        return m_maxGeschwindigkeit;
    }

    public boolean getZweisitzer() {
        return zweisitzer;
    }

    public CMotorrad() {
        // ruft den SUV Konstruktor auf
        this("rot", "VW", 5, 250, 100, false);
    }

    public CMotorrad(final boolean p_zweisitzer) {
        // ruft den SUV Konstruktor auf
        this("rot", "VW", 5, 250, 100, p_zweisitzer);
    }

    public CMotorrad(final String p_farbe, final String p_marke, final int p_anzahlGaenge,
            final int p_maxGeschwindigkeit, final int p_leistungKW, final boolean p_zweisitzer) {
        m_farbe = p_farbe;
        m_marke = p_marke;
        m_anzahlGaenge = p_anzahlGaenge;
        m_maxGeschwindigkeit = p_maxGeschwindigkeit;
        m_leistungKW = p_leistungKW;
        m_seriennummer = Integer.toString(s_anzahl / 10) + "-" + Integer.toString(s_anzahl % 10);
        s_anzahl++;
        zweisitzer = p_zweisitzer;

    }

}