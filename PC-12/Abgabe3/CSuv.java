public class CSuv extends CAuto {
	private final boolean m_offroadFahrbar;

	public CSuv() {
		// ruft den SUV Konstruktor auf
		this("rot", "VW", 5, 250, false);
	}

	public CSuv(final boolean p_offroadFahrbar) {
		// ruft den SUV Konstruktor auf
		this("rot", "VW", 5, 250, p_offroadFahrbar);
	}

	public CSuv(final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit,
			final boolean p_offroadFahrbar) {
		// Aufruf des Konstruktur von CAuto
		super(p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit, EAutoTyp.SUV);
		m_offroadFahrbar = p_offroadFahrbar;
	}
}
