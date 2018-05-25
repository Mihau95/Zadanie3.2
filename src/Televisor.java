class Televisor {
    String stat;

    Televisor(){
        stat="Off";
    }

    void turnOn(){
        stat="On";
    }

    void turnOff(){
        stat="Off";
    }

    void showStatus(){
        System.out.println("TV status: "+stat);
    }
}