import java.util.Scanner;

public class WiFiDiagonosis {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("If you have a problem with internet connectivity, this WiFi Diagonosis might work.");
	//First step
	System.out.println("First step: reboot your computer");
	System.out.println("Are you able to connect with the internet? (Yes or No)");
	String response= input.next();
	//using if loop to understand users anwser	
	//If ans is yes 	
	if (response.equals("yes")) {
			System.out.println("Rebooting your computer seems to work.");
		}
	//if ans is no 
	if (response.equals("no")){
		System.out.println("Second step: reboot your router");
		//ask the question again 
		System.out.println("Now are you able to connect with the internet ? (yes or no)");
		//Get response for yes no 
		response =input.next();
		// if ans is yes 
			if (response.equals("yes")) {
			System.out.println("Rebooting your router seems to work.");}
			// if ans is no
		if (response.equals("no"))
		{
			System.out.println("Third Step: Make sure the cables to your router are plugged in firmly and your router is getting power");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
			//get input for yes or no 
		response= input.next();
		// if response is yes then display this 
		if(response.equals("yes")) {
			System.out.println("Cheking the routers cable seems to work");	}	
			//if response is no display this 
			if(response.equals("no")) {
				System.out.println("Fourth step: Move your computer closer to your router");
				System.out.println("Now are you able to connect with the internet? (yes or no) ");
				//Get response again
				response= input.next();
				if(response.equals("yes")) {
					System.out.println("Moving your computer close to the router seem to work.");
				}
				//if ans is no show this 
				if (response.equals("no")) {
					System.out.println("Contact Your ISP");
					System.out.println("Make sure your ISP is hooked up to your router");
				}
			}
		
			
		
			
		}
		}
			
						
		}
		
	
	}	
	
	

	


