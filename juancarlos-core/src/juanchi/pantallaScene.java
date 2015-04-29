package juanchi;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class pantallaScene extends AbstractScreen {

	public pantallaScene(principal Principal) {
		super(Principal);

	}

	public void render(float delta) {
		Gdx.gl.glClearColor(0.2f, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

}
