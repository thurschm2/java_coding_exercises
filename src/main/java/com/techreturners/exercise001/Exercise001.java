package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return firstName.charAt(0) +"."+ lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        double answer = Math.round(originalPrice + (originalPrice * vatRate/100)); 
        return answer;
    }

    public String reverse(String sentence) {
        int i = sentence.length();
        String answer = "";
        System.out.print(sentence);
        while (i > 0) {
            answer = answer + sentence.charAt(i-1);
            i --;
        }
        System.out.print(answer);
        return answer;
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}
