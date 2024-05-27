public class OdemeKontrol extends ConcreteVisit {
     KrediKartStrategy cardNumber;
    @Override
    public void visit(KrediKartStrategy odeme) {
        super.visit(odeme);
        performFraudCheck(odeme);
        sendPaymentNotification(odeme);
    }

    private void performFraudCheck(KrediKartStrategy odeme) {
        // Basit bir dolandırıcılık kontrolü
        boolean isFraudulent = ((OdemeKontrol) odeme.getCardNumber()).startsWith("9999");
        if (isFraudulent) {
            System.out.println("Dolandırıcılık tespit edildi: " + odeme.getCardNumber());
        } else {
            System.out.println("Dolandırıcılık tespit edilmedi.");
        }
    }

    private void sendPaymentNotification(KrediKartStrategy odeme) {
        // Ödeme bildirimi gönder
        System.out.println("Ödeme bildirimi gönderildi: " + odeme.getCardNumber());
    }
    
    public boolean startsWith(String önEk) {
        return cardNumber.startsWith(önEk);
    }

   
}
