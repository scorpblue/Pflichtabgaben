
public class CMotorrad implements IFahrzeug
{
// unveränderbare Eigenschaften
  private final String m_marke;
  private final String m_farbe;
  private final int m_maxGeschwindigkeit;
 

// veränderbare Eigenschaften
protected int m_aktGeschwindigkeit; // initial 0
protected int m_gang = 1; // aktueller Gang - hier wird ein Wert vorgegeben
protected int m_position; // hier merkt sich das Auto seine Position auf der Straße, initial 0

  public CMotorrad ()
  {
      this("Honda", "Schwarz", 80);
   }

   public CMotorrad(final String p_marke, final String p_farbe, final int p_maxGeschwindigkeit)
   {
       m_marke = p_marke;
       m_farbe = p_farbe;
       m_maxGeschwindigkeit = p_maxGeschwindigkeit;
   }

   public int getAktGeschwindigkeit()
   {
       return m_aktGeschwindigkeit;
   }
   public int getGang ()
   {
       return m_gang;
   }
   public int getPosition ()
   {
       return m_position;
   }

   @Override
   public void schalte ( final int p_gang )
   {

   }
   @Override
   public void beschleunige( final int p_inkrement )
   {

   }
   @Override
   public void bremse( final int p_dekrement )
   {

   }
   @Override
    public String toString(){
        return "CMotorrad: " + m_marke + " " + m_farbe + "" + m_maxGeschwindigkeit;
    }



}