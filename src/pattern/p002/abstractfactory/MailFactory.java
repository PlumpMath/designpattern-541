package pattern.p002.abstractfactory;

public class MailFactory implements Factory {

    public MailFactory() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Sender creator() {
        // TODO Auto-generated method stub
        return new MailSender();
    }

}
