public class CMotorrad implements IFahrzeug
{
    private final boolean m_zweiRad;
    private final int m_maxGeschwindigkeit;
    private final int m_anzahlGaenge;
    private int m_aktGeschwindigkeit;
    private int m_gang;

    public CMotorrad()
    {
        this( false, 200 , 6);
    }
     public CMotorrad(final boolean p_zweiRad, final int p_maxGeschwindigkeit, final int p_anzahlGaenge){
         m_zweiRad = p_zweiRad;
         m_maxGeschwindigkeit = p_maxGeschwindigkeit;
         m_anzahlGaenge = p_anzahlGaenge;
     }
   
     public int getGeschwindigkeit() {
         return m_aktGeschwindigkeit;
     }
     
     public int getGang(){
         return m_gang;
     }
public boolean getZweirad(){
    return m_zweiRad;
}

    @Override
    public String toString() {
        String s = "Ist zweirad: " + m_zweiRad;
        s += "Geschwindigkeit" + m_aktGeschwindigkeit;
        return s;
    }
}