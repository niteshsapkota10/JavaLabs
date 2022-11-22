package threading;

public class MultiThreading extends Thread{
    public void run(){
        try{
            Thread.sleep(500);
            System.out.println("Thread ID :: "+Thread.currentThread().getId());
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}
