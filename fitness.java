import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.io.*;

public class fitness {
	static String[] upper = {"Push Ups", "Bicep Curls", "Tricep Dips", "Shoulder Press", "Reverse Fly"};
	static String[] lower = {"Plie squats", "Goblet squats", "Lunge Hops", "Deadlift", "Pulsing squats", "Curtsy Lunge to side leg lift", "Wall sprints with band", "Power skip to lunge with floor touch", "Frog hops", "Lateral jumps with bands", "Lateral jumps", "Knee up and out Hops(band)", "Squat jumps"};
	static String[] core = {"Planks", "Side Plank", "Reverse Crunch", "Russian Twists", "V-ups", "Bicycle Crunches", "Oblique Twists"};
	static String[] cardio = {"Burpees", "Mountain Climbers", "Jumping Jacks", "High Knees", "Tuck Jumps", "Heismans", "Diamond Jumps", "Butt kickers", "Jumping jacks", "Jack uppercuts", "High knee torso twist", "Jump turns", "Burpee to Diamond Jump"};


	public static void main(String[] args) throws Exception{
		while(true){
			System.out.println("What would you like to do?");
			System.out.println("1: Work out");
			System.out.println("2: Add to file");
			Scanner in = new Scanner(System.in);
			if(in.nextInt() == 2){
				edit();
			}
			else if(in.nextInt() == 1){
				randomize(upper, upper.length);
				randomize(lower, lower.length);
				randomize(core, core.length);
				randomize(cardio, cardio.length);
				generateWorkout();
			}
			else {
				break;
			}
		}
	}

	public static void edit(){
		System.out.print("Which list do you want to add to? \n1. cardio \n2. core \n3.lower \n4.upper");
		Scanner inout = new Scanner(System.in);
		int file = inout.nextInt();
		System.out.print("What would you like to add: ");
		Scanner in = new Scanner(System.in);
		String fileText = "";
		if(file == 1) fileText = "cardio.txt";
		else if(file == 2) fileText = "core.txt";
		else if(file == 3) fileText = "lowerbody.txt";
		else if(file == 4) fileText = "upperbody.txt";
		try(FileWriter fw = new FileWriter(fileText, true);
		    BufferedWriter bw = new BufferedWriter(fw);
		    PrintWriter out = new PrintWriter(bw))
		{
		    out.println(in.nextLine());
		} catch (IOException e) {
		    System.out.println(e);
		}
	}

	static void generateWorkout(){
		System.out.println("Round one: " + cardio[0] +", " + lower[0] + ", " +core[0]);
		System.out.println("Round two: " + cardio[1] +", " + upper[0] + ", " +lower[1]);
		System.out.println("Round three: " + core[1] + ", " + cardio[3] + ", " + lower[2]);
		System.out.println("Round four: " + upper[1] + ", " + lower[3] + ", " + cardio[4]);
	}

	static int randomIndex(int length){
		System.out.println(length);
		Random rand = new Random();
		int  n = rand.nextInt(length);
		System.out.println(n);
		return n;
	}

	static void randomize( String arr[], int n) { 
        Random r = new Random(); 
        for (int i = n-1; i > 0; i--) { 
            int j = r.nextInt(i); 
            // Swap arr[i] with the element at random index 
            String temp = arr[i]; 
            arr[i] = arr[j]; 
            arr[j] = temp; 
        } 
        // Prints the random array 
        //System.out.println(Arrays.toString(arr)); 
    } 

}

// 3 Upper 
// 3 Lower
// 2 core
// 7 Cardio

// Total of 15 moves 


/* 3 moves 

	- Upper
	- Cardio
	- Lower

	- Cardio
	- Core
	- Cardio

	- Upper
	- Cardio
	- Lower

	- Cardio
	- Core
	- Cardio

	- Upper
	- Cardio
	- Lower

	- Cardio
	- Core
	- Cardio
 
*/
















