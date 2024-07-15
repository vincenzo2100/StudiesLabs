package ZAD4;
public abstract class Duck {
FlyBehaviour flyBehaviour;
QuackBehavior quackBehavior;

    public Duck(FlyBehaviour flyBehaviour, QuackBehavior quackBehavior) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehavior = quackBehavior;
    }

    public void performSwim(){
        System.out.println("Duck is swimming.");
    }

    public void performFly(){
        this.flyBehaviour.fly();
    }
    public void performQuack(){
        this.quackBehavior.quack();
    }


    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }


    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
