 abstract class ConcreteVisit implements Visitor {
    public void visit(KrediKartStrategy odeme){
        if(odeme.isValid()){
            System.out.println("Ödeme işlemi başarılı.");
        }else{
            System.out.println("Ödeme işlemi başarısız. Lütfen geçerli bir kraedi kartı giriniz.");
        }
    }
}