package StaticUsage;

public class StaticEx
{
    static int count = 0;
    static  void display()
    {
        count++;
        System.out.println(" Count: "+ count);
    }
    public static void main(String[] args) {
        StaticEx.display();
    }
}
