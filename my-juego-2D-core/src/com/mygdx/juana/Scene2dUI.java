package com.mygdx.juana;

import Actores.negro;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;

public class Scene2dUI extends AbstractScreen {
	private Stage ECENA;
	private negro fondoNegro;
	private Skin skin;
	private Table tabla;

	public Scene2dUI(principal Principal) {
		super(Principal);
		ECENA = new Stage();

		skin = new Skin(Gdx.files.internal("skines/uiskin.json"));

		fondoNegro = new negro();
		fondoNegro.setSize(ECENA.getWidth(), ECENA.getHeight());
		ECENA.addActor(fondoNegro);

		tabla = new Table();
		ECENA.addActor(tabla);
		tabla.setFillParent(true);

		Label labelNombre = new Label("Nombre", skin);
		Label labelPuntuacion = new Label("Puntuacion", skin);
		TextField fielNombre = new TextField("", skin);
		TextField fielPuntuacion = new TextField("500", skin);
		tabla.add(labelNombre);
		tabla.add(fielNombre);
		tabla.row();
		tabla.add(labelPuntuacion);
		tabla.add(fielPuntuacion);

		tabla.debug();

		Gdx.input.setInputProcessor(ECENA);
	}

	public void render(float delta) {
		Gdx.gl.glClearColor(0.2f, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		ECENA.act(delta);
		ECENA.draw();
		tabla.setDebug(true);

	}

	public void resize() {
	}
}
