package LAB7;

class TeamEventRegistration extends EventRegistration{
    
    int noOfParticipants;
    int noOfTeams;

    TeamEventRegistration(String name, String nameOfEvent, int paticipantsNo, int noOfTeams){
        super(name,nameOfEvent,paticipantsNo);
        super.name = name;
        super.nameOfEvent = nameOfEvent;
        noOfParticipants = paticipantsNo;
        this.noOfTeams = noOfTeams;
    }


    public int getNoOfParticipants(){
        return noOfParticipants;
    }

    public void setNoOfParticipants(int noOfParticipants){
        this.noOfParticipants = noOfParticipants;
    }

    public int getNoOfTeams(){
        return noOfTeams;
    }

    public void getNoOfTeams(int noOfTeams){
        this.noOfTeams = noOfTeams;
    }

    public void registerEvent(){
        if(nameOfEvent == "ShakeALeg") System.out.println("Fee : 50");
        else if(nameOfEvent == "SingAndWin") System.out.println("Fee : 60");
        else if(nameOfEvent == "Actathon") System.out.println("Fee : 80");
        else if(nameOfEvent == "PlayAway") System.out.println("Fee : 100");
    }
    
}
