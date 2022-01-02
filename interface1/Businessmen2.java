package interface1;


public class Businessmen2  implements Richman , SocialWorker {

	@Override
	public void helpToOthers() {
	
		System.out.println( "Help to other");
	}

	@Override
	public void earnMoney() {
		
		System.out.println("Earn Money");
	}

	@Override
	public void donation() {
		System.out.println("Earn Donation");
		}

	@Override
	public void party() {
	System.out.println( "Party");
		
	}

}
