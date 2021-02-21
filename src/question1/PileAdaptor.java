package question1;

public class PileAdaptor implements PileI<String> {

    public StackImpl stack;

    public PileAdaptor(StackImpl stackImpl) {
        this.stack = stackImpl;
    }

    @Override
    public void empiler(String s) {
        if(s.equals("One object")){
            this.stack.push(1);
        }
    }

    @Override
    public String depiler() {
        this.stack.pop();
        return null;
    }


    @Override
    public boolean estVide() {
        if(this.stack.getSize() == 0){
            return true;
        }else{
            return false;
        }
    }
}
