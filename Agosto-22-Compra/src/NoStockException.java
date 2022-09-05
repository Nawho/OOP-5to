public class NoStockException extends RuntimeException {
    public NoStockException(){}
    public NoStockException(String message) {
        super(message);
    }
}
