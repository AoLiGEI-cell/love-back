package com.quanshu.loveback.pojo;

public class Result {
    private Integer code;//状态码
    private String msg;//提示信息
    private Object data;//返回数据

    public Result() {
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    //声明静态方法创建result对象-成功有数据
    public static Result success(Object data){
        return new Result(1, "success", data);
    }
    //成功无数据
    public static Result success(){
        return new Result(1, "success", null);
    }
    //失败
    public static Result error(String msg){
        return new Result(0, msg, null);
    }
}
