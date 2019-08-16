// Example for foreach loop
import java.util.Stack;
public class Ex17 {
public static void main(String[]args) {
int []a={10,20,30};
for(int t:a){
System.out.println(t+ " ");
}
System.out.println( "\n ");
int[][]b={ {11,22},{33,44} };
for (int t[]:b){
for (int x:t){
System.out.println(x+ " ");

}
System.out.println();
}
Stack<Integer>st=new Stack <Integer>();
st.push(100);
st.push(200);
st.push(300);
for(int i:st){
System.out.println(i+ " ");
}
}
}
