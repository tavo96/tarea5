package com.me.mygdxgame;


import java.awt.event.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class miInputmala extends InputListener{
	pelotitamala t;
	miInputmala(pelotitamala param)
	{
		super();
		t = param ;
	}
	
	
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
	   System.exit(0);
	   return true;
	}

}