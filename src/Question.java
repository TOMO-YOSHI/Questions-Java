

public class Question {

	private String text;
	private String answer;
	
	/**
	 * Constructs a question with empty question and answer
	 */
	public Question() {
		text = "";
		answer = "";
	}
	
	/**
	 * Sets the question text
	 * @param questionText the text of this question
	 */
	public void setText(String questionText) {
		text = questionText;
	}
	
	/**
	 * Sets the answer text
	 * @param answerText the text of this question
	 */
	public void setAnswer(String answerText) {
		answer = answerText;
	}
	
	/**
	 * Checks a given response for correctness
	 * @param response
	 * @return true if the response was correct, false otherwise
	 */
	public boolean checkAnswer(String response) {
		return response.equals(answer);
	}
	
	/**
	 * Displays this question
	 * @return text the text of this question
	 */
	public String getQuestion() {
		return text;
	}

	public String getAnswer() {
		return answer;
	}	
	
	public String getChoices() {
		return "";
	}


}
