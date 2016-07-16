package com.shopping.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {

	public static String getMD5(String str) {
	        byte [] buf = str.getBytes();
	        MessageDigest md5;
	        StringBuilder sb =null;
			try {
				md5 = MessageDigest.getInstance("MD5");
				 md5.update(buf);
			        byte [] tmp = md5.digest();
			        sb = new StringBuilder();
			        for (byte b:tmp) {
			            sb.append(Integer.toHexString(b&0xff));
			        }
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       
	        return sb.toString() ;
	}
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		 for (int i = 0; i < 10; i++) {
			 System.out.println(getMD5("123456"));
		}
		 
		 //×¢²á  ÃÜÂëµÄ¼ÓÃÜ
		 //µÇÂ¼ ÃÜÂëµÄ¼ÓÃÜ
		 
		 
	}
}
