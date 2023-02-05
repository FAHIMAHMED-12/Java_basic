
class Student{
    String Name;
    int age;
    int id;
    public void printInfo(String Name){
        System.out.println(Name);
    }
    public void printInfo(int age){
        System.out.println(age);
        
    }
    public void printInfo(String Name, int age){
        System.out.println(Name+" "+age);
    }
    public void printInfo(String Name, int age, int id){
        System.out.println(Name+" "+age+" "+id);
    }
}


public class polymorphism{
    public static void main(String[] args) {
        Student s3 = new Student();
        s3.Name="Akash";
        s3.age= 25;
        s3.id=1018;
        s3.printInfo(s3.Name,s3.age);
        
    }
    
    
}
