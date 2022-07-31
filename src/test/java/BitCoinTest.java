import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BitCoinTest {
    BitCoinTracker bitCoinTracker;
    @BeforeEach
    public void setUp(){
        bitCoinTracker = new BitCoinTracker();
        bitCoinTracker.registerObserver(new EmailService());
        bitCoinTracker.registerObserver(new WhatsappService());
    }

    @Test
    public void testBitCoinTracker(){
        bitCoinTracker.setPrice(101.1);
        BitCoin bitCoin = bitCoinTracker.getBitCoin();
        Assertions.assertTrue(bitCoin.getPrice() == 101.1, "something is wrong!");
    }

    @Test
    public void testObservers(){
        bitCoinTracker.setPrice(90.5);
    }

}
