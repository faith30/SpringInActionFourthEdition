package soundsystem;

import org.junit.contrib.java.lang.system.SystemOutRule;
import org.springframework.stereotype.Component;

import ch.qos.logback.core.util.SystemInfo;

@Component
public class SgtPeppers implements CompactDisc {
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	
	
	public void play(){
		System.out.print("Playing "+ title + " by " + artist);
	}
}
