package top.wml.coupon.calculation.template;

import top.wml.coupon.calculation.api.beans.ShoppingCart;

public interface RuleTemplate {

    ShoppingCart calculate(ShoppingCart settlement);
}
