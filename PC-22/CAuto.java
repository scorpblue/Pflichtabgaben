public class CAuto implements IFahrzeug {
  // --- definiere Eigenschaften ---

  // unveränderbare Eigenschaft durch final
  protected final String m_farbe;
  protected final String m_marke;
  protected final int m_maxGeschwindigkeit;
  protected final int m_anzahlGaenge;
  protected int m_leistungKW;
  protected static int s_anzahl = 0;
  protected final String m_seriennummer;

  // veränderbare Eigenschaften
  // aktuelle Geschwindigkeit - der Wert bei Java mit 0 automatisch belegt
  protected int m_aktGeschwindigkeit;
  // aktueller Gang - hier wird ein Wert vorgegeben
  protected int m_gang = 1;

  // --- definiere Methoden ---
  @Override
  public void schalte(final int p_gang) {
    m_gang = p_gang % (m_anzahlGaenge + 1);
    m_gang = m_gang < -1 ? -1 : m_gang;
  }

  @Override
  public void beschleunige(final int p_inkrement) {
    m_aktGeschwindigkeit += p_inkrement;
    m_aktGeschwindigkeit = m_aktGeschwindigkeit > m_maxGeschwindigkeit ? m_maxGeschwindigkeit : m_aktGeschwindigkeit;
    m_gang = m_aktGeschwindigkeit * (m_anzahlGaenge) / (m_maxGeschwindigkeit + 1) + 1;
    m_gang = m_gang < -1 ? -1 : m_gang;
  }

  @Override
  public void bremse(final int p_dekrement) {
    m_aktGeschwindigkeit -= p_dekrement;
    m_aktGeschwindigkeit = m_aktGeschwindigkeit < 0 ? 0 : m_aktGeschwindigkeit;
    m_gang = m_aktGeschwindigkeit * (m_anzahlGaenge + 1) / (m_maxGeschwindigkeit + 1);
    m_gang = m_gang < -1 ? -1 : m_gang;
  }

  public String getFarbe() {
    return m_farbe;
  }

  public CAuto get() {
    return new CAuto(m_farbe, m_marke, m_anzahlGaenge, m_maxGeschwindigkeit, m_leistungKW);
  }

  @Override
  public int getGeschwindigkeit() {
    return m_aktGeschwindigkeit;
  }

  @Override
  public int getMaxGeschwindigkeit() {
    return m_maxGeschwindigkeit;
  }

  public int getLeistungKW() {
    return m_leistungKW;
  }

  public double getPS() {
    return m_leistungKW * 1.36;
  }

  public void setLeistungKW(final int p_leistungKW) {
    m_leistungKW = p_leistungKW;
  }

  // Default-Konstruktor ohne Parameter
  public CAuto() {
    // ruft den Konstruktor mit Parametern auf
    this("rot", "VW", 5, 250, 100);
  }

  // Konstruktor mit Parametern
  public CAuto(final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit,
      final int p_leistungKW) {
    m_farbe = p_farbe;
    m_marke = p_marke;
    m_anzahlGaenge = p_anzahlGaenge;
    m_maxGeschwindigkeit = p_maxGeschwindigkeit;
    m_leistungKW = p_leistungKW;
    m_seriennummer = Integer.toString(s_anzahl / 10) + "-" + Integer.toString(s_anzahl % 10);
    s_anzahl++;
  }

  // statische Methode, um die Anzahl der Autos zu erhalten
  public static int getAnzahl() {
    return s_anzahl;
  }

  // Methode des Autos, um die individuelle Seriennummer zu erhalten
  @Override
  public String getSeriennummer() {
    return m_seriennummer;
  }

  public static void main(String[] p_args) {
    CAuto auto1 = new CAuto("gruen", "vw", 8, 200, 100);
    System.out.println(auto1.getAnzahl());
    System.out.println(auto1.getSeriennummer());
    // auto1.beschleunige(200);
    // System.out.println(auto1.m_gang+"\n"+auto1.m_aktGeschwindigkeit);

    int i = 0;
    while (i <= auto1.m_maxGeschwindigkeit) {

      System.out.println(auto1.m_aktGeschwindigkeit + "  " + auto1.m_gang);
      auto1.beschleunige(1);
      i++;
    }

  }
}
