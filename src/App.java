import java.io.*;
import java.util.*;
public class App {
    public static void main(String[] args) throws IOException {
        
        Scanner sc=new Scanner(System.in);
        // FileOutputStream file=new FileOutputStream("D:/write.txt");
        // String s=sc.nextLine();
        // byte[] b=s.getBytes();
        // file.write(b);
        // file.flush();
        // file.close();
        // System.out.println("success");
        try{
            File file=new File("D:/write.txt");
            OutputStream out=new FileOutputStream(file);
            BufferedOutputStream bf=new BufferedOutputStream(out);
            String st=sc.nextLine();
            bf.write(st.getBytes(),(int)file.length(),st.getBytes().length);
            bf.flush();
            bf.close();
            out.close();
            InputStream in=new FileInputStream(file);
            BufferedInputStream bin=new BufferedInputStream(in);
            byte[] b=new byte[(int)file.length()];
            bin.read(b);
            String str=new String(b);
            System.out.println(str);
            bin.close();
            in.close();
        }catch(NullPointerException e){
                System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
       
    }
}
