public class Attendee extends User{

    public Attendee(String name, int age){
        super(name, age);
    }
    public Attendee(String name){
        super(name);
    }
    public boolean hasPaid(){
        return false;
    }



}

