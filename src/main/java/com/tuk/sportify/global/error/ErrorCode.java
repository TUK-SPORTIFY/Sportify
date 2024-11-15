package com.tuk.sportify.global.error;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ErrorCode {
    /**
     * Sport Voucher : 스포츠 이용권 관련 에러 코드
     */
    SPORT_VOUCHER_NOT_FOUND("100","존재하지 않는 스포츠 이용권입니다."),
    SPORT_VOUCHER_CLOSED("101","해당 이용권은 종료됐습니다.");

    private final String msg;
    private final String code;
}
