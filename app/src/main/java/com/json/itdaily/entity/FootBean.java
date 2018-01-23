package com.json.itdaily.entity;

import java.util.List;

/**
 * Created by Administrator on 2017/11/14.
 */

public class FootBean {

    /**
     * status : 1
     * error_code : 200
     * msg : 成功
     * result : [{"goods_id":482,"goods_name":"玛丽黛佳小蘑菇气垫粉底液遮瑕保湿提亮持久补水隔离V7BB素颜霜","market_price":"199.00","shop_price":"159.20","original_img":"http://img.alicdn.com/bao/uploaded/i3/2240117142/TB1Dqp7oEl7MKJjSZFDXXaOEpXa_!!0-item_pic.jpg","bc_provcity":"浙江 温州","bp_update_sales":547,"bc_smallimg":["http://img2.tbcdn.cn/tfscom/i3/2240117142/TB21tDPmrsTMeJjy1zcXXXAgXXa_!!2240117142.png","http://img1.tbcdn.cn/tfscom/i1/2240117142/TB2qhkfrJRopuFjSZFtXXcanpXa_!!2240117142.jpg","http://img4.tbcdn.cn/tfscom/i1/2240117142/TB2yeVPfNRDOuFjSZFzXXcIipXa_!!2240117142.jpg","http://img2.tbcdn.cn/tfscom/i3/2240117142/TB2uPBdzNhmpuFjSZFyXXcLdFXa_!!2240117142.jpg"],"goods_attributes":null,"go_url":"https://s.click.taobao.com/sMyB2Zw","discount_url":"https://s.click.taobao.com/udzB2Zw","shop_title":"润千鸿化妆品专营店","constellation_id":0,"comment_count":0},{"goods_id":2233,"goods_name":"2017秋冬装新款女装外套棉衣棉服女短款棒球服棉衣大码加厚圆领潮","market_price":"218.00","shop_price":"98.00","original_img":"http://img.alicdn.com/bao/uploaded/i3/842994830/TB1DiAdc3oSMeJjSspaXXbMOFXa_!!0-item_pic.jpg","bc_provcity":"北京","bp_update_sales":1116,"bc_smallimg":["http://img3.tbcdn.cn/tfscom/i2/TB1CamGNpXXXXXHXXXXXXXXXXXX_!!0-item_pic.jpg","http://img2.tbcdn.cn/tfscom/i4/842994830/TB2wy7jXGnD11BjSsziXXaReVXa_!!842994830.jpg","http://img2.tbcdn.cn/tfscom/i6/TB1QLChNpXXXXbTXFXXYXGcGpXX_M2.SS2","http://img2.tbcdn.cn/tfscom/i3/TB14c9pNpXXXXc2XpXXYXGcGpXX_M2.SS2"],"goods_attributes":null,"go_url":"https://s.click.taobao.com/eH6isYw","discount_url":"","shop_title":"侃侃衣诚旗舰店","constellation_id":0,"comment_count":0},{"goods_id":1379,"goods_name":"回头客手撕面包枣泥欧式蛋糕500g华夫口袋早餐饼食品整箱散装早点","market_price":"68.00","shop_price":"19.80","original_img":"http://img.alicdn.com/bao/uploaded/i4/3066393095/TB1dpcfaRY85uJjSZPcXXaGGpXa_!!0-item_pic.jpg","bc_provcity":"福建 厦门","bp_update_sales":3197,"bc_smallimg":["http://img4.tbcdn.cn/tfscom/i3/3066393095/TB2w_wLqHsTMeJjSsziXXcdwXXa_!!3066393095.jpg","http://img3.tbcdn.cn/tfscom/i2/3066393095/TB2UJQ7hfBNTKJjy0FdXXcPpVXa_!!3066393095.jpg","http://img4.tbcdn.cn/tfscom/i1/3066393095/TB2QqdkdMsSMeJjSspeXXa77VXa_!!3066393095.jpg","http://img4.tbcdn.cn/tfscom/i4/3066393095/TB2AmThmPuhSKJjSspdXXc11XXa_!!3066393095.jpg"],"goods_attributes":null,"go_url":"https://s.click.taobao.com/mewF1Zw","discount_url":"","shop_title":"回头客古龙人专卖店","constellation_id":0,"comment_count":0},{"goods_id":4222,"goods_name":"益欣油污净厨房抽油烟机清洗剂500g 家庭清洁强力去渍重油污","market_price":"29.90","shop_price":"12.90","original_img":"http://img.alicdn.com/bao/uploaded/i2/2383465929/TB1HYsfXdbJ8KJjy1zjXXaqapXa_!!0-item_pic.jpg","bc_provcity":"浙江 台州","bp_update_sales":282,"bc_smallimg":["http://img3.tbcdn.cn/tfscom/i1/2383465929/TB1JjwmXjnD8KJjSspbXXbbEXXa_!!0-item_pic.jpg","http://img3.tbcdn.cn/tfscom/i2/2383465929/TB2m16LkCJjpuFjy0FdXXXmoFXa_!!2383465929.jpg","http://img3.tbcdn.cn/tfscom/i1/2383465929/TB28z.gt4RDOuFjSZFzXXcIipXa_!!2383465929.jpg","http://img4.tbcdn.cn/tfscom/i3/2383465929/TB2qVu7iwn.PuJjSZFkXXc_lpXa_!!2383465929.jpg"],"goods_attributes":null,"go_url":"https://s.click.taobao.com/Qii7MYw","discount_url":"https://s.click.taobao.com/yGb7MYw","shop_title":"益欣旗舰店","constellation_id":0,"comment_count":0}]
     */

