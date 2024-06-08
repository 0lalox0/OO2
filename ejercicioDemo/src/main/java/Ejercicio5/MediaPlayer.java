package Ejercicio5;

import java.util.List;

public class MediaPlayer {
public List<Media> Medias;
public String play() {
	
	for(Media m : Medias){
		m.play();
	}
	return "";
}
}
