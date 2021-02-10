package inf112.skeleton.app;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import inf112.skeleton.app.screen.TitleScreen;

public class InputHandler extends InputAdapter {
    private RoboRally game;

    public InputHandler(RoboRally aGame) {
        game = aGame;
    }

    @Override
    public boolean keyUp(int keycode) {
        switch (keycode) {
            case Input.Keys.ESCAPE:
                game.setScreen(new TitleScreen(game));
                break;
            case Input.Keys.UP:

                break;
            case Input.Keys.LEFT:
                break;
            case Input.Keys.RIGHT:
                break;
            default:

        }
        return true;
    }

}
