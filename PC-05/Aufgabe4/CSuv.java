public class CSuv extends CAuto {

    private static int m_number = 0;
    int m_seriennummer = s_anzahl;
    private static int s_anzahl;// static
    private final boolean m_offroadFahrbar;

    public CSuv() {
        // ruft den SUV Konstruktor auf
        this("rot", "VW", 5, 250, false);
    }

    public CSuv(final boolean p_offroadFahrbar) {
        // ruft den SUV Konstruktor auf
        this("rot", "VW", 5, 250, p_offroadFahrbar);
    }

    public CSuv(final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit,
            final boolean p_offroadFahrbar) {
        // Aufruf des Konstruktur von CAuto
        super(p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit);
        m_offroadFahrbar = p_offroadFahrbar;

        // inkrementieren der statischen Variablen

        if (s_anzahl < 10) {
            s_anzahl++;

        }
        if (s_anzahl == 10) {
            s_anzahl = 0;
            m_number++;
        }
        m_seriennummer = s_anzahl;//

    }

    public static int getAnzahl() {
        return s_anzahl;
    }

    // Methode des Autos, um die individuelle Seriennummer zu erhalten
    public int getSeriennummer() {
        return m_seriennummer;
    }

    public String toString() {
        return "Der Seriennummer von suv ist : " + m_number + "-" + m_seriennummer;
    }
}