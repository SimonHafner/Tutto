import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void throwDice() {
        Dice dice = new Dice();
        int dieOne = dice.getDie();
        dice.throwDice();
        int dieTwo = dice.getDie();
        assertNotEquals(dieOne, dieTwo);
        // However, keep in mind that it's either possible that the same die can occur two times in a row.
    }

    @Test
    void getDie() {
        Dice dice = new Dice(3);
        assertEquals(3, dice.getDie());
    }
}