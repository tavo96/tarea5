package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class pelotita extends Image{
	public pelotita(int x, int y) {
		super(new Texture("data/pelotita.png"));
		this.addListener(new miInput(this));
		if (getX()>100)
		remove();
		
		this.setX(x);
		this.setY(y);
	}
	public void act(float delta)
	{ setX(getX()+1);
	 	
		if(getX()>420)
			{
			setX(0);}
		
		
		
	}

}