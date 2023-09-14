package top.wml.coupon.customer.service;

import top.wml.coupon.calculation.api.beans.ShoppingCart;
import top.wml.coupon.calculation.api.beans.SimulationOrder;
import top.wml.coupon.calculation.api.beans.SimulationResponse;
import top.wml.coupon.customer.api.beans.RequestCoupon;
import top.wml.coupon.customer.api.beans.SearchCoupon;
import top.wml.coupon.customer.dao.entity.Coupon;
import top.wml.coupon.template.api.beans.CouponInfo;

import java.util.List;

/**
 * @author mqxu
 * @date 2023/9/8
 * @description CouponCustomerService
 **/
public interface CouponCustomerService {

    /**
     * 领券接口
     *
     * @param request 请求对象
     * @return 优惠券
     */
    Coupon requestCoupon(RequestCoupon request);

    /**
     * 核销优惠券
     *
     * @param info 优惠券信息
     * @return 优惠券
     */
    ShoppingCart placeOrder(ShoppingCart info);

    /**
     * 优惠券金额试算
     *
     * @param order 订单信息
     * @return 优惠券
     */
    SimulationResponse simulateOrderPrice(SimulationOrder order);

    void deleteCoupon(Long userId, Long couponId);

    /**
     * 查询用户优惠券
     *
     * @param request 请求对象
     * @return 优惠券
     */
    List<CouponInfo> findCoupon(SearchCoupon request);
}