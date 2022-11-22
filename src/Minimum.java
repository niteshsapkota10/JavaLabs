//package assignments.minimum;
public class Minimum {
    public static void main(String[] args){
        System.out.println("threading.Hello World");
        int[] numbers={10,8,9,7,6,5,4,3,2,1};
        System.out.println("Minimum of Given Array :: "+getMinimum(numbers));
    }
    static int getMinimum(int[] numbers){
        int min=numbers[0];
        for(int i: numbers){
            if(i<min)
                min=i;
        }
        return min;
    }
}
