package swingui_05.face;

import java.awt.Color;
import java.awt.Font;

import com.swingui.constant.HorizontalAlignment;
import com.swingui.front.Frame;
import com.swingui.front.button.Button;
import com.swingui.front.layout.HStack;
import com.swingui.front.layout.Spacer;
import com.swingui.front.layout.VStack;
import com.swingui.front.text.Text;
import com.swingui.value.Spacing;
import com.swingui.value.UIValue;
import com.swingui.value.size.UILength.Height;
import com.swingui.value.size.UILength.Width;

/**
 * 顔（表情）を変化させるアノ超人クラス
 * 
 * @author t.yoshida
 */
public class FaceChanger
{
    // 表情テキスト
    private UIValue<String> faceText = UIValue.of(FacialExp.Smile.text);

    // 表情前景色
    private UIValue<Color> faceFgColor = UIValue.of(FacialExp.Smile.fgColor);

    // 表情背景色
    private UIValue<Color> faceBgColor = UIValue.of(FacialExp.Smile.bgColor);

    /**
     * 表情を変化させる。
     */
    public void playWithFace()
    {
        Frame.of
        (
            "アシュラ面 三変化（へんげ）",

            (f) ->
            {
                f.setResizable(true);  // 画面リサイズ可能
                f.setSize(400, 300);  // 初期画面サイズ指定
            },

            VStack.of
            (
                Spacing.of(0),

                Spacer.fill(),

                // 王冠テキスト
                Text.of("👑")
                    .font(new Font(Font.MONOSPACED, Font.PLAIN, 36))
                    .foreground(Color.decode("#FFD700")),

                HStack.of
                (
                    // 右手テキスト
                    VStack.of
                    (
                        Spacing.of(0),

                        Text.of("✋")
                            .foreground(Color.decode("#F8D8B7"))
                            .font(new Font(Font.MONOSPACED, Font.PLAIN, 20)),
                        Text.of("✋")
                            .foreground(Color.decode("#F8D8B7"))
                            .font(new Font(Font.MONOSPACED, Font.PLAIN, 20)),
                        Text.of("✋")
                            .foreground(Color.decode("#F8D8B7"))
                            .font(new Font(Font.MONOSPACED, Font.PLAIN, 20))
                    ),

                    // 表情テキスト
                    Text.of(faceText, HorizontalAlignment.Center)
                        .frame(Width.of(80), Height.of(80))
                        .font(new Font(Font.MONOSPACED, Font.BOLD, 12))
                        .foreground(faceFgColor)
                        .background(faceBgColor),

                    // 左手テキスト
                    VStack.of
                    (
                        Spacing.of(0),

                        Text.of("✋")
                            .foreground(Color.decode("#F8D8B7"))
                            .font(new Font(Font.MONOSPACED, Font.PLAIN, 20)),
                        Text.of("✋")
                            .foreground(Color.decode("#F8D8B7"))
                            .font(new Font(Font.MONOSPACED, Font.PLAIN, 20)),
                        Text.of("✋")
                            .foreground(Color.decode("#F8D8B7"))
                            .font(new Font(Font.MONOSPACED, Font.PLAIN, 20))
                    )
                ),

                // 笑い声テキスト
                Text.of("カーッカッカッカッカー", HorizontalAlignment.Trailing)
                    .font(new Font("Dialog", Font.BOLD, 11))
                    .frame(Width.of(230)),

                Spacer.of(Height.of(24)),

                //
                // 表情ボタン
                //
                HStack.of
                (
                    Button.of("笑い")
                        .frame(Width.of(80))
                        .onClicked((self) ->
                        {
                            faceText.set(FacialExp.Smile.text);
                            faceFgColor.set(FacialExp.Smile.fgColor);
                            faceBgColor.set(FacialExp.Smile.bgColor);
                        }),

                    Button.of("怒り")
                        .frame(Width.of(80))
                        .onClicked((self) ->
                        {
                            faceText.set(FacialExp.Angry.text);
                            faceFgColor.set(FacialExp.Angry.fgColor);
                            faceBgColor.set(FacialExp.Angry.bgColor);
                        }),

                    Button.of("冷血")
                        .frame(Width.of(80))
                        .onClicked((self) ->
                        {
                            faceText.set(FacialExp.Cold.text);
                            faceFgColor.set(FacialExp.Cold.fgColor);
                            faceBgColor.set(FacialExp.Cold.bgColor);
                        })
                ),

                Spacer.fill()
            )
        );
    }
}
