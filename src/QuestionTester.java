import java.util.Scanner;

public class QuestionTester {

	public static void main(String[] args) {
		
//		Question q = new Question();
//		
//		q.setText("Where is Japan's capital city?");
//		
//		q.setAnswer("Tokyo");
//		
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println(q.getQuestion());
//		String usersAnswer = in.nextLine();
//		
//		System.out.println(q.checkAnswer(usersAnswer));
		
		Scanner in = new Scanner(System.in);
		
		Question[] questions = new Question[2];
		
		ChoiceQuestion q = new ChoiceQuestion();
		
		q.setText("Where is Japan's capital city?");
		
		q.setAnswer("Tokyo");
		
		q.setChoice("Osaka");
		q.setChoice("Kyoto");
		q.setChoice("Tokyo");
		
		questions[0] = q;
		
		NumericQuestion q2 = new NumericQuestion();
		
		q2.setText("When is Tokyo Olympic going to take place? (Answer in a year!)");
		
		q2.setAnswer("2021");
		
		questions[1] = q2;
		
		for(Question question:questions) {
			
//			System.out.println(question);
			
			System.out.println(question.getQuestion());
			
			if (question instanceof ChoiceQuestion) {
				System.out.println(question.getChoices());
			}
			
			String usersAnswer = in.nextLine();
			
			System.out.println(question.checkAnswer(usersAnswer));
			
			
		}
				
		
	}

}
