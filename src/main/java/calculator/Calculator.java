package calculator;

import java.util.regex.Pattern;

public class Calculator {
     //문자열을 전달받아 구분자를 기준으로 분리한 수의 합을 반환
    public int sumFromString(String inputString) {
        if(inputString == null || inputString.isBlank()) return 0;

        int sum = 0;
        String separator = "[,:]";

        //커스텀 구분자인 경우 구분자, 입력문자열 재할당 
        if(inputString.startsWith("//")) {
            int newLineIdx = inputString.indexOf("\n");
            separator = Pattern.quote(inputString.substring(2, newLineIdx));

            inputString = inputString.substring(newLineIdx + 1);
        }

        for(String s : inputString.split(separator)) {
            try {
                int num = Integer.parseInt(s.trim());
                if(num < 0) throw new RuntimeException("음수값이 입력될 순 없어요!");

                sum += num; 
            } catch (Exception e) {
                throw new RuntimeException("숫자 이외의 값이 들어있으면 안돼요!");
            }            
        }

        return sum;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int subtract(int n1, int n2) {
        return n1 - n2;
    }

    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public int division(int n1, int n2) {
        return n1 / n2;
    }

}
