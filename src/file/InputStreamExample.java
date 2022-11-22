package file;
import java.io.*;
public class InputStreamExample {
    public static void main(String[] args) throws IOException{
        FileInputStream inputStream=null;
        FileOutputStream fileOutputStream=null;
        try{
            inputStream=new FileInputStream("src\\file\\input.txt");
            fileOutputStream=new FileOutputStream("src\\file\\output.txt");
            int a;
            while((a= inputStream.read())!=-1){
                fileOutputStream.write(a);
            }
        }finally {
            inputStream.close();
            fileOutputStream.close();
        }

    }
}
