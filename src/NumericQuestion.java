
public class NumericQuestion extends Question {

	/**
	 * Checks a given response for correctness
	 * @param response
	 * @return true if the response was correct, false otherwise
	 */
	public boolean checkAnswer(String response) {
		return Integer.parseInt(response) == Integer.parseInt(getAnswer());
	}
	
	
	
}
