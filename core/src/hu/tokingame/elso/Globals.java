package hu.tokingame.elso;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.math.Vector;
import com.badlogic.gdx.physics.box2d.World;
import com.sun.corba.se.spi.ior.iiop.MaxStreamFormatVersionComponent;

/**
 * Created by M on 10/14/2016.
 */


public class Globals {
    public static final String CHARS = "0123456789öüóqwertzuiopőúasdfghjkléáűíyxcvbnm'+!%/=()ÖÜÓQWERTZUIOPŐÚASDFGHJKLÉÁŰÍYXCVBNM?:_*<>#&@{}[],-.";
   // public static final BitmapFont FONT_HOBO_STD;
   // public static final BitmapFont FONT_DIGITAL_7;
    public static java.util.Vector<Integer> sorozat;
    public static boolean zeneKelle = true;
    public static int maxM = Generator.getMaxM();
    public static int minM = Generator.getMinM();
    public static int maxSz = Generator.getMaxSz();
    public static int minSz = Generator.getMinSz();

    public static boolean egyediMode = false; // ennek az értéke befolyásolja hogy egyéni vagy normál mód.
    public static boolean nehez = false;
/*
    static {
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("calibril.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 50;
        parameter.characters = CHARS;
        FONT_HOBO_STD = generator.generateFont(parameter);
        FONT_HOBO_STD.setColor(1, 1, 1, 1f);

        FreeTypeFontGenerator generator1 = new FreeTypeFontGenerator(Gdx.files.internal("digital-7.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter1 = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter1.size = 50;
        parameter1.characters = CHARS;
        FONT_DIGITAL_7 = generator1.generateFont(parameter1);
        FONT_DIGITAL_7.setColor(1,1,1,1f);


        generator.dispose();
    }*/
}
