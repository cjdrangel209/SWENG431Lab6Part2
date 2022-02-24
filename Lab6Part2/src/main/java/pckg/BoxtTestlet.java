package pckg;


import pckg.Box;


/**
 *
 * @author Cory Drangel
 */
public class BoxtTestlet implements TestletIF{
    Box b = new Box();
    
    public void runTest(TestHarness test){
        System.out.println("Box l = 1, w = 5, h = 5; expected volume: 25; result: "  + test.checkEqual(b.getVolume(1, 5, 5), 25));
        System.out.println("Box l = 2, w = 5, h = 5; expected volume: 50; result: "  + test.checkEqual(b.getVolume(2, 5, 5), 50));
        System.out.println("Box l = 5, w = 5, h = 5; expected volume: 125; result: "  + test.checkEqual(b.getVolume(5, 5, 5), 125));
        System.out.println("Box l = 9, w = 5, h = 5; expected volume: 225; result: "  + test.checkEqual(b.getVolume(9, 5, 5), 225));
        System.out.println("Box l = 10, w = 5, h = 5; expected volume: 250; result: "  + test.checkEqual(b.getVolume(10, 5, 5), 250));
        System.out.println("Box l = 5, w = 1, h = 5; expected volume: 25; result: "  + test.checkEqual(b.getVolume(5, 1, 5), 25));
        System.out.println("Box l = 5, w = 2, h = 5; expected volume: 50; result: "  + test.checkEqual(b.getVolume(5, 2, 5), 50));
        System.out.println("Box l = 5, w = 9, h = 5; expected volume: 225; result: "  + test.checkEqual(b.getVolume(5, 9, 5), 225));
        System.out.println("Box l = 5, w = 10, h = 5; expected volume: 250; result: "  + test.checkEqual(b.getVolume(5, 10, 5), 250));
        System.out.println("Box l = 5, w = 5, h = 1; expected volume: 25; result: "  + test.checkEqual(b.getVolume(5, 5, 1), 25));
        System.out.println("Box l = 5, w = 5, h = 2; expected volume: 50; result: "  + test.checkEqual(b.getVolume(5, 5, 2), 50));
        System.out.println("Box l = 5, w = 5, h = 9; expected volume: 225; result: "  + test.checkEqual(b.getVolume(5, 5, 9), 225));
        System.out.println("Box l = 5, w = 5, h = 10; expected volume: 250; result: "  + test.checkEqual(b.getVolume(5, 5, 10), 250));
    }
}
