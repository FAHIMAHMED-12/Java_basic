
class Coffee{
    public boolean empty(){
        return false;
    }
    public void refill(){
        System.out.println("Coffee is refilled");
    }
    public void drink(){
        System.out.println("Driking Coffee");
    }


}




public class coffeex {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        if (coffee.empty()){
            coffee.refill();
        }
        else{
            coffee.drink();
        }
        
    }
}
