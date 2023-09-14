package top.wml.coupon.customer.api.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

/**
 * @author mqxu
 * @date 2023/9/8
 * @description CouponStatus——优惠券的状态
 **/
@Getter
@AllArgsConstructor
public enum CouponStatus {

    AVAILABLE("未使用", 1),
    USED("已用", 2),
    INACTIVE("已经注销", 3);

    private final String desc;
    private final Integer code;

    public static CouponStatus convert(Integer code) {
        if (code == null) {
            return null;
        }
        return Stream.of(values())
                .filter(bean -> bean.code.equals(code))
                .findAny()
                .orElse(null);
    }
}