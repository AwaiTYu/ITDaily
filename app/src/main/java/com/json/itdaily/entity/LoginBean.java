package com.json.itdaily.entity;

import java.util.List;

/**
 * Created by Json on 2017/9/8.
 */

public class LoginBean {
    /**
     * status : 1
     * error_code : 200
     * msg : 登陆成功
     * result : {"token":"d137faae59d2dfb7fc8efa795ae8a2268276c91e"}
     */

    private int status;
    private int error_code;
    private String msg;
    private ResultBean result;

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

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * token : d137faae59d2dfb7fc8efa795ae8a2268276c91e
         */

        private String token;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
}
