import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkoutGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Welcome to the all pro Workout Generator!");
	    
	    System.out.println("Select today's muscle group : ");
	    System.out.println("Upper Body");
	    System.out.println("Lower Body");
	    
	    String muscleGroup = scanner.nextLine();
	    
	    List<Exercise> workoutPlan = generateWorkout(muscleGroup, scanner);
	    
	    
	    scanner.close();
	    
	}

	private static List<Exercise> generateWorkout(String muscleGroup, Scanner scanner){
		List<Exercise> workoutPlan = new ArrayList<>();
		
		switch(muscleGroup) {
		case "Upper Body":
			System.out.println("Select Upper Body Workout : ");
			System.out.println("Push");
			System.out.println("Pull");
			String upperBodyWorkout = scanner.nextLine();
			
			 switch (upperBodyWorkout.toLowerCase()) {
             case "push":
            	 enterPushWorkout();
                 showPushExercises();
                 addExercisesToWorkout(scanner, workoutPlan);
                 break;

             case "pull":
            	 enterPullWorkout();
                 showPullExercises();
                 addExercisesToWorkout(scanner, workoutPlan);
                 break;

             default:
                 System.out.println("Invalid workout type. Please select a valid workout.");
                 break;
         }
         break;

     case "Lower Body":
         System.out.println("Select Lower Body Workout : ");
         System.out.println("Legs");
         System.out.println("Cardio");
         String lowerBodyWorkout = scanner.nextLine();
         
         switch(lowerBodyWorkout.toLowerCase()) {
         case "legs" :
        	 enterLegsWorkout();
        	 showLegsExercises();
        	 addExercisesToWorkout(scanner, workoutPlan);
        	 break;
        
         case "cardio" :
        	 enterCardioWorkout();
        	 showCardioExercises();
        	 addExercisesToWorkout(scanner, workoutPlan);
        	 break;
        	 
         default :
        	 System.out.println("Invalid workout type. Please select a valid workout.");
        	 break;
         }
         break;

     default:
         System.out.println("Invalid muscle group. Exiting...");
         System.exit(0);
 }

 return workoutPlan;
}
	private static void enterPushWorkout() {
		System.out.println("You've selected a Push workout today, which involves push like movements. "
				+ "Here is a selection of the most popular exercises associated with the push workout split :");
	}
	
	private static void enterPullWorkout() {
		System.out.println("You've selected a Pull workout today, which involves pull like movements. "
				+ "Here is a selection of the most popular exercises associated with the pull workout split :");
	}
	
	private static void enterLegsWorkout() {
		System.out.println("You've selected a Leg workout today, which incorporates all of your leg muscles."
                + "Here is a selection of the most popular exercises associated with the leg workout split : ");
	}
	
	private static void enterCardioWorkout() {
		System.out.println("You've selected a Cardio workout today, how brave of you! What type of exercise would you like to do?");
	}
	
	private static void showPushExercises() {
		System.out.println("Bench Press | Incline Bench Press | Decline Bench Press | Chest Flys | \nOverhead Press | Shoulder Press | Lateral Raises |"
				+ " Tricep Pushdown | \nOverhead Tricep Extension | Skullcrushers | Pushups | Dips | ");
	}
	
	private static void showPullExercises() {
		System.out.println("Deadlift | Barbell Row | Lat Pulldown | Lat Pullover | \nSeated Cable Row | Shrugs | Face Pulls|"
				+ " Pullups | \nBicep Curls | Incline Bicep Curls | Hammer Curls | Preacher Curls |");
	}
	
	private static void showLegsExercises() {
        System.out.println("Squat | Pause Squat | Hack Squat | Bulgarian Split Squat | \nGoblet Squat | Leg Press | Lunges |"
                + " Reverse Lunges | \nRomanian Deadlift | Leg Extension | Hamstring Curl | Calf Raises |");
	}
	
	private static void showCardioExercises() {
		System.out.println("Treadmill | Incline Treadmill | Stairmaster | High Intensity Interval Training | Plyometrics | Tempo Run");
	}
	
	private static List<Exercise> addExercisesToWorkout(Scanner scanner, List<Exercise> workoutPlan) {
		while (true) {
	        System.out.println("\nWhat exercises interests you?");
	        String exerciseName = scanner.nextLine();
	        Exercise selectedExercise = getExerciseDetails(exerciseName);
	        
	        
	        if (selectedExercise != null) {
	            System.out.println("\nDo you want to add this exercise to your workout? (yes/no)");
	            String addExerciseChoice = scanner.nextLine().toLowerCase();
	            
	            if (addExerciseChoice.equals("yes")) {
	                workoutPlan.add(selectedExercise);
	                System.out.println("Exercise added to your workout!");
	            } else {
	                System.out.println("Exercise not added to your workout.");
	            }

	            System.out.println("\nDo you want to add more exercises to your workout? (yes/no)");
	            String addMoreExercisesChoice = scanner.nextLine().toLowerCase();

	            if (!addMoreExercisesChoice.equals("yes")) {
	                break;
	            } else {
	                
	                if (selectedExercise instanceof Push) {
	                    showPushExercises();
	                } else if (selectedExercise instanceof Pull) {
	                    showPullExercises();
	                } else if (selectedExercise instanceof Legs) {
	                    showLegsExercises();
	                } else if (selectedExercise instanceof Cardio) {
	                    showCardioExercises();
	                }
	            }
	        } 	
	    }
		
		
		System.out.println("\nHere is your workout for today!");
	    for (Exercise exercise : workoutPlan) {
	        System.out.println(exercise.toStringPlan());
	    }
	    int totalCalories = calculateCalories(workoutPlan);
	    System.out.println("Total calories burned: " + calculateCalories(workoutPlan));
	    System.out.println("\nIt is a common idea to finish your workout with some core exercises. Would you like to do some abs blasters?");
	    String addCoreFinisher = scanner.nextLine().toLowerCase();
	    if(addCoreFinisher.equals("yes")) {
	    	System.out.println("Great! A cycle of situps, leg raises, and planks for 5 minutes should be enough.");
	    	totalCalories += 120;   	
	    } else {
	    	System.out.println("That's okay, you worked hard enough already!");
	    }
	    System.out.println("Final total calories burned : " + totalCalories);
	    return workoutPlan; 
	    
	    
	}
	
	 private static int calculateCalories(List<Exercise> workoutPlan) {
	        int totalCalories = 0;
	        for (Exercise exercise : workoutPlan) {
	            totalCalories += exercise.getCalories();
	        }
	        return totalCalories;
	    }
	
	private static Exercise getExerciseDetails(String exerciseName) {
        switch (exerciseName.toLowerCase()) {
            case "bench press":
                BenchPress benchPress = new BenchPress();
                System.out.println(benchPress.toString());
                return benchPress;
            case "incline bench press":
                InclineBenchPress inclineBenchPress = new InclineBenchPress();
                System.out.println(inclineBenchPress.toString());
                return inclineBenchPress;
            case "decline bench press":
            	DeclineBenchPress declineBenchPress = new DeclineBenchPress();
            	System.out.println(declineBenchPress.toString());
            	return declineBenchPress;
            case "chest flys":
            	ChestFlys chestFlys = new ChestFlys();
            	System.out.println(chestFlys.toString());
            	return chestFlys;
            case "military press":
            	MilitaryPress militaryPress = new MilitaryPress();
            	System.out.println(militaryPress.toString());
            	return militaryPress;
            case "shoulder press":
            	ShoulderPress shoulderPress = new ShoulderPress();
            	System.out.println(shoulderPress.toString());
            	return shoulderPress;
            case "lateral raises":
            	LateralRaises lateralRaises = new LateralRaises();
            	System.out.println(lateralRaises.toString());
            	return lateralRaises;
            case "tricep pushdown":
            	TricepPushdown tricepPushdown = new TricepPushdown();
            	System.out.println(tricepPushdown.toString());
            	return tricepPushdown;
            case "overhead tricep extension":
            	OverheadTricepExtension overheadTricepExtension = new OverheadTricepExtension();
            	System.out.println(overheadTricepExtension.toString());
            	return overheadTricepExtension;
            case "skullcrushers":
            	SkullCrushers skullCrushers = new SkullCrushers();
            	System.out.println(skullCrushers.toString());
            	return skullCrushers;
            case "pushups":
            	Pushups pushups = new Pushups();
            	System.out.println(pushups.toString());
            	return pushups;
            case "dips":
            	Dips dips = new Dips();
            	System.out.println(dips.toString());
            	return dips;
            case "deadlift":
            	Deadlift deadlift = new Deadlift();
            	System.out.println(deadlift.toString());
            	return deadlift;
            case "barbell row":
            	BarbellRow barbellRow = new BarbellRow();
            	System.out.println(barbellRow.toString());
            	return barbellRow;
            case "lat pulldown":
            	LatPulldown latPulldown = new LatPulldown();
            	System.out.println(latPulldown.toString());
            	return latPulldown;
            case "lat pullover":
            	LatPullover latPullover = new LatPullover();
            	System.out.println(latPullover.toString());
            	return latPullover;
            case "seated cable row":
            	SeatedCableRow seatedCableRow = new SeatedCableRow();
            	System.out.println(seatedCableRow.toString());
            	return seatedCableRow;
            case "shrugs":
            	Shrugs shrugs = new Shrugs();
            	System.out.println(shrugs.toString());
            	return shrugs;
            case "face pulls":
            	FacePulls facePulls = new FacePulls();
            	System.out.println(facePulls.toString());
            	return facePulls;
            case "pullups":
            	Pullups pullups = new Pullups();
            	System.out.println(pullups.toString());
            	return pullups;
            case "bicep curls":
            	BicepCurls bicepCurls = new BicepCurls();
            	System.out.println(bicepCurls.toString());
            	return bicepCurls;
            case "incline bicep curls":
            	InclineBicepCurls inclineBicepCurls = new InclineBicepCurls();
            	System.out.println(inclineBicepCurls.toString());
            	return inclineBicepCurls;
            case "hammer curls":
            	HammerCurls hammerCurls = new HammerCurls();
            	System.out.println(hammerCurls.toString());
            	return hammerCurls;
            case "preacher curls":
            	PreacherCurls preacherCurls = new PreacherCurls();
            	System.out.println(preacherCurls.toString());
            	return preacherCurls;
            case "squat":
            	Squat squat = new Squat();
            	System.out.println(squat.toString());
            	return squat;
            case "pause squat":
            	PauseSquat pauseSquat = new PauseSquat();
            	System.out.println(pauseSquat.toString());
            	return pauseSquat;
            case "hack squat":
            	HackSquat hackSquat = new HackSquat();
            	System.out.println(hackSquat.toString());
            	return hackSquat;
            case "bulgarian split squat":
            	BulgarianSplitSquat bulgarianSplitSquat = new BulgarianSplitSquat();
            	System.out.println(bulgarianSplitSquat.toString());
            	return bulgarianSplitSquat;
            case "goblet squat":
            	GobletSquat gobletSquat = new GobletSquat();
            	System.out.println(gobletSquat.toString());
            	return gobletSquat;
            case "leg press":
            	LegPress legPress = new LegPress();
            	System.out.println(legPress.toString());
            	return legPress;
            case "lunges":
            	Lunges lunges = new Lunges();
            	System.out.println(lunges.toString());
            	return lunges;
            case "reverse lunges":
            	ReverseLunges reverseLunges = new ReverseLunges();
            	System.out.println(reverseLunges.toString());
            	return reverseLunges;
            case "romanian deadlift":
            	RomanianDeadlift romanianDeadlift = new RomanianDeadlift();
            	System.out.println(romanianDeadlift.toString());
            	return romanianDeadlift;
            case "leg extension":
            	LegExtension legExtension = new LegExtension();
            	System.out.println(legExtension.toString());
            	return legExtension;
            case "hamstring curl":
            	HamstringCurl hamstringCurl = new HamstringCurl();
            	System.out.println(hamstringCurl.toString());
            	return hamstringCurl;
            case "calf raises":
            	CalfRaise calfRaise = new CalfRaise();
            	System.out.println(calfRaise.toString());
            	return calfRaise;
            case "treadmill":
            	Treadmill treadmill = new Treadmill();
            	System.out.println(treadmill.toString());
            	return treadmill;
            case "incline treadmill":
            	InclineTreadmill inclineTreadmill = new InclineTreadmill();
            	System.out.println(inclineTreadmill.toString());
            	return inclineTreadmill;
            case "stairmaster":
            	Stairmaster stairmaster = new Stairmaster();
            	System.out.println(stairmaster.toString());
            	return stairmaster;
            case "high intensity interval training":
            	HIIT hiit = new HIIT();
            	System.out.println(hiit.toString());
            	return hiit;
            case "plyometrics":
            	Plyometrics plyometrics = new Plyometrics();
            	System.out.println(plyometrics.toString());
            	return plyometrics;
            case "tempo run":
            	TempoRun tempoRun = new TempoRun();
            	System.out.println(tempoRun.toString());
            	return tempoRun;
            	

            default:
                System.out.println("Invalid exercise name. Please select a valid exercise.");
                return null;
        }
    }
}
