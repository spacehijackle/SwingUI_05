package swingui_05.counter;

import java.awt.Font;

import com.swingui.constant.UIDefaults;
import com.swingui.front.Frame;
import com.swingui.front.button.Button;
import com.swingui.front.layout.Spacer;
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
    private UIValue<Integer> count = UIValue.of(0);

    public void pushToCount()
    {
        Frame.of
        (
            "カウンター",

            VStack.of
            (
                Spacer.fill(),

                // カウント表示
                Text.of(count)
                    .font(new Font("Dialog", java.awt.Font.BOLD, 48)),

                // カウントアップ・ボタン
                Button.of("Push to increment")
                    .onClicked(self -> count.set(count.get() + 1)),

                Spacer.fill()
            )
            .padding(UIDefaults.COMPONENT_GAP)
        );
    }
}
