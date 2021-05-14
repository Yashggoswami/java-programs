package infytq;

public class Demo {
    public static void main(String[] args) {
        String msg1="Pheonix";
        String msg2="Jack And Jill";
        String characters="";

        for(int i=0;i<msg1.length();i++)
        {
            for(int j=0;j<msg2.length();j=j+2)
            {
                if(msg1.charAt(i)==msg2.charAt(j) && msg1.charAt(i)!=' ')
                {
                    if(!characters.contains(msg1.charAt(i)+" ")){
                        characters+=" "+msg1.charAt(i);
                        break;
                    }
                }
            }
        }

        if(characters!="")
            System.out.println(characters);
        else
            System.out.println(-1);
    }
}
