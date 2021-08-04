public class MyClass {
    public static void main(String args[]) {      // if statement is more flexible because we can test different values.
                                                  // each time we do a test we dont have to use the same test criteria
                                                  // we can do (if value == 1 else cat = 5) use different values.
                                                  // in switch statement we only test one value and use different cases for the same value.
        
        int value = 1;                   // if Statement
        
        if(value == 1) {                 // checks
            
            System.out.println("Value was 1");
            
        } else if (value == 2) {        
            
            System.out.println("Value was 2");
        } else {
            
            System.out.println("Was not 1 or 2");
        }
        
        int switchValue = 2;                    // Switch statement
        
        switch(switchValue) {                
            case 1:                             // checks
                System.out.println("Value was 1");
                break;
                
            case 2:
                System.out.println("Value was 2");
                break;
                
            default:
            System.out.println("was not 1 or 2");   // this will run if the 2 cases above fail.
            break;
        }
    }
}
