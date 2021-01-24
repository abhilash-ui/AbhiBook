package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class readconfig {
	 Properties pro;
	
	
	public  readconfig()   {
File f=new File("./config/config.properties");

try {
	FileInputStream fis= new FileInputStream(f);
	pro=new Properties();

	pro.load(fis);
} catch (Exception e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}



}

	
	public String user() {
		String use = pro.getProperty("us");
		return use;
	}
	public String pass() {
		String psw = pro.getProperty("psw");
		return psw;
	}
	public String veri() {
	String veriable = pro.getProperty("ver");
	return veriable;
	}
	public String Neguss() {
		String negetiveus = pro.getProperty("uss");
		return negetiveus;
	}
	public String Negpss() {
		String negetiveps = pro.getProperty("pss");
		return Negpss();
	}
}
