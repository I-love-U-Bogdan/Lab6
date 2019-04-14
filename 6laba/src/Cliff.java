public class Cliff extends Thing {
    public Cliff(String name, String direction, ThingActions... thingActions) {
        super(name,direction);
        addThingAction(thingActions);
    }


    public void action() {

    }


    public void getDescribe() {

    }
}
