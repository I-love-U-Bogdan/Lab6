public class Treasure extends Thing {
    public Treasure(String name, String direction, ThingActions... thingActions) {
        super(name,direction);
        addThingAction(thingActions);
    }


    public void action() {

    }


    public void getDescribe() {

    }
}
