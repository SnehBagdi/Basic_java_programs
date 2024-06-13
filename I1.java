package basic;

public interface I1{
   public abstract void set();
   
   default void set2()
   {
	   System.out.println("this is default method of I1");
       set1();
      
   }
   
   static void set3()
   {
	   System.out.println("i am static");
   }
   
   private void set1()
   {
	   System.out.println("this is private method of I1");
   }
}
