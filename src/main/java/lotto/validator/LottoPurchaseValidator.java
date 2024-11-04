package lotto.validator;

public class LottoPurchaseValidator implements InputValidator{

    public void validate(String input){
        validateNull(input);
        validateNumeric(input);
    }

    private void validateNull(String purchaseAmountUserInput) {
        if (purchaseAmountUserInput.isEmpty() & purchaseAmountUserInput ==null){
            throw new IllegalArgumentException("[ERROR] 구입금액을 입력하세요");
        }
    }

    private void validateNumeric(String purchaseAmountUserInput) {
        if (isNotNumeric(purchaseAmountUserInput)){
            throw new IllegalArgumentException("[ERROR] 구입금액은 숫자로만 이루어져야 합니다.");
        }
    }

    private boolean isNotNumeric(String purchaseAmountUserInput) {
        return !purchaseAmountUserInput.matches("\\d+");
    }


}