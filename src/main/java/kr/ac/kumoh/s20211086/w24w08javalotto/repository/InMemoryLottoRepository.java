package kr.ac.kumoh.s20211086.w24w08javalotto.repository;

import kr.ac.kumoh.s20211086.w24w08javalotto.model.LottoNumber;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryLottoRepository implements LottoRepository
{
    private LottoNumber storedLottoNumber = null;

    @Override
    public LottoNumber save(LottoNumber lottoNumber) {
        this.storedLottoNumber = lottoNumber;
        return storedLottoNumber;
    }

    @Override
    public LottoNumber find() {
        return storedLottoNumber;
    }
}
