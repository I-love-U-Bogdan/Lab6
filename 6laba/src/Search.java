public class Search extends ThingActions{
    String name = "искал";
    String operand;

    Search(String operand){
        this.operand = " " + operand;
    }

    public void run(){
        System.out.println(" " + name + operand + " ");
    }

    public String getName(){
        return name;
    }

    public String getOperand(){
        return operand;
    }
}
