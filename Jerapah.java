import java.util.Scanner;
public class Jerapah{
	//testgit
	private String name;
	private double energy;
	private boolean cleanliness;
	private double health;
	private double happiness;
	private double hunger;
	public boolean gameover;
	
	Scanner input = new Scanner(System.in);
	public Jerapah(){
		name = "";
		energy = 5;
		cleanliness = false;
		health = 50;
		happiness = 50;
		hunger = 50;
		gameover = false;
	}
	public void setName(String n){
		this.name = "";
	}

	public void setHunger(double h){
		this.hunger = h;
	}
	
	public void setEnergy(double e){
		this.energy = e;
	}

	public void setCleanliness(boolean c){
		this.cleanliness = c;
	}
	
	public void setGameover(boolean go){
		this.gameover = false;
	}

	public void setHappiness(double hap){
		this.happiness = hap;
	}	

	public void setHealth(double hea){
		this.health = hea;
	}	
	
	public double getHunger(){
		return hunger;
	}
	public boolean getCleanliness(){
		return cleanliness;
	}
	public boolean getGameover(){
		return gameover;
	}
	public double getHappiness(){
		return happiness;
	}
	public double getHealth(){
		return health;
	}
	public double getEnergy(){

		return energy;
	}	
	public String getName(){
		return name;
	}

	
	
// EAT METHOD
	public double eat(double food){
		double fulcheck = hunger;
		hunger = hunger + food; 

		double tambah = food/10;
		energy = energy + tambah;
		
		
			if(getHunger() > 100){
			setHunger(fulcheck);
			System.out.println("------------------------");
			System.out.println("it  cant eat that much, hes too full!");
			System.out.println("Fullness = " + getHunger());
			System.out.println("------------------------");
		}else{
			
			System.out.println("------------------------");
			System.out.println(getName() + " loved the food");
			System.out.println("Fullness = " + getHunger());
			cleanliness = false;
			System.out.println("------------------------");
		}

		return hunger;
	}
	
//	BATH METHOD
	public boolean bath(double water){
		cleanliness = true;
		if(water > 10){
			health =- 1;
		}
		
		System.out.println("------------------------");
		System.out.println("You Bath " + getName() + " Its clean now!");
		System.out.println("------------------------");
		return cleanliness;
	}
	
// CLEAN ROOM METHOD


	
	
//	SLEEP METHOD	
	public double sleep(double tidur){

		energy = energy + tidur; 
		hunger = hunger - tidur;
		cleanliness = false;
			System.out.println("------------------------");
			System.out.println(getName() + " had a good nap");
			System.out.println("------------------------");
		
		return energy;
	}

//	MEDICINE METHOD
	public double medicine(double obat){ 
		happiness = happiness/2;
		int counter = 0;
			if(obat == 5 || obat ==10 || obat ==15 || obat == 20){
				health =+ obat;
				System.out.println("------------------------");
				System.out.println("You gave " + getName() + " his medicine");
				System.out.println("------------------------");
			else{
				System.out.println("Pleas Enter doses in multiples of 5 to a max of 20 you can only do a dose of 20 3 times");
				}
				
			
		return health;
	}
	
//	PLAYING METHOD
	public double play(double minplay){
		happiness = happiness + minplay;
		energy = energy - minplay;
		System.out.println("------------------------");
		System.out.println("You play with " + getName() + " for a bit");
		System.out.println("------------------------");
		return happiness;
	}
	
// ENTER USERNAME METHOD
	public void username(){
		name = input.next();
	}
	
	public void menu(){
		System.out.println("");
		System.out.println("What would you like to do with " + getName());
		System.out.println("");
		System.out.println("1: Eat");
		System.out.println("2: Bath");
		System.out.println("3: Sleep");
		System.out.println("4: Give Medicine");
		System.out.println("5: Play");
		System.out.println("6: Check Status");
		System.out.println("0: Exit");
	}

	public void status(){
		System.out.println("Fullness = " + getHunger());
		System.out.println("Happiness = " + getHappiness());
		System.out.println("Energy = " + getEnergy());
		System.out.println("Health = " + getHealth());
		System.out.println("Clean/Dirty = " + (getCleanliness()?"Clean":"Dirty"));

	}
	
	public void condition(){
		if(getHealth() <= 0){
				System.out.println("You are Sick, drink some medicine!");
		}if(getHealth() <= -50){
				System.out.println("You got sick and died");
				gameover = true;
		}if(getHunger() <= 0){
			System.out.println("You are Hungry, Eat Some food!!!!");
		}if(getHunger() <= -20){
				System.out.println("You died of starvation");
			gameover = true;
		}
	}
}