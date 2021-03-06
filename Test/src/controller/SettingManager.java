package controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SettingManager {
	// MD5
		public static String cryptMD5(String message) {
			/*MessageDigest md;
			try {
					md = MessageDigest.getInstance("MD5");
				
				md.update(message.getBytes());
				byte byteData[] = md.digest();
				// convert the byte to hex format
				StringBuffer sb = new StringBuffer();
				for (int i = 0; i < byteData.length; i++) {
					sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16)
							.substring(1));
				}
				message = sb.toString();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
				catch (NoSuchAlgorithmException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return message;*/
			MessageDigest md = null;
			try {
				md = MessageDigest.getInstance("MD5");
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
			md.update(message.getBytes());
			byte[] digest = md.digest();
			StringBuffer sb = new StringBuffer();
			for (byte b : digest) {
				sb.append(String.format("%02x", b & 0xff));
			}
			message = sb.toString();
			return message;
		}
}
