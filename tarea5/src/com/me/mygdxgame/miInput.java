package com.me.mygdxgame;

import java.awt.event.InputEvent;

import com.badlogic.gdx.scenes.scene2d.InputListener;



public class miInput extends InputListener{
	pelotita p;
	miInput(pelotita param)
	{
		super();
		p = param;
	}
	

	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
		p.remove();
		return true;
	}

}