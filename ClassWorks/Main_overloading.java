
// OVERLOADING
// In java there is only func overloading.
// same func name - diff. no.& type of args

// checks for presence of args -> if not 
// if args 
// call default func and check for num of args
// then check for dataype


import java.lang.*;
import java.util.*;

class Sum{
int a,b,c;
float x,y,z;

//1st func
void add(int a, int b){
System.out.println(a+b);
}

//2nd func
void add(float x, float y, float z){
System.out.println(x+y+z);
}

//3rd func
void add(){
Scanner in = new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
System.out.println(a+b+c);
}
}

class Main_overloading{
public static void main(String[] args){
Sum s = new Sum();
s.add(23,24); //1st func
s.add(4,5,6); //type conv. to float and 2nd func
// s.add(23.04f, 45.23f); //error 
s.add(23.45f, 45.23f, 12.08f); //2nd func
s.add();
}
}