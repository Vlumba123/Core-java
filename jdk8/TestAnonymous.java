package jdk8;

public class TestAnonymous {
	public static void main(String[] args) {
		
		Richman r = new Richman( ) {

			@Override
			public void earnMoney() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void donation() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void party() {
				// TODO Auto-generated method stub
				
			}

};System.out.println("Done");
r.donation();
r.earnMoney();
r.party();
		}
}