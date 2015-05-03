package Actores;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class negro extends Actor {
	private Texture fondito;
	private TextureRegion negrito;

	public negro() {
		fondito = new Texture("mainScreen.png");
		negrito = new TextureRegion(fondito, 800, 500);

	}

	public void dispose() {
		fondito.dispose();

	}

	@Override
	public void draw(Batch batch, float parentAlpha) {

		batch.draw(negrito, getY(), getX(), getOriginX(), getOriginY(),
				getWidth(), getHeight(), getScaleX(), getScaleY(),
				getRotation());

	}

	@Override
	public void act(float delta) {
		super.act(delta);
	}

}
