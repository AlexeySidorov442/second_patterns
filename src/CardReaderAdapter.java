public class CardReaderAdapter implements USB{

    private MemoryCard memoryCard;

    public CardReaderAdapter(MemoryCard memoryCard){
        this.memoryCard = memoryCard;
    }
    @Override
    public void connectWithUsbCable() {
        this.memoryCard.insert();
        this.memoryCard.copyData();
    }
}
