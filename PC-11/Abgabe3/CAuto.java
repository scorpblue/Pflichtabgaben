public class CAuto implements IFahrzeug
{
 // Eigenschaften von CAuto

 private final String m_farbe;
 private final String m_marke;
 private final int m_maxGeschwindigkeit;
 private final int m_anzahlGaenge;
 
 private double m_aktGeschwindigkeit;
 private int m_gang = 1;

 //konstruktor ohne Parameter

 public CAuto()
 {
     this("blau", "dodge", 300, 5);
 }

 //konstruktor mit Parameter

 public CAuto( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit)
 {
     m_farbe = p_farbe;
     m_marke = p_marke;
     m_anzahlGaenge = p_anzahlGaenge;
     m_maxGeschwindigkeit = p_maxGeschwindigkeit;
 }

 //Methoden

 @Override
 public void schalte(final String p_gang)
 {
     if (p_gang.equals("R") || p_gang.equals("N"))
     {
         if(p_gang.equals("R")){
             m_gang = -1 %(m_anzahlGaenge +1);
             m_gang = m_gang < -1 ? 0 :m_gang;
         }
         else{
             m_gang = 0;
             m_gang = m_gang < -1 ? 0 : m_gang;
         }
     }
     else{
         m_gang = Integer.parseInt(p_gang) % (m_anzahlGaenge + 1);
         m_gang = m_gang < -1 ? 0 : m_gang;
     }
 }
 @Override
 public void beschleunige( final double p_inkriment)
 {
     m_aktGeschwindigkeit += p_inkriment;
     m_aktGeschwindigkeit = (int)m_aktGeschwindigkeit > m_aktGeschwindigkeit ? m_maxGeschwindigkeit : m_aktGeschwindigkeit;
 }

 @Override
 public void bremse(final int p_dekrement)
 {
     m_aktGeschwindigkeit -= p_dekrement;
     m_aktGeschwindigkeit = m_aktGeschwindigkeit < 0 ? 0 : m_aktGeschwindigkeit;
 }
 
  //Getter für die werte

 public String getFarbe()
 {
     return m_farbe;
 }
 public String getMarke()
 {
     return m_marke;
 }
 public int getMaxGang()
 {
     return m_anzahlGaenge;
 }
 public double getGeschwindigkeit()
 {
     return m_aktGeschwindigkeit;
 }
 public int getMaxgeschwindigkeit()
 {
     return m_maxGeschwindigkeit;
 }

}