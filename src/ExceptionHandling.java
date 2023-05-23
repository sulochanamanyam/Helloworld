package com.dao;
public class ExceptionHandling {

     static final int MAX_DAY_IN_YEAR=365;
     static int m=1;

     Integer a=new Integer(10);
     Integer b=10;
    public static void test() throws ArrayIndexOutOfBoundsException{
        //try {
            int a=10, b=20;
        m=650;
            int remainder=b/0;
            System.out.println(remainder);
           // throw new ClassCastException("throw an exception");
       /* }catch (ArithmeticException a) {
            throw new RuntimeException("unable to process the transaction");
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("This is from finally");
        }*/
    }

     public static void main(String[] args) {
        // ExceptionHandling eh=new ExceptionHandling();
        if(10/2==0) {
            System.out.println("even number");
        }

         if(10/2==0) {
             System.out.println("even number");
         } else if(10/4==2){
             System.out.println("not even niether odd");
         } else {
             System.out.println("odd");
         }

         int i = 0;
         while (i < 5) {
             System.out.println(i);
             i++;
         }

         do{

         }while(i < 5) {

         }

    }
}
