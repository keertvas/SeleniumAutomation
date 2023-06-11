

public class looping {
	boolean retailBanking = true;
	// true - execute if condition
	//false - execute else condition
	
	String quickLinks = "Multi-Currency Forex card";
	
	// Method1: IF-ELSE STATEMENT
	public void syntax_ifelse(){
		looping bankng = new looping();
		if(bankng.retailBanking) {
			System.out.println("Navigate to Digi Savings");
		}
		else{
			System.out.println("exit the flow");
		}
	}
	
	// Method2: IF-ELSE-IF STATEMENT
	public void syntax_ifelseif_multiple(){
		
		if(quickLinks.equals("Retail Internet Banking")) {
			System.out.println("Feature services on Retail banking");
		}
		else if(quickLinks.equals("Corporate Internet Banking")) {
			System.out.println("Feature services on Corporate Internet Banking");
		}
		else if(quickLinks.equals("Travel Currency card")) {
			System.out.println("Feature services on Travel currency Card");
		}
		else {
			System.out.println("No options to choose !");
		}
	}
	
	
	// Method3: SWITTCH CASE
	public void syntax_switchcase() {
		switch(quickLinks) {
		case "Multi-Currency Forex card":
			System.out.println("Feature services on Multi-Currency Forex card");
			// if first condition matches, remaining condition will also execute and so add break; to avoid executing others
			break;
		case "Retail Internet Banking":
			System.out.println("Feature services on Retail banking");
			break;
		case "Corporate Internet Banking":
			System.out.println("Feature services on Corporate Internet Banking");
			break;
		case "Travel Currency card":
			System.out.println("Feature services on Travel currency Card");
			break;
		default:
		}
		
	}
	
	// Main
	public static void main(String[] args) {
		looping bankng = new looping();
		// bankng.syntax_ifelse(); 				// Option1: if-else statement
		// bankng.syntax_ifelseif_multiple(); 	// Option2: if-else-if multiple statements
		bankng.syntax_switchcase(); 			//Option3: Switch case
	}

}
