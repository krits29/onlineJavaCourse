/**
 * Created by kritisharma on 2/16/20.
 */
public class InterfacesTest
{
    public static void main(String[] args)
    {
        ITelephone myPhone = new DeskPhone(123456);
        myPhone.powerOn();
        myPhone.callPhone(123456);
        myPhone.answer();

        myPhone = new MobilePhone(24565);
        myPhone.powerOn();
        myPhone.callPhone(24565);
        myPhone.answer();
    }
}
