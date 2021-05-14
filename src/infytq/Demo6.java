package infytq;

public class Demo6 {
    public static void main(String[] args) {
        int endnum;

        for(endnum=3;endnum<=9;endnum++){
            if(endnum>6)
                continue;
        }
        System.out.println(endnum);
        for(int startnum=0;startnum<endnum;startnum++){
            endnum--;
            if(endnum<6)
            {break;
            }
            
            System.out.print(startnum+" "+endnum+" ");
           
        }
    }
    
}
