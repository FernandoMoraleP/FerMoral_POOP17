public class CalDay {
    public static void main(String[] args) {

        String month = "february";
        
        

        switch (month) {
            case "february":  
                System.out.println("input is february, then output should be: 29");
            case "april":  
                System.out.println("input is april, then output should be: 30");
                    break; 
                    
            default: System.out.println("Invalid month");
                     break;
        }
                
    }
}