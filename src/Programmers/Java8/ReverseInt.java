package Programmers.Java8;

public class ReverseInt {
    String res= "";
    public int reverseInt(int n){
        Integer.toString(n).chars().sorted().forEach(i -> res= Character.valueOf((char)i) + res);
        return Integer.parseInt(res);
    }
}
