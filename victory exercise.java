package Homework.exercise;

public class PatternVictory {
    
    public static void printPattern(String n){
        String name = "Victory is mine";
        int i=name.length();
    

        for(i=0;i<=name.length()+9;i++){
            System.out.print(n);  
        }

    }
    public static void main(String[] args) {
        String name = "Victory is mine";
    for(int j=0;j<=4;j++){
        
    
        printPattern("/");
        
        System.out.println("\n|| " +name +" ||");
        printPattern("\\");
        System.out.println("\n");

    }
        
    }  
    
}