

public class Projector implements Device {

    public void powerOn(){
        pullDownProjectorScreen();
        System.out.println("projector turned on");
    }

    public void powerOff(){
        pullUpProjectorScreen();
        System.out.println("projector turned on");
    }

    private void pullDownProjectorScreen(){
        System.out.println("Projector screen has been lowered for viewing");
    }

    private void pullUpProjectorScreen(){
        System.out.println("Screen raised back up to close");
    }

    public String toString(){
        return "projector";
    }
}
