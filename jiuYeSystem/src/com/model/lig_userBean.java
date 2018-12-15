package com.model;

/**
 * Created by Administrator on 2018/12/10.
 */
public class lig_userBean {
    private int id;
    private String type;
    private String user;
    private String password;

    public lig_userBean(){
        super();
    }

    public lig_userBean(String type, String user, String password){
        super();
        this.type = type;
        this.user = user;
        this.password = password;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
