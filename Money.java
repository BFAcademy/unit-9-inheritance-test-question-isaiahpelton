public class Money
{
    private double value;
    public Money(double value)
    {
        this.value = value;
    }
    
    public double getAmount()
    {
        return value;
    }
}

class Coin extends Money
{
    private String name;
    public Coin(String name ,double value)
    {
        super(value);
        this.name = name;
    }

    public String toString()
    {
        return name;
    }

    public boolean get(Coin coin)
    {
        if (coin == null)
        {
            return false;
        }
        Coin c = (Coin) coin;
        return(c.getAmount() == value);
    }
}

class Bill extends Money
{
    public Bill(double value)
    {
        super(value);
    }

    public String toString()
    {
        return "$" + value; 
    }
}

class Quarter extends Coin
{
    public Quarter(String name, double value)
    {
        super("quarter", 0.25);
    }
}
class Nickel extends Coin
{
    public Nickel(String name, double value)
    {
        super("nickel",0.10);
    }
}
class Dime extends Coin
{
    public Dime(String name, double value)
    {
        super("dime",0.05);
    }
}
