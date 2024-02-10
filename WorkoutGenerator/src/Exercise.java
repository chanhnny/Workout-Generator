
public class Exercise {
	String name;
	String description;
	String equipment;
	String muscleGroup;
	int calories;
	
	public Exercise(String name, String description, String equipment, String muscleGroup, int calories) {
		this.name = name;
		this.description = description;
		this.equipment = equipment;
		this.muscleGroup = muscleGroup;
		this.calories = calories;
	}
	
	public String toString() {
		return "\nExercise: " + name + "\nDescription: " + description + "\nEquipment: " + equipment + "\nMuscle Group: " + muscleGroup + "\nCalories: " + calories;
	}

	public String toStringPlan() {
		return name;
	}
	
	public int getCalories() {
		return calories;
	}
}

class Push extends Exercise {
	public Push(String name, String description, String equipment, String muscleGroup, int calories) {
		super(name, description, equipment, muscleGroup, calories);
	}
}

class Pull extends Exercise {
	public Pull(String name, String description, String equipment, String muscleGroup, int calories) {
		super(name, description, equipment, muscleGroup, calories);
	}
}

class Legs extends Exercise {
	public Legs(String name, String description, String equipment, String muscleGroup, int calories) {
		super(name, description, equipment, muscleGroup, calories);
	}
}

class Cardio extends Exercise {
	public Cardio (String name, String description, String equipment, String muscleGroup, int calories) {
		super(name, description, equipment, muscleGroup, calories);
	}
}

class BenchPress extends Push {
	public BenchPress() {
		super("Bench Press", "Compound exercise that involves laying on a flat angle, lowering the weight down to your chest and pressing upwards.",
				 "Barbell or Dumbbells, flat bench", "Chest, Shoulders, Triceps", 100);
	}
}

class InclineBenchPress extends Push {
	public InclineBenchPress() {
		super("Incline Bench Press", "Compound exercise that involves laying on a incline angle, lowering the weight down to your chest and pressing upwards.",
				"Barbell or Dumbbells, Inclined Bench", "Upper Chest, Shoulders, Triceps", 50);
	}
}

class DeclineBenchPress extends Push {
	public DeclineBenchPress() {
		super("Decline Bench Press", "Compound exercise that involves laying on a declined angle, lowering the weight down to your chest and pressing upwards.",
				 "Barbell or Dumbbells, Declined Bench", "Lower Chest, Shoulders, Triceps", 50);		
	}
}

class ChestFlys extends Push {
	public ChestFlys() {
		super("Chest Flys", "Isolation Exercise that invovles lowering dumbbells in an arc motion. Squeeze your chest as you extend your arms up.",
				 "Dumbbells, flat bench", "Pectorials", 50);		
	}
}

class MilitaryPress extends Push {
	public MilitaryPress() {
		super("Military Press", "Compound movement exercise that involves pressing weight above the head while standing. ",
				 "Barbell or Dumbbells", "Shoulders, Triceps, Core", 50);		
	}
}

class ShoulderPress extends Push {
	public ShoulderPress() {
		super("Shoulder Press", "Compound exercise that invovles pressing weight above the head while sitting.",
				 "Dumbbells, Seated bench", "Shoulder and Triceps", 50);		
	}
}

class LateralRaises extends Push {
	public LateralRaises() {
		super("Lateral Raises", "Isolation exercise that involves lifting weight away from the body, starting from the side.",
				 "Dumbbells", "Middle Deltoids", 25);		
	}
}

class TricepPushdown extends Push {
	public TricepPushdown() {
		super("Tricep Pushdown", "Isolation Exercise that invovles pushing straight down a weight from a bar. Keep elbows still, chest up, and shoulders back.",
				 "Cable machine, bar or rope.", "Triceps", 25);		
	}
}

class OverheadTricepExtension extends Push {
	public OverheadTricepExtension() {
		super("Overhead Tricep Extension", "Isolation Exercise that invovles holding weight overhead, lowering it with elbows, and raising it back up.",
				 "Dumbbells", "Triceps", 25);		
	}
}

class SkullCrushers extends Push {
	public SkullCrushers() {
		super("Skull Crushers", "Isolation Exercise starting with lying on your back and bringing the weight down past your head. Keep elbows still.",
				 "Barbell, Dumbbells", "Triceps", 25);		
	}
}

class Pushups extends Push {
	public Pushups() {
		super("Pushups", "Compound exercise that activates muscles across the whole body. Start in a plank position, and lower yourself until a 90 degree angle in your elbows. Then pushup!",
				 "Bodyweight, weight", "Chest, Shoulders, Triceps, Core", 75);		
	}
}

