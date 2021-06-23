package string.permutation;
import java.util.Scanner;
class TestPermutation{
  public static void main(String [] abc){
    Scanner s= new Scanner(System.in);
    String S= s.next();
    Permutation p= new Permutation();
    p.setsub(S);
    p.permute(0,S.length()-1);
  }
}