package stages;

import java.io.File;

public class Intro extends Stage{
	
	
	public Intro() {
		super(Intro.class.getSimpleName(), "Intro.txt");
		super.addRandomInfo();
	}

}
