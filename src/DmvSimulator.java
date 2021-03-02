
public class DmvSimulator {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the DMV! Someone will be with you shortly!");
		
		// generate random number for user
		int userNumber = (int) (Math.random() * 200 + 1);
		System.out.println("Your number is " + userNumber + ". Please wait until you are called.");
		
		int minNumber = 1, maxNumber = 200;
		int calledNumber = userNumber + 1;
		
		if (calledNumber > maxNumber) {
			calledNumber = minNumber;
		}
		
		while (userNumber != calledNumber) {
			System.out.println("Now calling number " + calledNumber + ".");
			calledNumber++;
			
			if (calledNumber > maxNumber) {
				calledNumber = minNumber;
			}
		}
		
		// calledNumber equals userNumber now, so it is finally the user's turn
		System.out.println("Now calling number " + calledNumber + ".");
		
		// ending message
		System.out.println("You waited through the entire line, and you didn't even realize you were missing the paperwork? It's almost like you wanted to waste your own time! Mwahahaha!");
		
	}
}
