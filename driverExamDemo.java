import java.util.Scanner;

public class driverExamDemo{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("please enter answer A, B, C or D:");

		String[] answers = new String[20];
		String answer;

		for(int index=0;index<20;index++){
			do{
				System.out.print((index+1)+":");
					answer = keyboard.nextLine();

				}while(!isValidAnswer(answer));
				answers[index] = answer;
	}
		examClass exam = new examClass();
			System.out.println("Results");
			System.out.println("Total correct: " +exam.totalCorrect());
			System.out.println("Total incorrect: " +exam.totalIncorrect());

			String passed = exam.passed()? "YES" : "NO";
			System.out.println("Passed: " +passed);

			if(exam.totalIncorrect()>0){
				System.out.println("The incorrect answers were");

				int missedIndex;
			for(int index=0;index<exam.totalIncorrect();index++){
				missedIndex = exam.questionsMissed()[index]+1;

				System.out.print(" " +missedIndex);
		}
	}
}

public static boolean isValidAnswer(String answer){
	return "A".equalsIgnoreCase(answer) ||
			"B".equalsIgnoreCase(answer) ||
			"C".equalsIgnoreCase(answer) ||
			"D".equalsIgnoreCase(answer);
	}
}

