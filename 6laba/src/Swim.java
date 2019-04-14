public class Swim extends ThingActions {
    String name = "плавал";
    String operand;

    Swim(String operand){
        this.operand = " " + operand;
    }

    public void run(){
        System.out.print(" " + name + " в" + operand + " ");
    }

    public String getName(){
        return name;
    }

    public String getOperand(){
        return operand;
    }
}
