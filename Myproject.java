package Myproject;

import java.util.*;
public class Myproject
{
    public static void main(String[] args) 
    {
       		Scanner object=new Scanner(System.in);
                
		String name;
		int percentage;
		int rollno;
		String board;
		String stream;
		int age;
		int classes;
		int ch;
		int chc;
		
		System.out.println("");
		System.out.println("*********************************WELCOME***********************************");
		System.out.println("");
		System.out.print("enter your name :-  ");
		name=object.next();
		System.out.println("");
		System.out.print("enter your percentage :-  ");
		percentage=object.nextInt();
		System.out.println("");
		System.out.print("enter your board roll number :-  ");
		rollno=object.nextInt();
		System.out.println("");
	    System.out.print("you are from which board :-  ");
		board=object.next();
		System.out.println("");
		System.out.print("please enter your stream :-  ");
		stream=object.next();
		System.out.println("");
	    System.out.print("enter your age :-  ");
		age=object.nextInt();
		System.out.println("");
		System.out.print("enter your class :-  ");
		classes=object.nextInt();
		System.out.println("");
        if(percentage < 60)
		{
		System.out.print("according to your percentage " +percentage);
		System.out.println("you are eligible for following courses :-  ");
        System.out.println("1.management ");
        System.out.println("2.medical ");
        System.out.println("3.law ");
		ch=object.nextInt();
		switch(ch)
		{
			case 1:
			System.out.println(" you select management the courses are avaiable in management is :-  ");
			System.out.println("1.B.com");
			System.out.println("2.BBA");
			System.out.println("3.MBA");
			System.out.println("4.M.com");
			System.out.println("5.Hotel Management");
			chc=object.nextInt();
			switch (chc)
			{
				case 1:
				System.out.println("the college avaiable in B.com is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
			
				case 2:
				System.out.println("the college avaiable in BBA is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 3:
				System.out.println("the college avaiable in MBA is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 4:
				System.out.println("the college avaiable in M.com is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break; 
				
				case 5:
				System.out.println("the college avaiable in Hotel management is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				default :
				System.out.println("not vaild");
				
			}
			break;
			
			case 2:
			System.out.println("you select medical the courses are avaiable in medical is :-  ");
			System.out.println("1.MBBS");
			System.out.println("2.DBS");
			System.out.println("3.MD");
			System.out.println("4.OPD");
			System.out.println("5.Pharmacy");
			chc=object.nextInt();
			
			switch (chc)
			{
				case 1:
				System.out.println("the colleges avaiable in MBBS is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
			
				case 2:
				System.out.println("the college avaiable in DBS is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 3:
				System.out.println("the college avaiable in MD is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 4:
				System.out.println("the college avaiable in opd is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break; 
				
				case 5:
				System.out.println("the college avaiable in Pharmacy is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				default :
				System.out.println("not vaild");
				
			}
			break;
			
			case 3:
			System.out.println("you select law the courses are avaiable in law is :-  ");
			System.out.println("1.LLb");
			System.out.println("2.BA");
			System.out.println("3.PhD");
			System.out.println("4.LLM");
			System.out.println("5.BA+LLB");
			chc=object.nextInt();
			
			switch (chc)
			{
				case 1:
				System.out.println("the college avaiable in LLb is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
			
				case 2:
				System.out.println("the college avaiable in BA is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 3:
				System.out.println("the college avaiable in PhD is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 4:
				System.out.println("the college avaiable in LLM is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break; 
				
				case 5:
				System.out.println("the college avaiable in BA+LLB is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				default :
				System.out.println("not vaild");
				
			}
			break;
			
			default:
			System.out.println("invaild opation");
			
		}
		}			
		else
		{
		System.out.print("according to your percentage " +percentage);
		System.out.println(" you are eligible for following courses :-  ");
        System.out.println("1.Engineering ");
        System.out.println("2.management ");
        System.out.println("3.medical ");
        System.out.println("4.law ");
		ch=object.nextInt();
        switch(ch)
		{
			case 1:
			System.out.println("you select Engineering the courses are avaiable in Engineering is :-  ");
			System.out.println("1.B.Tech");
			System.out.println("2.M.Tech");
			System.out.println("3.BCA ");
			System.out.println("4.MCA");
			System.out.println("5.Bsc");
			System.out.println("6.Msc");
			chc=object.nextInt();
			switch(chc)
			{
				
				case 1:
				System.out.println("the colleges where B.Tech is avaiable :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 2:
				System.out.println("the college avaiable in M.Tech is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 3:
				System.out.println("the college avaiable in BCA is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 4:
				System.out.println("the college avaiable in MCA is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 5:
				System.out.println("the college avaiable in Bsc is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break; 
				
				case 6:
				System.out.println("the college avaiable in Msc is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				default :
				System.out.println("not vaild");
			}
			
			break;
			
			case 2:
			System.out.println("you select management the courses are avaiable in management is :-  ");
			System.out.println("1.B.com");
			System.out.println("2.BBA");
			System.out.println("3.MBA");
			System.out.println("4.M.com");
			System.out.println("5.Hotel Management");
			chc=object.nextInt();
			switch(chc)
			{
				
				case 1:
				System.out.println("the colleges where B.Tech is avaiable :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 2:
				System.out.println("the college avaiable in M.Tech is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 3:
				System.out.println("the college avaiable in BCA is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 4:
				System.out.println("the college avaiable in MCA is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 5:
				System.out.println("the college avaiable in Bsc is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break; 
				
				case 6:
				System.out.println("the college avaiable in Msc is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				default :
				System.out.println("not vaild");
			}
			break;
			
			case 3:
			System.out.println("you select management the courses are avaiable in medical is :-  ");
			System.out.println("1.MBBS");
			System.out.println("2.DBS");
			System.out.println("3.MD");
			System.out.println("4.OPD");
			System.out.println("5.Pharmacy");
			chc=object.nextInt();
			switch(chc)
			{
				
				case 1:
				System.out.println("the colleges where B.Tech is avaiable :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 2:
				System.out.println("the college avaiable in M.Tech is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 3:
				System.out.println("the college avaiable in BCA is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 4:
				System.out.println("the college avaiable in MCA is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 5:
				System.out.println("the college avaiable in Bsc is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break; 
				
				case 6:
				System.out.println("the college avaiable in Msc is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				default :
				System.out.println("not vaild");
			}
			break;
			
			case 4:
			System.out.println("you select management the courses are avaiable in law is :-  ");
			System.out.println("1.LLb");
			System.out.println("2.BA");
			System.out.println("3.PhD");
			System.out.println("4.LLM");
			System.out.println("5.BA+LLB");
			chc=object.nextInt();
			switch(chc)
			{
				
				case 1:
				System.out.println("the colleges where B.Tech is avaiable :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 2:
				System.out.println("the college avaiable in M.Tech is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 3:
				System.out.println("the college avaiable in BCA is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 4:
				System.out.println("the college avaiable in MCA is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				case 5:
				System.out.println("the college avaiable in Bsc is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break; 
				
				case 6:
				System.out.println("the college avaiable in Msc is :-  ");
				System.out.println("1.VIT college");
				System.out.println("2.MIT university");
				System.out.println("3.ajeenkya dy patil university");
				System.out.println("4.Symbiosis university");
				System.out.println("5.pune university");
				break;
				
				default :
				System.out.println("not vaild");
			}
			break;
			
			default:
			System.out.println("invaild opation");
			
		}		
		}
    }
    
}

