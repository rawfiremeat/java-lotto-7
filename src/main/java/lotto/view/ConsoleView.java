package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

camp.nextstep.edu.missionutils.Console;
public class ConsoleView {
    public Integer getPurchaseLottoAmount(){
        System.out.println("구입금액을 입력해 주세요.");
        return Integer.parseInt(Console.readLine());
    }

    public List<Integer> getWinningNumbers() { // 숫자가 아닌 값이면 예외
        System.out.println("당첨 번호를 입력해 주세요.");
        String userInputWinningNumbers = Console.readLine();
        return Arrays.stream(userInputWinningNumbers.split(",")).map(Integer::parseInt).toList();
    }

    public Integer getBonusNumber() { // 한글자의 숫자가 아니면 예외
        System.out.println("보너스 번호를 입력해 주세요.");
        return Integer.parseInt(Console.readLine());
    }
}