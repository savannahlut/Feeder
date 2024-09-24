public class Main 
{
    public static void main (String[] args)
    {
        Feeder j = new Feeder(0); 
        System.out.println(j.simulateManyDays(5, 10));
        Feeder g = new Feeder(250); 
        System.out.println(g.simulateManyDays(10, 5));
        Feeder i = new Feeder(2400); 
        System.out.println(i.simulateManyDays(10, 4));
    }
}