import java.util.Comparator;


public class Score {



    static void driverScore(){

        Input.drivers.sort( new SortbypointsDriver());

        System.out.println("Race ranking");
        for (int i=0; i<Input.drivers.size(); i++)
            System.out.println( Input.drivers.get(i).toString());
        System.out.println("====================================");

    }

    static void constructorScore(){

        Input.constructors.sort(new SortbypointsConstructor());

        System.out.println("Constructor Ranking");
        for (int i=0; i<Input.constructors.size(); i++)
            System.out.println(Input.constructors.get(i).toString());

        System.out.println("====================================");

    }

    static void teamScore(){

        Input.team.sort(new SortByPointTeam());

        System.out.println("Team ranking");
        for (int i=0; i<Input.team.size(); i++)
            System.out.println( Input.team.get(i).toString());

        System.out.println("====================================");

    }

}

class SortbypointsDriver implements Comparator<Driver>{

    public int compare(Driver b, Driver a)
    {
        return a.getPoints() - b.getPoints();
    }
}

class SortbypointsConstructor implements Comparator<Constructor>{

    public int compare(Constructor b, Constructor a)
    {
        return a.getPoints() - b.getPoints();
    }
}

class SortByPointTeam implements Comparator<Team>{

    public int compare(Team b, Team a)
    {
        return a.getTotalPoints() - b.getTotalPoints();
    }
}