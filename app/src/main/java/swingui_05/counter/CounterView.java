package swingui_05.counter;

import java.awt.Font;

import com.swingui.front.Frame;
import com.swingui.front.button.Button;
import com.swingui.front.layout.VStack;
import com.swingui.front.text.Text;
import com.swingui.value.UIValue;

/**
 * カウンター表示クラス
 * 
 * @author t.yoshida
 */
public class CounterView
{
    // カウント値
    private UIValue<Integer> counter = new UIValue<>(0);

    public void pushToCount()
    {
        Frame.of
        (
            "カウンター",

            VStack.of
            (
                // カウント表示
                Text.of(counter)
                    .font(new Font("Dialog", Font.BOLD, 48)),

                // カウントアップ・ボタン
                Button.of("Push to increment")
                    .onClicked(self -> counter.set(counter.get() + 1))
            )
            .padding(24)
        );
    }
}
