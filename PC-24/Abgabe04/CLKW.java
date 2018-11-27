public class CLKW extends CAuto
{
    private String m_gewicht;

    public CLKW ( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final String p_gewicht)

    {
    super(p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit);
        m_gewicht = p_gewicht;
    }

    public String getGewicht()
    {
        return m_gewicht;
    }
    @Override
    public String toString(){
        return "CLKW: " + m_farbe + " " + m_marke + " " + m_anzahlGaenge + " " + m_gewicht;
    }
}
