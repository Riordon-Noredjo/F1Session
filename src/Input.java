import java.util.ArrayList;

public class Input{
    static ArrayList<Team> team = new ArrayList<Team>();
    static ArrayList<Driver> drivers = new ArrayList<Driver>();
    static ArrayList<Constructor> constructors = new ArrayList<Constructor>();

    void inputTeam(Team t, String teamName, int Budget, int teamNumber) {
        t.setTeamName(teamName);
        t.setBudget(Budget);
        t.setTeamNumber(teamNumber);
        team.add(t);
    }

    void inputDriver(Driver d, String teamName, String driverName, int skills, int teamNumber){
        d.setTeamName(teamName);
        d.setDriverName(driverName);
        d.setSkills(skills);
        d.setTeamNumber(teamNumber);
        drivers.add(d);
    }

    void inputConstructor(Constructor c, String teamName, int teamNumber){
        c.setTeamName(teamName);
        c.setTeamNumber(teamNumber);
        constructors.add(c);
    }

}

