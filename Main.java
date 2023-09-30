package javacourse;

import java.util.Scanner;

class Mainer{
	String[] Books= {"java","Html","css","javascript","php"};
	String[] Books1=new String[10];
	int sz=Books.length;
	 
	void Show() {
		   System.out.println("Books are is GIven below");
		for(int i=0;i<Books.length;i++) {	
			System.out.println(i+" "+Books[i]+" ");
		}System.out.println();		
	}
	void adding(String ab){
		String[]  arr=new String[sz+1];
		String element=ab;
		
		for(int i=0;i<sz;i++) {
			arr[i]=Books[i];
		}
		arr[sz]=element;
		System.out.println("----Book returning succesfully-----");
		System.out.println();	
		System.out.println("Currently Available books are");
		for(int i=0;i<arr.length;i++) {	
			System.out.print(arr[i]+" ");
		}
		System.out.println();	
	}	
	void getting(String ab) {
		String get=ab;
		String gb="";
		for(int i=0;i<sz;i++) {			
			String gd=Books[i];
			if(get.equals(gd))	{
				Books[i]="";
				gb=gd;
			}		
		}
		System.out.println("Please take the Book"+" "+gb);
	}
}

public  class LibraryDatabase {
	public static void main(String[] args) {
		
		Mainer obj=new Mainer();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("-----Library Mangement Systen-----");
		System.out.println("Enter your studentId:");
		int id=sc.nextInt();
		System.out.println("-------Login Succesfully------");
		System.out.println();
		System.out.println("-----currently Available----");
		obj.Show();
		System.out.println("To get a book =");
		String get=sc.next(); 
		obj.getting(get);	
		System.out.println("Return a book please type a Book name =");
		String add=sc.next();
		obj.adding(add);	
    
		}	
	}
