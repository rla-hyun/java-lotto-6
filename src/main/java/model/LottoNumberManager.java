package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoNumberManager {

    private List<Integer>[] lottos;
    private int idx = 0;

    public LottoNumberManager(int tickets) {
        lottos = new List[tickets];
        for(int i=0; i<tickets; i++)
            lottos[i] = new ArrayList<>();
    }

    public void saveLotto(List<Integer> number) {
        Collections.sort(number);
        lottos[idx++] = number;
    }

    public List<Integer>[] getLottos() {
        return lottos;
    }

    public int getLottoCount() {
        return lottos.length;
    }
}
