/*public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
    System.out.println("Finally downloaded Java");
    System.out.println(9);
    System.out.println(2*3);
    char myVar1 = 65, myVar2 = 66, myVar3 = 67;
    System.out.println(myVar1);
    System.out.println(myVar2);
    System.out.println(myVar3);
  }
}

*/

public class Main{
   public static void method(){
        System.out.println("Hello");
    }
   
   //public static void main(){
   // method();
   // method();  
   //}
   public static void checkage(int age){
     if(age < 18){
      System.out.println("Not old Enough!");
     }else{
      System.out.println("Old Enough");
     }
   }
    public static void main(String[] args){
     checkage(15);
   }

}
