
public class SurroundSystem implements Device {

    public void powerOn(){
        switchToFavoriteCD();
        increaseVolume();
        System.out.println("now displaying show on surround sound..");
    }

    public void powerOff(){
        lowerVolume();
        System.out.println("powering down Surround sound...");
    }


    private void increaseVolume(){
        System.out.println("Volume increase to comfortable level on startup");
    }

    private void switchToFavoriteCD(){
        System.out.println("Favorite CD now playing");
    }

    private void lowerVolume(){
        System.out.println("lowering sound volume before closing system");
    }

    public String toString(){
        return "Sound System";
    }
}
