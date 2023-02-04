import java.util.Scanner;

public class hackerrank_p1 {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int Num = n.nextInt();
        int result=0;
        for (int i=0; i<=10;i++){
            result=Num*i;
            System.out.println(Num+"x"+i+"="+result);
        }
        n.close();
    }
}

