package pckg;


/**
 *
 * @author Cory Drangel
 */
class TestHarness {
    
    public boolean checkEqual(int actual, int expected){
        boolean val;
        if(actual == expected){
            val = true;
        }
        else{
            val = false;
        }
        
        return val;
    }
    
    public boolean checkEqual(double actual, double expected){
        boolean val;
        if(actual == expected){
            val = true;
        }
        else{
            val = false;
        }
        
        return val;
    }
    
}
