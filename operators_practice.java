package udemyclass01;

public class operators {
	public static void myMethod() {
		System.out.println("This is my method!");
	}
	
	public static void main(String[] args) {
		int result = 1+2;
		System.out.println("result: " + result);
		
	 result = result + 10;
	 System.out.println("result: " + result);
	 result = result / 10;
	 System.out.println("result: " + result);
	 result = 13 % 10;
	 System.out.println("result: " + result);
	 result += 10;
	 System.out.println("result: " + result);
	 
	 boolean isred = false;
	 if(isred == false)
		 System.out.println("is false");
	 
	 int topscore = 90;
	 int secondscore = 40;
	 
	 if((topscore > secondscore) && (topscore < 100))
		 System.out.println("close but no cigar");
	 if((topscore > 100) || (secondscore > 50))
		 System.out.println("above average");
	 int newvalue = 50;
	 if(newvalue == 50)
		 System.out.println("true"); 
	 double one = 20;
	 double two = 80;
	 double three = ((one + two) * 25);
	 System.out.println(one + ": " + two + " :" + three + ". ");
	 int re = 40 % 3;
	 if(re < 20)
		 System.out.println( "over limit: " + re);
	 
	}

}
