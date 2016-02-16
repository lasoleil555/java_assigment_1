package assignment;

import java.io.File;
import java.util.ArrayList;

public class FIleMp3 {
	private static ArrayList<Song> mp3Files=new ArrayList<Song>();
	public static void main(String args[]){
		
		///
		String locationMp3Folder="C:/mp3Folder/";
		
		///
		File n=new File(locationMp3Folder);
		System.out.println(n.getAbsolutePath());
		for(File f:n.listFiles()){
			String tmp=f.getName();
			try{
				if(tmp.indexOf(".mp3")!=0){
					String artits=tmp.substring(0,tmp.indexOf("-"));
					String title=tmp.substring(tmp.indexOf("-"),tmp.length());
					Song song=new Song(f.getAbsolutePath(),f.getName(),artits,title);
					mp3Files.add(song);
					System.out.println(song);	
				}
			}catch(StringIndexOutOfBoundsException e){
				//ottip ketti
				System.err.println("Не mp3 file>>>"+ tmp+"\n");
				
			}
		}
		System.out.println("Найдена песен: " +mp3Files.size());
//		System.out.println(mp3Files.toString());
	}
}
