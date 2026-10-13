
class Candidate {
    String name;
    int rollNumber;
    String position;
    int votes;

    
    Candidate() {
        name = "";
        rollNumber = 0;
        position = "";
        votes = 0;
    }

    
    Candidate(String name, int rollNumber, String position, int votes) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.position = position.toUpperCase();
        this.votes = votes;
    }

    
    void registerCandidate(String name, int rollNumber, String position, int votes) {
        this.name = name.toUpperCase();
        this.rollNumber = rollNumber;
        this.position = position.toUpperCase();
        this.votes = votes;
    }

    void registerCandidate(String name, int rollNumber, String position) {
        registerCandidate(name, rollNumber, position, 0);
    }

    void display() {
        System.out.println("Candidate Registered Successfully");
        System.out.println("Candidate Name     : " + name.toUpperCase());
        System.out.println("Roll Number        : " + rollNumber);
        System.out.println("Position           : " + position);
        System.out.println("Votes Received     : " + votes);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("========== STUDENT COUNCIL ELECTION ==========");

        Candidate c1 = new Candidate("Ananya", 101, "President", 125);
        Candidate c2 = new Candidate("Rahul", 102, "President", 98);

        c1.display();
        c2.display();

        
        if (c1.name.isEmpty() || c1.rollNumber <= 0 ||
            c1.position.isEmpty() || c1.votes < 0) {
            System.out.println("Invalid candidate information");
            return;
        }

        
        System.out.println("Duplicate Candidate Check:");
        if (c1.name.equalsIgnoreCase(c2.name)) {
            System.out.println("Candidate Name     : " + c2.name.toUpperCase());
            System.out.println("Status             : Duplicate Nomination");
        } else {
            System.out.println("Status             : No Duplicate Nomination");
        }

        
        System.out.println("\n---------- ELECTION RESULTS ----------");
        if (c1.position.equals(c2.position)) {
            Candidate winner = (c1.votes >= c2.votes) ? c1 : c2;

            System.out.println("Position           : " + winner.position);
            System.out.println("Winning Candidate  : " + winner.name.toUpperCase());
            System.out.println("Total Votes        : " + winner.votes);
        }

        System.out.println("=============================================");
    }
}
