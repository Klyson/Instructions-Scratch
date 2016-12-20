package Daught_Scratches;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ScrInstructions extends ApplicationAdapter {

    SpriteBatch batch;
    Sprite spr;

    @Override
    public void create() {
        batch = new SpriteBatch();
        spr = new Sprite(new Texture("Dance^4_Instructions.png"));
        spr.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        spr.setPosition(0, 0);
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        spr.draw(batch);
        batch.end();
        if (Gdx.input.isKeyPressed(Input.Keys.ESCAPE)) {
            Gdx.app.exit();
        }
    }
}
