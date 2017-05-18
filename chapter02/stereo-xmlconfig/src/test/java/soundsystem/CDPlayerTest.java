package soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.commons.logging.Log;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:soundsystem.xml")
public class CDPlayerTest {
	@Rule
	public final SystemOutRule logs = new SystemOutRule().enableLog();
	@Autowired
	private CompactDisc cd;
	@Autowired
	private MediaPlayer player;
	@Test
	public void cdShouldNotNull(){
		assertNotNull(cd);
	}
	@Test
	public void play(){
		logs.clearLog();
		player.play();
		assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles", logs.getLog());
	}
}
