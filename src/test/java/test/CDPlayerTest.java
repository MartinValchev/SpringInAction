package test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.java.soundsystem.CDPlayerConfig;
import com.java.soundsystem.CompactDisc;
import com.java.soundsystem.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/Spring-config.xml" })
//@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	@Autowired
	MediaPlayer player;

	@Autowired
	private CompactDisc cd;

	@Test
	public void shouldNotBeNull() {
		assertNotNull(cd);
	}

	@Test
	public void testPlay() {
		player.play();
		assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles", log.getLog());
	}
}
