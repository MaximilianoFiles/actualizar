package Actores;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;

public class cocheActor extends Actor {
	private Texture chabon;
	private TextureRegion chabonRegion;

	public cocheActor() {
		chabon = new Texture("pibe.png");
		chabonRegion = new TextureRegion(chabon, chabon.getWidth(),
				chabon.getHeight());
		setSize(chabon.getWidth(), chabon.getHeight());
	}

	public void dispose() {
		chabon.dispose();
	}

	@Override
	public void draw(Batch batch, float parentAlpha) {
		Color color = getColor();
		batch.setColor(color.r, color.g, color.b, color.a * parentAlpha);
		batch.draw(chabonRegion, getY(), getX(), getOriginX(), getOriginY(),
				getWidth(), getHeight(), getScaleX(), getScaleY(),
				getRotation());
	}

	@Override
	public void act(float delta) {
		super.act(delta);
		addCaptureListener(new InputListener() {
			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				addAction(Actions.color(Color.BLUE));
				return true;
			}

			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				addAction(Actions.color(Color.GREEN));
			}
		});
	}
}