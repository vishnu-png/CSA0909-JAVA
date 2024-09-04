public class R192224265{
  public static boolean isprime(int n){
    if(n<=1){
      return false;
    }
    for(int i =2; i<=Math.sqrt(n); i++){
      if(n %2 == 0){
        return false;
      }
      
    }
    return true;
  }
  public static void main(String[] args){
    int p = 0;
    int c = 0;
    int [] num ={1,2,4,45,6,6,75};
    for(int n : num){
      if(isprime(n)){
        p++;
        System.out.println(n+" is prime");
      }
      else{
        c++;
        System.out.println(n+" is composite");
      }
    }
    System.out.println("the count of prime is "+p);
    System.out.println("the counut of composite is "+c);
  }
}
