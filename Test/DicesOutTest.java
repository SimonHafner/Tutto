import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DicesOutTest {

    DicesOut dicesOut = new DicesOut();

    @Test
    void getDiceArray() {
        int size = dicesOut.getDiceArray().size();
        // check if the array contains six elements:
        assertEquals(0, size);
    }

    @Test
    void getDies() {
        dicesOut.getDies();
        for (int i : dicesOut.getDies()){
            assertEquals(0, i);
        }
    }

    @Test
    void contains() {
        ArrayList<Integer> diesArray = new ArrayList<Integer>();
        diesArray = dicesOut.getDies();
        for (int i = 0; i < 6; i++){
            if(diesArray.contains(i)){
                assertEquals(Boolean.TRUE, dicesOut.contains(i));
            }
            else {
                assertEquals(Boolean.FALSE, dicesOut.contains(i));
            }
        }

    }

    @Test
    void addDice() {
        int size_a = dicesOut.getDiceArray().size();
        Dice dice = new Dice(1);
        dicesOut.addDice(dice);
        int size_b = dicesOut.getDiceArray().size();
        assertNotEquals(size_a, size_b);
    }

}