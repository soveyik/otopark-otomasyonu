public class SporArac extends DecoratorArac {
    public SporArac(DecoratorAracInterface c){
        super(c);
    }
    
    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Spor araç özellikleri ekleniyor.");
    }
}