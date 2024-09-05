import java.util.*;
class Coursework5{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String GoToHomepage = null;
		
		while(true){
			
			System.out.println("\t\t\t\t\t __   ______             __                ");
			System.out.println("\t\t\t\t\t|  \\ /      \\           |  \\               ");
			System.out.println("\t\t\t\t\t \\$$|  $$$$$$\\  ______  | $$  _______      ");
			System.out.println("\t\t\t\t\t|  \\| $$  \\$$  |      \\ | $$ /       \\     ");
			System.out.println("\t\t\t\t\t| $$| $$        \\$$$$$$\\| $$|  $$$$$$      ");
			System.out.println("\t\t\t\t\t| $$| $$   __  /      $$| $$| $$           ");
			System.out.println("\t\t\t\t\t| $$| $$__/  \\|  $$$$$$$| $$| $$_____      ");
			System.out.println("\t\t\t\t\t| $$ \\$$    $$ \\$$    $$| $$ \\$$     \\     ");
			System.out.println("\t\t\t\t\t \\$$  \\$$$$$$   \\$$$$$$$ \\$$  \\$$$$$$$     \n\n");
		
		
			System.out.println("  _   _                       _                        _____                                         _                     ");
			System.out.println(" | \\ | |                     | |                      / ____|                                       | |                    ");
			System.out.println(" |  \\| |  _   _   _ __ ___   | |__     ___   _ __    | |        ___    _ __   __   __   ___   _ __  | |_    ___   _ __     ");
			System.out.println(" | . ` | | | | | | '_ ` _ \\  | '_ \\   / _ \\ | '__|   | |       / _ \\  | '_ \\  \\ \\ / /  / _ \\ | '__| | __|  / _ \\ | '__|    ");
			System.out.println(" | |\\  | | |_| | | | | | | | | |_) | |  __/ | |      | |____  | (_) | | | | |  \\ V /  |  __/ | |    | |_  |  __/ | |       ");
			System.out.println(" |_| \\_|  \\__,_| |_| |_| |_| |_.__/   \\___| |_|       \\_____|  \\___/  |_| |_|   \\_/    \\___| |_|     \\__|  \\___| |_|       ");
		
			System.out.println("\n===============================================================================================================================");
		
			System.out.println("\n\n\t[01] Decimal Converter");
			System.out.println("\t[02] Binary Converter");
			System.out.println("\t[03] Octal Converter");
			System.out.println("\t[04] Hexadecimal Converter");
			System.out.println("\t[05] Roman Number Converter");
			System.out.println("\t[06] Exit\n");
		
			while (true){
				String bits = "";
				int bit;
				
			
				try{
					System.out.print("\nEnter option -> ");
					int option = input.nextInt();
				
					
						if (option == 1){
							
							System.out.println("\n+-----------------------------------------------------------------+");
							System.out.println("|                       Decimal Converter                         |");
							System.out.println("+-----------------------------------------------------------------+");
							
							try{
								System.out.print("\nEnter an decimal number : ");
								int decimalNumber = input.nextInt();
								if (decimalNumber > 0){
									while (decimalNumber > 0){
										bit = decimalNumber % 2;
										decimalNumber = decimalNumber / 2;
										bits += bit;
									}
									System.out.print("\n\tBinary number : ");
									for (int i = (bits.length() - 1); i >= 0; i--){
										System.out.print(bits.charAt(i));
									}
								}else {
									System.out.println("Please enter positive numbers");
								}
							}catch (Exception e){
								System.out.println("Invalid input");
							}
							
							while (true){
								System.out.print("\n\nDo you want to go to homepage (Y/N) -> ");
								GoToHomepage = input.next();
								GoToHomepage = GoToHomepage.toLowerCase();
								if (GoToHomepage.equals("y")){
									break;
								}else if (GoToHomepage.equals("n")){
									break;
								}else {
									System.out.println("Please input 'Y' or 'N'");
								}
							}
							
							if (GoToHomepage.equals("y")){
								break;
							}
							
						}else if (option == 2){
						}else if (option == 3){
						}else if (option == 4){
						}else if (option == 5){
							
						}else if (option == 6){
							System.out.println("\nProgram exiting....");
							return;
						}else {
							System.out.println("Invalid option");
							break;
						}
			
				}catch (Exception e){
					System.out.println("\nInvalid input! Please re-enter your option.");
					input.next();
				}
			}
		}
	}
}

