package com.gourav;

public class Constructor {

    static String aa;
    public static  void constructor(){
        System.out.println("Constructor");
        aa="abc";
    }

    public static void main(String[] args) {
//        Constructor constructor=new Constructor();
//        System.out.println(aa);

        try{
            constructor();
            System.out.println("A");
        }catch(Exception ex){
            System.out.println("B");
        }finally {
            System.out.println("C");
        }
        System.out.println("D");



    }

}
