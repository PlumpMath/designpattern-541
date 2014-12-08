package pattern.p002.abstractfactory;


public class MailSender implements Sender {

    public MailSender() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void send() {
        // TODO Auto-generated method stub
        System.out.println("this is MailSender");
    }

}
