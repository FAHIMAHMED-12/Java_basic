
class EncapsulatedClass {
    private int data;
   
    public int getData() {
      return data;
    }
   
    public void setData(int data) {
      this.data = data;
    }
  }


public class encapsulation {
    public static void main(String[] args) {
        EncapsulatedClass obj = new EncapsulatedClass();
        obj.setData(42);
        System.out.println("Data: " + obj.getData());
    }

    
}
