package com.model;

import java.io.*;
import java.sql.*;
/**
 * Created by Administrator on 2018/12/10.
 */
public class ligBean {
    public static Connection conn = null;
    public static Statement st = null;
    public static ResultSet rs = null;

    public final static String Driver = "com.mysql.jdbc.Driver";
    public final static String url = "jdbc:mysql://localhost:3306/tp_datebase";
    public final static String user = "root";
    public final static String password ="1234";

    public ligBean(){
        try {
            Class.forName(Driver);
            conn = DriverManager.getConnection(url,user,password);
            st = conn.createStatement();
        }catch (ClassNotFoundException e) {
            System.err.println("驱动器出错！"+e.getMessage());
            System.out.print("驱动器加载出错！"+e.getMessage());
        }catch (SQLException e) {
            System.err.println("数据库异常！"+e.getMessage());
            System.out.print("数据库出错！"+e.getMessage());
        }catch (Exception e) {
            System.err.println("JDBC出错！"+e.getMessage());
            System.out.print("JDBC出错！"+e.getMessage());
        }
    }


    private static String getEncoding(String sql) {//接收外部sql防乱码
        String s=null;
        byte b[] = null;
        try {
            b = sql.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        s = new String(b);
        return s;
    }


    public int logonInsert(lig_userBean log){//注册插入
        String sql = "insert into "+log.getType()+" (user,password) values ('"+log.getUser()+"','"+log.getPassword()+"')";
        int n = 0;
        try {
            n = st.executeUpdate(sql);
            return n;
        }catch (SQLException e) {
            System.err.println("数据库异常！"+e.getMessage());
            System.out.print(sql);
        }catch (Exception e) {
            System.err.println("JDBC出错！"+e.getMessage());
            System.out.print("JDBC出错！"+e.getMessage());
        }
        return -1;
    }


    public int logonQuery(lig_userBean log){//注册查询
        String sql = "select count(*) from "+log.getType()+" where user = '"+log.getUser()+"'";
        int n = -2;
        try {
            rs = st.executeQuery(sql);
            while (rs.next()) {
                n = rs.getInt(1);
                return n;
            }
        }catch (SQLException e) {
            System.err.println("数据库异常！"+e.getMessage());
            System.out.print(sql);
        }catch (Exception e) {
            System.err.println("JDBC出错！"+e.getMessage());
            System.out.print("JDBC出错！"+e.getMessage());
        }
        return -1;
    }

    public int loginQuery(lig_userBean lig){//登录查询
        String sql = "select count(*) from "+lig.getType()+" where user = '"+lig.getUser()+"' and password = '"+lig.getPassword()+"'";
        int n = -2;
        try {
            rs = st.executeQuery(sql);
            while (rs.next()) {
                n = rs.getInt(1);
                return n;
            }
        }catch (SQLException e) {
            System.err.println("数据库异常！"+e.getMessage());
            System.out.print(sql);
        }catch (Exception e) {
            System.err.println("JDBC出错！"+e.getMessage());
            System.out.print("JDBC出错！"+e.getMessage());
        }
        return -1;
    }

    public int student(){//学生查询
        String sql = "select count(*) from student";
        int n = -2;
        try {
            rs = st.executeQuery(sql);
            while (rs.next()) {
                n = rs.getInt(1);
                return n;
            }
        }catch (SQLException e) {
            System.err.println("数据库异常！"+e.getMessage());
            System.out.print(sql);
        }catch (Exception e) {
            System.err.println("JDBC出错！"+e.getMessage());
            System.out.print("JDBC出错！"+e.getMessage());
        }
        return -1;
    }
    public int enterprise(){//企业查询
        String sql = "select count(*) from enterprise";
        int n = -2;
        try {
            rs = st.executeQuery(sql);
            while (rs.next()) {
                n = rs.getInt(1);
                return n;
            }
        }catch (SQLException e) {
            System.err.println("数据库异常！"+e.getMessage());
            System.out.print(sql);
        }catch (Exception e) {
            System.err.println("JDBC出错！"+e.getMessage());
            System.out.print("JDBC出错！"+e.getMessage());
        }
        return -1;
    }

    public void close(){
        try {
            if(rs != null)rs.close();
            if(st != null)st.close();
            if(conn != null)conn.close();
        }catch (SQLException e){

        }catch (Exception e){

        }
    }
}
