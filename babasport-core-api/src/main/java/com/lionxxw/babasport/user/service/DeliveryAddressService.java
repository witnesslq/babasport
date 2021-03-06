package com.lionxxw.babasport.user.service;

import com.lionxxw.babasport.user.dto.DeliveryAddressDto;
import com.lionxxw.common.base.BaseService;

/**
 * <p>Description: 用户收货地址接口 </p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/6/28 上午10:42
 */
public interface DeliveryAddressService extends BaseService<DeliveryAddressDto> {

    /**
     * 重置用户下的收货地址为非默认的
     * @param buyer
     * @throws Exception
     */
    void resetDefault(String buyer) throws Exception;
}