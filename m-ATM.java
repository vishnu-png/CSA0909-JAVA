import java.util.Scanner;

public class R192224265{
  public static void main(String[] args){
    Scanner a= new Scanner(System.in);
    int d1 = a.nextInt();
    int n1 = a.nextInt();
    int d2 = a.nextInt();
    int n2 = a.nextInt();
    int d3 = a.nextInt();
    int n3 = a.nextInt();
    int d4 = a.nextInt();
    int n4 = a.nextInt();
    System.out.println("First deposit "+d1);
    System.out.println("no.of notes "+n1);
    System.out.println("second deposit "+d2);
    System.out.println("no.of notes "+n2);
    System.out.println("third deposit "+d3);
    System.out.println("no.of notes "+n3);
    System.out.println("Fouth deposit "+d4);
    System.out.println("no.of notes "+n4);
    int a1 = d1*n1;
    int a2 = d2*n2;
    int a3 = d3*n3;
    int a4 = d4*n4;
    int t = a1+a2+a3+a4;
    System.out.println("the total deposit is "+t);
  }
}
