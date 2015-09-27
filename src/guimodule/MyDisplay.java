package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void setup() {
		super.setup();
		size(400,400);
		background(200,200,200);
	}
	
	@Override
	public void draw() {
		super.draw();
		fill(255,255,0);
		ellipse(200, 200, 390, 390);
	}
	
	
	
	

}
