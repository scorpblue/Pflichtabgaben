public class CAuto implements IFahrzeug {

//--- Klasseneingenschaften ---
    private static int s_produced = 0;

//--- unveraenderbare Eigenschaft ---  
    private final String m_farbe;
    private final String m_marke;
    private final int m_maxGeschwindigkeit;
    private final int m_anzahlGaenge;
    private final int m_kw;
    private final String m_serialnumber;

      
//--- veraenderbare Eigenschaften ---
    // aktuelle Geschwindigkeit - der Wert bei Java mit 0 automatisch belegt
    private int m_aktGeschwindigkeit;
    
    
    // aktueller Gang - hier wird ein Wert vorgegeben
    private int m_gang = 1;
      
    
//--- Constuctor
    // Default-Konstruktor ohne Parameter
    public CAuto()
    {
      // ruft den Konstruktor mit Parametern auf
      this( "rot", "VW", 5, 250, 90);
    }
      

    // Konstruktor mit Parametern
    public CAuto( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final int p_kw)
    {
        s_produced += 1;

        m_farbe = p_farbe;
        m_marke = p_marke;
        m_anzahlGaenge = p_anzahlGaenge;
        m_maxGeschwindigkeit = p_maxGeschwindigkeit;
        m_kw = p_kw;

        m_serialnumber = asigneSerialnumber(s_produced);
    }



//--- getter and setter
    /**
     * @return the s_produced
     */
    public static int getS_produced() {
        return s_produced;
    }


    /**
     * @return the m_farbe
     */
    public String getM_farbe() {
        return m_farbe;
    }


    /**
     * @return the m_marke
     */
    public String getM_marke() {
        return m_marke;
    }


    /**
     * @return the m_maxGeschwindigkeit
     */
    public int getM_maxGeschwindigkeit() {
        return m_maxGeschwindigkeit;
    }


    /**
     * @return the m_anzahlGaenge
     */
    public int getM_anzahlGaenge() {
        return m_anzahlGaenge;
    }


    /**
     * @return the m_kw
     */
    public int getM_kw() {
        return m_kw;
    }


    /**
     * @return the m_aktGeschwindigkeit
     */
    public int getM_aktGeschwindigkeit() {
        return m_aktGeschwindigkeit;
    }


    /**
     * @param m_aktGeschwindigkeit the m_aktGeschwindigkeit to set
     */
    public void setM_aktGeschwindigkeit(int m_aktGeschwindigkeit) {
        this.m_aktGeschwindigkeit = m_aktGeschwindigkeit;
    }


    /**
     * @return the m_gang
     */
    public int getM_gang() {
        return m_gang;
    }


    /**
     * @param m_gang the m_gang to set
     */
    public void setM_gang(int m_gang) {
        this.m_gang = m_gang;
    }


//--- interface methodes
    /**
    * @param p_gang
    */
    @Override
    public void schalte( final int p_gang ){
        m_gang = p_gang % (m_anzahlGaenge + 1);
        m_gang = m_gang < 0 ? 0 : m_gang;
        beschleunige(10);
    }


    /**
     * @param p_inkrement
     */
    @Override
    public void beschleunige( final int p_inkrement ){
        m_aktGeschwindigkeit += p_inkrement;
        m_aktGeschwindigkeit = m_aktGeschwindigkeit > m_maxGeschwindigkeit ? m_maxGeschwindigkeit : m_aktGeschwindigkeit;
    }


    /**
     * @param p_dekrement
     */
    @Override
    public void bremse( final int p_dekrement ){
        m_aktGeschwindigkeit -= p_dekrement;
        m_aktGeschwindigkeit = m_aktGeschwindigkeit < 0 ? 0 : m_aktGeschwindigkeit;
    }


//--- definiere Methoden ---
    /**
     * calculaded the HP of the Car
     * @return
     */
    public double getPS() {
        return m_kw * 1.36;
        
    }

    /**
     * creates a String, that show's the amount of produced cars in this form x-x-x-x 
     */ 
    public String asigneSerialnumber (int p_produced) {
        String serial = "";
        String produced = Integer.toString(p_produced);
        for (int i = 0; i < produced.length(); i++) {
            String temp = Character.toString(produced.charAt(i));
            temp = temp.concat("-");
            serial = serial.concat(temp);
        }
        
        if (p_produced < 10) {
            String n0ll = "0-";
            serial = n0ll.concat(serial);
        }
        serial = serial.substring(0, serial.length()-1);
        return serial;
    }

    /**
     * returns all values of fixed and adjustable variable in one line of text
     */
    @Override
    public String toString() {
        return "Farbe: " + m_farbe + " Marke: "  + m_marke +" MaxSpeed: " + m_maxGeschwindigkeit + " aktSpeed: " + m_aktGeschwindigkeit + " gaenge: " + m_anzahlGaenge + " aktgang: " + m_gang + " kw: " + m_kw + " Seriennummer " + m_serialnumber;  
    }
}
