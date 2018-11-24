package Abgabe4;

public class CMotorrad implements IFahrzeug {
	// --- definiere Eigenschaften ---

	private static final int MAX_BESCHLEUNIGUNG = 5;
	private static final int MAX_VERZOEGERUNG = 3;

	private static int s_id; // zähler für fz ids, initial 0

	// unveränderbare Eigenschaft durch final
	private final int m_motoradId;
	private final String m_farbe;
	private final String m_marke;
	private final int m_maxGeschwindigkeit;
	private final int m_anzahlGaenge;
	// Weitere Attribute f�r CMotorrad
	private final boolean m_umweltfreundlich;

	// veränderbare Eigenschaften
	private int m_aktGeschwindigkeit; // initial 0
	private int m_gang = 1; // aktueller Gang - hier wird ein Wert vorgegeben
	private int m_position; // hier merkt sich das Auto seine Position auf der Straße, initial 0
	// Ver�nderung
	private EMotoradTyp m_typ;

	public CMotorrad(final String p_farbe, final String p_marke, final int p_anzahlGaenge,
			final int p_maxGeschwindigkeit, final EMotoradTyp p_typ, final boolean p_umweltfreundlich) {
		m_farbe = p_farbe;
		m_marke = p_marke;
		m_anzahlGaenge = p_anzahlGaenge;
		m_maxGeschwindigkeit = p_maxGeschwindigkeit;
		m_typ = p_typ;
		m_umweltfreundlich = p_umweltfreundlich;
		m_motoradId = s_id++;
	}

	public int motoradId() {
		return m_motoradId;
	}

	public int getAktGeschwindigkeit() {
		return m_aktGeschwindigkeit;
	}

	public void incrementPosition(int p_inc) {
		m_position = p_inc > 0 ? m_position + p_inc : m_position;
	}

	public int getPosition() {
		return m_position;
	}

	public boolean getUmweltfreundlich() {
		return m_umweltfreundlich;
	}

	public EMotoradTyp getType() {
		return m_typ;
	}

	@Override
	public void schalte(final int p_gang) {
		m_gang = p_gang % (m_anzahlGaenge + 1);
		m_gang = m_gang < 0 ? 0 : m_gang;
	}

	@Override
	public void beschleunige(final int p_inkrement) {
		m_aktGeschwindigkeit += p_inkrement;
		m_aktGeschwindigkeit = m_aktGeschwindigkeit > m_maxGeschwindigkeit ? m_maxGeschwindigkeit
				: m_aktGeschwindigkeit;
	}

	@Override
	public void bremse(final int p_dekrement) {
		m_aktGeschwindigkeit -= p_dekrement;
		m_aktGeschwindigkeit = m_aktGeschwindigkeit < 0 ? 0 : m_aktGeschwindigkeit;
	}

	@Override
	public String toString() {
		return m_marke + " " + m_motoradId + ": Umweltfreundlich=" + String.valueOf(getUmweltfreundlich()) +"; Position=" + m_position + "; Speed=" + m_aktGeschwindigkeit;
	}

	@Override
	public boolean equals(Object o) {

		if (o == this)
			return true;
		if (!(o instanceof CAuto)) {
			return false;
		}

		CAuto auto = (CAuto) o;

		return auto.getAutoId() == m_motoradId;
	}

	@Override
	public int hashCode() {
		return Integer.valueOf(m_motoradId).hashCode();
	}
}
