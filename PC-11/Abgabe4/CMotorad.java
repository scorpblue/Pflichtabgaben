public class CMotorad implements IFahrzeug
{
    private final String m_farbe;
    private final String m_marke;
    private final int m_maxGeschwindigkeit;
    private final int m_anzahlGaenge;
    
    private double m_aktGeschwindigkeit;
    private int m_gang = 1;
    private int m_drehmoment = 0;

    public CMotorad()
    {
        this("gelb", "suziki", 350, 5);
    }
    
    public CMotorad(final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit)
    {
        m_farbe = p_farbe;
        m_marke = p_marke;
        m_anzahlGaenge = p_anzahlGaenge;
        m_maxGeschwindigkeit = p_maxGeschwindigkeit;
    }
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

 public int getDrehmoment()
 {
     return m_drehmoment;
 }
   //setter für drehmoment...
   public void setDrehmoment(int m_drehmoment)
   {
       this.m_drehmoment = m_drehmoment;
   }

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

   @Override
	public String toString() {
		String ausgabe ="Dies ist ein "+m_farbe+"es Motorrad der Marke "+m_marke+".\n";
		ausgabe = ausgabe + "Es hat "+m_anzahlGaenge+" Gaenge .\n";
		ausgabe = ausgabe + "Das Motorrad hat eine Spitzengeschwindigkeit von "+ m_maxGeschwindigkeit+"Km .\n";
		ausgabe = ausgabe + "Es faehrt aktuell "+m_aktGeschwindigkeit +"Km im "+ m_gang + ". Gang .\n";
		ausgabe = ausgabe + "Es hat aktuell einen Drehmoment von "+m_drehmoment+".\n";
		return ausgabe;
	}

}