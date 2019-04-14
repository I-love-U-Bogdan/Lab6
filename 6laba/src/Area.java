public class Area extends Thing {
    public Area(String name, String direction, ThingActions ... thingActions) {
        super(name, direction);
        addThingAction(thingActions);
        }
private Seashells seashells = new Seashells();//Вложенные внутренние классы, просто потому что надо

    public void action() {

    }


    public void getDescribe() {
        System.out.print(" песчаная");
    }
    public class Seashells{

    }
}

