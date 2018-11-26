public class CMotorrad implements IFahrzeug {

    private final String m_farbe;
    private final String m_marke;
    private final int m_maxGeschwindigkeit;
    private final int m_anzahlGaenge;

    private int m_drehmoment = 0;
    private int m_gang = 1;
    private double m_aktGeschwindigkeit = 0;
    private static final int MAX_BESCHLEUNIGUNG = 5;
    private static final int MAX_VERZOEGERUNG = 3;
    private int m_raeder = 2;

    public CMotorrad() {
        this("blau", "Yamaha", 5, 130, 2);

    }

    public CMotorrad(final String p_farbe, final String p_marke, final int p_anzahlGaenge,
            final int p_maxGeschwindigkeit, final int p_raeder) {
        m_farbe = p_farbe;
        m_marke = p_marke;
        m_anzahlGaenge = p_anzahlGaenge;
        m_maxGeschwindigkeit = p_maxGeschwindigkeit;
        m_raeder = p_raeder;
    }

    public void schalte(final int p_gang) {
        // in dieser Implementierung kann man von jedem Gang in jeden anderen
        // schalten
        m_gang = p_gang % (m_anzahlGaenge + 1);
        m_gang = m_gang < 0 ? 0 : m_gang;
    }

    public void beschleunige(final int p_inkrement) {
        if (p_inkrement < 0)
            throw new IllegalArgumentException("negative value for increment: " + p_inkrement);

        m_aktGeschwindigkeit += Math.min(p_inkrement, MAX_BESCHLEUNIGUNG);
        m_aktGeschwindigkeit = m_aktGeschwindigkeit > m_maxGeschwindigkeit ? m_maxGeschwindigkeit
                : m_aktGeschwindigkeit;
    }

    public void bremse(final int p_dekrement) {
        if (p_dekrement < 0)
            throw new IllegalArgumentException("negative value for decrement: " + p_dekrement);

        m_aktGeschwindigkeit -= Math.min(p_dekrement, MAX_VERZOEGERUNG);
        m_aktGeschwindigkeit = m_aktGeschwindigkeit < 0 ? 0 : m_aktGeschwindigkeit;

    }

    public int getM_raeder() {
        return m_raeder;
    }

    public void setM_reader(int m_raeder) {
        this.m_raeder = m_raeder;
    }

    public int getM_drehmoment() {
        return m_drehmoment;
    }

    public void setM_drehmoment(int m_drehmoment) {
        this.m_drehmoment = m_drehmoment;
    }

    public double getM_aktGeschwindigkeit() {
        return m_aktGeschwindigkeit;
    }

    public String toString() {
        String ausgabe = "Die Farbe von moto ist " + m_farbe + "\n" + ".der Marke ist  " + m_marke + ".\n"
                + ".Die gange ist  " + m_anzahlGaenge + ".\n" + ".Die Maxgeschwindigkeit ist " + m_maxGeschwindigkeit
                + ".\n" + " Die AktGeschwindigkeit ist " + m_aktGeschwindigkeit + ".\n" + ".Der Gange ist " + m_gang
                + ".\n" + ".Der Drehmoment ist " + m_drehmoment;

        return ausgabe;
    }
}