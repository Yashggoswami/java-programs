package infytq;

import java.util.*;
public class Demo9 {

    public static void main(String[] args) {
        String str="HelLoWOrld";
        String result="";
        TreeMap<Character,String> map=new TreeMap<>();

        for(int i=0;i<str.length();i++)
            map.put(Character.toLowerCase(str.charAt(i)),map.getOrDefault(Character.toLowerCase(str.charAt(i)),"")+str.charAt(i));
        
        String[] st=map.values().toArray(new String[map.size()]);

        for(int i=0;i<st.length/2;i++)
        {
            result+=st[i]+st[st.length-1-i];
        }

        result+=st[st.length/2];
        //dWerHoOlLl

        System.out.println(result);
}
}
