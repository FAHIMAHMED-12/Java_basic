public class StringToInt {
    public static void main(String[] args) {
        //Extract Digit only from a String by replaceAll
        String str="sdfvsdf68fsdfsf8999fsdf09";
        String NumberOnly= str.replaceAll("[^0-9]", "");
        System.out.println(NumberOnly);
        if (str.isEmpty()){
            System.out.println("khali");
        }
        else{
            System.out.println("Khali na");
        }
    
        //Extract Digit only from a String by CharMatcher.digit()
        String s = "helloThisIsA1234Sample";
        s = s.replaceAll("\\D+","");
        System.out.println(s);
        
    }
    
}
