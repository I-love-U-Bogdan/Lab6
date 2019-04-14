public class Axe extends Thing {
    public Axe(String name, String direction, ThingActions... thingActions) {
        super(name,direction);
        addThingAction(thingActions);
    }


    public void action() {

    }


    public void getDescribe() {

    }
}
