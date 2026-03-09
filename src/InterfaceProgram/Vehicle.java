package InterfaceProgram;

public interface Vehicle
{
    void start();
}
class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println(" Car is Red in Colour and it is in Running Mode ");
    }
    public static void main(String[] args)
    {
        Car c = new Car();
        c.start();

    }
}
