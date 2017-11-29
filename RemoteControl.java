

public class RemoteControl {

   private Device device = null;
   private static final RemoteControl INSTANCE = new RemoteControl();

   private RemoteControl(){
   }

    public static RemoteControl getInstance(){
        return INSTANCE;
    }

    public void operate(Device device){
        this.device= this.device;
        System.out.println("---Connected to:" + device + " ----");
    }

    public void clickOffButton(){
        device.powerOff();
    }

    public void clickOnButton(){
        device.powerOn();
    }
}
