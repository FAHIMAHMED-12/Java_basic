class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Write Something");
    }
    public void pencolor(){
        System.out.println(this.color);
    }

}
// class Student{
//     int id;
//     String name;
//     int age;
//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.id);
//         System.out.println(this.age);
//     }
// }




public class oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color="blue";
        pen1.type="gel";
        pen1.write(); 
        
        Pen pen2= new Pen();
        pen2.color="Red";
        pen2.type="ball";
        pen1.pencolor();
        pen2.pencolor();
        // Student student1 = new Student();
        // student1.age= 15;
        // student1.id=1015;
        // student1.name= "Akash";
        // student1.printInfo();

    }

    
}
