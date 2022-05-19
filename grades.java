import java.util.Scanner;

public class grades {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
	
		System.out.print("What is your homework weight?");
		int hwweight = kb.nextInt();
		
		
		System.out.print ("What is your exam 1 weight?");
		int oneweight= kb.nextInt();
		

		int twoweight = 100 - (hwweight + oneweight);
		System.out.println("Using weights of: " + hwweight + " " + oneweight + " " + twoweight);
		
		System.out.print("Homework \n");
		
		System.out.print("Number of HW Assignments: ");
		int hwassign= kb.nextInt();
		
		
		System.out.print("Average hw grade: ");
		double hwaverage= kb.nextDouble();		
		
		System.out.print("Number of late days used: ");
		int lateDays = kb.nextInt();
		
		
		
		System.out.print("Labs attended? ");
		int labs = kb.nextInt();
		
	
		double weightedhwgrade = homeworkGrade(hwweight, hwaverage, labs, lateDays, hwassign);
		
		System.out.println("Weighted hw grade: " + weightedhwgrade);
		
		System.out.println ("Exam 1  ");
		
		System.out.println("Score? ");
		double examOneScore= kb.nextDouble();
		
		System.out.println("Curve? ");
		double examOneCurve= kb.nextDouble();
				
		
		
		double examOneTotal= examOneScore + examOneCurve; 
		if(examOneTotal > 100) {
			examOneTotal = 100;
			
		}
		
	System.out.println("Total Points= " + examOneTotal);
	
	double examOneWeight = (oneweight/100) * examOneTotal; 
	System.out.println("Weighted Score: " + examOneWeight); 
	
		
	
		
		System.out.println("Exam 2:  ");
		
		System.out.println("Score? ");
		double examTwoScore= kb.nextDouble();
		
		System.out.println("Curve? ");
		double examTwoCurve= kb.nextDouble();
		
		
		double examTwoTotal=examTwoScore + examTwoCurve;
		if (examTwoTotal > 100) {
			examTwoTotal= 100;
		}
		
 System.out.println("Total Points= " + examTwoTotal);
 
 double examTwoWeight= (twoweight/100)* examTwoTotal;
 System.out.println ("Weighted Score: "+ examTwoWeight);
 
 double courseGrade= examOneWeight+ examTwoWeight+ weightedhwgrade; 
 System.out.println ("You are ending the class with: " + courseGrade);
 
	
	
		
	
		
		
		
		
	}
	
	public static double homeworkGrade(int hwweight, double avghwgrade, int labs, int latedays, int numassignments ) {
		double grade = 0.0;
		
		if (latedays == 0) {
			
			double numerator = (double)((avghwgrade * (double)numassignments + (double)labs * 4.0) + 5.0);
			double denominator = ((double)(10.0 * (double)numassignments + 4.0 * (double)numassignments));
			grade = hwweight*numerator/denominator;
			System.out.println("Total points: " + numerator + " / " + denominator);
		}
		
		else {
			double numerator = (double)((avghwgrade * (double)numassignments + (double)labs * 4.0) + 5.0);
			double denominator = ((double)(10.0 * (double)numassignments + 4.0 * (double)numassignments));
			grade = hwweight*numerator/denominator;
			System.out.println("Total points: " + numerator + " / " + denominator);
		}
		
		if ((double)latedays > (0.5 * (double) numassignments)) {
			grade *= 0.9;
			
		}
		
		
		return grade;
		
		/* do math
		 * if (latedays ==0) {
		 * 	grade += 5;
		 * }
		 * else if (latedays > half numassignments) {
		 *  grade *= 0.9;
		 * }
		 * else {
		 *  
		 * }
		 * return grade;
		 */
	}
		
		


	

	
	

}
