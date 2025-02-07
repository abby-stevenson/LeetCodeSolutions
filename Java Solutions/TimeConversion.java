public static String timeConversion(String s) {
    // Write your code here
    String AMorPM = s.substring(s.length() - 2);
    String hour = s.substring(0, 2);
    String min = s.substring(3, 5);
    String sec = s.substring(6, 8);
    
    if ((AMorPM.equals("AM") && !hour.equals( "12")) ||
         AMorPM.equals("PM") && hour.equals("12")) {
        return hour+":"+min+":"+sec; 
    }
    if (AMorPM.equals("AM") && hour.equals("12")) {
        return "00:"+min+":"+sec;
    }
    else {
    int inthour = Integer.parseInt(hour);
    int PMHour = 12 + inthour;
    return PMHour+":"+min+":"+sec;
    }
        
    }