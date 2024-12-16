public class InterfacesInJava {
    public static void main(String[] args) {
        // Create an object of the class that implements the interface
        Queen q= new Queen();
        q.moves();
    }

}

interface CheesPlayer {
    //Abstract function aahe 
    void moves();

}

class Queen implements CheesPlayer {

    // public hehne karan nahi tar to mg default funt hotoy
    public void moves(){
        System.out.println("Queen moves");
    }

}

class Rook implements CheesPlayer {
    public void moves(){
        System.out.println(" Rook moves");
    }

}

class King implements CheesPlayer {
    public void moves(){
        System.out.println("King moves");
    }

}
