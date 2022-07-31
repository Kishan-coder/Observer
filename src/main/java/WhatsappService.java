public class WhatsappService implements Observer{
    private void sendWhatsApp(){
        System.out.println("Notifying via whatsapp msg///");
    }
    @Override
    public void notifyChange() {
        sendWhatsApp();
    }
}
