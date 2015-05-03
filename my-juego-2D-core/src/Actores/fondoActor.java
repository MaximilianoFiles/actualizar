package Actores;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class fondoActor extends Actor {
	private ShapeRenderer shape;

	public fondoActor() {
		shape = new ShapeRenderer();
	}

	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.end();
		shape.setProjectionMatrix(batch.getProjectionMatrix());
		shape.setTransformMatrix(batch.getTransformMatrix());
		shape.begin(ShapeType.Filled);
		shape.rect(getX(), getY(), getWidth(), getHeight(), Color.RED,
				Color.GREEN, Color.BLUE, Color.YELLOW);
		shape.end();
		batch.begin();
	}
}