public class Main 
{
    public static void main (String[] args)
    {
        Feeder a = new Feeder(500);
        a.simulateOneDay(12);
        System.out.println(a);
        Feeder b = new Feeder(1000);
        b.simulateOneDay(22);
        System.out.println(b);
        Feeder c = new Feeder(100);
        c.simulateOneDay(5);
        System.out.println(c);

        Feeder j = new Feeder(0); 
        System.out.println(j.simulateManyDays(5, 10));
        Feeder g = new Feeder(250); 
        System.out.println(g.simulateManyDays(10, 5));
        Feeder i = new Feeder(2400); 
        System.out.println(i.simulateManyDays(10, 4));
    }
}