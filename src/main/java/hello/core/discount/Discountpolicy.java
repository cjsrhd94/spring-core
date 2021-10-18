package hello.core.discount;

import hello.core.member.Member;

public interface Discountpolicy {

    /**
     * @return 할인 대상 금액
     */
    int dicount(Member member, int price);
}
