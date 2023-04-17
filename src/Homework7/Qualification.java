package Homework7;

public class Qualification extends Teacher{

	
	
	 public Qualification(String arg_course, int arg_experienceYears, String arg_schedule){
	        Course = arg_course;
	        ExperienceYears = arg_experienceYears;
	        Schedule = arg_schedule;
	        
	        System.out.println("Qualification (derived) class created ... ");
	    }
	    
	 
	    public void Verify(){
	        if (Course == "Java" && ExperienceYears >= 3 && Schedule == "Afternoon"){
	            System.out.println("You qualify to teach at this school!");
	        } else {
	            System.out.println("You do NOT qualify!");
	        }
	    }
	
	
	
	
}
