import java.util.Arrays;

public class R192224265{
  public static void main(String[] args){
    int [] arr = {14,13,2,32};
    Arrays.sort(arr);
    String n = Arrays.toString(arr);
    System.out.println(n);
    System.out.println("the 1st Maximum num is "+arr[arr.length - 1]);
    System.out.println("the 3rd minimum num is "+arr[2]);
    int a = arr[arr.length - 1];
    int b = arr[2];
    int sum = a+b;
    int diff = a-b;
    System.out.println("the sum is "+sum);
    System.out.println("the difference is " + diff);
    
  }
}
