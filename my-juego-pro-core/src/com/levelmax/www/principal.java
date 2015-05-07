package com.levelmax.www;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class principal extends Game {
	private SpriteBatch batch;
	private AbstractScreen PANTALLASCENE;
	private AbstractScreen UI;
	private AbstractScreen PRIMERJUEGO;

	@Override
	public void create() {
		batch = new SpriteBatch();
		PRIMERJUEGO = new primerJuego(this);
		UI = new Scene2dUI(this);
		PANTALLASCENE = new pantallaScene(this);
		setScreen(PRIMERJUEGO);
	}

	public void dispose() {
		PANTALLASCENE = new pantallaScene(this);

	}

	public SpriteBatch getBatch() {
		return batch;
	}
}
