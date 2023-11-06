package baseball;

import java.util.ArrayList;
import java.util.List;
public class UserNumber {

    private static final String INPUT_LENGTH_EXCEPTION = "세자리 이하의 숫자만 입력해주세요.";
    private static final int BASEBALL_INPUT_NUMBER = 3;

    private final List<Integer> baseballNumberlist;

    public UserBaseballNumber(String userInput) {
        // input validate
        baseballNumberlist = parseUserInput(userInput);
    }

    private void checkInputNumberLength(String userInput) {
        if(userInput.length() != BASEBALL_INPUT_NUMBER) {
            throw new IllegalArgumentException(INPUT_LENGTH_EXCEPTION);
        }
    }

    private void checkInputisInteger(String userInput) {
        try {
            Integer.parseInt(userInput);
        } catch (NumberFormatException ex) {

        }
    }
}
