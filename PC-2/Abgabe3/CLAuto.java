
public class CLAuto implements IFahrzeug
{
        private static int s_anzahl;
        private final int m_seriennummer;


        private final String m_farbe;
        private final String m_marke;
        private final int m_maxGeschwindigkeit;
        private final int m_anzahlGaenge;

        private int m_aktuelleGeschwindigkeit;
        private int m_gang;

        public CLAuto()
        {
            this ("gruen", "Chevrolet", 4, 193);
        }

        public CLAuto (final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit)
        {
            m_farbe = p_farbe;
            m_marke = p_marke;
            m_anzahlGaenge = p_anzahlGaenge;
            m_maxGeschwindigkeit = p_maxGeschwindigkeit;


            m_seriennummer = s_anzahl;
            s_anzahl++;
        }

        @Override
        public void schalte( final int p_gang )
        {
            m_gang = p_gang % (m_anzahlGaenge + 1);
            m_aktuelleGeschwindigkeit = m_gang < 0 ? 0 : m_gang;
        }

        @Override
        public void beschleunige( final int p_inkrement)
        {
            m_aktuelleGeschwindigkeit += p_inkrement;
            m_aktuelleGeschwindigkeit = m_aktuelleGeschwindigkeit > m_maxGeschwindigkeit ? m_maxGeschwindigkeit : m_aktuelleGeschwindigkeit;
        }

        @Override
        public void bremse( final int p_dekrement)
        {
            m_aktuelleGeschwindigkeit -= p_dekrement;
            m_aktuelleGeschwindigkeit = m_aktuelleGeschwindigkeit < 0 ? 0 : m_aktuelleGeschwindigkeit;
        }
        public static int getAnzahl()
        {
            return s_anzahl;
        }

        public String getSeriennummer()
        {
            int teiler = 10;
            int zwei = m_seriennummer % teiler;
            int eins = (m_seriennummer - zwei)/ teiler;
            String ausgabe =  eins + "-" + zwei ;
            
            return ausgabe;
            
            
        }

        public int getGang()
        {
            return m_gang;

        }
        public static void main (final String[] p_args )

        {
            final CLAuto l_auto1 = new CLAuto ("gruen", "Chevrolet", 4, 193);
            final CLAuto l_auto2 = new CLAuto ("gruen", "Chevrolet", 4, 193);
            final CLAuto l_auto3 = new CLAuto ("gruen", "Chevrolet", 4, 193);
            final CLAuto l_auto4 = new CLAuto ("gruen", "Chevrolet", 4, 193);
            final CLAuto l_auto5 = new CLAuto ("gruen", "Chevrolet", 4, 193);
            final CLAuto l_auto6 = new CLAuto ("gruen", "Chevrolet", 4, 193);
            final CLAuto l_auto7 = new CLAuto ("gelb", "Ford", 6, 290);
            final CLAuto l_auto8 = new CLAuto ("gelb", "Ford", 6, 290);
            final CLAuto l_auto9 = new CLAuto ("gelb", "Ford", 6, 290);
            final CLAuto l_auto10 = new CLAuto ("gelb", "Ford", 6, 290);
            final CLAuto l_auto11 = new CLAuto ("gelb", "Ford", 6, 290);
            final CLAuto l_auto12 = new CLAuto ("gelb", "Ford", 6, 290);
        


           
            System.out.println ("Seriennummer von Auto 1: " + l_auto1.getSeriennummer());
            System.out.println ("Seriennummer von Auto 2: " + l_auto2.getSeriennummer());
            System.out.println ("Seriennummer von Auto 3: " + l_auto3.getSeriennummer());
            System.out.println ("Seriennummer von Auto 4: " + l_auto4.getSeriennummer());
            System.out.println ("Seriennummer von Auto 5: " + l_auto5.getSeriennummer());
            System.out.println ("Seriennummer von Auto 6: " + l_auto6.getSeriennummer());
            System.out.println ("Seriennummer von Auto 7: " + l_auto7.getSeriennummer());
            System.out.println ("Seriennummer von Auto 8: " + l_auto8.getSeriennummer());
            System.out.println ("Seriennummer von Auto 9: " + l_auto9.getSeriennummer());
            System.out.println ("Seriennummer von Auto 10: " + l_auto10.getSeriennummer());
            System.out.println ("Seriennummer von Auto 11: " + l_auto11.getSeriennummer());
            System.out.println ("Seriennummer von Auto 12: " + l_auto12.getSeriennummer());

            System.out.println("Auto ist in Gang: " + l_auto1.getGang());

      }
    
}
