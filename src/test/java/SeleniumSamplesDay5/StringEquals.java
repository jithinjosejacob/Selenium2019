package SeleniumSamplesDay5;

public class StringEquals {
	
	public static void main (String args[]) {
		
		String FString = "NewMan";
		String LString = "Newman";
		
		if(FString.equalsIgnoreCase(LString))
			System.out.println("Both Strings Match");
		else
			System.out.println("No Match");
			
	}

}
