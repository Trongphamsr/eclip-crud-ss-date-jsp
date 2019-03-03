package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.connect.ConnectionDb;
import com.model.Thanhvien;

public class ThanhvienDao {
	public List<Thanhvien> getAllThanhvien(){
		List<Thanhvien> list = new ArrayList<>();
		Connection con;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		con=ConnectionDb.openConnection();
		try {
			pstmt=con.prepareStatement("select * from thanhvien");
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Thanhvien tv = new Thanhvien();
				tv.setStt(rs.getInt("stt"));
				tv.setHo(rs.getString("ho"));
				tv.setTen(rs.getString("ten"));
				tv.setTk(rs.getString("tk"));
				list.add(tv);
			}
		} catch (SQLException e) {
			Logger.getLogger(ConnectionDb.class.getName()).log(Level.SEVERE, null, e);
		}finally {
			ConnectionDb.closeAll(con, pstmt, rs);
		}
		return list;
	}
}