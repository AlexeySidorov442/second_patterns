public class ReadCardRunner {
    public static void main(String[] args) {
        USB cardReader = new CardReaderAdapter(new MemoryCard());
        cardReader.connectWithUsbCable();
    }
}
