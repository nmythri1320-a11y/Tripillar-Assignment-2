package StringTypesProgram;

public class StringTypesDemo
{
    public  static void main(String[]s )
    {
        String st = "Sapthagiri";
        StringBuilder sb = new StringBuilder("HELLO");
        StringBuffer sbf = new StringBuffer("NEW");

        st.concat(" College");
        sb.append(" World");
        sbf.append(" CAR");

        System.out.println(st);
        System.out.println(sb);
        System.out.println(sbf);
    }
}

