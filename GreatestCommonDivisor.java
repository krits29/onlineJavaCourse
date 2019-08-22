/**
 * Created by kritisharma on 8/20/19.
 */
public class GreatestCommonDivisor
{
    public static void main(String[] args)
    {
        getGreatestCommonDivisor(12, 16);
    }

    public static int getGreatestCommonDivisor (int first, int second)
    {
        if ( first < 10 || second < 10 )
        {
            System.out.println("Please use a number that is greater than 10");
            return -1;
        }

        while ( first > 0 && second > 0 )
        {
            if (second % first == 0)
            {
                System.out.println(first);
                return first;
            }
            else if (first % second == 0)
            {

                System.out.println(second);
                return second;
            }

            if ( first > second )
            {
                if (second % 2 != 0)
                {
                    if ( second % 3 == 0 )
                    {
                        second = second / 3;
                    }
                    else if ( second % 3 != 0)
                    {
                        if ( second % 5 == 0)
                        {
                            second = second / 5;
                        }
                        else if ( second % 5 != 0 )
                        {
                            if ( second % 7 == 0)
                            {
                                second = second / 7;
                            }
                            else if ( second % 7 != 0 )
                            {
                                if ( second % 11 == 0 )
                                {
                                    second = second / 11;
                                }
                            }
                        }
                    }
                }
                else
                {
                    second = second / 2;
                }

            }
            else if ( second > first )
            {
                if (first % 2 != 0)
                {
                    if ( first % 3 == 0 )
                    {
                        first = first / 3;
                    }
                    else if ( first % 3 != 0)
                    {
                        if ( first % 5 == 0)
                        {
                            first = first / 5;
                        }
                        else if ( first % 5 != 0 )
                        {
                            if ( first % 7 == 0)
                            {
                                first = first / 7;
                            }
                            else if ( first % 7 != 0 )
                            {
                                if ( first % 11 == 0 )
                                {
                                    first = first / 11;
                                }
                            }
                        }
                    }
                }
                else
                {
                    first = first / 2;
                }
            }


        }

        System.out.println("not sure what just happened");
        return -1;
    }
}
