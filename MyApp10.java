public class MyApp10 {
  public static void main(String[] args) {
    System.out.println();
    String fname = "Taro";
    String lname = "Yamada";
    // System.out.println("I am Taro Yamada.");
    // System.out.println("I am " + fname + " Yamada.");
    System.out.println(String.format("I am %s %s.", fname, lname));
  }
}