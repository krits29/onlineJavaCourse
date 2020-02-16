/**
 * Created by kritisharma on 2/16/20.
 */
public class DeskPhone implements ITelephone
{
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber)
    {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn()
    {
        System.out.println("Not available");  //still need to have this method even thoutgh it is not applicable
    }                                         //because is is implementing the interface so it needs all the methods

    @Override
    public void dial(int phoneNumber)
    {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer()
    {
        if (isRinging)
        {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber)
    {
        if (phoneNumber == myNumber)
        {
            isRinging = true;
            System.out.println("Ring ring ring");
        }
        else
        {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging()
    {
        return isRinging;
    }
}

