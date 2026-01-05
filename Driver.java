import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<monkey> monkeyList = new ArrayList<monkey>();

    public static void main(String[] args) {
    	Scanner scnr = new Scanner(System.in);


        initializeDogList();
        initializeMonkeyList();
        
        char option = 0;
        
        
        displayMenu();
       
       while(option != 'q') {
    	   option = scnr.next().charAt(0);
    	   switch(option) {
    	   case '1':
    		   intakeNewDog(scnr);
    		   return;
    		   
    	   case '2':
    		   intakeNewMonkey(scnr);
    		   return;
    	   case '3':
    		   reserveAnimal(scnr);
    		   return;
    	   case '4':
    		   printAnimals(option);
    		   return;
    	   case '5':
    		   printAnimals(option);
    		   return;
    	   case '6':
    		   printAnimals(option);
    		   return;
    		 default:
    			 System.out.println("Invalid input");
    		   
    		   
   
    	
    		   
    		   
    	   }
    	   
	   }
    	
    }
    
    

  




// This method prints the menu options
public static void displayMenu() {
    System.out.println("\n\n");
    System.out.println("\t\t\t\tRescue Animal System Menu");
    System.out.println("[1] Intake a new dog");
    System.out.println("[2] Intake a new monkey");
    System.out.println("[3] Reserve an animal");
    System.out.println("[4] Print a list of all dogs");
    System.out.println("[5] Print a list of all monkeys");
    System.out.println("[6] Print a list of all animals that are not reserved");
    System.out.println("[q] Quit application");
    System.out.println();
    System.out.println("Enter a menu selection");
}


// Adds dogs to a list for testing
public static void initializeDogList() {
    Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
    Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
    Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

    dogList.add(dog1);
    dogList.add(dog2);
    dogList.add(dog3);
}


// Adds monkeys to a list for testing
//Optional for testing
public static void initializeMonkeyList() {
	
}




// Completed the intakeNewDog method
// The input validation to check that the dog is not already in the list
// is done for you
// Gets input from the user and allows for new dog intake
public static void intakeNewDog(Scanner scanner) {
	scanner.nextLine();
    System.out.println("What is the dog's name?");
    
    String name = scanner.nextLine();
    for(Dog dog: dogList) {
        if(dog.getName().equalsIgnoreCase(name)) {
            System.out.println("\n\nThis dog is already in our system\n\n");
            return; //returns to menu
        }
    }
    System.out.println("What is the dogs breed?");
    String breed = scanner.nextLine();
    System.out.println("What is the dogs gender?");
    String gender = scanner.nextLine();
    System.out.println("What is the dogs age?");
    String age = scanner.nextLine();
    System.out.println("What is the dogs weight");
    String weight = scanner.nextLine();
    System.out.println("What is the dogs acquisition date?");
    String acquisitionDate = scanner.nextLine();
    System.out.println("What is the dogs acquisition country?");
    String acquisitionCountry = scanner.nextLine();
    System.out.println("What is the dogs training status?");
    String trainingStatus = scanner.nextLine();
    System.out.println("Is this dog reserved?");
    boolean reserved = scanner.hasNextLine(); 
    System.out.println("What country is the dog in service?");
    String inServiceCountry = scanner.nextLine();
    
    Dog dog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry,trainingStatus, reserved, inServiceCountry);
    dogList.add(dog);
    System.out.println("Your entry has been added to the Dog List.");
    }

    



    // Completed intakeNewMonkey
//New monkey's available to system and can be inputted as needed
// Checks if monkey is already in the system

    public static void intakeNewMonkey(Scanner scanner) {
    	scanner.nextLine();
        System.out.println("What is your monkey's name?");
        String name = scanner.nextLine();
        for(monkey monkey: monkeyList) {
        	if(monkey.getName().equalsIgnoreCase(name)) {
        		System.out.println("\n\n Monkey is already in System\n\n");
        		return;
        	}
        	
        }
        System.out.println("What is your animal type?");
        String animalType = scanner.nextLine();
        System.out.println("What's your monkey's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();
        System.out.println("What is the monkey's weight");
        String weight = scanner.nextLine();
        System.out.println("What is the monkey's aquisition date?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("What is the monkey's aquisition country?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("Is your monkey in training?");
        String trainingStatus = scanner.nextLine();
        System.out.println("Is this monkey reserved?");
        String reserved = scanner.nextLine();
        System.out.println("What country is the monkey serving?");
        String inServiceCountry = scanner.nextLine();
        System.out.println("What is the species of the monkey? ");
        String species = scanner.nextLine();
        System.out.println("What is the monkey's tail length?");
        String tailLength = scanner.nextLine();
        System.out.println("What is the monkey's height?");
        String height = scanner.nextLine();
        System.out.println("What is the monkey's body length?");
        String bodyLength = scanner.nextLine();
        
        monkey monkey = new monkey(name, gender, age, weight,acquisitionDate,acquisitionCountry,trainingStatus,reserved,inServiceCountry,species,tailLength,bodyLength,height);
        monkeyList.add(monkey);
        System.out.println("Your entry has been added to the Monkey List.");
        return;
        
    
    
        
    }

    // Completed reserveAnimal
    // distinguishes animals by animal type and animal country
    public static void reserveAnimal(Scanner scanner) {
    	scanner.nextLine();
        System.out.println("Enter the Animal Type");
        String animalType = scanner.nextLine();
        if(animalType.equalsIgnoreCase("monkey")) {
        	System.out.println("Enter the monkey'a acquisition country");
        	String country = scanner.nextLine();
        	for( monkey monkey: monkeyList) {
        		if(monkey.getAcquisitionLocation().equalsIgnoreCase(country)) {
        			monkey.setReserved(true);
        			System.out.println("The monkey is reserved");
        			return;
        		}
        	}
        	System.out.println("The monkey is not in the list");
        	
        }
        else if (animalType.equalsIgnoreCase("dog")) {
        	System.out.println("Enter the dogs acquisition country");
        	String country = scanner.nextLine();
        	for (Dog dog: dogList) {
        		if(dog.getAcquisitionLocation().equalsIgnoreCase(country)) {
        			dog.setReserved(true);
        			System.out.println("The dog is reserved");
        			return;
        		}
        	}
        	System.out.println("The dog is not in the list");
        }
        else {
        	System.out.print("Animal is not found");
        }
    }
        
        	
        			
    
        			
        	
        	
        
       

    
   static int i = 0;
 //COmpleted print animals method based on list type parameters and different input options
    public static void printAnimals(char option) {
    	switch(option) {
    	case '4':
    		System.out.println("Dogs:");
    		System.out.println(dogList);
    		return;
    	case '5':
    		System.out.println("Monkeys:");
    		System.out.println(monkeyList);
    		return;
    	case '6':
    		for(int i = 0; i< dogList.size();++i) {
    			if(dogList.get(i).getTrainingStatus().equals("in service")&& dogList.get(i).getReserved()== false) {
    				System.out.print(dogList.get(i));
    			}
    		}
    		for (int i = 0; i< monkeyList.size();++i) {
    			if (monkeyList.get(i).getTrainingStatus().equals("in service")&& monkeyList.get(i).getReserved() == false){
    				System.out.println(monkeyList.get(i));
    			}
    		}
    		return;
  

    		
    			}
    		}
        

    }

    
    		
   
    		
    	