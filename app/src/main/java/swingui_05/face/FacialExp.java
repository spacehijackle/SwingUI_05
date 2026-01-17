package swingui_05.face;

import java.awt.Color;

/**
 * 表情クラス
 */
public class FacialExp
{
    /** 笑い(通常)顔 */
    static final FacialExp Smile = new FacialExp
    (
        "(*‘∀‘)", Color.black, Color.decode("#F8D8B7")
    );

    /** 怒り顔 */
    static final FacialExp Angry = new FacialExp
    (
        "(＃｀Д´)", Color.white, Color.red
    );

    /** 冷血顔 */
    static final FacialExp Cold = new FacialExp
    (
        "(-_-)", Color.black, Color.cyan
    );

    /** 表情テキスト */
    public final String text;

    /** 表情前景色 */
    public final Color fgColor;

    /** 表情背景色 */
    public final Color bgColor;

    private FacialExp(String text, Color fgColor, Color bgColor)
    {
        this.text = text;
        this.fgColor = fgColor;
        this.bgColor = bgColor;
    }
}
