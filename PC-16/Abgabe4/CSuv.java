public class CSuv extends CAuto{

//--- fixed fields ----
    private final boolean m_offroadFahrbar;

//--- constructors ---
  public CSuv()
  {
    // ruft den SUV Konstruktor auf
    this( "rot", "VW", 5, 250, 110, false );
  }

  public CSuv( final boolean p_offroadFahrbar )
  {
    // ruft den SUV Konstruktor auf
    this( "rot", "VW", 5, 250, 110, p_offroadFahrbar );
  }

  public CSuv( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final int p_kw,final boolean p_offroadFahrbar )
  {
    // Aufruf des Konstruktur von CAuto
    super( p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit , p_kw);
    m_offroadFahrbar = p_offroadFahrbar;

  }

  //--- Getter and Setter ---

  public boolean getM_offroadFahrbar(){
    return m_offroadFahrbar;
  }
    
    /**
     * @Override
     * creates a String, that show's the amount of produced cars in this form y-y-y-x, where y is a decimal digit and x is an roman number
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
      int c = Character.getNumericValue(serial.charAt(serial.length()-1));
      serial = serial.substring(0, serial.length()-1);

      switch (c) {
        case 0:
        serial = serial.concat("O");
        break;

        case 1:
          serial = serial.concat("I");
          break;

        case 2:
          serial = serial.concat("II");
          break;
      
        case 3:
          serial = serial.concat("III");
          break;

        case 4:
          serial = serial.concat("IV");
          break;

        case 5:
          serial = serial.concat("V");
          break;

        case 6:
          serial = serial.concat("VI");
          break;

        case 7:
          serial = serial.concat("VII");
          break;

        case 8:
          serial = serial.concat("VIII");
          break;

        case 9:
          serial = serial.concat("IX");
          break;

      }
      return serial;
  }
}