    private int status;
    private int error_code;
    private String msg;
    private List<ResultBean> result;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * goods_id : 482
         * goods_name : 玛丽黛佳小蘑菇气垫粉底液遮瑕保湿提亮持久补水隔离V7BB素颜霜
         * market_price : 199.00
         * shop_price : 159.20
         * original_img : http://img.alicdn.com/bao/uploaded/i3/2240117142/TB1Dqp7oEl7MKJjSZFDXXaOEpXa_!!0-item_pic.jpg
         * bc_provcity : 浙江 温州
         * bp_update_sales : 547
         * bc_smallimg : ["http://img2.tbcdn.cn/tfscom/i3/2240117142/TB21tDPmrsTMeJjy1zcXXXAgXXa_!!2240117142.png","http://img1.tbcdn.cn/tfscom/i1/2240117142/TB2qhkfrJRopuFjSZFtXXcanpXa_!!2240117142.jpg","http://img4.tbcdn.cn/tfscom/i1/2240117142/TB2yeVPfNRDOuFjSZFzXXcIipXa_!!2240117142.jpg","http://img2.tbcdn.cn/tfscom/i3/2240117142/TB2uPBdzNhmpuFjSZFyXXcLdFXa_!!2240117142.jpg"]
         * goods_attributes : null
         * go_url : https://s.click.taobao.com/sMyB2Zw
         * discount_url : https://s.click.taobao.com/udzB2Zw
         * shop_title : 润千鸿化妆品专营店
         * constellation_id : 0
         * comment_count : 0
         */

        private int goods_id;
        private String goods_name;
        private String market_price;
        private String shop_price;
        private String original_img;
        private String bc_provcity;
        private int bp_update_sales;
        private Object goods_attributes;
        private String go_url;
        private String discount_url;
        private String shop_title;
        private int constellation_id;
        private int comment_count;
        private List<String> bc_smallimg;

        public int getGoods_id() {
            return goods_id;
        }

        public void setGoods_id(int goods_id) {
            this.goods_id = goods_id;
        }

        public String getGoods_name() {
            return goods_name;
        }

        public void setGoods_name(String goods_name) {
            this.goods_name = goods_name;
        }

        public String getMarket_price() {
            return market_price;
        }

        public void setMarket_price(String market_price) {
            this.market_price = market_price;
        }

        public String getShop_price() {
            return shop_price;
        }

        public void setShop_price(String shop_price) {
            this.shop_price = shop_price;
        }

        public String getOriginal_img() {
            return original_img;
        }

        public void setOriginal_img(String original_img) {
            this.original_img = original_img;
        }

        public String getBc_provcity() {
            return bc_provcity;
        }

        public void setBc_provcity(String bc_provcity) {
            this.bc_provcity = bc_provcity;
        }

        public int getBp_update_sales() {
            return bp_update_sales;
        }

        public void setBp_update_sales(int bp_update_sales) {
            this.bp_update_sales = bp_update_sales;
        }

        public Object getGoods_attributes() {
            return goods_attributes;
        }

        public void setGoods_attributes(Object goods_attributes) {
            this.goods_attributes = goods_attributes;
        }

        public String getGo_url() {
            return go_url;
        }

        public void setGo_url(String go_url) {
            this.go_url = go_url;
        }

        public String getDiscount_url() {
            return discount_url;
        }

        public void setDiscount_url(String discount_url) {
            this.discount_url = discount_url;
        }

        public String getShop_title() {
            return shop_title;
        }

        public void setShop_title(String shop_title) {
            this.shop_title = shop_title;
        }

        public int getConstellation_id() {
            return constellation_id;
        }

        public void setConstellation_id(int constellation_id) {
            this.constellation_id = constellation_id;
        }

        public int getComment_count() {
            return comment_count;
        }

        public void setComment_count(int comment_count) {
            this.comment_count = comment_count;
        }

        public List<String> getBc_smallimg() {
            return bc_smallimg;
        }

        public void setBc_smallimg(List<String> bc_smallimg) {
            this.bc_smallimg = bc_smallimg;
        }
    }
}
