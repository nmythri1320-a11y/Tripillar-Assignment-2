package Module05;

import java.io.IOException;

public class ThrowsDemo
{
    static void check() throws IOException {
        throw new IOException("IO Exception...");
    }

    public static void main(String[] args) throws IOException {
        check();
    }
}
