import java.lang.*;
import java.util.Scanner;

// Greatest of 3 nums
// here main func is in same class

class GreatestNum{
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
}

public static void main(String[] args){
Scanner inp = new Scanner(System.in);
GreatestNum s = new GreatestNum();
s.a = inp.nextInt();
s.b = inp.nextInt();
s.c = inp.nextInt();
s.findGreatest(s.a,s.b,s.c);
}
}





