public class CMotorrad implements IFahrzeug
{
    private final String m_farbe;
    private final String m_marke;
    private final int m_maxGeschwindigkeit;
    private final int m_anzahlGaenge;
    private final boolean m_rallyeStreifen;

    private int m_aktuelleGeschwindigkeit;
    private int m_gang;

    public CMotorrad()
    {
        this("weinrot", "harley", 2, 200, true);
    }

    public CMotorrad (final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final boolean p_rallyeStreifen)
    {
        m_farbe = p_farbe;
        m_marke = p_marke;
        m_anzahlGaenge = p_anzahlGaenge;
        m_maxGeschwindigkeit = p_maxGeschwindigkeit;
        m_rallyeStreifen = p_rallyeStreifen;
    }


        @Override
        public String toString()
        {
            return "Motorrad: " + m_farbe + "\n" + m_marke + "\n" + m_anzahlGaenge + "\n" + m_maxGeschwindigkeit + "\n" + m_rallyeStreifen + "\n"; 
        }

        @Override
        public void schalte( final int p_gang )
        {
            m_gang = p_gang % (m_anzahlGaenge + 1);
            m_aktuelleGeschwindigkeit = m_gang < 0 ? 0 : m_gang;
        }

        @Override
        public void beschleunige( final int p_inkrement)
        {
            m_aktuelleGeschwindigkeit += p_inkrement;
            m_aktuelleGeschwindigkeit = m_aktuelleGeschwindigkeit > m_maxGeschwindigkeit ? m_maxGeschwindigkeit : m_aktuelleGeschwindigkeit;
        }

        @Override
        public void bremse( final int p_dekrement)
        {
            m_aktuelleGeschwindigkeit -= p_dekrement;
            m_aktuelleGeschwindigkeit = m_aktuelleGeschwindigkeit < 0 ? 0 : m_aktuelleGeschwindigkeit;

        }

}