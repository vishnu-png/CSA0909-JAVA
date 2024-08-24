public class Count{
  public static void main(String[] args){
    String word = "vishnuvardhan";
    word = word.toLowerCase();
    int l = word.length();
    int vc = 0 ,oc = 0;
    
    for(int i = 0; i<l;i++){
      char ch = word.charAt(i);
      if(ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o' || ch =='u'){
        System.out.print(ch+" ");
        vc++;
      }
      else{
        System.out.print(ch+" ");
        oc++;
      }
    }
    System.out.println();
    System.out.println("the count of vowels "+vc);
    System.out.println("the count of consonents "+ oc);
  }
}