class Dips extends Push {
	public Dips() {
		super("Dips", "Compound exercise starting with raising yourself on two bars. Lower your body and push yourself back up. Can add weight!",
				 "Dip bars, added weight if necessary", "Chest, Shoulder, Triceps", 50);		
	}
}

class Deadlift extends Pull {
	public Deadlift() {
		super("Deadlift", "Compound movementinvolving lifting a weight from the ground into an upright position. Keep back flat.", 
				"Barbell", "Glutes, Hamstrings, Core, Lower Back, Quadriceps.", 100);
	}
}

class BarbellRow extends Pull {
	public BarbellRow() {
		super("Barbell Row", "Compound exercise where you are slightly bent over and pull the barbell towards your chest.", 
				"Barbell", "Back, Arms, Core", 50);
	}
}

class LatPulldown extends Pull {
	public LatPulldown() {
		super("Cable Machine", "Compound exercise focused on pulling down weight from a high position to your chest.", 
				"Cable machine, Bar Grip, Seated", "Lats, Upper Back, Biceps, Rear Deltoids, Rhomboids", 50);
	}
}

class LatPullover extends Pull {
	public LatPullover() {
		super("Lat Pullover", "Isolation exercise focused on pulling weight down while your arms are straight out. Stand in a slightly bent over poisition.", 
				"Cable machine, Bar Grip", "Lats", 25);
	}
}

class SeatedCableRow extends Pull {
	public SeatedCableRow() {
		super("Seated Cable Rows", "Compound exercise focused on pulling weight in front of you straight to abdomen. Sit upright with shoulders back. Pull with elbows.", 
				"Cable machine, Bar Grip", "Lats, Biceps, Rear Deltoids, Rhomboids", 50);
	}
}

class Shrugs extends Pull {
	public Shrugs() {
		super("Shrugs", "Isolation exercise where you keep your arms straight as you lift your shoudlers towards your ear.", 
				"Dumbbells", "Trapezius", 25);
	}
}

class FacePulls extends Pull {
	public FacePulls() {
		super("Face Pulls", "Compound exercise focused on pulling rope towards your face while standing upright.", 
				"Cable machine, Rope Grip", "Upper Back, Traps, Rear Deltoids", 50);
	}
}

class BicepCurls extends Pull {
	public BicepCurls() {
		super("Bicep Curls", "Isolation movement in whicn you curl your arms upward, while keeping the elbow still.", 
				"Dumbbells, Barbell", "Biceps", 25);
	}
}

class InclineBicepCurls extends Pull {
	public InclineBicepCurls() {
		super("Incline Bicep Curls", "Isolation movement in which you curl your arms upward, but starting on an incline bench so that your arms are further back.", 
				"Inclined Bench, Dumbbells", "Biceps (Long Head)", 25);
	}
}

class HammerCurls extends Pull {
	public HammerCurls() {
		super("Hammer Curls", "Isolation exercise in which you curl your arms upward, but with a different grip. Palms facing each other. ", 
				"Dumbbells", "Biceps (Brachioradialis)", 25);
	}
}

class PreacherCurls extends Pull {
	public PreacherCurls() {
		super("Preacher Curls", "Isolation exercise in which you curl your arms upward, but your arms are lying flat in front of you from a supported machine.", 
				"Preacher Curl Bench", "Biceps (Short Head)", 25);
	}
}

class Pullups extends Pull {
	public Pullups() {
		super("Pullups", "Compound exercise involving pulling your whole body up as it's hanging. The most well rounded pull exercise!", 
				"Pullup Bar, weight", "Lats, Traps, Rhomboids, Biceps, Rear Deltoids, Core", 75);
	}
}

class Squat extends Legs {
	public Squat() {
		super("Squat", "Compound exercise where you lower your hips from a standing position and standing back up. The most well rounded leg exercise!",
				"Barbell, Dumbbells, Bodyweight", "Quadriceps, Glutes, Hamstrings, Abductors, Calves, Lower back, Core", 100);
	}
}

class PauseSquat extends Legs {
	public PauseSquat() {
		super("Pause Squat", "Compound exercise just like a squat, but when you lower yourself, you will pause for about a second before standing up.",
				"Barbell, Dumbbells, Bodyweight", "Quadriceps, Glutes, Hamstrings, Abductors, Calves, Lower back, Core", 50);
	}
}

