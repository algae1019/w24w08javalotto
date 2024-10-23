package kr.ac.kumoh.s20211086.w24w08javalotto.repository;

import kr.ac.kumoh.s20211086.w24w08javalotto.model.LottoNumber;

public interface LottoRepository
{
    LottoNumber save(LottoNumber lottoNumber);
    LottoNumber find();
}
