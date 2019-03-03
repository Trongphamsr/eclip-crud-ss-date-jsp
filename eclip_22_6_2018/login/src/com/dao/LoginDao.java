package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.jdt.internal.compiler.batch.Main;

import com.connect.ConnectDb;
import com.model.LoginModel;
import com.mysql.cj.api.jdbc.Statement;

public class LoginDao {

	public static LoginModel Login(String username, String password) {
//		boolean bl = false;
//		Connection con;
//		PreparedStatement ps;
//		ResultSet rs;
//		con=ConnectDb.openConnect();
//
//		
////		username da duoc kiem tra la chi co duy nhat, nen ta chon duoc cai tg uong voi username cua ng dung
//		String sql1 = "select createdate from login where username='"+username+"'";
//		try {
//			ps=con.prepareStatement(sql1);
//			// khi tra ve result thi chac chan lay dk tg he thong
//			rs=ps.executeQuery();
//			rs.next();
//			String rs1=rs.getString("createdate");
//			
//			// lay thoi gian hien tai va tg he thong kieu tra ve string
//			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//			String st = String.valueOf(timestamp);
//			
//			// dinh dang ngay theo quy chuan thong nhat
////			SimpleDateFormat format = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z"); 
//			
//			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
//			Date d1 = null;
//			Date d2 = null;
//			try {
//				d1= format.parse(rs1);
//				d2=  format.parse(st);
//			} catch (ParseException e) {
//				e.printStackTrace();
//			}
//			// lay thoi gian hien tai tru di tg he thong tra ve giay
////			long diff=d2.getTime()-d1.getTime();
////			long dt = st3-rs2;
//				long diff=d1.getTime();
//				long dif=d2.getTime();
//				
//				long gg =dif-diff;
//				long seconds = TimeUnit.MILLISECONDS.toSeconds(gg);
//			
//			// neu ma tg tra ve tru di tg trong he thong nho hon hoac bang 30 ngay thi ta se cho login
////			if(seconds<=2592000) {
////				// kiem tra nhap username va password
////				
////				String sql="select * from login where username='"+username+"' and password='"+password+"'";
////				try {
////					ps=con.prepareCall(sql);
////					rs=ps.executeQuery();
////					
////					while(rs.next()) {
////						LoginModel md= new LoginModel();
////						md.setUsername(rs.getString("username"));
////						md.setPassword(rs.getString("password"));
////						con.close();
////						return md;
////					}
////				} catch (SQLException e) {
////					Logger.getLogger(LoginDao.class.getName()).log(Level.SEVERE,null,e);
////				}
////			}
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		return null;
		
		
		
		
		
		Connection con;
		PreparedStatement ps;
		ResultSet rs;
		con=ConnectDb.openConnect();
		String re="2017-2-14 ";

		String sql1 = "select createdate from login where username='"+username+"'";
		try
		{
			PreparedStatement bbb = con.prepareStatement(sql1);
			
			ResultSet aaa = bbb.executeQuery();
			aaa.next();
			//System.out.println("hshsh "+ aaa.getString("createdate"));
//			String a = aaa.getString("createdate");
			String a = aaa.getString("createdate");
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			String st = String.valueOf(timestamp);
			
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
			Date d1=null;
			Date d2=null;
			try {
				d1 = format.parse(a);
				d2=format.parse(st);
				System.out.println(d1);
				System.out.println(d2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			long diff=d1.getTime();
			long dif=d2.getTime();
			long gg =dif-diff;
			long seconds = TimeUnit.MILLISECONDS.toHours(diff);
			long seconds1 = TimeUnit.MILLISECONDS.toHours(dif);
			long g = TimeUnit.MILLISECONDS.toSeconds(gg);
			System.out.println(seconds);
			System.out.println(seconds1);
			System.out.println(g);
			
			
			if(g<=100) {
			// kiem tra nhap username va password
			
			String sql="select * from login where username='"+username+"' and password='"+password+"'";
			try {
				ps=con.prepareCall(sql);
				rs=ps.executeQuery();
				
				while(rs.next()) {
					LoginModel md= new LoginModel();
					md.setUsername(rs.getString("username"));
					md.setPassword(rs.getString("password"));
					con.close();
					return md;
				}
			} catch (SQLException e) {
				Logger.getLogger(LoginDao.class.getName()).log(Level.SEVERE,null,e);
			}
		}
				
				
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("34534534");
		}
		return null;
	}
		
		
	public static void main(String[] args) throws SQLException {
		Connection con;
		PreparedStatement ps;
		ResultSet rs;
		con=ConnectDb.openConnect();
		String re="2017-2-14 ";

		String sql1 = "select createdate from login where username='a'";
		try
		{
			PreparedStatement bbb = con.prepareStatement(sql1);
			
			ResultSet aaa = bbb.executeQuery();
			aaa.next();
			//System.out.println("hshsh "+ aaa.getString("createdate"));
//			String a = aaa.getString("createdate");
			String a = aaa.getString("createdate");
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			String st = String.valueOf(timestamp);
			
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date d1=null;
			Date d2=null;
			try {
				d1 = format.parse(a);
				d2=format.parse(st);
				System.out.println(d1);
				System.out.println(d2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			long diff=d1.getTime();
			long dif=d2.getTime();
			long gg =dif-diff;
			long seconds = TimeUnit.MILLISECONDS.toHours(diff);
			long seconds1 = TimeUnit.MILLISECONDS.toHours(dif);
			long g = TimeUnit.MILLISECONDS.toHours(gg);
			System.out.println(seconds);
			System.out.println(seconds1);
			System.out.println(g);
			
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("34534534");
		}
		
		
	}
}
