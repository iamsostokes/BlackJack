import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.hamcrest.core.IsEqual.equalTo;


public class DealerTest {

    private Card card;

    private Dealer dealer;

    @Before
    public void create() {
        dealer = new Dealer();

    }

    @Test
    public void dealACardtoDealer() {
        ArrayList<Card> result = dealer.getDealersHand();

        assertThat(result.size(), equalTo(0));

        dealer.dealACardtoDealer();

        assertThat(result.size(), equalTo(2));

    }
}