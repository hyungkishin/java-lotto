package lotto.view;

import lotto.domain.Lotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    private static final String BUY_MONEY_MESSAGE = "구입금액을 입력해 주세요.";

    private static final String WINNING_NUMBER_MESSAGE = "지난 주 당첨 번호를 입력해 주세요.";

    private static final String DELIMITER = ",";

    private final BufferedReader reader;

    public InputView() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public int getLottoPrice() throws IOException {
        System.out.println(BUY_MONEY_MESSAGE);
        String input = reader.readLine().trim();

        return Integer.parseInt(input);
    }

    public Lotto getLastWeekLottoNumbers() throws IOException {
        System.out.println(WINNING_NUMBER_MESSAGE);
        String input = reader.readLine().trim();

        final List<Integer> winnerLottoNumber = Arrays.stream(input.split(DELIMITER))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        return new Lotto(winnerLottoNumber);
    }

    public void tearDown() throws IOException {
        reader.close();
    }
}
