package com.tom.game;

public class dog extends Thread {
    public static final int DIRECTION_UP = 0;
    public static final int DIRECTION_DOWN = 1;
    public static final int DIRECTION_RIGHT = 2;
    public static final int DIRECTION_LEFT = 3;
    public static final int DIRECTION_NONE = -1;

    private final GameView gameView;
    int direction = DIRECTION_NONE;
    int x, y = 0;

    public dog(GameView gameView) {
        this.gameView = gameView;
    }

    @Override
    public void run() {
        while (direction != DIRECTION_NONE) {
            switch (direction) {
                case DIRECTION_UP:
                    if (y > 60) {
                        y -= 50;
                    }
                    dog.interrupted();

            }
        }
    }
}


//期末：圖片效果 + intent Activity切換 + switch + 儲存資料 到Android手機 SharedPreferences 喜好資料 讀取資料 abd工具