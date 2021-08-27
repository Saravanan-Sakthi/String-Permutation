package string.permutation;
import java.util.Scanner;
class TestPermutation{
  public static void main(String [] abc){
    Scanner s= new Scanner(System.in);
    System.out.print("Enter the string : ");
    String S= s.next();
    Permutation p = new Permutation();
    p.setSub(S);
    p.permute(0,S.length()-1);
  }
}