package com.bai80;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BaiTapSerializeFactory {

	public static boolean saveFile(ArrayList<BaiTapSerializeDanhBa>dsDB, String path)
	{
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dsDB);
			oos.close();
			fos.close();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
	
	public static ArrayList<BaiTapSerializeDanhBa> readFile(String path)
	{
		ArrayList<BaiTapSerializeDanhBa> dsDB = new ArrayList<>();
		try {
			
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object data = ois.readObject();
			dsDB=(ArrayList<BaiTapSerializeDanhBa>) data;
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dsDB;
	}
}
