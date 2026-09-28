public class TripleJumpRecord {

	public static void main(String[] args) {
		// Current record
		double record = 18.29;
		
		// Player records
		double jump1 = 15.58;
		double jump2 = 18.35;
		double jump3 = 17.26;
		double jump4 = 18.31;
				
		// Get new record 
		double newRecord = Math.max(record, Math.max(Math.max(jump1, jump2), Math.max(jump3, jump4)));
		
		// Display the new record
		System.out.println("The current record is now " + newRecord + " meters");
		System.out.println("The current record is below " + (int) Math.ceil(newRecord) + " meters");
		System.out.println("The current record is above " + (int) Math.floor(newRecord) + " meters");
	}

}