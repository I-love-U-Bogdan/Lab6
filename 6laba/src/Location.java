import java.util.ArrayList;
import java.util.Vector;
public abstract class Location implements Action {
    private String name;

    protected ArrayList<Location> InnerLocation = new ArrayList<Location>();
    protected Vector<Thing> InnerThing = new Vector<Thing>();//наш вектор, по заданию
    protected ArrayList<Trolls> InnerTrolls = new ArrayList<Trolls>();

    public void GoTo(Location location, Trolls ... trolls){//Тролли могут ходить!
        for (Trolls tr : trolls) {
            if (getName() == location.getName()) {
                System.out.print("Подожди, персонаж и так тут находится!");
            }
            if (getName() != location.getName()) {

                InnerTrolls.remove(trolls);
                location.InnerTrolls.add(tr);
                System.out.println(tr.TrollName + " ушел в " + location.getName() + " из " + getName());
                tr.ThingActionList.clear();//персонаж ушел и у него убрались прошлые действия
            }
        }
    }


    public void AddInnerLocation(Location... locations) {
        for (Location loc : locations) {
            InnerLocation.add(loc);
        }
    }

    public void AddInnerThing(Thing... things) {
        for (Thing th : things) {
            InnerThing.add(th);
        }
    }

    public void AddInnerTrolls(Trolls... trolls) {
        for (Trolls th : trolls) {
            InnerTrolls.add(th);
        }
    }
    public void DescribeLocations() {
        for (Location loc : InnerLocation) {
            System.out.println(loc.getName());
            loc.DescribeThing();
            loc.DescribeTrolls();//подумой
        }
    }



    public void DescribeThing() {
        System.out.println();
        for (Thing thing : InnerThing) {
            System.out.print(thing.getName());
            thing.doActions();
            System.out.println();
        }
        System.out.println();
    }

    public void DescribeTrolls() {

        for (Trolls troll : InnerTrolls) {
            System.out.print(troll.getName());
            troll.doActions();
        }
        System.out.println();
    }
    public Location(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void action() {

    }
}
