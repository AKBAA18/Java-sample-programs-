abstract class Person {
  public String fname = "John";
  public  String lname = "Doe";
  String email = "john@doe.com";
  int age = 24;
  }
  class ext extends  Person{
  	String a=fname;
    String b=lname;
  }
class absext
{
  public static void main(String[] args) {
    ext myObj = new ext();
    System.out.println("Name: " + myObj.a + " " + myObj.b);
    //System.out.println("Email: " + myObj.email);
    //System.out.println("Age: " + myObj.age);
  }
}
