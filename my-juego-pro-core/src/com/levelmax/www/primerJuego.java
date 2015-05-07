package com.levelmax.www;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class primerJuego extends AbstractScreen {
	private Texture miMapa;
	private Texture personaje;
	private Rectangle lado;
	private SpriteBatch batch;
	private OrthographicCamera camara;
	int ancho = Gdx.graphics.getWidth();
	int alto = Gdx.graphics.getHeight();
	private static final float SPEED = 10;

	public primerJuego(principal Principal) {
		super(Principal);

	}

	@Override
	public void show() {
		miMapa = new Texture("mundo.png");
		personaje = new Texture("pibe.png");
		lado = new Rectangle(40, 150, personaje.getWidth(),
				personaje.getHeight());
		batch = Principal.getBatch();
		camara = new OrthographicCamera(ancho, alto);

	}

	@Override
	public void dispose() {
		miMapa.dispose();
		batch.dispose();
		personaje.dispose();

	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0.2f, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.setProjectionMatrix(camara.combined);
		batch.begin();
		batch.draw(miMapa, 0, 0);
		batch.draw(personaje, lado.x, lado.y, personaje.getWidth(),
				personaje.getHeight());
		batch.end();
		eventos();
		camara.update();

	}

	@Override
	public void resize(int width, int height) {
		camara.setToOrtho(false, ancho, alto);
	}

	public void eventos() {
		if (Gdx.input.isKeyPressed(Keys.D)) {
			lado.x = lado.x + SPEED;
			camara.position.x += SPEED;

		} else if (Gdx.input.isKeyPressed(Keys.A)) {
			lado.x = lado.x - SPEED;
			camara.position.x -= SPEED;

		}

	}
}
