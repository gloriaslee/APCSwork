public class Testing{
  public String stringy;
  public Testing(String a){
    stringy = a;
  }
  public void testa(Testing a){
    a = new Testing("ayo");
  }
  public void testo(Testing a, Testing b){
    a=b;
  }
  public static void main(String[] args){
    Testing wub = new Testing("wub");
    Testing stub = new Testing("stub");
    stub.testo(wub, stub);

    System.out.println(wub);
    System.out.println(stub);
    wub.testa(wub);
    System.out.println(wub);
  }
}
