public class Dig extends ThingActions{
    String name = "копал";
    String operand;

    Dig(String operand){
        this.operand = " " + operand;
    }

    public void run(){
        System.out.print(" " + name + operand + " ");
    }

    public String getName(){
        return name;
    }

    public String getOperand(){
        return operand;
    }
}
