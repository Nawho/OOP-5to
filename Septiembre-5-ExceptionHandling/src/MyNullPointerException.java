public class MyNullPointerException extends RuntimeException {
    private transient int extendedMessageState;
    private transient String extendedMessage;

    public MyNullPointerException() {}

    public MyNullPointerException( String s ) {
        super(s);
    }

    // Totalmente nuestro
    @Override
    public String getMessage() {
        String msg = super.getMessage();
        if (msg == null) {
            synchronized(this) {
                if (this.extendedMessageState == 1) {
                    this.extendedMessage = this.getExtendedNPEMessage();
                    this.extendedMessageState = 2;
                }

                return this.extendedMessage;
            }
        } else {
            return msg;
        }
    }

    private native String getExtendedNPEMessage();
}
