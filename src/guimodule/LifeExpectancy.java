package guimodule;

import java.util.HashMap;
import java.util.Map;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class LifeExpectancy extends PApplet {
	
	private static final long serialVersionUID = -3216257522949427480L;
	UnfoldingMap map;

	@Override
	public void setup() {
		size(800, 700, OPENGL);
		map = new UnfoldingMap(this, 50, 50, 700, 500, 
				new Google.GoogleMapProvider() );
		MapUtils.createDefaultEventDispatcher(this, map);
	}
	
	@Override
	public void draw() {
		map.draw();
	}
	
	private Map<String,Float> lifeExpectancyFromCVS(String fileName){
		
		Map<String,Float> lifeExpMap = new HashMap<String,Float>();
		String[] rows = {};
		return lifeExpMap;
	}
	

}
