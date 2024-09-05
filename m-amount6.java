public class R192224265{
  public static void main(String[] args){
    char g  = 'B';
    int s = 50000;
    double b = 0;
    
    if(g == 'A'){
      b = 0.05*s;
      System.out.println(b);
    }
    else if(g == 'B'){
      b = 0.10*s;
      System.out.println(b);
    }
    else{
      System.out.println("correct grade");
    }
    if(s < 10000){
      b = b * 0.02;
      System.out.println(b);
    }
    double t = s+b;
    System.out.println("total is "+t);
  }
}
