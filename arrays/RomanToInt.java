package arrays;

public class RomanToInt {
    
    public static int solution(String s){
        int sum = 0;
        
        // Roman numeral values
        int[] romanValues = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // Assign values to each character
            if (ch == 'I') romanValues[i] = 1;
            else if (ch == 'V') romanValues[i] = 5;
            else if (ch == 'X') romanValues[i] = 10;
            else if (ch == 'L') romanValues[i] = 50;
            else if (ch == 'C') romanValues[i] = 100;
            else if (ch == 'D') romanValues[i] = 500;
            else if (ch == 'M') romanValues[i] = 1000;
        }
        
        // Process the Roman numeral string
        for (int i = 0; i < s.length(); i++) {
            // If the current value is less than the next value, subtract it
            if (i + 1 < s.length() && romanValues[i] < romanValues[i + 1]) {
                sum -= romanValues[i];
            } else {
                sum += romanValues[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(solution(s));  
    }
}

