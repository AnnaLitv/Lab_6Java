import com.company.SetWag;
import com.company.Wagon;
import com.company.WagonSit;
import com.company.WagonSleep;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Anna-PC on 06.06.2017.
 */
public class SetWagTest extends Object {
    @Test
    public void size() throws Exception {
        SetWag setWag = new SetWag();
        setWag.add((Wagon) new WagonSit(3,6,34,23));
        setWag.add((Wagon) new WagonSit(4,5,34,23));
        setWag.add((Wagon) new WagonSleep(5,5,56,34));
        int i=setWag.size();
        assertEquals(3,i);
    }

    @Test
    public void isEmpty() throws Exception{
       SetWag setWag = new SetWag();
       assertTrue(setWag.isEmpty());
    }

    @Test
    public void isEmpty2() throws Exception{
        SetWag setWag = new SetWag();
        setWag.add((Wagon) new WagonSleep(5,5,56,34));
        assertFalse(setWag.isEmpty());
    }

    @Test
    public void get() throws Exception{
        SetWag setWag = new SetWag();
        setWag.add((Wagon) new WagonSleep(5,5,56,34));
        setWag.add((Wagon) new WagonSit(4,5,34,23));
        setWag.add((Wagon) new WagonSleep(5,5,56,34));
        int num = setWag.get(2).getNumberWag();
        int com = setWag.get(2).getComfort();
        int pep = setWag.get(2).getPeople();
        int lugg = setWag.get(2).getLuggage();
        boolean bol;
        if(num==5&&com==5&&pep==56&&lugg==34)
            bol=true;
        else bol=false;
        assertTrue(bol);
    }

    @Test
    public void get2() throws Exception{
        SetWag setWag = new SetWag();
        setWag.add((Wagon) new WagonSleep(5,5,56,34));
        setWag.add((Wagon) new WagonSit(4,5,34,23));
        setWag.add((Wagon) new WagonSleep(5,5,56,34));
        int num = setWag.get(2).getNumberWag();
        int com = setWag.get(2).getComfort();
        int pep = setWag.get(2).getPeople();
        int lugg = setWag.get(2).getLuggage();
        boolean bol;
        if(num==6&&com==5&&pep==56&&lugg==34)
            bol=true;
        else bol=false;
        assertFalse(bol);
    }

    @Test
    public void contains() throws Exception{
        SetWag setWag = new SetWag();
        setWag.add((Wagon) new WagonSleep(5,5,56,34));
        setWag.add((Wagon) new WagonSit(4,5,34,23));
        setWag.add((Wagon) new WagonSleep(5,5,56,34));
        WagonSleep wg = new WagonSleep(5,5,56,34);
        assertTrue(setWag.contains(wg));
    }

    @Test
    public void contains2() throws Exception{
        SetWag setWag = new SetWag();
        setWag.add((Wagon) new WagonSleep(5,5,56,34));
        setWag.add((Wagon) new WagonSit(4,5,34,23));
        setWag.add((Wagon) new WagonSleep(5,5,56,34));
        WagonSleep wg = new WagonSleep(10,5,56,34);
        assertFalse(setWag.contains(wg));
    }

    @Test
    public void add() throws Exception{
        SetWag setWag = new SetWag();
        setWag.add((Wagon) new WagonSleep(4,5,34,23));
        WagonSleep wg = new WagonSleep(4,5,34,23);
        assertTrue(setWag.contains(wg));
    }

    @Test
    public void add2() throws Exception{
        SetWag setWag = new SetWag();
        assertTrue(setWag.add((Wagon) new WagonSleep(4,5,34,23)));
    }

    @Test
    public void remove() throws Exception{
        SetWag setWag = new SetWag();
        setWag.add((Wagon) new WagonSleep(5,5,56,34));
        setWag.add((Wagon) new WagonSit(4,5,34,23));
        setWag.add((Wagon) new WagonSleep(5,5,56,34));
        WagonSit wg = new WagonSit(4,5,34,23);
        assertTrue(setWag.remove(wg));
    }

    @Test
    public void remove2() throws Exception{
        SetWag setWag = new SetWag();
        setWag.add((Wagon) new WagonSleep(5,5,56,34));
        setWag.add((Wagon) new WagonSit(4,5,34,23));
        setWag.add((Wagon) new WagonSleep(5,5,56,34));
        WagonSit wg = new WagonSit(4,5,34,23);
        setWag.remove(wg);
        assertTrue(!setWag.contains(wg));
    }
}