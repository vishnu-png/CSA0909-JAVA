public class True{
  public static boolean is(int n){
    if(n == 0){
      return false;
    }
    while(n % 3 == 0){
      n /= 3;
    }
    return n==1;
  }
  public static void main(String[] args){
    int n = 27;
    boolean result = is(n);
    System.out.print(result);
  }
}
