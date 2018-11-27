public class CBike implements IFahrzeug {
    private final int m_hubraum;
    public CBike(int p_hubraum)
    {m_hubraum = p_hubraum;}
    public void schalte( final int p_gang )
    {}
    public void beschleunige( final int p_inkrement )
    {}
    public void bremse( final int p_dekrement )
    {}
    public int getHubraum(){
        return m_hubraum;}
    }