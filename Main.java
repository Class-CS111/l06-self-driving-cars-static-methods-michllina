// When you are ready to have your work checked, change the value below from N to Y
// ReadyForSubmission=N
// YOUR NAME: Michelle Mendoza
// COLLABORATORS: None
// DATE:  3/28/2025

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("My thoughts on the article are:");
		// Part 2: Invoking/calling method
		Main.printQuestionAnswers();
	}
	
	// Part 1: Creating method definition
	//return type is void, method identifier is printQuestionAnswers
	public static void printQuestionAnswers() 
{
	System.out.println("Should a self-driving car prioritize the safety of its passengers or pedestrians?\r\n" + //
				"I think the self-driving car should prioritize the safety of both passengers and pedestrians, but if I had to choose, I would say the safety of the passenger should be prioritized. The reason why I think the passengers should be prioritized is because there is more concern when sitting inside the self-driving car than outside of it. That is because, if a pedestrian sees a self-driving car, they can decide to avoid it. A passenger doesn't have that decision. Additionally, they are ultimately the ones who experience the self-driving car the most. That's why I think passengers should be prioritized.\r\n" + //
				"");
	System.out.println("What factors should the car's algorithms consider when making such determinations?\r\n" + //
				"Concerning outside the car: Traffic, speed, roadblocks, time, weather, so many things.\r\n" + //
				"Inside the car: Passenger weight, age, height, mobility, etc.\r\n" + //
				"All of these factors are important in ensuring that the self-driving car is as safe as possible.\r\n" + //
				"");
	System.out.println("Who should be deciding the algorithms for self-driving cars?\r\n" + //
				"The government and engineers should decide the algorithms for self-driving cars. This is because the government would be able to hold the engineers accountable in court, and the engineers can use their expertise to craft safe and reliable self-driving cars.\r\n" + //
				"");
}
	
}