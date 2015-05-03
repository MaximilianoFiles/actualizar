package juanchi;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class Scene2dUI extends AbstractScreen {
	private Stage ECENA;
	private TextButton boton;

	private Skin skin;

	public Scene2dUI(principal Principal) {
		super(Principal);
		ECENA = new Stage();
		skin = new Skin(Gdx.files.internal("skines/uiskin.json"));

		boton = new TextButton("Opciones", skin);
		boton.setPosition(450, 300);
		ECENA.addActor(boton);

		Gdx.input.setInputProcessor(ECENA);

	}

	public void render(float delta) {
		Gdx.gl.glClearColor(0.2f, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		ECENA.act(delta);
		ECENA.draw();

	}

	public void resize() {

	}

}
