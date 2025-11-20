import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class SurveyAthlete {

    private String name;
    private String preName;
    private int integerNoBounds;
    private int tempInt;
    private int s;
    private int i;
    private int v;
    private int l;
    private int a;
    private int e;
    private int t;
    private ArrayList<Integer> oneHundred = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);

    public void setName(){
        System.out.println("What is your name? ");
        preName = sc.nextLine();
        name = preName.substring(0,1).toUpperCase() + preName.substring(1).toLowerCase();
    }

    public ArrayList<Integer> completeSurvey(){
        System.out.println("You will now complete the survey.");
        System.out.println("On a scale from 0-100, how much strength do you have?");
        tempInt = noExceptions();
        s = noIntExceptions(tempInt);
        System.out.println("On a scale from 0-100, how much intelligence do you have? ");
        tempInt = noExceptions();
        i = noIntExceptions(tempInt);
        System.out.println("On a scale from 0-100, how much arrogance do you have?");
        tempInt = noExceptions();
        a = noIntExceptions(tempInt);
        System.out.println("On a scale from 0-100, how much speed do you have?");
        tempInt = noExceptions();
        v = noIntExceptions(tempInt);
        System.out.println("On a scale from 0-100, how good are you at working with a team?");
        tempInt = noExceptions();
        t = noIntExceptions(tempInt);
        System.out.println("On a scale from 0-100, how much endurance do you have?");
        tempInt = noExceptions();
        e = noIntExceptions(tempInt);
        System.out.println("On a scale from 0-100, how lazy are you?");
        tempInt = noExceptions();
        l = noIntExceptions(tempInt);
        oneHundred.add(s);
        oneHundred.add(i);
        oneHundred.add(t);
        oneHundred.add(e);
        oneHundred.add(v);
        oneHundred.add(a);
        oneHundred.add(l);
        return oneHundred;
    }

    public int noExceptions(){
        while(true){
            try{
                integerNoBounds = sc.nextInt();
                break;
            }
            catch(InputMismatchException e){
                System.out.println("That is not a number, try again");
                sc.nextLine();
            }
        }
        return integerNoBounds;
    }

    public int noIntExceptions(int integerNoBounds){
        while(integerNoBounds < 0 || integerNoBounds >100){
            System.out.println("This is not a number between 0-100. Try again");
            integerNoBounds = noExceptions();
        }
        return integerNoBounds;
    }
}
