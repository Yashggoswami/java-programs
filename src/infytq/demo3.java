package infytq;

public class demo3 {
    public static String function(String str){
        int num=0;
        String vowels="aeiou";
        String outString="";
        while(num!=str.length()){
            if((str.length()%2==0) || vowels.contains(""+str.charAt(num)))
                outString+=str.charAt(num);
            outString+=function(str.substring(++num));
            break;
        }

        return outString;
    }
    public static void main(String[] args) {
        String str="Epoch";
        String outStr1=function(str);
        System.out.println(outStr1);
    }
}
