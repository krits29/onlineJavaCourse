public class NumberOfDaysInMonth
{
    public static boolean isLeapYear(int year)
    {
        if (year <= 0 || year > 9999)
        {
            System.out.println("Sorry that's not a valid year");
            return false;
        }
        else if(((year % 4 == 0 && !(year % 100 == 0))) || (year % 400 == 0))
        {
            System.out.println("it's a leap year");
            return true;
        }
        else
        {
            System.out.println("not a leap year");
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year)
    {
        if (month < 1 || month > 12)
        {
            System.out.println("Sorry, that's not a valid month");
            return -1;
        }
        else if (year <= 0 || year > 9999)
        {
            System.out.println("sorry that's not a valid year");
            return -1;
        }
        else
        {
            if (isLeapYear(year) == false)
            {
                switch (month)
                {
                    case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                        System.out.println(31);
                        return 31;

                    case 2:
                        System.out.println(28);
                        return 28;


                    case 4:case 6:case 9:case 11:
                        System.out.println(30);
                        return 30;


                }
            }

            else
            {
                switch (month)
                {
                    case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                        System.out.println(31);
                        return 31;


                    case 2:
                        System.out.println(29);
                        return 29;


                    case 4:case 6:case 9:case 11:
                        System.out.println(30);
                        return 30;


                }
            }

            return -1;
        }

    }
}
