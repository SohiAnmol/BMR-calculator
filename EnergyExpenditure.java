import java.util.Scanner;
/**
 * Write a description of class EnergyExpenditure here.
 *
 *Anmoldeep Singh
 *3149800
 *Assignment 2
 *Question 1
 *
 */
public class EnergyExpenditure
{
    public static void main(String[] args){
        String answer="";
        do{
            Scanner kb = new Scanner(System.in);
            double weight, height, age;
            String gender;
            System.out.println("Enter your weight (in kg), height (in cm), age (in years), and gender (m/f):");
            weight = kb.nextDouble();
            height = kb.nextDouble();
            age = kb.nextDouble();
            gender = kb.next();
            double calcbmr=calculateBMR(weight,height,age,gender);
            String selection=displayActivityLevels();
            double af=getActivityFactor(selection);
            double tdee2=calculateTDEE(calcbmr,af);
            displayResults(calcbmr,tdee2);
            System.out.println("");
            System.out.println("Do you want to calculate another TDEE value? (y/n)?");
            answer=kb.next();
            System.out.println("");
        }
        while(answer.equals("y"));
        System.out.println("Goodbye!");
    }

    public static double calculateBMR(double weight,double height,double age,String gender){
        double bmr=0;
        if(gender.equalsIgnoreCase("m"))
            bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        else
            bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        return bmr;
    }

    public static String displayActivityLevels(){
        System.out.println("");
        Scanner kb = new Scanner(System.in);
        System.out.println("select your activity level:");
        System.out.println("[A] Sedentary");    
        System.out.println("[B] Lightly active");    
        System.out.println("[C] Moderate exercise");
        System.out.println("[D] Very active");     
        System.out.println("[E] Extra active");
        return kb.next();
    }

    public static double getActivityFactor( String selection){
        double activityFactor=0;
        switch(selection){
            case "A": activityFactor = 1.2; 
                break;
            case "B": activityFactor = 1.375; 
                break;
            case "C": activityFactor = 1.55; 
                break;
            case "D": activityFactor = 1.725; 
                break;
            case "E": activityFactor = 1.8; 
                break;
            default: activityFactor = 0.0;
        }
        return activityFactor;
    }

    public static double calculateTDEE(double calcbmr,double af){
        double tdee=0;
        tdee = calcbmr * af;
        return tdee;
    }

    public static void displayResults(double calcbmr,double tdee2){
        System.out.println("");
        System.out.println("BMR: " + calcbmr);
        System.out.println("TDEE: " + tdee2);
    }
}
