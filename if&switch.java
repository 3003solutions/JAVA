public class MyClass {
    public static void main(String args[]) {
        
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
