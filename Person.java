
public class Person {

    public static void main(String  args[]){
        Projector sanyo = new Projector();
        TV lg = new TV();

        RemoteControl control = RemoteControl.getInstance();

        control.clickOnButton();
        control.operate(sanyo);



        control.operate(lg);
        control.clickOnButton();


    }
}
