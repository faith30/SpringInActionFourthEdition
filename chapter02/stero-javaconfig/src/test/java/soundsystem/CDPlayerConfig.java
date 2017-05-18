package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
	@Bean
	public CompactDisc cd(){
		return new SgtPeppers();
	}
	@Bean
	public CDPlayer cdPlayer(CompactDisc cd){
		return  new CDPlayer(cd);
	}
}
