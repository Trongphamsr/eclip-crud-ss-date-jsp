package com.bai80;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class BaiTapFileTextFileFactory {

	public static boolean saveFile(ArrayList<BaiTapFile> dsKH, String path)
	{
		try {
			
			FileOutputStream fos= new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			for(BaiTapFile kh :dsKH) {
				String line = kh.getMa()+";" +kh.getTen()+";"+BaiTapFileDateConverter.fromDate(kh.getNamSing());
				bw.write(line);
				bw.newLine();
			}
			bw.close();
			osw.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static ArrayList<BaiTapFile> readFile(String path)
	{
		ArrayList<BaiTapFile> dsKH = new ArrayList<>();
		try {
			
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			while(line!=null) {
				String []arr=line.split(";");
				if(arr.length==3) {
					BaiTapFile kh = new BaiTapFile();
					kh.setMa(Integer.parseInt(arr[0]));
					kh.setTen(arr[1]);
					kh.setNamSing(BaiTapFileDateConverter.fromString(arr[2]));
					dsKH.add(kh);
				}
				line=br.readLine();
			}
			br.close();
			isr.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dsKH;
	}
}
