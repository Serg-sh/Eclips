package test;
public class Fish {

    int currentDepth=0;
    
 
    
    //����� - dive
    public int dive (int howDeep) {
 currentDepth=currentDepth + howDeep;
 System.out.println("����� �� ������� " + howDeep + " �����");
 System.out.println("� �� ������� " + currentDepth + " ����� ���� ������ ����");
 return currentDepth;

    }
   
    //����� - say-Fish
    public String say (String something) {
   return "FISH -����� SAY ";
      }
    
  }

class FishMaster {

  public static void main(String[] args) {
 Fish myFish = new Fish();
 myFish.say("45");
 
    }

}
