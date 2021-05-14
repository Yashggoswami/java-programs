package infytq;
class parent{
    protected int pid=0;
    protected static String pstr="p";
    parent(){
        this.pid++;
        parent.pstr+='p';
    }
    protected void display(){
        System.out.println(this.pid+" "+parent.pstr);
    }

}
class child extends parent{
    protected int cid;
    protected static String str="c";
    child(){
        this.cid++;
        this.str+=this.pstr;
    }
    protected void display(){
        super.display();
        System.out.println(this.cid+" "+child.str);
    }
    
}
public class Demo7 extends child {
    protected int did;
    protected static String dstr="g";
    Demo7(){
        this.did++;
        Demo7.dstr+=child.str+parent.pstr;
    }
    protected void display(){
        super.display();
        System.out.println(this.did+" "+Demo7.dstr);
    }

    public static void main(String[] args) {
        parent p=new Demo7();
        p.display();
    }
    
}
