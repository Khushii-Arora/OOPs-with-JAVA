package LAB7;

class SingleEventRegistration extends EventRegistration{
    
    int paticipantsNo;

    SingleEventRegistration(String name, String nameOfEvent, int paticipantsNo){
        super(name,nameOfEvent,paticipantsNo);
        super.name = name;
        super.nameOfEvent = nameOfEvent;
        this.paticipantsNo = paticipantsNo;
    }


    public int getpaticipantsNo(){
        return paticipantsNo;
    }

    public void setpaticipantsNo(int paticipantsNo){
        this.paticipantsNo = paticipantsNo;
    }

    public void registerEvent(String nameOfEvent){
        if(nameOfEvent == "ShakeALeg") System.out.println("Fee : 100");
        else if(nameOfEvent == "SingAndWin") System.out.println("Fee : 150");
        else if(nameOfEvent == "PlayAway") System.out.println("Fee : 130");
    }
    
    public void display() {System.out.println("Thank You" + name + "for your participation Your registration fee is:"+registrationFee
    		+ "You are participant no:");}
}