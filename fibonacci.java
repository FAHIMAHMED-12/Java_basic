import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        int Num = n.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.print(a+" "+b);
    
        for(int i=1; i<=Num; i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
        n.close();
    }
    
}
