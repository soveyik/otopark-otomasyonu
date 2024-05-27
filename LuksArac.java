public class LuksArac extends DecoratorArac{
    public LuksArac (DecoratorAracInterface c){
        super(c);
    }

    public void assemble(){
        super.assemble();
        System.out.println("Lüks araç özellikleri ekleniyor.");
    }
}