package basic;

public interface I2 extends I1{
   public abstract void cal();
   
   default void cal1()
   {
	   System.out.println("this is default of i2");
	   set();
	   set2();
	   I1.set3();
   }
}
