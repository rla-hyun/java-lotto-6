package validation;

public enum ErrorMessage {

    invalidInput("숫자를 입력해야 합니다."),
    NotDivisibleBy1000("1,000원 단위로 입력해야 합니다."),
    notSixNumbers("숫자 6개를 입력해야 합니다."),
    outOfRangeNumber("1~45사이의 숫자를 입력해야 합니다.");

    private String reason;

    private ErrorMessage(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

}
