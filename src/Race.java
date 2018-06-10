import java.util.Random;

public class Race {
    int tPoints;

    void race(){
        DriversPoints();
        ConstructorPoints();
        TeamPoints();
        Score.driverScore();
        Score.constructorScore();
        Score.teamScore();
    }

    void DriversPoints(){

        for(int i = 0; i<Input.drivers.size();i++){
            int points = Input.drivers.get(i).getPoints() + Points();
            Input.drivers.get(i).setPoints(points);
        }
    }

    void ConstructorPoints(){
        for(int i = 0; i<Input.constructors.size();i++){
            int points = Input.constructors.get(i).getPoints() + Points();
            Input.constructors.get(i).setPoints(points);
        }

    }

    void TeamPoints(){

        for(int y = 0; y<Input.team.size();y++){
            for(int i = 0; i<Input.drivers.size();i++){
                if(Input.team.get(y).getTeamNumber() == Input.drivers.get(i).getTeamNumber()){
                    tPoints += Input.drivers.get(i).getPoints();
                }

            }
            Input.team.get(y).setTotalPoints(tPoints);
            tPoints = 0;
        }





    }

    int Points(){
        Random random = new Random();
        return random.nextInt(10) *10;
    }
}
