package ZAD4;
import java.util.ArrayList;

public class MainDuckSim {
    public static void main(String[] args) {
        ArrayList<Duck> kaczki = new ArrayList<>();

        kaczki.add(new MallardDuck(new FlyWithWings(),new Quack()));
        kaczki.add(new RubberDuck(new FlyNoWay(),new Squeak()));
        kaczki.add(new ModelDuck(new FlyNoWay(),new MuteQuack()));

        for(Duck a:kaczki)
        {
            a.performFly();
            a.performQuack();
        }
        kaczki.get(1).setFlyBehaviour(new FlyBehaviour() {
            @Override
            public void fly() {
                System.out.println("Duck is flying on a rocket.");
            }
        });
        kaczki.get(1).performFly();
    }
}
