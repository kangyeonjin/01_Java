package com.ohgiraffers.section02;

import com.ohgiraffers.section02.exception.MoneyNegativeException;
import com.ohgiraffers.section02.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.exception.PriceNegativeException;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money)throws Exception{

        if(price  < 0 ){

            throw  new PriceNegativeException("가격은 음수 일 수 없습니다.");
        }

        if(money < 0){

            throw new MoneyNegativeException("가지고 있는돈은 음수일수없습니다");

        }
        if(money >= price) {
            System.out.println("상품을 구입하기 위한 금액이 충분합니다");

        }else{

            throw new NotEnoughMoneyException("가지고있는 돈보다 상품가격이 더 비쌉니다");
        }

    }

}
