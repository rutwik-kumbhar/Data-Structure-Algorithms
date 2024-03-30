package javaoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Bike {
   private   void  run(){

        System.out.println("Bike Running");
    }

//    public  static  void  play(){
//        System.out.println("Bike play called ");
//    }

}

 class  Honada extends  Bike{

   public void run(){
        System.out.println("Honda Bike running");
    }

     public  static  void  play(){
         System.out.println("Honda Play called ");
     }
 }



public class Main {
    public static void main(String[] args) {
        Bike  bike  = new Honada();

      Honada h = new Honada();
      String str = "Test the role and and access of each user";

      String[] arr = str.split(" ");

        List<String> list = Arrays.asList(arr);
        Map<String,Long>  map =  list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
        System.out.println(list);



    }
}
