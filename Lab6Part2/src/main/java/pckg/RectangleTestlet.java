package pckg;


import pckg.Rectangle;


/**
 *
 * @author Cory
 */
public class RectangleTestlet implements TestletIF{
    Rectangle r = new Rectangle();
    
    public void runTest(TestHarness test){
        test.checkEqual(r.getArea(10, 10), 100);
    }
}
