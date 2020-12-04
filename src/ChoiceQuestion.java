import java.util.ArrayList;

public class ChoiceQuestion extends Question {
	
	private ArrayList<String> choices = new ArrayList<String>();

	public void setChoice(String newChoice) {
		choices.add(newChoice);
	}
	
	public String getChoices() {
		String formattedChoices = "";
//		for (String choice : choices) {
//			System.out.println(choice);
//			formattedChoices += choice + System.lineSeparator();
//		}
		
		for (int i = 0; i < choices.size(); i++) {
			formattedChoices += choices.get(i);
			if ( i + 1 != choices.size()) {
				formattedChoices += System.lineSeparator();
			}
		}
		
		return formattedChoices;
	}
}
