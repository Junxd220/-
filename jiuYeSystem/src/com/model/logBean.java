package com.model;

import java.io.UnsupportedEncodingException;
import java.sql.*;

/**
 * Created by Administrator on 2018/12/15.
 */
public class logBean {
    public static Connection conn = null;
    public static Statement st = null;
    public static ResultSet rs = null;

    public final static String Driver = "com.mysql.jdbc.Driver";
    public final static String url = "jdbc:mysql://localhost:3306/tp_datebase";
    public final static String user = "root";
    public final static String password ="1234";

    public logBean(){
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
        }catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }
        s = new String(b);
        return s;
    }


    public int stuInsert(log_userBean log){//学生信息插入
        String sql = "insert into stuInfo (stuID,loginID,name,sex,nation,birth,maarry,height,weight,idCard,idAddress,telephone,mobilephone,qq,email,postNum,nowAddress, myselfOpinin,college,studyType,studyName,chinese,computer,language_a,level_a,language_b,level_b) values " +
                "('"+log.getStuID()+"','"+log.getLoginID()+"','"+log.getName()+",'"+log.getSex()+"','"+log.getNation()+"','"+log.getBirth()+"','"+log.getMaarry()+"','"+log.getHeight()+"','"+log.getWeight()+"','"+log.getIdCard()+"','"+log.getIdAddress()+"'" +
                ",'"+log.getTelephone()+"','"+log.getMobilephone()+"','"+log.getQq()+"','"+log.getEmail()+"','"+log.getPostNum()+"','"+log.getNowAddress()+"'" +
                ",'"+log.getMyselfOpinin()+"','"+log.getCollege()+"','"+log.getStudyType()+"','"+log.getStudyName()+"'" +
                ",'"+log.getChinese()+"','"+log.getComputer()+"','"+log.getLanguage_a()+"','"+log.getLevel_a()+"','"+log.getLanguage_b()+"','"+log.getLevel_b()+"')";
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


    public int logonInserts(log_userBean log){//企业信息插入
        String sql = "";
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
