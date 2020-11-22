package diningphilosophers;

public class ChopStick {
    // Le nombre total de baguettes
    private static int stickCount = 0;
    // Le numéro de chaque baguette
    private final int myNumber;
    // Est-ce que ma baguette est libre ?
    private boolean iAmFree = true;

    public ChopStick() {
        // Chaque baguette est numérotée 
        myNumber = ++stickCount;
    }

    // ...
    
    @Override
    public String toString() {
        return "Stick#" + myNumber;
    }

    void take() {
        if (this.iAmFree == true){
           this.iAmFree = false; 
        }
    }

    void release() {
        if (this.iAmFree == false){
            this.iAmFree = true;
        }
    }
}
