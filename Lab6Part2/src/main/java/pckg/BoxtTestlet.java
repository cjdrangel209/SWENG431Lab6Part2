package pckg;


import pckg.Box;


/**
 *
 * @author Cory Drangel
 */
public class BoxtTestlet implements TestletIF{
    Box b = new Box();
    
    public void runTest(TestHarness test){
        test.checkEqual(b.getVolume(1, 1, 1), 1);
    }
}