class HackSquat extends Legs {
	public HackSquat() {
		super("Hack Squat", "Compound exercise involving a hack squat machine, leaning on pads at an angle. This brings more focus on your legs and less on your back",
				"Barbell, Dumbbells, Bodyweight", "Quadriceps, Glutes, Hamstrings, Abductors, Calves", 50);
	}
}

class BulgarianSplitSquat extends Legs {
	public BulgarianSplitSquat() {
		super("Bulgarian Split Squat", "Compound exercise where you lower you isolate one of your legs up, then perform the squat movement.",
				"Dumbbells, Bodyweight", "Quadriceps, Glutes, Hamstrings, Abductors, Calves, Lower back, Core", 50);
	}
}

class GobletSquat extends Legs {
	public GobletSquat() {
		super("Goblet Squat", "Compound exercise where you lower your hips from a from a close feet V position, then stand back up.",
				"Dumbbells", "Quadriceps (BIG emphasis), Glutes, Hamstrings, Abductors, Calves, Lower back, Core, Arms", 50);
	}
}

class LegPress extends Legs {
	public LegPress() {
		super("Squats", "Compound exercise where you lower your hips from a standing position and standing back up. The most well rounded leg exercise!",
				"Leg Press Machine", "Quadriceps, Glutes, Hamstrings, Abductors, Calves", 50);
	}
}

class Lunges extends Legs {
	public Lunges() {
		super("Lunges", "Compound exercise where you step forward in a long stride and lower your hips like a squat. Keep posture upright!",
				"Barbell, Dumbbells, Bodyweight", "Quadriceps, Glutes, Hamstrings, Abductors, Calves, Core", 50);
	}
}

class ReverseLunges extends Legs {
	public ReverseLunges() {
		super("Reverse Lunges", "Compound exercise where you step backward in a long stride and lower your hips like a squat. Keep posture upright!",
				"Barbell, Dumbbells, Bodyweight", "Quadriceps, Glutes, Hamstrings, Abductors, Calves, Core", 50);
	}
}

class RomanianDeadlift extends Legs {
	public RomanianDeadlift() {
		super("Romanian Deadlift", "Compound exercise where you bendover without bending knees much, and keeping weight towards your shins. Keep back straight. ",
				"Barbell, Dumbbells", "Glutes, Hamstrings", 50);
	}
}

class LegExtension extends Legs {
	public LegExtension() {
		super("Leg Extension", "Isolation movement involving a lever machine, with a padded bar against your legs. Raise it up while sitting back.",
				"Leg Extension Machine", "Quadriceps", 25);
	}
}

class HamstringCurl extends Legs {
	public HamstringCurl() {
		super("Hamstring Curl", "Isolation movement involving a lever machine with a padded bar underneath your legs. Push it down while sitting back.",
				"Hamstring Curl Machine", "Hamstrings", 25);
	}
}

class CalfRaise extends Legs {
	public CalfRaise() {
		super("Calf Raises", "Isolation exercise where you raise yourself by tiptoeing.",	
				"Dumbbells, Bodyweight", "Calves", 25);
	}
}

class Treadmill extends Cardio {
	public Treadmill() {
		super("Treadmill", "Machine that stimulates walking, or running! Steady exercise to get your heart rate up!",	
				"Treadmill machine", "Cardiovascular System, Full Body", 200);
	}
}

class InclineTreadmill extends Cardio {
	public InclineTreadmill() {
		super("Incline Treadmill", "Go at your own speed, with an incline! Good to tone up.",	
				"Treadmill machine with incline", "Cardiovascular System, Full Body", 250);
	}
}

class Stairmaster extends Cardio {
	public Stairmaster() {
		super("Stairmaster", "Machine that mimics going up the stairs.",	
				"Stairmaster machine", "Cardiovascular System, Full Body, Legs", 200);
	}
}

class HIIT extends Cardio {
	public HIIT() {
		super("High Intensity Interval Training", "Intense workout composed of full body movements at a high speed. Minimal rest periods. ",	
				"Bodyweight exercises (pushups, pullups, squats, etc.)", "Cardiovascular System, Full Body", 500);
	}
}

class Plyometrics extends Cardio {
	public Plyometrics() {
		super("Plyometrics", "Intense movements that revolve around athleticism. Involves a lot of jumping and bursty movements.",	
				"Bodyweight exercises (box jumps, lateral jumps, pogo jumps, etc.)", "Cardiovascular System, Full Body", 400);
	}
}

class TempoRun extends Cardio {
	public TempoRun() {
		super("Tempo Run", "Long distance runnning, go at your own pace!",	
				"Trail, Anywhere.", "Cardiovascular System, Full Body", 300);
	}
}