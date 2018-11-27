class CSeriennr
{   
    
    private String vSerial;

public CSeriennr(int pSerial)
{
   // int test = 0; //Eingabewert der gesplittet wird
        String str = ""; //leerer strin g initialisieren
        if (String.valueOf(pSerial).length() == 1) //wenn der int-wert nur 1 digit hat, dann mache
        {
            str = "0-" + pSerial;
            System.out.println(str);
        }
        else
        {
            int max = String.valueOf(pSerial).length();//max ist der maximalwert für den zähler = anzahl an digits im int
            for (int i = 1; i <= max ;i++)
            {
                 int temp = pSerial % 10;//Rest aus Wert
                 pSerial = pSerial/10;//niedrigste zahl wird entfernt
                str = String.format("%d", temp) + str;//der string wird aneinander gehängt
                if (i!=max)//wenn i noch nicht max erreicht hat, füge immer ein - vor den string
                {
                    str = "-" + str;
                }
            }
        }
        vSerial = str;
}

public String getvSerial()
{
    return vSerial;
}
    }