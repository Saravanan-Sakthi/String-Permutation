package string.permutation;
class Permutation{
  static String sub="";
  void setsub(String s){
    sub= s;
  }
  static void swap(int i, int j){
    char [] A= new char[sub.length()];
    for (int k=0;k<sub.length();k++) A[k]= sub.charAt(k);
    char temp= A[i];
    A[i]=A[j];
    A[j]=temp;
    sub="";
    for (int k=0;k<A.length;k++) sub=sub+A[k];
  }
  void permute(int start, int end ){
    if (start==end) System.out.print(sub+" ");
    else {
      for (int i=start;i<=end;i++){
        swap(start,i);
        permute(start+1,end);
        swap(start,i);
      }
    }
  }
}