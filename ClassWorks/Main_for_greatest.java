import java.lang.*;
import java.util.Scanner;

// Greatest of 3 nums
// here we create a another class main where we called main func
class GreatestNumNew{
int a,b,c;
void findGreatest(int a, int b, int c){
int max = a;
if(b>max){
max = b;
}
if(c>max){
max = c;
}

System.out.println("max is " + max);
}}

class Main_for_greatest{
public static void main(String[] args){
Scanner inp = new Scanner(System.in);
GreatestNumNew s = new GreatestNumNew();
s.a = inp.nextInt();
s.b = inp.nextInt();
s.c = inp.nextInt();
s.findGreatest(s.a,s.b,s.c);
}
}
