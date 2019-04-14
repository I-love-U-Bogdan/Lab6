import java.util.ArrayList;

public abstract class Trolls {
    public String TrollName;
    public Trolls(String TrollName){
        this.TrollName = TrollName;
    }
    public ArrayList<ThingActions> ThingActionList= new ArrayList<ThingActions>();
    public ArrayList<Thing> Inventory = new ArrayList<Thing>();

    public void addThingAction(ThingActions ... thingActions){
        for(ThingActions thAc : thingActions){
            ThingActionList.add(thAc);
        }
    }
    public void take(Thing...things){
       System.out.print( getName() + " положил в инвентарь ");
        for (Thing thing : things){
            Inventory.add(thing);
            System.out.print(thing.getName() + " ");
        }
        System.out.println();
    }
    public void openChest (Thing thing) throws CheckException{//срочно нужно исключение, мне и моему другу тоже
        System.out.println(getName() + " пытается открыть " + thing.name);//Не ругайте, я искренне старался =с
        int i = 0;
        if (Inventory.get(i).name == "топор" & Inventory.size() != 0 ){
            System.out.println(getName() + " смогла открыть " + thing.name + " используя " + Inventory.get(i).name);
            PreciousStones.Diamond diamond = new PreciousStones.Diamond("алмаз","n");
            PreciousStones.Ruby ruby = new PreciousStones.Ruby("рубин","n");
            PreciousStones.Emerald emerald = new PreciousStones.Emerald("изумруд","n");
            take(diamond,ruby,emerald);
        }
        else {
            throw new CheckException(getName() + " не смогла открыть сундук ");
        }
    }
    public void doActions(String ... actionNames){
        int index = 0;
        int count = actionNames.length;
        for (String acname : actionNames){
            for (ThingActions thAction : ThingActionList){
                if (thAction.getName().equals(acname)){
                    thAction.run();
                    index += 1;
                    if (index != count){
                        System.out.print("и");
                    }
                    break;
                }
            }
        }
    }
    public void doActions(){
        int index = 0;
        int count = ThingActionList.size();
        for (ThingAction thAction : ThingActionList){
            thAction.run();
            index += 1;
            if (index != count){
                System.out.print("и");
            }

        }
    }

    public String getName(){
        return TrollName;
    }
}
