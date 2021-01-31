package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return Charecter.firstName.charAt(0) +"."+ Character.lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        double answer = Math.round(originalPrice + (originalPrice * vatRate/100)); 
        return answer;
    }

    public String reverse(String sentence) {
        int i = sentence.length();
        String answer = "";
        while (i > 0) {
            answer = answer + sentence.charAt(i-1);
            i --;
        }
        //System.out.print(answer);
        return answer;
    }

    public int countLinuxUsers(List<User> users) {
        int count = 0;
        
        for (int i = 0 ; i < users.length ; i ++ ) {
            System.out.println(users[)
           if (users.find("Linux") == true ) {
                count ++;}
        return count;
    }
}
