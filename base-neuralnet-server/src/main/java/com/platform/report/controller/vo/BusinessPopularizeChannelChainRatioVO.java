package com.platform.report.controller.vo;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BusinessPopularizeChannelChainRatioVO {
    /**
     * 渠道名称
     */
    private String channel;
    /**
     * 渠道占比：某渠道申请量占比=某渠道的申请量/所有渠道申请量之和
     */
    private Double ratio;
    /**
     * 某渠道申请量环比=（本时段申请量-前一时段申请量）/前一时段申请量
     */
    private Double chainRatio;
    /**
     * 时间
     */
    private String date;
}