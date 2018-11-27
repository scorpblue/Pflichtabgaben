public class CLKW extends CLAuto
{
    final int m_nutzlast;

    public CLKW()
    {
        this("blau", "Scania", 12, 80, 40);
    }

    public CLKW(String p_farbe, String p_marke, int p_anzahlGaenge, int p_maxGeschwindigkeit, int p_nutzlast)
    {
        super(p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit);

        m_nutzlast = p_nutzlast;
    }

     @Override
        public String toString()
        {
            return "LKW: " + this.getGang() + "\n" + m_nutzlast + "\n"; 
        }

}

