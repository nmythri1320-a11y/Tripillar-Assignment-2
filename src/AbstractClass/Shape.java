package AbstractClass;

abstract class Shape
{
    abstract void display();
}
class Circle extends Shape
{
    @Override
    void display()
    {
        System.out.println(" This is a Circle shape ");
    }
    public static void main(String[] args)
    {
        Circle c = new Circle();
        c.display();
    }
}

