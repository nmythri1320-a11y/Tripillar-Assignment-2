package Module05;

public class LifeCycleDemo extends Thread
{
    public void run() {
        System.out.println("Thread running");
    }

    public static void main(String[] args) {
        LifeCycleDemo t = new LifeCycleDemo();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
    }
}
