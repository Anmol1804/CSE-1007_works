
// Arrays
// syntax:- int[] arr = new int[size] or int arr[] = new int[size]
// int[] a = {1,2,3};
// int[][] arr2d = new int[3][3];

// jagged array - variable column length
// int[][] a2d = new int[3][];
// a2d[0] = new int[4] - row 0 has 4 length (4 cols)
// a2d[1] = new int[5] - row 1 has 5 cols
// a2d[2] = {1,2,3,4,5,6}

// EXAMPLE

import java.lang.*;
import java.util.*;

class Student{
String name;
int regno;
String address;

void get(){
Scanner in = new Scanner(System.in);
name = in.next();
regno = in.nextInt();
address = in.next();
}

void print(){
System.out.println(name + " " + regno + " " + address);
}
}

class Main_arraydemo{
public static void main(String[] args){

// command line input
int n;
n=Integer.parseInt(args[0]);

//student refernces
Student[] s = new Student[n]; //or Student s[] = new Student[n]; 

// enhanced for loops
for(int i=0; i<n; i++){
s[i] = new Student(); //memory allocated
s[i].get();
}

for(int i=0; i<n; i++){
s[i].print();
}
}
}
