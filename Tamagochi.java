import java.util.Scanner;
public class Tamagochi{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Jerapah j = new Jerapah();
		
		
		
		
		
		System.out.println("Hi! Welcome to Tamagochi");
		System.out.println("What would you like to name it?");
		j.username();

		
		

		
		System.out.println("------------------------");
		for(int i = 0; i < 100; i++){
			
		j.condition();
		if(j.getGameover()){
		System.out.println("Game Over thanks for playing");
		break;

		}

		
		j.menu();
		
		double check = j.getHunger();
		
		int choice = input.nextInt();
		
		if (choice == 1){
			System.out.println("How many treats do you want to give it?");
			double food = input.nextDouble();
			j.eat(food);

		}
		else if (choice == 3){
				if(j.getHunger() > 0){
					System.out.println("How many minutes do you want " + j.getName() + " to sleep");
					double tidur = input.nextDouble();
					tidur = tidur*60/100;
					
					j.sleep(tidur);
			}
			else{
				System.out.println("You are too hungry to go to sleep go eat something!");
			}
		}
		else if (choice == 4){
			System.out.println("Enter doses in multiplex of 5 to a max of 20");
			double obat = input.nextDouble();
			j.medicine(obat);
		}
		else if (choice == 5){
				if(j.getEnergy() > 0){
					System.out.println("How many minutes do you want " + j.getName() + " to play");
					double minplay = input.nextDouble();
					minplay = minplay*60/100;
					j.play(minplay);
			}
			else{
				System.out.println("You are too hungry to go to sleep go eat something!");
			}
			

		}
		else if (choice == 2){
			double water = input.nextDouble();
			j.bath(water);
		}

		else if (choice == 6){
			System.out.println("------------------------");
			j.status();
			System.out.println("------------------------");
			
		}
		
		else if (choice == 0){
			System.out.println("------------------------");
			System.out.println("Thanks for playing!");
			System.out.println("------------------------");
			break;
		}
	}
		
		
		
		
	}
}