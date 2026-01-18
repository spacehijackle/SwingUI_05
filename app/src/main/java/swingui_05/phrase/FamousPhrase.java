package swingui_05.phrase;

import java.awt.Color;
import java.awt.Font;

import com.swingui.constant.HorizontalAlignment;
import com.swingui.constant.UIAlignmentX;
import com.swingui.front.Frame;
import com.swingui.front.button.Button;
import com.swingui.front.layout.HStack;
import com.swingui.front.layout.Spacer;
import com.swingui.front.layout.VStack;
import com.swingui.front.text.Text;
import com.swingui.value.Spacing;
import com.swingui.value.UIValue;
import com.swingui.value.gap.Symmetry.Horizontal;
import com.swingui.value.size.UILength.Height;
import com.swingui.value.size.UILength.Width;

/**
 * 有名なフレーズを表示するクラス
 * 
 * @author t.yoshida
 */
public class FamousPhrase
{
    // フレーズテキスト
    private UIValue<String> phrase = UIValue.of("Select a phrase below.");

    /**
     * 選択したキャラクターのフレーズを表示する。
     */
    public void selectCharacter()
    {
        Frame.of
        (
            "キャラクター選択",

            (f) ->
            {
                f.setResizable(true);  // 画面リサイズ可能
                f.setSize(400, 300);  // 初期画面サイズ指定
            },

            VStack.of
            (
                Spacer.fill(),

                //
                // フレーズ表示
                //
                VStack.of
                (
                    UIAlignmentX.Leading,  // 左寄せ

                    Spacing.of(4),

                    // タイトル
                    Text.of("- Famous Phrase -")
                        .font(new Font("Dialog", Font.ITALIC, 12)),

                    // フレーズ
                    Text.of(phrase)
                        .self(self -> self.setOpaque(true))
                        .font(new Font("Dialog", Font.PLAIN, 24))
                        .frame(Width.Infinite, Height.of(80))
                        .padding(16)
                        .background(Color.white)
                )
                .padding(Horizontal.of(24)),

                Spacer.of(Height.of(8)),

                //
                // キャラクター選択ボタン
                //
                HStack.of
                (
                    Button.of("丹下段平")
                        .frame(Width.of(100))
                        .onClicked(self -> phrase.set("「立つんだジョー！」")),

                    Button.of("こまわり君")
                        .frame(Width.of(100))
                        .onClicked(self -> phrase.set("「八丈島のキョン！」")),

                    Button.of("ジャイアン")
                        .frame(Width.of(100))
                        .onClicked(self -> phrase.set("「のび太のくせに！」"))
                ),

                HStack.of
                (
                    Button.of("ロッキー")
                        .frame(Width.of(100))
                        .onClicked(self -> phrase.set("「エイドリアーン！」")),

                    Button.of("てつや君")
                        .frame(Width.of(100))
                        .onClicked(self -> phrase.set("「僕は死にましぇん！」")),

                    Button.of("ほなみ ❤")
                        .frame(Width.of(100))
                        .onClicked(self -> phrase.set("「か～んち、●●しよっ！」"))
                ),

                Spacer.fill()
            )
        );
    }
}
