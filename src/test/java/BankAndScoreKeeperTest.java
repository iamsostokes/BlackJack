import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.core.IsEqual.equalTo;


public class BankAndScoreKeeperTest {

    private BankAndScoreKeeper testBankAndScoreKeeper;

    @Before
    public void create(){
        testBankAndScoreKeeper = new BankAndScoreKeeper();
    }

    @Test
    public void addToPlayerBank() {

        double result = testBankAndScoreKeeper.addToPlayerBank(50.0);

        assertThat(result, equalTo(50.0));

    }
}