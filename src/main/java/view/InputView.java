package view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String getPurchasePrice() {
        System.out.println(Message.USER_INPUT_MESSAGE.getMessage());
        return Console.readLine();
    }

    public String getWinningNumber() {
        System.out.println(Message.NUMBER_INPUT_MESSAGE.getMessage());
        String number = Console.readLine();
        System.out.println(Message.BONUS_INPUT_MESSAGE.getMessage());
        return number + "/" + Console.readLine();
    }
}
