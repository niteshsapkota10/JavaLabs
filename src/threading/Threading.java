package threading;

public class Threading {
    public static void main(String[] args){
        Hello h1=new Hello();
        Hi h2=new Hi();
        h1.start();
        h2.start();
    }
}
class Hello extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("threading.Hello!");
            try{Thread.sleep(1000);}catch (Exception ex){}
        }
    }
}
class Hi extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("threading.Hi!");
            try{Thread.sleep(1000);}catch (Exception ex){};
        }
    }
}
