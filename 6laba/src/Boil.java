public class Boil extends ThingActions{
    String name = "сварил";
    String operand;

    Boil(String operand){
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
