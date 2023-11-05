package view;

import java.util.List;

public class OutputView {

    public void printLottoNumber(List<Integer>[] numbers) {
        System.out.println(numbers.length + "개를 구매했습니다.");
        for(List<Integer> lotto : numbers)
            System.out.println(lotto);
    }
}
