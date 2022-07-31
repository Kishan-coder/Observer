public class BitCoinTracker extends ObserverManager implements  BitCoinManager{

    BitCoin bitCoin = new BitCoin();

    @Override
    public BitCoin getBitCoin() {
        return bitCoin;
    }

    @Override
    public void setPrice(double price) {
        bitCoin.setPrice(price);
        notifyChange();
    }

    @Override
    public void notifyChange() {
        for (Observer observer: observers) {
            observer.notifyChange();
        }
    }
}
