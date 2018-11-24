package Abgabe4;

public class CLkw extends CAuto {

	private final int m_anzahlReifen;

	public CLkw(final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit,
			final int p_anzahlReifen) {
		super(p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit, EAutoTyp.TRUCK);
		m_anzahlReifen = p_anzahlGaenge;
	}

	public int getAnzahlReifen() {
		return m_anzahlReifen;
	}

	@Override
	public String toString() {
		return "LKW " + getAutoId() + ": Anzahl Reifen=" + getAnzahlReifen() + "; Position=" + getPosition()
				+ "; Speed=" + getAktGeschwindigkeit();
	}
}
