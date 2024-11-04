package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Integer> lottoNumbers = Lotto.generateLottoNumbers();
        System.out.println("생성된 로또 번호: " + lottoNumbers);

        System.out.println("구입금액을 입력해 주세요.");
        String input = Console.readLine();
        int amount = LottoGame.validatePurchaseAmount(input);
        System.out.println("구입 금액: " + amount + "원");

        List<Lotto> purchasedLottos = LottoGame.buyLottoTickets(amount);
        System.out.println(purchasedLottos.size() + "개를 구매했습니다.");
        purchasedLottos.forEach(lotto -> System.out.println(lotto.getNumbers()));

        System.out.println("당첨 번호를 입력해 주세요.");
        List<Integer> winningNumbers = LottoGame.getWinningNumbers(Console.readLine());

        System.out.println("보너스 번호를 입력해 주세요.");
        int bonusNumber = LottoGame.getBonusNumber(Console.readLine());

        System.out.println("당첨 번호: " + winningNumbers);
        System.out.println("보너스 번호: " + bonusNumber);
    }
}
