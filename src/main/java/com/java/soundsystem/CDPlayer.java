package com.java.soundsystem;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class CDPlayer implements MediaPlayer{
	private CompactDisc compactDisc;
		

	public CompactDisc getCompactDisc() {
		return compactDisc;
	}
	@Autowired
	public void setCompactDisc(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}


	public void play() {
		compactDisc.play();
		
	}
}
