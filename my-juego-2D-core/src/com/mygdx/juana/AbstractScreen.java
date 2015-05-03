package com.mygdx.juana;

import com.badlogic.gdx.Screen;

public class AbstractScreen implements Screen {
	protected principal Principal;

	public AbstractScreen(principal Principal) {
		this.Principal = Principal;
	}

	@Override
	public void show() {
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}
}