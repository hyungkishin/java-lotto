package lotto.domain.fixture;

import lotto.domain.WinnerLotto;

import java.util.Arrays;
import java.util.TreeSet;

public class WinningLottoFixture {

    public static TreeSet<Integer> 로또_1등_번호 = new TreeSet<>(Arrays.asList(1, 12, 13, 24, 35, 45));

    public static int 보너스_번호 = 45;

    public static WinnerLotto 로또_1등 = new WinnerLotto(로또_1등_번호, 보너스_번호);
}
