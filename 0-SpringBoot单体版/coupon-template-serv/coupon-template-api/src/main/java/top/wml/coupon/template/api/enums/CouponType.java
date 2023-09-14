package top.wml.coupon.template.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum CouponType {
    UNKNOWN("unknown","0"),
    MONEY_OFF("满减卷","1"),
    DISCOUNT("打折","2"),
    RANDOM_DISCOUNT("随机减","3"),
    NIGHT_MONEY_OFF("晚间双倍优惠卷","4");

    private final String description;
    private final String code;

    public static CouponType convert(String code){
        return Stream.of(values())
                .filter(bean -> bean.code.equalsIgnoreCase(code))
                .findFirst()
                .orElse(UNKNOWN);
    }

}
