package juanchi;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class principal extends Game {
	private SpriteBatch batch;
	private AbstractScreen PANTALLASCENE;

	@Override
	public void create() {
		batch = new SpriteBatch();
		PANTALLASCENE = new pantallaScene(this);
		setScreen(PANTALLASCENE);

	}

	public SpriteBatch getBatch() {
		return batch;
	}

}
