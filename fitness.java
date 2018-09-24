import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.io.*;

public class fitness {
	static String[] upper = {"Push Ups", "Bicep Curls", "Tricep Dips", "Shoulder Press", "Reverse Fly"};
	static String[] lower = {"Plie squats", "Goblet squats", "Lunge Hops", "Deadlift", "Pulsing squats", "Curtsy Lunge to side leg lift", "Wall sprints with band", "Power skip to lunge with floor touch", "Frog hops", "Lateral jumps with bands", "Lateral jumps", "Knee up and out Hops(band)", "Squat jumps"};
	static String[] core = {"Planks", "Side Plank", "Reverse Crunch", "Russian Twists", "V-ups", "Bicycle Crunches"};
	static String[] cardio = {"Burpees", "Mountain Climbers", "Jumping Jacks", "High Knees", "Tuck Jumps", "Heismans", "Diamond Jumps", "Butt kickers", "Jumping jacks", "Jack uppercuts", "High knee torso twist", "Jump turns"};


	public static void main(String[] args) throws Exception{
		System.out.println("What would you like to do?");
		System.out.println("1: Work out");
		randomize(upper, upper.length);
		randomize(lower, lower.length);
		randomize(core, core.length);
		randomize(cardio, cardio.length);
		generateWorkout();
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
















