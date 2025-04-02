package OOPS.interfACE;

public class car  implements engine,Brake{
    @Override
    public void brake() {
        System.out.println("I will Brake Like Normal Brake");
    }

    @Override
    public void Start() {
        System.out.println("I will Start Like Normal Start");
    }

    @Override
    public void Stop() {
        System.out.println("I will Stop Like Normal Stop");
    }

    @Override
    public void Acc() {
        System.out.println("I will Acc Like Normal Acc");
    }
}
