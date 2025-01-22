
import java.util.Scanner;
/**
 * Assignment 1
 * Question 1
 * Anmoldeep Singh
 * 3149800
 */
public class EnergyExpenditure
{
    public static void main(String[]args){
        Scanner kb= new Scanner(System.in);
        
        System.out.println("Enter your weight (in kg), height (in cm), age (in years), and gender (m/f) :");
        double weight=kb.nextDouble();
        int height=kb.nextInt();
        int age=kb.nextInt();
        String gender=kb.next();
        
        System.out.println("Select your activity level:"+"\n[A] Sedentary"+"\n[B] Lightly active"+"\n[C] Moderate exercise"+"\n[D] Very active"+"\n[E] Extra active");
        String opt=kb.next();
        
        double bmr;
        double tdee=0.0;
        
        if(gender.equals("m"))
            bmr=66+(13.7*weight)+(5*height)-(6.8*age);

        else if(gender.equals("f"))
            bmr=655+(9.6*weight)+(1.8*height)-(4.7*age);

        else
            bmr=0.0;
            
        switch(opt){
            case "A":tdee=bmr*(1.2);break;

            case "B":tdee=bmr*(1.375);break;

            case "C":tdee=bmr*(1.55);break;

            case "D":tdee=bmr*(1.725);break;

            case "E":tdee=bmr*(1.9);break;

        }
        System.out.println("BMR: "+bmr);
        System.out.println("TDEE: "+tdee);
    }
}