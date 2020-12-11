class FlashCard 
{
	private String question;
	private String[] choices;
	private String answer;

	public FlashCard(String question, String[] choices)
	{
		this.question = question;
		this.choices = choices;
	} 
} // end class FlashCard

class Choice 
{
	private String choice;
	private boolean correctAnswer;

	public void setChoice(String choice)
	{
		this.choice = choice;	
	}

	public void setCorrectAnswer(boolean correctAnswer)
	{
		this.correctAnswer = correctAnswer;
	}

	public String getChoice()
	{
		return this.choice;
	}	

	public boolean getCorrectAnswer()
	{
		return this.correctAnswer;
	}	
} // end class Choice
