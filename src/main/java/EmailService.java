public class EmailService implements Observer{
    private void sendEmail(){
        System.out.println("Sending email...");
    }
    @Override
    public void notifyChange() {
        sendEmail();
    }
}
