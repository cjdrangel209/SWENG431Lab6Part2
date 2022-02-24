package pckg;


import pckg.Rectangle;


/**
 *
 * @author Cory
 */
public class RectangleTestlet implements TestletIF{
    Rectangle r = new Rectangle();
    
    public void runTest(TestHarness test){
        System.out.println("Rectangle w = 1, h = 5; expected area: 5; result: " + test.checkEqual(r.getArea(1, 5), 5));
        System.out.println("Rectangle w = 2, h = 5; expected area: 10; result: " + test.checkEqual(r.getArea(2, 5), 10));
        System.out.println("Rectangle w = 5, h = 5; expected area: 25; result: " + test.checkEqual(r.getArea(5, 5), 25));
        System.out.println("Rectangle w = 9, h = 5; expected area: 45; result: " + test.checkEqual(r.getArea(9, 5), 45));
        System.out.println("Rectangle w = 10, h = 5; expected area: 50; result: " + test.checkEqual(r.getArea(10, 5), 50));
        System.out.println("Rectangle w = 5, h = 1; expected area: 5; result: " + test.checkEqual(r.getArea(5, 1), 5));
        System.out.println("Rectangle w = 5, h = 2; expected area: 10; result: " + test.checkEqual(r.getArea(5, 2), 10));
        System.out.println("Rectangle w = 5, h = 9; expected area: 45; result: " + test.checkEqual(r.getArea(5, 9), 45));
        System.out.println("Rectangle w = 5, h = 10; expected area: 50; result: " + test.checkEqual(r.getArea(5, 10), 50));
    }
}
