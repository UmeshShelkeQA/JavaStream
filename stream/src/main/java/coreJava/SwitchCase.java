package coreJava;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switch("k") {
		case "y":System.out.println("Line 1");
				System.out.println("Line 2");
				System.out.println("Line 3");
					//break;
		case "v":System.out.println("Line 21");
				System.out.println("Line 22");
				System.out.println("Line 23");
				break;
		case "k":
				System.out.println("Line 31");
				System.out.println("Line 32");
				System.out.println("Line 33");
				break;
		default:System.out.println("Default Statement");
		}
		
		int i=3;
		System.out.println("Post Increment : "+ i++);
		System.out.println("Pre Increment : "+ ++i);
		
		i+=3;
		System.out.println("Short Assignment Statement 1: "+ i);
		
		//i+=++i;// i = i +(++i)
		i = i + i++;
		System.out.println("Short Assignment Statement 2: "+ i);
		
		int j=10;
		int k = j--;
		System.out.println("J Value :"+j + "\nK Value :"+k);
		
		//we should have initialize the local variable other it gives compile time error "The local variable s may not have been initialized"
//		int s;
//		int t=1+s; //without initialization we can not use local variable
//		System.out.println(s);
		
	}

}
