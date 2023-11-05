package controller;

import model.LottoGenerator;
import model.LottoNumberManager;
import view.InputView;
import view.OutputView;

public class LottoLauncher {

    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();

    private LottoNumberManager lottoNumberManager;
    private LottoGenerator lottoGenerator = new LottoGenerator();

    public void LottoRun() {
        getPurchaseCount(inputView.getPurchasePrice());
        getLottoNumbers(lottoNumberManager.getLottoCount());
        outputView.printLottoNumber(lottoNumberManager.getLottos());
    }

    private void getPurchaseCount(String price) {
        int cnt = Integer.parseInt(price) / 1000;
        lottoNumberManager = new LottoNumberManager(cnt);
    }

    private void getLottoNumbers(int cnt) {
        for(int i=0; i<cnt; i++)
            lottoNumberManager.saveLotto(
                    lottoGenerator.createLottoNumbers());
    }
}
