package com.mygdx.juana;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class principal extends Game {
	private SpriteBatch batch;
	private AbstractScreen PANTALLASCENE;
	private AbstractScreen UI;

	@Override
	public void create() {
		batch = new SpriteBatch();
		UI = new Scene2dUI(this);
		setScreen(UI);
	}

	public void dispose() {
		PANTALLASCENE = new pantallaScene(this);
	}

	public SpriteBatch getBatch() {
		return batch;
	}
}