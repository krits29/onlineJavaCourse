/**
 * Created by kritisharma on 2/16/20.
 */
public class MobilePhone implements ITelephone
{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber)
    {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn()
    {
        isOn = true;
        System.out.println("Mobile phone is on");
    }

    @Override
    public void dial(int phoneNumber)
    {
        if(isOn)
        {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        }
        else
        {
            System.out.println("Mobile phone is off");
        }
    }

    @Override
    public void answer()
    {
        if (isRinging)
        {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber)
    {
        if (phoneNumber == myNumber && isOn)
        {
            isRinging = true;
            System.out.println("Rrrring rrrring rrrring");
        }
        else
        {
            isRinging = false;
            System.out.println("Something went wrong");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging()
    {
        return isRinging;
    }
}
