public class F1Session {
    public static void main(String[] args){

        inputData();
        Race Canada = new Race();
        Canada.race();

    }

    static void inputData(){
        Input input = new Input();

        Team redBullRacing = new Team();
        Team ferrari = new Team();
        input.inputTeam(redBullRacing,"RedBull Racing",1_000_000,1);
        input.inputTeam(ferrari,"Ferrari",1_500_000,2);

        Driver maxVerstappen = new Driver();
        Driver danielRicciardo = new Driver();
        Driver sebastianVettel = new Driver();

        input.inputDriver(maxVerstappen,"Redbull Racing", "Max Verstappen", 85,1);
        input.inputDriver(danielRicciardo,"Redbull Racing", "Daniel Ricciardo", 89,1);
        input.inputDriver(sebastianVettel,"Ferrari", "Sebastian Vettel", 91,2);

        Constructor redBullRacingConst = new Constructor();
        Constructor ferrariConst = new Constructor();
        input.inputConstructor(redBullRacingConst,"Redbull Racing",1);
        input.inputConstructor(ferrariConst,"Ferrari",2);

    }


}



