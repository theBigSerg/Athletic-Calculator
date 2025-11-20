import java.util.ArrayList;

public class AthleticCalculator {

    private int strength;
    private int intelligence;
    private int teamwork;
    private int endurance;
    private int speed;
    private int arrogance;
    private int lazy;
    private double strengthP;
    private double intelligenceP;
    private double teamworkP;
    private double enduranceP;
    private double speedP;
    private double arroganceP;
    private double lazyP;

    //inteligence = 1; strength = 2; endurance = 3; teamwork = 4; speed = 5; arrogance = -2; lazy = -1;
    //40%; 25%, 20%, 10%, 5%                                                 20%, 30%
    public AthleticCalculator(ArrayList<Integer> oneHundred){
        strength = oneHundred.get(0);
        intelligence = oneHundred.get(1);
        teamwork = oneHundred.get(2);
        endurance = oneHundred.get(3);
        speed = oneHundred.get(4);
        arrogance = oneHundred.get(5);
        lazy = oneHundred.get(6);
    }


    //mutators for all traits
    public void setStrength(int s){
        strength = s;
    }
    public void setIntelligence(int i){
        intelligence = i;
    }
    public void setTeamwork(int t){
        teamwork = t;
    }
    public void setEndurance(int e){
        endurance = e;
    }
    public void setSpeed(int v){
        speed = v;
    }
    public void setArrogance(int a){
        arrogance = a;
    }
    public void setLazy(int l){
        lazy = l;
    }

    //accessors for all traits
    public int getStrength(){
        return strength;
    }
    public int getIntelligence(){
        return intelligence;
    }
    public int getTeamwork(){
        return teamwork;
    }
    public int getEndurance(){
        return endurance;
    }
    public int getSpeed(){
        return speed;
    }
    public int getArrogance(){
        return arrogance;
    }
    public int getLazy(){
        return lazy;
    }

    

    public String toString(){
        return "-----------------------------\nStrength: "+getStrength()+"\nIntelligence: "+getIntelligence()+"\nTeamwork: "+getTeamwork()+"\nEndurance: "+getEndurance()+"\nSpeed: "+getSpeed()+"\nArrogance: "+getArrogance()+"\nLaziness: "+getLazy()+"\n-----------------------------";
    
    }

    public void print(){
        strengthP = strength/100.0*0.25;
        intelligenceP = intelligence/100.0*0.4;
        teamworkP = teamwork/100.0*0.1;
        enduranceP = endurance/100.0*0.2;
        speedP = speed/100.0*0.05;
        arroganceP = arrogance/100.0*0.2;
        lazyP = lazy/100.0*0.3;
        //System.out.println(strengthP);
        //System.out.println(intelligenceP);
        //System.out.println(enduranceP);
        //System.out.println(speedP);
        //System.out.println(teamworkP);
       // System.out.println(lazyP);
       // System.out.println(arroganceP);
        double overall = strengthP+intelligenceP+teamworkP+enduranceP+speedP-arroganceP-lazyP;
        System.out.println("You are: "+overall*100+"% a full athlete");
    }





}
