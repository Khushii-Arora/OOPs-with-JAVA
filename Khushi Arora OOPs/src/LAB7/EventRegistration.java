package LAB7;

class EventRegistration{
    String name;
    String nameOfEvent;
    double registrationFee;

    EventRegistration(String name, String nameOfEvent, double registrationFee){
        this.name = name;
        this.nameOfEvent = nameOfEvent;
        this.registrationFee = registrationFee;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getNameOfEvent(){
        return nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent){
        this.nameOfEvent = name;
    }

    public String getRegistrationFee(){
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee){
        this.registrationFee = registrationFee;
    }

    public void registerEvent(String nameOfEvent){
        if(nameOfEvent == "ShakeALeg") System.out.println("registration Fee : 100");
        else if(nameOfEvent == "SingAndWin") System.out.println("registration Fee : 150");
        else if(nameOfEvent == "Actathon") System.out.println("registration Fee : 70");
        else if(nameOfEvent == "PlayAway") System.out.println("registration Fee : 130");
    }
    
    
}
