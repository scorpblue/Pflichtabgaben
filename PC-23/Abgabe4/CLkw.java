public class CLkw extends CAuto
{
    public final int m_tragLast;

    public CLkw()
    {
        this( "rot", "VW", 5, 250, false , 100 );
    }
    public CLkw(final int p_tragLast )
    {
        this( "rot", "VW", 5, 250, false, p_tragLast);
     
    }
    public CLkw( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final boolean p_offroadFahrbar , final int p_tragLast)
    {
        super( p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit, p_offroadFahrbar, p_tragLast);
        m_tragLast = p_tragLast;
    }
    public int getTraglast(){
        return m_tragLast;
    }
    @Override
    public String toString() {
        String s = "Ist zweirad: " + m_zweiRad;
        return s;}
}