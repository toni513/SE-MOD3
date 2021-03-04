package W1_HW1;



public class W1_H1 {
	
		public static void W1_H1(boolean squawking, int currentHour) {
	        if(squawking) {
	            if (currentHour < 6 && currentHour >= 0 || currentHour == 23) {
	                System.out.println(true);
	            } else if (currentHour < 0 || currentHour > 23) {
	                System.out.println(false);
	            } else {
	                System.out.println(false);
	            }
	        } else {
	            if (currentHour < 6 && currentHour >= 0 || currentHour == 23) {
	                System.out.println(true);
	            } else if (currentHour < 0 || currentHour > 23) {
	                System.out.println(false);
	            } else {
	                System.out.println(false);
	            }
	        }
	    }
	}