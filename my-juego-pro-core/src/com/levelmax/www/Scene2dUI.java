package com.levelmax.www;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class Scene2dUI extends AbstractScreen {
	private Stage ECENA;
	private Skin skin;
	private Table tabla;
	private Texture imageFondo;
	private SpriteBatch batch;
	private TextButton newGame, loadGame, setting, quit;

	public Scene2dUI(principal Principal) {
		super(Principal);
		batch = Principal.getBatch();
		ECENA = new Stage();
		imageFondo = new Texture("juan.png");

		Gdx.input.setInputProcessor(ECENA);

		skin = new Skin(Gdx.files.internal("skines/uiskin.json"));

		// TABLA
		tabla = new Table().pad(30);
		ECENA.addActor(tabla);
		tabla.setFillParent(true);

		newGame = new TextButton("Nuevo juego", skin);
		loadGame = new TextButton("Cargar juego", skin);
		setting = new TextButton("Opciones", skin);
		quit = new TextButton("Salir", skin);

		final int anchoBoton = 300;
		final int altoBoton = 60;
		final int espacio = 20;

		tabla.add(newGame).width(anchoBoton).height(altoBoton).space(espacio)
				.row();
		tabla.add(loadGame).width(anchoBoton).height(altoBoton).space(espacio)
				.row();
		tabla.add(setting).width(anchoBoton).height(altoBoton).space(espacio)
				.row();
		tabla.add(quit).width(anchoBoton).height(altoBoton).space(espacio)
				.row();

	}

	public void render(float delta) {
		Gdx.gl.glClearColor(0.2f, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(imageFondo, 0, 0);
		batch.end();
		ECENA.act(delta);
		ECENA.draw();
	}

	public void resize() {
	}
}
