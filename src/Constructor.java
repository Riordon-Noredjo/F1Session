public class Constructor extends Team {
    private String teamName;
    private int racePoints;
    private int totalPoints;
    private int teamNumber;

    @Override
    public String getTeamName() {
        return teamName;
    }

    @Override
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }


    @Override
    public int getTeamNumber() {
        return teamNumber;
    }

    @Override
    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    @Override
    public int getRacePoints() {
        return racePoints;
    }

    @Override
    public void setRacePoints(int racePoints) {
        this.racePoints = racePoints;
    }

    @Override
    public int getTotalPoints() {
        return totalPoints;
    }

    @Override
    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    @Override
    public String toString() {
        return "Constructor{" +
                "teamName='" + teamName + '\'' +
                ", racePoints=" + racePoints +
                ", totalPoints=" + totalPoints +
                ", teamNumber=" + teamNumber +
                '}';
    }
}