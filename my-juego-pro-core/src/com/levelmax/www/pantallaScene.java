package com.levelmax.www;

import Actores.cocheActor;
import Actores.fondoActor;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class pantallaScene extends AbstractScreen {
	private Stage ESCENARIO;
	private cocheActor PIBE;
	private fondoActor FONDO;

	public pantallaScene(principal Principal) {
		super(Principal);
		ESCENARIO = new Stage(new ScreenViewport());
		Gdx.input.setInputProcessor(ESCENARIO);
		FONDO = new fondoActor();
		FONDO.setSize(ESCENARIO.getWidth(), ESCENARIO.getHeight());
		ESCENARIO.addActor(FONDO);
		PIBE = new cocheActor();
		PIBE.setPosition(100, 100);
		PIBE.setRotation(89f);
		ESCENARIO.addActor(PIBE);
	}

	public void render(float delta) {
		Gdx.gl.glClearColor(0.2f, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		ESCENARIO.draw();
		ESCENARIO.act();
	}

	public void resize() {
		ESCENARIO.getViewport().update(Gdx.graphics.getWidth(),
				Gdx.graphics.getHeight());
		FONDO.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	}
}
