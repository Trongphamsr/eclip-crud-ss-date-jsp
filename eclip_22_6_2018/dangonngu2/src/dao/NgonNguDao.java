package dao;

import java.util.HashMap;
import java.util.Map;

public class NgonNguDao {

	public Map<String,String> englishLanguage(){
		Map<String,String> map = new HashMap<>();
		map.put("Login.TieuDe", "My Login Form");
		map.put("Login.TenDangNhap", "username");
		map.put("Login.MatKhau", "password");
		map.put("Login.GhiNho", "remember");
		map.put("Login.Submit", "Login");
		return map;
		
	}
	
	public Map<String,String> vietnameseLanguage(){
		Map<String,String> map = new HashMap<>();
		map.put("Login.TieuDe", "tieu de");
		map.put("Login.TenDangNhap", "tai khoan");
		map.put("Login.MatKhau", "mat khau");
		map.put("Login.GhiNho", "ghi nho");
		map.put("Login.Submit", "dang nhap");
		return map;
		
	}
}
