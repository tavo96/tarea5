package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class pelotitamala extends Image{
	public pelotitamala(int x, int y) {
		super(new Texture("data/pelotitamala.png"));
		this.addListener(new miInputmala(this));
		if (getX()>100)
		remove();
		
		setX(x);
		setY(y);
	}
	public void act(float delta)
	{ setX(getX()+1);
	 	
		if(getX()>420)
			{
			setX(0);}
		
	
	}

}