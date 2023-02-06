
class footballer {
    public void makeGoal(){
        System.out.println("Goooooooal");
    }
    public void makeAssist() {
      System.out.println("asssit has been done");
    }
  }
   
  class Messi extends footballer {
    public void makeGoal() {
      System.out.println("Messi scores goal");
    }
    public void makeAssist(){
        System.out.println("Messi assisted");
    }
  }

public class Inheritence {
    public static void main(String[] args) {
        footballer messi = new footballer();
        footballer dybala =new Messi();
        //Animal myDog = new Dog();
        messi.makeAssist();
        dybala.makeAssist();
        
    }
}
