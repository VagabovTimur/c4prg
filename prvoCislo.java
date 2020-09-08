class prvoCislo
{
    public static void main (String[] args)
    {
        int i =0;
        int a =0;
        String  prvocislo = "";

        for (i = 1; i <= 100; i++)
        {
            int soucet=0;
            for(a =i; a>=1; a--)
            {
                if(i%a==0)
                {
                    soucet = soucet + 1;
                }
            }
            if (soucet ==2)
            {

                prvocislo = prvocislo + i + " ";
            }
        }
        System.out.println("Prvocisla od 1 do 100 jsou :");
        System.out.println(prvocislo);
    }
