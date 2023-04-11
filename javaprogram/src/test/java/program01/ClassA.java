package program01;

public class ClassA{


    public static void main(String[] args) {
//VALIDATE TO THE LEARNMORE M IS PRESENT OR NOT
        String name = "LearnMore";
        if (name.contains("M")){
            System.out.println("m is there");
        }
        else {
            System.out.println("m is no there");
        }
//VALIDATE TO THE CONVERT STRING TO INTEGER
      String value = "246";
        int newValue = Integer.parseInt(value);
        System.out.println(newValue+27);
//Create a String as “27.22“ , Convert it into Float and add 2.5 with it
        String floatValue = "27.22";
        Double values = Double.parseDouble(floatValue);
        System.out.println(values+2.5);








    }




    }


