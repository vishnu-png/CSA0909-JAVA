import java.util.Scanner;
public class R192224265{
  public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    int n = a.nextInt();
    a.nextLine();
    System.out.print("the choice is "+n+"\n");
    if(n == 1){
      String str = a.nextLine();
      int l = str.length();
      StringBuilder rev = new StringBuilder();
      for(int i = l-1; i>=0; i--){
        char ch = str.charAt(i);
        rev.append(ch);
      }
      System.out.println(rev);
      if(str.equals(rev.toString())){
        System.out.println("it is palindrome");
      }
      else{
        System.out.println("it is not a paindrome");
      }
      
    }
    else if(n == 2){
      int num = a.nextInt();
      int number = num;
      int rev =0;
      while(num > 0){
        int d = num % 10;
        rev = rev*10+d;
        num /= 10;
      }
      if(rev == number){
        System.out.println("the given number is palindrome");
      }
      else{
        System.out.println("the given number is not a palindrome");
      }
    }
    else{
      System.out.println("choose the correct option");
    }
  }
}
