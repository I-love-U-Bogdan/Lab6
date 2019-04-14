public class Grotto extends Thing {
    public Grotto(String name, String direction, ThingActions... thingActions) {
        super(name, direction);
        addThingAction(thingActions);
    }


    public void action() {

    }


    public void getDescribe() {
        System.out.print(" небольшой");
    }
}
