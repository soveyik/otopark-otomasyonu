public class DecoratorArac implements DecoratorAracInterface {
    protected DecoratorAracInterface car;

    public DecoratorArac (DecoratorAracInterface c){
        this.car = c;
    }

    @Override
    public void assemble(){
        this.car.assemble();
    }
}