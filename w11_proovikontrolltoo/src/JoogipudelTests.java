import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JoogipudelTests {

    @Test
    public void joogipudeliMass() {
        Jook jook1 = new Jook("Sprite", 0.66, 0.965);
        Jook jook2 = new Jook("Coca-Cola", 0.78, 1.045);

        Joogipudel joogipudel1 = new Joogipudel("1", 500, 200, 0.10);
        Joogipudel joogipudel2 = new Joogipudel("2", 800, 380, 0.10);
        Joogipudel joogipudel3 = new Joogipudel("3", 2000, 600, 0.10);

        joogipudel1.setJook(jook1);
        joogipudel2.setJook(jook2);

        assertEquals(796.5, joogipudel1.pudelimassJoogiga(), 0.0);
        assertEquals(1284.5, joogipudel2.pudelimassJoogiga(), 0.0);
        assertEquals(600.0, joogipudel3.pudelimassJoogiga(), 0.0);
    }
}
