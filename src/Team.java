public class Team{
    private String teamName;
    private int budget;
    private int racePoints;
    private int totalPoints;
    private int teamNumber;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getBudget() {
        return budget;
    }

    public int getRacePoints() {
        return racePoints;
    }

    public void setRacePoints(int racePoints) {
        this.racePoints = racePoints;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", budget=" + budget +
                ", racePoints=" + racePoints +
                ", totalPoints=" + totalPoints +
                ", teamNumber=" + teamNumber +
                '}';
    }
}