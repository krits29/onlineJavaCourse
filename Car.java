/**
 * Created by kritisharma on 8/21/19.
 */
public class Car
{
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model)
    {
        String validModel = model.toLowerCase();
        if (validModel.equals("model x") || validModel.equals("model 3")) // use .equals to test whether a particular value of string is equal to another type
        {
            this.model = model; // use this. when referring to the variables identified initially
        }
        else
        {
            this.model = "unknown";
        }
    } // this is called a setter

    public String getModel()
    {
        return this.model;
    }
}
