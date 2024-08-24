public class Count{
  public static void main(String[] args){
    String word = "vishnu";
    word = word.toLowerCase();
    int l = word.length();
    int vc = 0;
    for(int i = 0; i < l; i++){
      char ch = word.charAt(i);
      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        vc++;
      }
    }
    System.out.println("the count of vowels"+" "+vc);
  }
}
