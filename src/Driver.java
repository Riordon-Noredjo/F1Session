public class Driver extends Team implements Ranking{
    private String driverName;
    private String teamName;
    private int skills;
    private int racePoints;
    private int totalPoints;
    private int teamNumber;


    public int ranking(int racePoints){


        return 0;
    }


    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String getTeamName() {
        return teamName;
    }

    @Override
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getSkills() {
        return skills;
    }

    public void setSkills(int skills) {
        this.skills = skills;
    }

    public int getRacePoints() {
        return racePoints;
    }

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
    public int getTeamNumber() {
        return teamNumber;
    }

    @Override
    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }


    @Override
    public String toString() {
        return "Driver{" +
                "driverName='" + driverName + '\'' +
                ", teamName='" + teamName + '\'' +
                ", skills=" + skills +
                ", racePoints=" + racePoints +
                ", totalPoints=" + totalPoints +
                ", teamNumber=" + teamNumber +
                '}';
    }
}