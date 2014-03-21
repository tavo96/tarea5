package com.me.mygdxgame;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;




public class MyGdxGame implements ApplicationListener {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture texture;
	private Sprite sprite;
	private Image i;
	pelotita p;
	pelotitamala f;
	
	int frame=0;
	
	Stage s;
	ArrayList<pelotita>pelotitas=new ArrayList<pelotita>();
	ArrayList<pelotitamala>pelotitasmala=new ArrayList<pelotitamala>();
	
	
	
	@Override
	public void create() {		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
		
		texture = new Texture(Gdx.files.internal("data/image3297.png"));
		
		
		sprite = new Sprite(texture,512,512);
		sprite.setSize(1f,0.9f);
		sprite.setPosition(-0.5f,-0.4f);
		
		Gdx.input.setInputProcessor(s);
		
		
		s=new Stage();
		i=new Image(texture);
		s.addActor(i);
		for(int i=0; i<=10; i++)
		{
			
			pelotita p = new pelotita((int)(Math.random()*1000%w),(int)(Math.random()*1000%h));
			s.addActor(p);
			pelotitas.add(p);
		}
		
		for(int i=0; i<=10; i++)
		{
			
			pelotitamala f = new pelotitamala((int)(Math.random()*1000%w),(int)(Math.random()*1000%h));
			s.addActor(f);
			pelotitasmala.add(f);
		}
		
		
	}

	@Override
	public void dispose() {
		batch.dispose();
		texture.dispose();
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		sprite.draw(batch);
		s.act();
		s.draw();
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
