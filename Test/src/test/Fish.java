package test;
public class Fish {

    int currentDepth=0;
    
 
    
    //метод - dive
    public int dive (int howDeep) {
 currentDepth=currentDepth + howDeep;
 System.out.println("Ќыр€ю на глубину " + howDeep + " футов");
 System.out.println("я на глубине " + currentDepth + " футов ниже уровн€ мор€");
 return currentDepth;

    }
   
    //метод - say-Fish
    public String say (String something) {
   return "FISH -метод SAY ";
      }
    
  }

class FishMaster {

  public static void main(String[] args) {
 Fish myFish = new Fish();
 myFish.say("45");
 
    }

}
