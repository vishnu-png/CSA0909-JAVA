import java.util.Scanner;
public class R192224265{
  public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    int n;
    int ps = 0;
    int ns = 0;
    int pc = 0;
    int nc = 0;
    while(true){
      System.out.println("enter the character ");
      int num = a.nextInt();
    
      if(num == -1){
        break;
      }
      if(num > 0){
        ps += num;
        pc++;
        System.out.println("it is a possitve number");
      }
      else if(num < 0){
        ns += num;
        nc++;
        System.out.println("it is a negative number");
      }
    }
    System.out.println("the possitive count is "+ps);
    System.out.println("the negative count is "+ns);
    double pa = ps / pc;
    double na = ns / nc;
    System.out.println("p average "+pa);
    System.out.println("n average "+na);
    
  }
}
