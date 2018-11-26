/**
 * CLkw
 */
public class CLkw extends CAuto implements IFahrzeug {
    private int s_produced;

    private boolean m_anhaenger = false;


//--- Constructors ---
    public CLkw(){
        super();
    }


//--- getter and setter    
    public boolean getM_anhaenger(){
        return m_anhaenger;
    }

    public void setM_anhaenger(final boolean p_anhaenger){
        m_anhaenger = p_anhaenger;
    }

//--- interface methodes ---
@Override
public void schalte(int p_gang) {
    super.schalte(p_gang);
}
@Override
public void beschleunige(int p_inkrement) {
    super.beschleunige(p_inkrement);
}

@Override
public void bremse(int p_dekrement) {
    super.bremse(p_dekrement);
}

@Override
public String toString() {
    String haenger;
    if (m_anhaenger==false) {
        haenger = "nein";
    } else {
        haenger = "ja";
    }
    return super.toString() + "Anhaenger angehaengt: " + haenger;
}

@Override
public String asigneSerialnumber(int p_produced) {
    return super.asigneSerialnumber(p_produced);
}
}