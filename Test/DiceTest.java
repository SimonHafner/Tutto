import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void throwDice() {
        Dice dice = new Dice();
        // By creating a new dice, the die is set to 0 (i.e. undefined) by default.
        int dieOne = dice.getDie();
        dice.throwDice();
        // The die should change to a number between 1 and 6.
        int dieTwo = dice.getDie();
        assertNotEquals(dieOne, dieTwo);
    }

    @Test
    void getDie() {
        Dice dice = new Dice(3);
        assertEquals(3, dice.getDie());
    }
}