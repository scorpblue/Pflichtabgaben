public class CSuv extends CAuto
{
    private final boolean m_offroadFahrbar;

    public CSuv()
    {
        this("blau", "dodge", 300, 5, false);
    }

    public CSuv( final boolean p_offroadFahrbar)
    {
        this("blau", "dodge", 300, 5, p_offroadFahrbar);
    }

    //Aufruf der konstruktor von CAuto

    public CSuv( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final boolean p_offroadFahrbar)
    {
        super(p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit);
        m_offroadFahrbar = p_offroadFahrbar;
    }

    //Getter

    public String getOffroad()
    {
        if(this.m_offroadFahrbar == true)
        {
            return "Das Auto kann überall fahren";
        }
        else
        {
            return "Das Auto ist nicht überall fahren";
        }
    }

}