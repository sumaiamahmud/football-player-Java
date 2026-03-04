abstract class FootballPlayer {
    private String name;
    private int goalsScored;
    private double monthlySalary;

    public FootballPlayer(String name, int goalsScored, double monthlySalary) {
        this.name = name;
        this.goalsScored = goalsScored;
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    abstract double calculateGoalRate();
}

class LaLigaPlayer extends FootballPlayer {
    private int matchesPlayed;

    public LaLigaPlayer(String name, int goalsScored, double monthlySalary, int matchesPlayed) {
        super(name, goalsScored, monthlySalary);
        this.matchesPlayed = matchesPlayed;
    }

    @Override
    double calculateGoalRate() {
        if (matchesPlayed == 0) {
            return 0.0;
        }
        return (double) getGoalsScored() / matchesPlayed;
    }

    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("League: LaLiga");
        System.out.println("Goals Scored: " + getGoalsScored());
        System.out.println("Goal Rate: " + calculateGoalRate());
        System.out.println();
    }
}

class PremierLeaguePlayer extends FootballPlayer {
    private int matchesPlayed;

    public PremierLeaguePlayer(String name, int goalsScored, double monthlySalary, int matchesPlayed) {
        super(name, goalsScored, monthlySalary);
        this.matchesPlayed = matchesPlayed;
    }

    @Override
    double calculateGoalRate() {
        if (matchesPlayed == 0) {
            return 0.0;
        }
        return (double) getGoalsScored() / matchesPlayed;
    }

    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("League: Premier League");
        System.out.println("Goals Scored: " + getGoalsScored());
        System.out.println("Goal Rate: " + calculateGoalRate());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LaLigaPlayer messi = new LaLigaPlayer("Lionel Messi", 474, 5000000.0, 520);
        PremierLeaguePlayer ronaldo = new PremierLeaguePlayer("Cristiano Ronaldo", 103, 4000000.0, 236);

        messi.printDetails();
        ronaldo.printDetails();
    }
}