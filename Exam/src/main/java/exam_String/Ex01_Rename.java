package exam_String;

import java.util.Arrays;

public class Ex01_Rename {
	public static void main(String[] args) {
		String[] music = { "d:/music/hoangloc.mp3",
				"d:/music/hoanglong.mp4",
				"d:/music/hoanglinh.mp3",
				"d:/music/hoangloan.mp4", 
				"d:/music/hoanglam.mp3", };
		String[] musicc = getMusic(music);
		for(String result:musicc) {
			System.out.println(result);
		}
	}

	public static String[] getMusic(String[] list) {
		String[] music =new String[list.length];
		int index=0;
		for (int i = 0; i < list.length; i++) {
			if (list[i].endsWith(".mp3")) {
				int beginIndex = list[i].lastIndexOf("/");
				int endIndex = list[i].indexOf(".");
				music[index++]= list[i].substring(beginIndex+1, endIndex);
			}
		}
		return Arrays.copyOfRange(music, 0, index);
	}
}
