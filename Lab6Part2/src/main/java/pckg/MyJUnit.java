package pckg;

/**
 *
 * @author Cory Drangel
 */
public class MyJUnit extends TestHarness {
    public static void main(String[] args){        
       for(String s: args){
           Class c = Class.forName("pckg." + s);
           Object o = c.newInstance();
           TestletIF t = (TestletIF)o;
           
       }
    }
}
