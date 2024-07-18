package lab_4;

// Abstract class to represent a Sport
class Sports {
    // Method to play a sport
    public void play() {
        System.out.println("Playing Sports...!!!");
    }
}

// Class to represent Football (extends Sports)
class Football extends Sports {
    // Override the play method to play Football
    public void play() {
        System.out.println("Playing Football...");
    }
}

// Class to represent Basketball (extends Sports)
class Basketball extends Sports {
    // Override the play method to play Basketball
    public void play() {
        System.out.println("Playing Basketball...");
    }
}

// Class to represent Rugby (extends Sports)
class Rugby extends Sports {
    // Override the play method to play Rugby
    public void play() {
        System.out.println("Playing Rugby...");
    }
}

public class SportMain {

    public static void main(String[] args) {
        // Create a Sports object and play
        Sports s = new Sports();
        s.play();
        
        // Create a Football object and play
        Football sf = new Football();
        sf.play();
        
        // Create a Basketball object and play
        Basketball sb = new Basketball();
        sb.play();
        
        // Create a Rugby object and play
        Rugby sr = new Rugby();
        sr.play();
    }
}

/*Dry Run

Playing Sports...!!!
Playing Football...
Playing Basketball...
Playing Rugby...

*/