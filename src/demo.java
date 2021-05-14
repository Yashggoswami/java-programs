import java.lang.Integer;
import java.util.*;
public class demo{
    public static void main(String[] args)
    { List<Boolean> list=new ArrayList<>();

        list.add(true);
        list.add(Boolean.parseBoolean("FaLSe"));
        list.add(Boolean.TRUE);

        for(boolean b:list)
        {
            System.out.println(b);
        }
    }
}