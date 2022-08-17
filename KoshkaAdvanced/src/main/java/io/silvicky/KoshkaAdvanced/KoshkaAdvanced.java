package io.silvicky.KoshkaAdvanced;

import io.silvicky.Koshka.Koshka;
import io.silvicky.String.ExpressionErr;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.*;
import java.io.IOException;

public class KoshkaAdvanced extends Koshka {
    public KoshkaAdvanced(GraphicsConfiguration gc) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        super(gc);
    }

    public KoshkaAdvanced(GraphicsConfiguration gc, String val) throws IOException, UnsupportedAudioFileException, LineUnavailableException, ExpressionErr {
        super(gc, val);
    }
    @Override
    public int translatePic(int src)
    {
        if(getGender(0))
        {
            if(src>=0&&src<=7)src+=8;
            else if(src>=8&&src<=15)src-=8;
            else if(src>=31&&src<=34)src+=4;
            else if(src>=35&&src<=38)src-=4;
        }
        if(getGender(1))
        {
            if(src==0||src==1)src+=6;
            else if(src>=2&&src<=5)src+=29;
            else if(src==6||src==7)src-=6;
            else if(src==8||src==9)src+=6;
            else if(src>=10&&src<=13)src+=25;
            else if(src==14||src==15)src-=6;
            else if(src==16)src=39;
            else if(src>=31&&src<=34)src-=29;
            else if(src>=35&&src<=38)src-=25;
            else if(src==39)src=16;
        }
        return src;
    }
}
